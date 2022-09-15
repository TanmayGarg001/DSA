//12.Given a binary tree, print the bottom view from left to right.
//A node is included in bottom view if it can be seen when we look at the tree from bottom.
//                      20
//                    /   \
//                  8     22
//                /   \     \
//                5    3     25
//                   /   \
//                  10    14
//
//For the above tree, the bottom view is 5 10 3 14 25.
package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class Main12 {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> bottomView(Node root) {
        //TC = O(nlogn),MC = O(n)
        //Pretty much same as prev: We look tree in vertical levels[lines] and we give unique index to line by doing -1 for each
        //top index at the left of root node and vice versa for others.
        //TreeMap is used so that we can so searching for key in log(n) and Pair class is used so that we can keep track of node address and its data.
        //Only diff is that the key values will get overwritten at the end of while loop as we don't have to check for already existing keys.
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
            if (temp.left != null) {
                qp.add(new Pair(temp.left, data - 1));
            }
            if (temp.right != null) {
                qp.add(new Pair(temp.right, data + 1));
            }
            tmap.put(data, temp.data);
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