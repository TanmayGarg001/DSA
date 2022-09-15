//1.Given a binary tree, find its level order traversal.
//Level order traversal of a tree is breadth-first traversal for the tree.
//https://practice.geeksforgeeks.org/problems/level-order-traversal/
//https://leetcode.com/problems/binary-tree-level-order-traversal/
package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main1 {

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> levelOrder(Node root) {
        //TC = O(n),MC = O(n)
        //Linked/Array List will keep track of nodes in left to right order and arrayList will keep storing the output
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            ans.add(temp.data);
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        return ans;
    }

    public List<List<Integer>> levelOrderTraversal(Node root) {
        //TC = O(n),MC = O(n)
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {//edge case
            return ans;
        }
        Queue<Node> q = new LinkedList<>();//for BFS
        q.add(root);//add root to queue coz we know at least one element is there in our tree
        while (!q.isEmpty()) {//if our queue has some nodes then we do work:
            int size = q.size();//stores number of different nodes that we have to process in each iteration
            List<Integer> currLvl = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                currLvl.add(temp.data);
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            ans.add(currLvl);
        }
        return ans;
    }

    //See this vid for clarification on BFS/DFS:https://www.youtube.com/watch?v=pcKY4hjDrxk
    //https://www.youtube.com/watch?v=XZnWETlZZ14&t=100s

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