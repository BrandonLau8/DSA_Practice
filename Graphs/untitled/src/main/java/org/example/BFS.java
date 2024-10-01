package org.example;

import java.util.*;

public class BFS {

    public static void bfsOfGraph(int nodeCount, Graph graph, Node startNode) {
        //Get Adj List
        Map<Node, List<Node>> adj = graph.getAdjList();

        //Create list and visit array
        ArrayList<Node> bfsStore = new ArrayList<>();
        boolean[] vis = new boolean[nodeCount];

        //Track nodes with queue
        Queue<Node> q = new LinkedList<>();

        //add starting node to queue and mark as visited
        q.add(startNode);
        vis[startNode.val] = true;

        while(!q.isEmpty()) {

            //take node out of queue and put it into list
            //This list represents a traversed adjList
            Node node = q.poll();
            bfsStore.add(node);

            //iterate node in adjList and check if neighborNodes have it been visited

            for(Node neighborNode: adj.get(node)) {
                //if not visited, add to queue and set to visited
                if(vis[neighborNode.val] == false) {
                    q.add(neighborNode);
                    vis[neighborNode.val] = true;
                }
            }
        }

        for (Node node: bfsStore) {
            System.out.print(node.val + " ");
        }
    }
}
