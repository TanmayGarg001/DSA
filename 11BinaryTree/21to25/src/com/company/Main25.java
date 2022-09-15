//25.Sum of the Longest Bloodline of a Tree (Sum of nodes on the longest path from root to leaf node)
//Given a binary tree of size N. Your task is to complete the function sumOfLongRootToLeafPath(), that find the sum of all nodes on the longest path from root to leaf node.
//If two or more paths compete for the longest path, then the path having maximum sum of nodes is being considered.
//https://practice.geeksforgeeks.org/problems/sum-of-the-longest-bloodline-of-a-tree/1#
package com.company;

public class Main25 {

    int ans = 0;

    public static void main(String[] args) {

    }

    public int sumOfLongRootToLeafPath(Node root) {
        //TC = O(n),MC = O(n)
        //Idea is simple calc. the height of the tree and then recursively solve for maxSum
        int h = height(root);
        solve(root, h, 0);
        return ans;
    }

    int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    void solve(Node root, int lvl, int sum) {
        if (root == null) {//base case
            return;
        }
        if (lvl == 1) {//if tree has only 1 height than max ans will be node itself.
            ans = Math.max(ans, sum + root.data);
        }
        if (lvl > 1) {//recur the same for left and right subtrees.
            solve(root.left, lvl - 1, sum + root.data);
            solve(root.right, lvl - 1, sum + root.data);
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