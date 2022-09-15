//22.Given a Binary Tree. Return true if, for every node X in the tree other than the leaves, its value is equal to the sum of its left subtree's value
//and its right subtree's value. Else return false.
//An empty tree is also a Sum Tree as the sum of an empty tree can be considered to be 0. A leaf node is also considered a Sum Tree.
//https://practice.geeksforgeeks.org/problems/sum-tree/1
package com.company;

public class Main22 {

    public static boolean flag = true;

    public static void main(String[] args) {

    }

    public static boolean isSumTree(Node root) {
        //TC = O(n),MC = O(n)
        if (root == null) {
            return true;
        }
        solve(root);
        return flag;
    }

    public static int solve(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {//if node is leaf node then return the root's[that node] data
            return root.data;
        }
        int l = solve(root.left);//recur
        int r = solve(root.right);//recur
        flag = flag & (root.data == l + r);//check the main condition
        return root.data + l + r;
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