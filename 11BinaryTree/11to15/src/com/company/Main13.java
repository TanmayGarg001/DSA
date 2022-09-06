<<<<<<< HEAD
//13.Given a Binary Tree. Find the Zig-Zag Level Order Traversal of the Binary Tree.
//https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1#
//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/submissions/
package com.company;

import java.util.*;

public class Main13 {

    public static void main(String[] args) {

    }

    ArrayList<Integer> zigZagTraversal(Node root) {
        //TC = O(n),MC = O(n)
        //Pretty much same as level order traversal the only difference being currLvl will be added and reversed at odd levels.
        ArrayList<Integer> result = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int x = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> currLvl = new ArrayList<>();
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
            if (x % 2 != 0) {
                Collections.reverse(currLvl);
                ans.add(currLvl);
            }
            result.addAll(currLvl);//add all the arrayList's element to the result ArrayList
            x++;
        }
        return result;
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
=======
//13.Given a Binary Tree. Find the Zig-Zag Level Order Traversal of the Binary Tree.
//https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1#
//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/submissions/
package com.company;

import java.util.*;

public class Main13 {

    public static void main(String[] args) {

    }

    List<List<Integer>> zigZagTraversal(Node root) {
        //TC = O(n),MC = O(n)
        //Pretty much same as level order traversal the only difference being currLvl will be added and reversed at odd levels.
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> currLvl = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                currLvl.add(node.data);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            if (ans.size() % 2 != 0) {
                Collections.reverse(currLvl);
                ans.add(currLvl);
            } else {
                ans.add(currLvl);
            }
        }
        return ans;
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
>>>>>>> 26b1aac (Final Commit_1)
