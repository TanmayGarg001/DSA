<<<<<<< HEAD
//2.Given a binary tree of size N, find its reverse level order traversal. ie- the traversal must begin from the last level.
//https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1
package com.company;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> reverseLevelOrder(Node root) {
        //TC = O(n),MC = O(n)
        //Very similar to prev question.
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        ArrayList<Node> al = new ArrayList<>();
        al.add(root);
        while (!al.isEmpty()) {
            Node temp = al.remove(0);
            ans.add(temp.data);
            if (temp.right != null) {
                al.add(temp.right);
            }
            if (temp.left != null) {
                al.add(temp.left);
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    public List<List<Integer>> levelOrderBottom(Node root) {
        //TC = O(n),MC = O(n)
        //Same as prev que just reverse it at last
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
        Collections.reverse(ans);
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
=======
//2.Given a binary tree of size N, find its reverse level order traversal. ie- the traversal must begin from the last level.
//https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1
package com.company;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> reverseLevelOrder(Node root) {
        //TC = O(n),MC = O(n)
        //Very similar to prev question.
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        ArrayList<Node> al = new ArrayList<>();
        al.add(root);
        while (!al.isEmpty()) {
            Node temp = al.remove(0);
            ans.add(temp.data);
            if (temp.right != null) {
                al.add(temp.right);
            }
            if (temp.left != null) {
                al.add(temp.left);
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    public List<List<Integer>> levelOrderBottom(Node root) {
        //TC = O(n),MC = O(n)
        //Same as prev que just reverse it at last
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
        Collections.reverse(ans);
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
