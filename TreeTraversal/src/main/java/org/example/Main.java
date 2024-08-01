package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
//
//        tree.inOrderTraversal(tree.root);
//        tree.preOrderTraversal(tree.root);
//        tree.postOrderTraversal(tree.root);
        tree.levelOrderTraversal(tree.root);
    }
}

class BinaryTree {
    Node root;

    //InOrderTraversal (left, root, right), typically used for binary search trees because it visits nodes in ascending order
    void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.value + " ");
        inOrderTraversal(node.right);
    }


    //PreOrderTraversal (root, left, right), useful for creating a copy of the tree
    void preOrderTraversal(Node node) {
        if(node == null) {
            return;
        }

        System.out.println(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    //PostOrderTraversal (left, right, root), useful for deleting a tree
    void postOrderTraversal(Node node) {
        if(node == null) {
            return;
        }

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.value + " ");
    }

    //LevelOrderTraversal (Breadth-First Traversal), traverses the tree level by level left to right
    //Useful for finding the shortest path in unweighted trees or graphs, serialization and deserialization of trees, connecting nodes at the same level, and printing trees level by level
    void levelOrderTraversal(Node node) {
        if(node == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.value + " ");

            if(current.left != null) {
                queue.add(current.left);
            }

            if(current.right != null) {
                queue.add(current.right);
            }
        }
    }
}


class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}