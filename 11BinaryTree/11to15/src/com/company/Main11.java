//11.Given below is a binary tree. The task is to print the top view of binary tree.
//Top view of a binary tree is the set of nodes visible when the tree is viewed from the top. For the given below tree
//       1
//      /  \
//    2      3
//   /  \   /  \
//  4    5  6   7
//
//Top view will be: 4 2 1 3 7
//Note: Return nodes from leftmost node to rightmost node.
//https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1#
package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class Main11 {

    public static void main(String[] args) {

    }

    static ArrayList<Integer> topView(Node root) {
        //TC = O(nlogn),MC = O(n)
        //We look tree in vertical levels[lines] and we give unique index to line by doing -1 for each top index at the left of root node and vice versa for others.
        //TreeMap is used so that we can so searching for key in log(n) and Pair class is used so that we can keep track of node address and its data.
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<Pair> qp = new LinkedList<>();
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        qp.add(new Pair(root, root.data));
        while (!qp.isEmpty()) {
            Pair pair = qp.poll();
            Node temp = pair.node;
            int data = pair.data;
            if (!tmap.containsKey(data)) {
                tmap.put(data, temp.data);
            }
            if (temp.left != null) {
                qp.add(new Pair(temp.left, data - 1));
            }
            if (temp.right != null) {
                qp.add(new Pair(temp.right, data + 1));
            }
        }
        return new ArrayList<>(tmap.values());
    }

    static class Pair {
        Node node;
        int data;

        public Pair(Node node, int data) {
            this.node = node;
            this.data = data;
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