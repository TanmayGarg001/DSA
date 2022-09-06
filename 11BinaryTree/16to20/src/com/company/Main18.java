<<<<<<< HEAD
//18.Given the root of a binary tree, flatten the tree into a "linked list"
//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
//https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1
package com.company;

public class Main18 {

    static private Node prev = null;

    public static void main(String[] args) {

    }

    static public void flatten(Node root) {
        //TC = O(n),MC = O(n)
        //Recursive code.
        if (root == null) {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

    public static Node bToDLL(Node root) {
        //TC = O(n),MC = O(n)
        //Recursive code.
        if (root == null) {
            return null;
        }
        Node temp = bToDLL(root.left);
        root.right = bToDLL(root.right);
        if (root.right != null) {
            root.right.left = root;
        }
        while (temp != null && temp.right != null) {
            temp = temp.right;
        }
        if (temp != null) {
            temp.right = root;
        }
        root.left = temp;
        Node start = root;
        while (start.left != null) {
            start = start.left;
        }
        return start;
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
//18.Given the root of a binary tree, flatten the tree into a "linked list"
//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
//https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1
package com.company;

public class Main18 {

    static private Node prev = null;

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.left.right = new Node(7);
        root.right.right = new Node(6);
        flatten(root);
    }

    static public void flatten(Node root) {
        //TC = O(n),MC = O(n)
        //Recursive code.
        if (root == null) {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

    public static void bToDLL(Node root) {
        //TC = O(n),MC = O(n)
        Node cur = root;
        while (cur != null) {
            if (cur.left != null) {
                Node last = cur.left;
                while (last.right != null) {
                    last = last.right;
                }
                last.right = cur.right;
                cur.right = cur.left;
                cur.left = null;
            }
            cur = cur.right;
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
>>>>>>> 26b1aac (Final Commit_1)
