package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        
        System.out.println(graph.getNeighbors(1));

        System.out.println("Graph: ");
        graph.printGraph();

        graph.removeEdge(0, 1);
        System.out.println("After removing edge (0, 1):");
        graph.printGraph();

        graph.removeVertex(2);
        System.out.println("After removing vertex 2:");
        graph.printGraph();
    }
}

class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }

    //add edge between two vertices
    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // Add this line for undirected graph
    }

    public void removeVertex(int vertex) {
        adjacencyList.remove(vertex);

        //remove the vertex from the neighbors of other vertices
        for(List<Integer> neighbors : adjacencyList.values()) {
            neighbors.remove(Integer.valueOf(vertex)); //remove by vertex and not index
        }
    }

    //remove an edge between two vertices
    public void removeEdge(int source, int destination) {
        adjacencyList.get(source).remove(Integer.valueOf(destination));

        // For undirected graph, uncomment below line
//        adjacencyList.get(destination).remove(Integer.valueOf(source));
    }

    public List<Integer> getNeighbors(int vertex) {
        return adjacencyList.get(vertex);    }

    public void printGraph() {
        for(Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            System.out.print(entry.getKey() + "->");
            for(Integer neighbor: entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}