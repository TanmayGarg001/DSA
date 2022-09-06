<<<<<<< HEAD
//29.Given a binary tree in which nodes are numbered from 1 to n. Given a node and a positive integer K.
//We have to print the Kth ancestor of the given node in the binary tree. If there does not exist any such ancestor then print -1.
//https://www.geeksforgeeks.org/kth-ancestor-node-binary-tree-set-2/
package com.company;

public class Main29 {
    static Node temp = null;
    static int k;

    public static void main(String[] args) {

    }

    static Node kthAncestorDFS(Node root, int node) {
        //TC = O(n),MC = O(n)
        if (root == null) {
            return null;
        }
        if (root.data == node || (temp = kthAncestorDFS(root.left, node)) != null || (temp = kthAncestorDFS(root.right, node)) != null) {
            if (k > 0) {
                k--;
            } else if (k == 0) {
                System.out.print("Kth ancestor is: " + root.data);
                return null; // return null to stop further backtracking
            }
            return root;// return current node to previous call
        }
        return null;
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
//29.Given a binary tree in which nodes are numbered from 1 to n. Given a node and a positive integer K.
//We have to print the Kth ancestor of the given node in the binary tree. If there does not exist any such ancestor then print -1.
//https://www.geeksforgeeks.org/kth-ancestor-node-binary-tree-set-2/
package com.company;

public class Main29 {
    static int k;

    public static void main(String[] args) {

    }

    static Node kthAncestorDFS(Node root, int node) {
        //TC = O(n),MC = O(n)
        if (root == null) {
            return null;
        }
        if (root.data == node || kthAncestorDFS(root.left, node) != null || kthAncestorDFS(root.right, node) != null) {
            if (k > 0) {
                k--;
            } else if (k == 0) {
                System.out.print("Kth ancestor is: " + root.data);
                return null; // return null to stop further backtracking
            }
            return root;// return current node to previous call
        }
        return null;
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
