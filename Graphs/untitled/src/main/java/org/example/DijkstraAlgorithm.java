package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    public static Map<Node, Integer> dijkstra(UndirectedGraph graph, Node start){

        Map<Node, Integer> weights = new HashMap<>();

        //used to trace the shortest path route
        Map<Node, Node> previous = new HashMap<>();

        //sorts the weight within the queue
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(edge->edge.weight));

        //Initialize distances
        for(Node node : graph.getNodes()) {
            weights.put(node, Integer.MAX_VALUE);
        }
        weights.put(start, 0);
        pq.add(new Edge(start, 0));

        while(!pq.isEmpty()){
            Edge current = pq.poll();
            Node currentNode = current.destination;

            for(Edge edge : graph.getNeighbors(currentNode)) {
                Node neighbor = edge.destination;
                int newWeight = weights.get(currentNode) + edge.weight;

                //If new weight is shorter, update the weight and previous node
                if(newWeight < weights.get(neighbor)) {
                    weights.put(currentNode, newWeight);
                    previous.put(neighbor, currentNode);
                    pq.add(new Edge(neighbor, newWeight));
                }
            }
        }
        return weights;
    }


}
