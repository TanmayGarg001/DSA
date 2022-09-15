//18.Given the root of a binary tree, flatten the tree into a "linked list"
//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
//https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1
package com.company;

public class Main18 {

    static private Node prev = null;

    public static void main(String[] args) {

    }

    static public void flatten(Node root) {
        //TC = O(n),MC = O(n)
        //Recursive code.
        if (root == null) {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

    public static Node bToDLL(Node root) {
        //TC = O(n),MC = O(n)
        //Recursive code.
        if (root == null) {
            return null;
        }
        Node temp = bToDLL(root.left);
        root.right = bToDLL(root.right);
        if (root.right != null) {
            root.right.left = root;
        }
        while (temp != null && temp.right != null) {
            temp = temp.right;
        }
        if (temp != null) {
            temp.right = root;
        }
        root.left = temp;
        Node start = root;
        while (start.left != null) {
            start = start.left;
        }
        return start;
    }

    static class Node {
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