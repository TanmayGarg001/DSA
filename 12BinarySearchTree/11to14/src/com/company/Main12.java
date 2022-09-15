//12.Given a Binary Search Tree (BST) and a range l-h(inclusive), count the number of nodes in the BST that lie in the given range.
//The values smaller than root go to the left side
//The values greater and equal to the root go to the right side
//https://practice.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/1
package com.company;

import java.util.ArrayList;

public class Main12 {

    public static void main(String[] args) {

    }

    static int getCount(Node root, int l, int h) {
        //TC = O(n),MC = O(h), here h is the highest number in the Tree
        //Ezpz make ArrayList int the inOrder traversal which satisfies the condition the number lies bw l & h
        ArrayList<Integer> al = new ArrayList<>();
        inOrder(root, l, h, al);
        return al.size();
    }

    static void inOrder(Node root, int l, int h, ArrayList<Integer> al) {
        if (root != null) {
            inOrder(root.left, l, h, al);
            if (root.data <= h && root.data >= l) {
                al.add(root.data);
            }
            inOrder(root.right, l, h, al);
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