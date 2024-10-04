package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DFS {
    public static void dfsOfGraph(int nodeCount, UndirectedGraph graph, Node startNode) {
        //DFS through undirected graph adj
        Map<Node, List<Node>> adj = graph.getAdjList();

        //Create list
        ArrayList<Node> dfsStore = new ArrayList<>();
        boolean[] vis = new boolean[nodeCount];

        //Iterate through each node in the adjList
        adj.forEach((key, value) -> {
            //If node not visited use recursion. This conditional ensures disconnected graphs are fully checked.
            if(!vis[key.val]) {
                dfs(key, vis, adj, dfsStore);
            }
        });

        for(Node node: dfsStore) {
            System.out.print(node.val + " ");
        }
    }
    public static void dfs(Node currentNode, boolean[] vis, Map<Node, List<Node>> adj, ArrayList<Node> dfsStore) {
        //add node into list and mark as visited.
        //This list represents a traversed adjList
        dfsStore.add(currentNode);
        vis[currentNode.val] = true;

        //iterate node in adjList and check if neighborNodes have it been visited
        for (Node neighborNode : adj.get(currentNode)) {

            //if node not visited use recursion
            if (!vis[neighborNode.val]) {
                dfs(neighborNode, vis, adj, dfsStore);
            }
        }
    }
}
