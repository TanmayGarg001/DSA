//27.Given a Binary Tree with all unique values and two nodes value, n1 and n2. The task is to find the lowest common ancestor of the given two nodes.
//We may assume that either both n1 and n2 are present in the tree or none of them are present.
//https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
package com.company;

public class Main27 {

    public static void main(String[] args) {
        //           2
        //        4     1
        //     3     5     7(q)
        //   N   N 32 10(p)
        //N= null
    }

    public static Node lca(Node root, int p, int q) {//lowest common ancestor
        //TC = O(n),MC = O(n)
        //Consider an example of binary tree and then observe it. It's easy
        if (root == null || root.data == p || root.data == q) {//base case, if we found the value at root node then it is the answer itself (ofc)
            return root;
        }
        Node left = lca(root.left, p, q);//recursively do the work for left and right subtree
        Node right = lca(root.right, p, q);
        if (left == null) {//if p or q is not found then return right node coz we might find them there, see the example for clarity
            return right;
        } else if (right == null) {
            return left;
        } else return root;
    }

    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        } else return root;
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