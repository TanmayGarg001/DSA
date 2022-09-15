//19.Given a Binary Tree of size N , where each node can have positive or negative values. Convert this to a tree where each node contains
//the sum of the left and right subtrees of the original tree. The values of leaf nodes are changed to 0.
//https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1#
package com.company;

public class Main19 {

    public static void main(String[] args) {

    }

    public static void toSumTree(Node root) {
        //TC = O(n),MC = O(n)
        //Basic recursive code.
        solve(root);
    }

    public static int solve(Node root) {
        if (root == null) {
            return 0;
        }
        int a = solve(root.left);
        int b = solve(root.right);
        int x = root.data;
        root.data = a + b;
        return a + b + x;
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