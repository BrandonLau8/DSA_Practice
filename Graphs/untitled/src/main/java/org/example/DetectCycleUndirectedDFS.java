package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetectCycleUndirectedDFS {

    public static boolean detectCycle(int nodeCount, UndirectedGraph graph) {
        Map<Node, List<Node>> adj =  graph.getAdjList();

        //Create currentNode and visit array
        boolean[] vis = new boolean[nodeCount];

        //Iterate through each node in adjList
        for (Map.Entry<Node, List<Node>> entry : adj.entrySet()) {
            Node key = entry.getKey();
            List<Node> value = entry.getValue();
            if (!vis[key.val]) {

                if (cycleDFS(key, null, adj, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean cycleDFS(Node currentNode, Node prevNode, Map<Node, List<Node>> adj, boolean[] vis) {

        vis[currentNode.val] = true;

        for(Node neighborNode : adj.get(currentNode)) {
            if(!vis[neighborNode.val]) {
                if(cycleDFS(neighborNode, currentNode, adj, vis)) {
                    return true;
                }
            } else if (neighborNode != prevNode) {
                return true;
            }
        }
        return false;
    }
}


