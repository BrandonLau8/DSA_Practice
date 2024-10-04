package org.example;

import java.util.*;

import static org.example.BFS.bfsOfGraph;
import static org.example.DFS.dfsOfGraph;


public class Main {
    public static void main(String[] args) {

        UndirectedGraph adjList = new UndirectedGraph();

        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

//        adjList.addNode(node0);
//        adjList.addNode(node1);
//        adjList.addNode(node2);
//        adjList.addNode(node3);
//        adjList.addNode(node4);
//
//        adjList.addEdge(node0, node1);
//        adjList.addEdge(node0, node2);
//        adjList.addEdge(node1, node3);
//        adjList.addEdge(node2, node3);
//        adjList.addEdge(node2, node4);
//
//        DirectedGraph directedGraph = new DirectedGraph();
//        directedGraph.addNode(node0);
//        directedGraph.addNode(node1);
//        directedGraph.addNode(node2);
//        directedGraph.addNode(node3);
//
//        directedGraph.addEdge(node0, node1);
//        directedGraph.addEdge(node0, node3);
//        directedGraph.addEdge(node1, node2);
//        directedGraph.addEdge(node1, node3);

//        DirectedGraph weightDirectedGraph = new DirectedGraph();
//        weightDirectedGraph.addWeightNode(node0);
//        weightDirectedGraph.addWeightNode(node1);
//        weightDirectedGraph.addWeightNode(node2);
//        weightDirectedGraph.addWeightNode(node3);
//
//        weightDirectedGraph.addWeightEdge(node0, node1, 5);
//        weightDirectedGraph.addWeightEdge(node0, node3, 8);
//        weightDirectedGraph.addWeightEdge(node1, node2, 32);
//        weightDirectedGraph.addWeightEdge(node1, node3, 23);
//
//        weightDirectedGraph.getWeightedDirectGraph();

        UndirectedGraph weightundirectedGraph = new UndirectedGraph();
        weightundirectedGraph.addWeightNode(node0);
        weightundirectedGraph.addWeightNode(node1);
        weightundirectedGraph.addWeightNode(node2);
        weightundirectedGraph.addWeightNode(node3);
        weightundirectedGraph.addWeightEdge(node0, node1, 4);
        weightundirectedGraph.addWeightEdge(node0, node2, 1);
        weightundirectedGraph.addWeightEdge(node1, node2, 2);
        weightundirectedGraph.addWeightEdge(node1, node3, 5);
        weightundirectedGraph.addWeightEdge(node2, node3, 8);

        weightundirectedGraph.getWeightUndirectGraph();

//        EdgeClassifier edgeClassifier = new EdgeClassifier(directedGraph.getAdjList());
//        edgeClassifier.dfs(node0);
//        edgeClassifier.getEdgeTypes();
//
//        TopologicalSort topologicalSort = new TopologicalSort(directedGraph);
//        topologicalSort.topologicalSort();

//        //Start Node
//        Node startNode = node0;
////
//        //Node Count
//        int nodeCount = adjList.getNodeCount();

//        bfsOfGraph(nodeCount, adjList, startNode);
//        dfsOfGraph(nodeCount, adjList, startNode);


//        DetectCycleUndirectedGraphBFS detectCycle = new DetectCycleUndirectedGraphBFS();
//        detectCycle.detectCycle(nodeCount, startNode, adjList);

//        dfsOfGraph(nodeCount, adj, startNode);

//        Boolean ans = detectCycle(nodeCount, , adj);
//        if(ans) {
//            System.out.println("cycle exists");
//        } else {
//            System.out.println("cycle does not exist");
//        }

    }
}