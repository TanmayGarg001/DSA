//8.Given a Binary search tree. Your task is to complete the function which will return the Kth the largest element without doing any modification in Binary Search Tree.
//https://practice.geeksforgeeks.org/problems/kth-largest-element-in-bst/1#
//https://leetcode.com/problems/kth-smallest-element-in-a-bst/submissions/
package com.company;

import java.util.ArrayList;

public class Main8 {

    static int counter = 0;
    static int ans = 0;
    private static ArrayList<Integer> al = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static int kthSmallest(Node root, int k) {
        //TC = O(h),MC = O(h)
        //Using inOrder traversal and return the answer when we reach kth the smallest element
        solve(root, k);
        return ans;
    }

    private static void solve(Node root, int k) {
        if (root == null) return;
        solve(root.left, k);
        counter++;
        if (counter == k) {
            ans = root.data;
            return;
        }
        solve(root.right, k);
    }

    public static int kthLargest(Node root, int k) {
        //TC = O(n),MC = O(n)
        //Make a arrayList and store the data in sorted order using inOrder traversal coz of BST and then return the kth-1 index accordingly.
        inOrder(root);
        return al.get(al.size() - k);
    }

    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            al.add(root.data);
            inOrder(root.right);
        }
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