<<<<<<< HEAD
//1.Given a Binary Search Tree and a node value X, find if the node with value X is present in the BST or not.
//https://leetcode.com/problems/search-in-a-binary-search-tree/
//https://practice.geeksforgeeks.org/problems/search-a-node-in-bst/1/#
package com.company;

public class Main1 {

    public static void main(String[] args) {

    }

    boolean search(Node root, int x) {
        //TC = O(h), MC = O(n)
        //basic recursive code
        if (root == null) {
            return false;
        } else if (root.data == x) {
            return true;
        } else if (root.data > x) {
            return search(root.left, x);
        } else {
            return search(root.right, x);
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
=======
//1.Given a Binary Search Tree and a node value X, find if the node with value X is present in the BST or not.
//https://leetcode.com/problems/search-in-a-binary-search-tree/
//https://practice.geeksforgeeks.org/problems/search-a-node-in-bst/1/#
package com.company;

public class Main1 {

    public static void main(String[] args) {

    }

    boolean search(Node root, int x) {
        //TC = O(h), MC = O(n)
        //basic recursive code
        if (root == null) {
            return false;
        } else if (root.data == x) {
            return true;
        } else if (root.data > x) {
            return search(root.left, x);
        } else {
            return search(root.right, x);
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
>>>>>>> 26b1aac (Final Commit_1)
