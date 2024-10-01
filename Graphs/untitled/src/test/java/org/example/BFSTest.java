//package org.example;
//
//import org.junit.Test;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//public class BFSTest {
//
//    @Test
//    public void bfsOfGraph() {
//        //Create graph
//        Graph adjList = new Graph();
//
//        Node node0 = new Node(0);
//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//        Node node4 = new Node(4);
//
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
//        // Step 2: Perform BFS
//        List<Integer> expectedBFSOrder = Arrays.asList(0, 1, 2, 3, 4); // Expected BFS order starting from node 0
//
//        // Override System.out to capture output
//        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outContent));
//
//        // Step 3: Call bfsOfGraph
//        BFS.bfsOfGraph(5, adjList, node0);
//
//        // Capture output and split into values
//        String[] bfsOutput = outContent.toString().trim().split(" ");
//        List<Integer> actualBFSOrder = new ArrayList<>();
//        for (String s : bfsOutput) {
//            actualBFSOrder.add(Integer.parseInt(s));
//        }
//
//        // Step 4: Assert expected order equals actual order
//        assertEquals(expectedBFSOrder, actualBFSOrder);
//
//        // Reset System.out
//        System.setOut(System.out);
//    }
//    }