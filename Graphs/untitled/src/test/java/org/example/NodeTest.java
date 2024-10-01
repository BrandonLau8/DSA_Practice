package org.example;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void testNodeCreatedWithValue() {
        Node node = new Node(5);

        assertEquals(5, node.val);
        assertNull(node.neighbor);
    }

    @Test
    public void testNodeCreationWithNeighbors() {
        //Create neighbors
        Node node1 = new Node(1);
        Node node2 = new Node(2);

        ArrayList<Node> neighbors = new ArrayList<>();
        neighbors.add(node1);
        neighbors.add(node2);

        Node node3 = new Node(3, neighbors);

        //Neighbors inside
        assertNotNull(node3.neighbor);

        //Size of neighbor array
        assertEquals(2, node3.neighbor.size());

        //neighbor array values
        assertEquals(1, node3.neighbor.get(0).val);
        assertEquals(2, node3.neighbor.get(1).val);
    }

    @Test
    public void testNeighborCreation() {
        //create node
        Node node = new Node(1);

        //verify neighbor is null upon creation of node
        assertNull(node.neighbor);

        ArrayList<Node> neighbor = new ArrayList<>();
        //verify neighbor is not null when initialized and empty
        assertNotNull(node.neighbor);
        assertTrue(node.neighbor.isEmpty());
    }
}