<<<<<<< HEAD
//10.Given a Binary Tree, find Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.
//Right view of following tree is 1 3 7 8.
//          1
//        /   \
//      2       3
//    /  \    /   \
//   4    5  6    7
//    \
//     8
//https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1#
package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main10 {

    public static void main(String[] args) {

    }

    public static List<Integer> rightView(Node root) {
        //TC = O(n),MC = O(n)
        //Iterative way
        //It's simple: we use level order traversal and keep adding the very last element of each level in binaryTree to our result ans then return it.
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
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
            ans.add(currLvl.get(currLvl.size() - 1));
        }
        return ans;
    }

    public static List<Integer> rightViewRecursive(Node root) {
        //TC = O(n),MC = O(n)
        //Recursive way: little faster and memory efficient than iterative way
        //The idea is we keep track of level i.e. depth and move level wise to each node and add that node if it is the first node from the right side.
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root, ans, 0);
        return ans;
    }

    public static void solve(Node root, ArrayList<Integer> ans, int level) {
        if (root == null) {
            return;
        }
        if (level == ans.size()) {
            ans.add(root.data);
        }
        solve(root.right, ans, level + 1);
        solve(root.left, ans, level + 1);
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
//10.Given a Binary Tree, find Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.
//Right view of following tree is 1 3 7 8.
//          1
//        /   \
//      2       3
//    /  \    /   \
//   4    5  6    7
//    \
//     8
//https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1#
package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main10 {

    public static void main(String[] args) {

    }

    public static List<Integer> rightView(Node root) {
        //TC = O(n),MC = O(n)
        //Iterative way
        //It's simple: we use level order traversal and keep adding the very last element of each level in binaryTree to our result ans then return it.
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
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
            ans.add(currLvl.get(currLvl.size() - 1));
        }
        return ans;
    }

    public static List<Integer> rightViewRecursive(Node root) {
        //TC = O(n),MC = O(n)
        //Recursive way: little faster and memory efficient than iterative way
        //The idea is we keep track of level i.e. depth and move level wise to each node and add that node if it is the first node from the right side.
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root, ans, 0);
        return ans;
    }

    public static void solve(Node root, ArrayList<Integer> ans, int level) {
        if (root == null) {
            return;
        }
        if (level == ans.size()) {
            ans.add(root.data);
        }
        solve(root.right, ans, level + 1);
        solve(root.left, ans, level + 1);
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
