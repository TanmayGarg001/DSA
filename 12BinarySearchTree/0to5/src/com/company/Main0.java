//0.Implement Binary Search Tree
//Binary Search Tree is a node-based binary tree data structure which has the following properties:
//> The left subtree of a node contains only nodes with keys lesser than the node’s key.
//> The right subtree of a node contains only nodes with keys greater than the node’s key.
//> The left and right subtree each must also be a binary search tree.
//> If we fulfill all the requirements we will have a BST and the inOrder will result in a sorted order print
package com.company;

public class Main0 {

    static Node root;

    public Main0() {
        root = null;
    }

    public static void main(String[] args) {
        Main0 BST = new Main0();
        BST.insert(50);
        BST.insert(100);
        BST.insert(30);
        BST.insert(20);
        BST.insert(-15);
        BST.insert(40);
        BST.insert(70);
        BST.insert(60);
        BST.insert(-120);
        BST.insert(80);
        BST.insert(500);
        inOrder(root);
    }

    public static void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public static Node buildBST(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else if (root.data > data) {
            root.left = buildBST(root.left, data);
        } else if (root.data < data) {
            root.right = buildBST(root.right, data);
        }
        return root;
    }

    public void insert(int data) {
        root = buildBST(root, data);
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