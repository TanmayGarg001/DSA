//5.Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
//Basically, the deletion can be divided into two stages:
//Search for a node to remove.
//If the node is found, delete the node.
//https://leetcode.com/problems/delete-node-in-a-bst/
//https://practice.geeksforgeeks.org/problems/delete-a-node-from-bst/1/
package com.company;

public class Main5 {

    public static void main(String[] args) {

    }

    public static Node deleteNode(Node root, int key) {
        //TC = O(h),MC = O(h) (h is the height of BST)
        if (root == null) {
            return null;
        }
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
            return root;
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
            return root;
        } else {//when root.data==key we will have 3 cases when we have 0,1 or 2 children of the node to be removed
            if (root.left == null && root.right == null) {//0 child
                return null;
            } else if (root.left == null) {//1 child only
                return root.right;
            } else if (root.right == null) {//1 child only
                return root.left;
            } else {//2 children, overwrite the node to be deleted by min data in right subtree
                Node min = root.right;
                while (min.left != null) {//We know that at right subtree the min value will be at leftMost node coz of BST
                    min = min.left;
                }
                root.data = min.data;
                root.right = deleteNode(root.right, min.data);
                return root;
            }
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