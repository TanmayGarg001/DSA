//30.Given a binary tree of size N, your task is to that find all duplicate subtrees from the given binary tree.
//https://practice.geeksforgeeks.org/problems/duplicate-subtrees/1#
//https://leetcode.com/problems/find-duplicate-subtrees/
package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main30 {

    public static void main(String[] args) {

    }

    static public List<Node> findDuplicateSubtrees(Node root) {
        //TC = O(n),MC = O(n)
        //Serialization is the process of converting an object into a stream of bytes to store the object or transmit it to memory, a database, or a file
        List<Node> res = new ArrayList<>();
        postorder(root, new HashMap<>(), res);
        return res;
    }

    static public String postorder(Node cur, Map<String, Integer> map, List<Node> res) {
        if (cur == null) {
            return "#";
        }
        //we use serialization to store a tree's
        String serial = cur.data + "," + postorder(cur.left, map, res) + "," + postorder(cur.right, map, res);
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        if (map.get(serial) == 2) {
            res.add(cur);
        }
        return serial;
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