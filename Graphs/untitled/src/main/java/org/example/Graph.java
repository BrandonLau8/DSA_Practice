package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Node, List<Node>> adjList;

    public Graph() {
        this.adjList = new HashMap<>();
    }

    public void addNode(Node node) {
        adjList.put(node, new ArrayList<>());
    }

    public void addEdge(Node u, Node v) {

        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

   public Map<Node, List<Node>> getAdjList() {
        //Iterate through the Adj List
       adjList.forEach((key, value) -> {
           System.out.print("Node" + key.val + ": ");

           //iterate through selected Adj List Node
           value.forEach((v) -> {
               System.out.print(v.val + " ");
           });
           System.out.println();
       });
       return adjList;
   }

   public int getNodeCount() {
        int nodeCount = adjList.size();
        return nodeCount;
   }

}
