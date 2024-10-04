package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectedGraph {
    private Map<Node, List<Node>> adjList;

    private Map<Node, List<Edge>> weightedDirectGraph;

    public DirectedGraph() {

        this.adjList = new HashMap<>();
        this.weightedDirectGraph = new HashMap<>();
    }


    public void addNode(Node node) {
        adjList.put(node, new ArrayList<>());
    }

    public void addEdge(Node u, Node v) {
        adjList.get(u).add(v);
    }

    public void addWeightNode(Node node) {weightedDirectGraph.put(node, new ArrayList<>());}
    public void addWeightEdge(Node u, Node v, int weight) {
        weightedDirectGraph.get(u).add(new Edge(v, weight));
    }

    public Map<Node, List<Node>> getAdjList() {

//        for(Map.Entry<Node, List<Node>> entry : adjList.entrySet()) {
//            Node key = entry.getKey();
//            List<Node> value = entry.getValue();
//            System.out.print("Node" + key.val + " ");
//            for(Node neighborNode : value) {
//                System.out.print(neighborNode.val + " ");
//            }
//            System.out.println();
//        }


        return adjList;
    }

    public void getWeightedDirectGraph() {

        for(Map.Entry<Node, List<Edge>> entry : weightedDirectGraph.entrySet()) {
            System.out.print("Node" + entry.getKey().val + ": ");
            List<Edge> edgeList = entry.getValue();
            for(Edge edge : edgeList) {
                System.out.print(edge.toString() + ", ");
            }
            System.out.println();
        }
//        return weightedDirectGraph;
    }
}
