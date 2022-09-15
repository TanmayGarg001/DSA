//4.There is BST given with root node with key part as integer only. You need to find the inorder successor and predecessor
//of a given key. In case, if the either of predecessor or successor is not found print -1.
//https://practice.geeksforgeeks.org/problems/predecessor-and-successor/1#
package com.company;

public class Main4 {

    public static void main(String[] args) {

    }

    public static void findPreSuc(Node root, Res p, Res s, int key) {
        //The predecessor of a node in BST is that node that will be visited just before the given node in the inorder traversal of the tree, and vice versa for successor
        //To find these we simply traverse the tree in left and right directions and keep doing that till we find our req. result.
        //The predecessor is known as before numbers (that appear just before) and the successor is known as after numbers (that appear just after).
        Node curr = root;
        while (curr != null) {
            if (curr.data < key) {
                p.pre = curr;
                curr = curr.right;
            } else curr = curr.left;
        }
        curr = root;
        while (curr != null) {
            if (curr.data > key) {
                s.succ = curr;
                curr = curr.left;
            } else curr = curr.right;
        }
    }

    public static class Res {
        Node pre = null;
        Node succ = null;
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