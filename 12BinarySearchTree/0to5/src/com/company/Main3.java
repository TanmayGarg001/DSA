//3.Given the root of a binary tree, determine if it is a valid binary search tree (BST).
//A valid BST is defined as follows:
//The left subtree of a node contains only nodes with keys less than the node's key.
//The right subtree of a node contains only nodes with keys greater than the node's key.
//Both the left and right subtrees must also be binary search trees.
//https://leetcode.com/problems/validate-binary-search-tree/
//https://practice.geeksforgeeks.org/problems/check-for-bst/1
package com.company;

public class Main3 {

    static long prev = Long.MIN_VALUE;

    public static void main(String[] args) {

    }

    public boolean isValidBST(Node root) {
        //TC = O(n),MC = O(n)
        //Basic BST inOrder traversal with a slight modification acc. to question
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (root.data <= prev) {
            return false;
        }
        prev = root.data;
        return isValidBST(root.right);
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