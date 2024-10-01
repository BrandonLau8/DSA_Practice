package org.example;

import java.util.*;

public class DetectCycleUndirectedGraphBFS {

    public void detectCycle(int nodeCount, Node startNode, Graph graph) {
        Map<Node, List<Node>> adj = graph.getAdjList();

        boolean[] vis = new boolean[nodeCount];

        boolean ans = cycleBFS(startNode, adj, vis);
        if(ans) {
            System.out.println("cycle detected");
        } else {
            System.out.println("no cycle");
        }

    }

    public boolean cycleBFS(Node startNode, Map<Node, List<Node>> adj, boolean[] vis) {
        Queue<Node> q = new LinkedList<>();

        q.add(startNode); // Add the starting node

        vis[startNode.val] = true;

        Map<Node, Node> map = new HashMap<>();
        map.put(startNode, null);

        while(!q.isEmpty()) {
            Node currentNode = q.poll();

            // Loop through each neighbor of the currentNode
            for (Node neighborNode : adj.get(currentNode)) {
                //if not visited
                if(!vis[neighborNode.val]) {
                    //add neighborNode assigned as currentNode and currentNode assigned as prevNode
                    q.add(neighborNode);
                    vis[neighborNode.val] = true;
                    map.put(neighborNode, currentNode);
                }
                //If prevNode had already connected (visited) currentNode(neighborNode) but connects to another node there is a cycle
                else if ( neighborNode != map.get(currentNode)) { return true;}
            }
        }
        return false;
    }
}