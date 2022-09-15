//0.Implement Binary Tree
package com.company;

import java.util.Scanner;

//Tasks to accomplish: buildTree
//Traversals:= extend all the leaf nodes so that tree becomes perfect binary tree and then traverse as the following algo.
//Inorder = LDR [2nd time]
//Preorder = DLR [1st time]
//Postorder = LRD [3rd time]

public class Main0 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Node temp = buildBinaryTree();
        System.out.println("================");
        System.out.println("inOrderTraversal :");
        inOrderTraversal(temp);
        System.out.println("================");
        System.out.println("preOrderTraversal :");
        preOrderTraversal(temp);
        System.out.println("================");
        System.out.println("postOrderTraversal :");
        postOrderTraversal(temp);
    }

    public static int calculateHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int left = calculateHeight(root.left);
        int right = calculateHeight(root.right);
        return 1 + Math.max(left, right);
    }

    public static void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.data);
            inOrderTraversal(node.right);
        }
    }

    public static void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.println(node.data);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public static void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.data);
        }
    }

    public static Node buildBinaryTree() {
        System.out.print("Enter the data: ");
        int data = scanner.nextInt();
        if (data == -1) {
            return null;
        }
        Node node = new Node(data);
        System.out.println("For the left node of " + data + ": ");
        node.left = buildBinaryTree();
        System.out.println("For the right node of " + data + ": ");
        node.right = buildBinaryTree();
        return node;
    }

    public static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            left = null;
            right = null;
            this.data = data;
        }
    }
}
