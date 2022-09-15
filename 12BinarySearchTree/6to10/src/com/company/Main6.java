//6.Given a Binary Tree, write a function to populate next pointer for all nodes. The next pointer for every node should be set to point to inorder successor.
//https://practice.geeksforgeeks.org/problems/populate-inorder-successor-for-all-nodes/1
package com.company;

import java.util.ArrayList;

public class Main6 {

    private static ArrayList<Node> al = new ArrayList<>();
    private static Node prev;

    public static void main(String[] args) {

    }

    public static void populateNext(Node root) {
        //TC = O(n), MC = O(n)
        //Basic inOrder traversal with slight modification
        if (root != null) {
            populateNext(root.left);
            if (prev != null) prev.next = root;
            prev = root;
            populateNext(root.right);
        }
    }

    public static Node populateNext2(Node root) {
        //TC = O(n), MC = O(n)
        //Simply make an arrayList and store the inOrder traversal nodes in it, and at last just use a loop and point all the elements in required fashion
        Node temp = root;
        inOrder(root);
        for (int i = 0; i < al.size(); i++) {
            root.next = al.get(i);
            root = root.next;
        }
        return temp;
    }

    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            al.add(root);
            inOrder(root.right);
        }
    }


    public static class Node {
        Node left;
        Node right;
        Node next;
        int data;

        Node(int data) {
            next = null;
            left = null;
            right = null;
            this.data = data;
        }
    }

}