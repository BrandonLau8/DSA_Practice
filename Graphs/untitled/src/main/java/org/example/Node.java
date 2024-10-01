package org.example;

import java.util.ArrayList;

public class Node {
    int val;
    ArrayList<Node> neighbor;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, ArrayList<Node> neighbor) {
        this.val = val;
        this.neighbor = neighbor;
    }

}
