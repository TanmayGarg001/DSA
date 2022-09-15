//2.Given a Binary Search Tree. The task is to find the minimum element in this given BST.
//https://practice.geeksforgeeks.org/problems/minimum-element-in-bst/1#
package com.company;

public class Main2 {

    public static void main(String[] args) {

    }

    int minValue(Node node) {
        //TC = O(length of left side of tree), MC = O(n)
        //basic recursive code
        if (node == null) {
            return -1;
        }
        if (node.left == null) {
            return node.data;
        }
        return minValue(node.left);
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