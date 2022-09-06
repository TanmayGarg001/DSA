<<<<<<< HEAD
//7.Given a Binary Search Tree (with all values unique) and two node values. Find the Lowest Common Ancestors of the two nodes in the BST.
//https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1
package com.company;

public class Main7 {

    public static void main(String[] args) {

    }

    Node lca(Node root, int p, int q) {
        //TC = O(h),MC = O(h)
        //For Binary search tree, while traversing the tree from top to bottom the first node which lies in between the two numbers p and q is the LCA of the nodes,
        //i.e. the first node n with the lowest depth which lies in between p and q
        if (root == null) {
            return null;
        }
        if (root.data > p && root.data > q) {
            return lca(root.left, p, q);
        }
        if (root.data < p && root.data < q) {
            return lca(root.right, p, q);
        }
        return root;
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
//7.Given a Binary Search Tree (with all values unique) and two node values. Find the Lowest Common Ancestors of the two nodes in the BST.
//https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1
package com.company;

public class Main7 {

    public static void main(String[] args) {

    }

    Node lca(Node root, int p, int q) {
        //TC = O(h),MC = O(h)
        //For Binary search tree, while traversing the tree from top to bottom the first node which lies in between the two numbers p and q is the LCA of the nodes,
        //i.e. the first node n with the lowest depth which lies in between p and q
        if (root == null) {
            return null;
        }
        if (root.data > p && root.data > q) {
            return lca(root.left, p, q);
        }
        if (root.data < p && root.data < q) {
            return lca(root.right, p, q);
        }
        return root;
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
