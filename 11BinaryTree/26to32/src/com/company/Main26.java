//26.Given a binary tree, task is to find subtree with maximum sum in tree.
//https://www.geeksforgeeks.org/find-largest-subtree-sum-tree/
package com.company;

public class Main26 {

    public static void main(String[] args) {

    }

    public static int maxSumSubTree(Node root, Temp ans) {//initially ans = Integer.MIN_VALUE
        //TC = O(n),MC = O(n)
        //Basic recursion
        if (root == null) {
            return 0;
        }
        int curr = maxSumSubTree(root.left, ans) + maxSumSubTree(root.right, ans) + root.data;
        ans.val = Math.max(ans.val, curr);
        return curr;
    }

    static class Temp {
        int val;
        Temp(int val) {
            this.val = val;
        }
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
