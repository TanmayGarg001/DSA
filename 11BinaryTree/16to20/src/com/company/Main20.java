//20.Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree,
//construct and return the binary tree, preorder and inorder consist of unique values.
//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
//https://practice.geeksforgeeks.org/problems/construct-tree-1/1
package com.company;

import java.util.HashMap;

public class Main20 {

    private static int track;//keeps track of preOrder index i.e. next root element to be made
    private static HashMap<Integer, Integer> map;//map for inOrderIndex arr[]

    public static void main(String[] args) {

    }

    public Node buildTree(int[] preorder, int[] inorder) {
        //TC = O(n),MC = O(n)
        track = 0;
        // build a hashmap to store value -> its index relations
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return arrayToTree(preorder, 0, preorder.length - 1);
    }

    private Node arrayToTree(int[] preorder, int left, int right) {
        // if there are no elements to construct the tree
        if (left > right) return null;

        // select the preorder_index element as the root and increment it
        int rootValue = preorder[track++];
        Node root = new Node(rootValue);

        // build left and right subtree
        // excluding inorderIndexMap[rootValue] element because it's the root
        root.left = arrayToTree(preorder, left, map.get(rootValue) - 1);
        root.right = arrayToTree(preorder, map.get(rootValue) + 1, right);
        return root;
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