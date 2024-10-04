package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class EdgeClassifier {

    enum EdgeType {TREE, FORWARD, BACKWARD, CROSS}

    private Map<Node, List<Node>> graph;
    private Map<Node, Integer> discoveryTime;
    private Map<Node, Integer> finishTime;
    private Map<Node, EdgeType> edgeTypes;
    private Set<Node> visited;
    private int time;

    public EdgeClassifier(Map<Node, List<Node>> graph) {
        this.graph = graph;
        this.discoveryTime = new HashMap<>();
        this.finishTime = new HashMap<>();
        this.edgeTypes = new HashMap<>();
        this.visited = new HashSet<>();
        this.time = 0;
    }

    public void dfs(Node node) {
        visited.add(node);
        discoveryTime.put(node, time++);

        for(Node neighbor : graph.get(node)) {
            if(!visited.contains(neighbor)) {
                //Tree Edge
                edgeTypes.put(neighbor, EdgeType.TREE);
                dfs(neighbor);
            } else if (discoveryTime.get(neighbor) < discoveryTime.get(node) && finishTime.get(neighbor) == null) {
                //Backward Edge (neighbor was discovered earlier)
                edgeTypes.put(neighbor, EdgeType.BACKWARD);
            } else if(discoveryTime.get(node) < discoveryTime.get(neighbor)) {
                //Forward edge (neighbor is a descendant)
                edgeTypes.put(neighbor, EdgeType.FORWARD);
            } else {
                //Cross Edge (neighbor is in another subtree
                edgeTypes.put(neighbor, EdgeType.CROSS);
            }
        }
        finishTime.put(node, time++);


    }

    public void getEdgeTypes() {
        for(Map.Entry<Node, EdgeType> entry : edgeTypes.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
