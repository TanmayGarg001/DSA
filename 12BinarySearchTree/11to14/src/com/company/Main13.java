//13.Given a Binary search Tree that contains positive integer values greater than 0. The task is to complete the function isDeadEnd which returns
//true if the BST contains a dead end else returns false. Here Dead End means, we are not able to insert any element after that node.
//https://practice.geeksforgeeks.org/problems/check-whether-bst-contains-dead-end/1#
package com.company;

public class Main13 {

    public static void main(String[] args) {

    }

    public static boolean isDeadEnd(Node root) {
        //TC = O(n),MC = O(n)
        //if BST has elements like x-1,x,x+1 then it means that deadEnd will exist coz we won't be able to add elements in between those number in the tree.
        return deadEnd(root, 1, Integer.MAX_VALUE);
    }

    static boolean deadEnd(Node root, int min, int max) {
        if (root == null) {
            return false;
        }
        if (min == max) {
            return true;
        }
        return deadEnd(root.left, min, root.data - 1) || deadEnd(root.right, root.data + 1, max);

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