package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static org.example.BFS.bfsOfGraph;
import static org.example.DFS.dfsOfGraph;


public class Main {
    public static void main(String[] args) {


        Graph adjList = new Graph();

        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        adjList.addNode(node0);
        adjList.addNode(node1);
        adjList.addNode(node2);
        adjList.addNode(node3);
        adjList.addNode(node4);

        adjList.addEdge(node0, node1);
        adjList.addEdge(node0, node2);
        adjList.addEdge(node1, node3);
        adjList.addEdge(node2, node3);
        adjList.addEdge(node2, node4);

        //Start Node
        Node startNode = node0;

        //Node Count
        int nodeCount = adjList.getNodeCount();

//        bfsOfGraph(nodeCount, adjList, startNode);
//        dfsOfGraph(nodeCount, adjList, startNode);


        DetectCycleUndirectedGraphBFS detectCycle = new DetectCycleUndirectedGraphBFS();
        detectCycle.detectCycle(nodeCount, startNode, adjList);

//        dfsOfGraph(nodeCount, adj, startNode);

//        Boolean ans = detectCycle(nodeCount, , adj);
//        if(ans) {
//            System.out.println("cycle exists");
//        } else {
//            System.out.println("cycle does not exist");
//        }

    }
}