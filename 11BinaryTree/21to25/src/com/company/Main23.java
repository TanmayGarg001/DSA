//23.Given a Binary Tree, check if all leaves are at same level or not.
//https://practice.geeksforgeeks.org/problems/leaf-at-same-level/1#
package com.company;

public class Main23 {

    int max = 0;

    public static void main(String[] args) {

    }

    boolean check(Node root) {
        //TC = O(n),MC = O(n)
        return checkHeight(root, 0);
    }

    boolean checkHeight(Node root, int level) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            if (max == 0) {
                max = level;
                return true;
            } else {
                return (max == level);
            }
        }
        boolean a = checkHeight(root.left, level + 1);
        boolean b = checkHeight(root.right, level + 1);
        return a && b;
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