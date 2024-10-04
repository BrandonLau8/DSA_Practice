package org.example;

import java.util.*;

//For directed acyclic graphs(DAGs) arranges vertices in linear order
public class TopologicalSort {
    private DirectedGraph graph;
    private Set<Node> visited;
    private Stack<Node> stack;

    public TopologicalSort(DirectedGraph graph) {
        this.graph = graph;
        this.visited = new HashSet<>();
        this.stack = new Stack<>();
    }

    public List<Node> topologicalSort(){
        //loop through adjlist keys
        for(Node node : graph.getAdjList().keySet()) {
            if(!visited.contains(node)) {
                dfs(node);
            }
        }

        //Collecting the nodes from the stack into a result list
        List<Node> topologicalOrder = new ArrayList<>();
        while(!stack.isEmpty()) {
            topologicalOrder.add(stack.pop());
        }

        for(Node node : topologicalOrder) {
            System.out.println(node.val);
        }
        return topologicalOrder;
    }

    private void dfs(Node node) {
        visited.add(node);

        //explore all neighbors of the current node
        for(Node neighbor : graph.getAdjList().get(node)) {
            if(!visited.contains(neighbor)){
                dfs(neighbor);
            }
        }

        //All neighbors are visited, push the current node onto the stack
        stack.push(node);
    }
}
