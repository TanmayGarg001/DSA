package com.company;

import java.util.Scanner;

public class BinaryTree {
    static Scanner scanner = new Scanner(System.in);
    static Node root;

    public BinaryTree() {
        root = builtBinaryTree();
    }

    private static Node builtBinaryTree() {
        System.out.print("Enter the data: ");
        int data = scanner.nextInt();
        if (data == -1) {
            return null;
        }
        Node temp = new Node(data);
        System.out.println("For the left node of " + data + ": ");
        temp.left = builtBinaryTree();
        System.out.println("For the right node of " + data + ": ");
        temp.right = builtBinaryTree();

        return temp;
    }

    public static void inOT() {
        inOrderTraversal(root);
    }

    public static int height() {
        return calculateHeight(root);
    }

    public static void preOT() {
        preOrderTraversal(root);
    }

    public static void postOT() {
        postOrderTraversal(root);
    }

    private static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }

    private static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    private static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);
    }

    public static int calculateHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int left = calculateHeight(root.left);
        int right = calculateHeight(root.right);

        return 1 + Math.max(left, right);
    }

}

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        left = null;
        right = null;
        this.data = data;
    }


}
