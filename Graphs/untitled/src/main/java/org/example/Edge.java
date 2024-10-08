package org.example;

public class Edge {
    Node destination;
    int weight;

    public Edge(Node destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Destination: " + destination.val + ", Weight: " + weight;
    }
}
