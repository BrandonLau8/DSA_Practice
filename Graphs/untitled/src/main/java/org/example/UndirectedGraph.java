package org.example;

import java.util.*;

public class UndirectedGraph {
    private Map<Node, List<Node>> adjList;
    private Map<Node, List<Edge>> weightUndirectGraph;

    public UndirectedGraph() {

        this.adjList = new HashMap<>();
        this.weightUndirectGraph = new HashMap<>();
    }

    public void addNode(Node node) {
        adjList.put(node, new ArrayList<>());
    }

    public void addEdge(Node u, Node v) {

        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void addWeightNode(Node node) {
        weightUndirectGraph.put(node, new ArrayList<>());
    }

    public void addWeightEdge(Node u, Node v, int weight) {


        weightUndirectGraph.get(u).add(new Edge(v, weight));
        weightUndirectGraph.get(v).add(new Edge(u, weight));
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

   public void getWeightUndirectGraph() {

        for(Map.Entry<Node, List<Edge>> entry : weightUndirectGraph.entrySet()) {
            System.out.print("Node" + entry.getKey().val + ": ");
            for(Edge edge : entry.getValue()) {
                System.out.print(edge.toString() + ", ");
            }
            System.out.println();
        }
   }

   public Set<Node> getNodes(){
        return weightUndirectGraph.keySet();
   }

   public List<Edge> getNeighbors(Node node){
        return weightUndirectGraph.get(node);
   }

   public int getNodeCount() {
        int nodeCount = adjList.size();
        return nodeCount;
   }


}
