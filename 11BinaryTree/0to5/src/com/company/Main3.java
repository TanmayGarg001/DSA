<<<<<<< HEAD
//3.Given a binary tree, find its height.
//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1
package com.company;

public class Main3 {

    public static void main(String[] args) {

    }

    public static int calcHeight(Node root) {
        //TC = O(n),MC = O(n)
        //Basic recursion
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(calcHeight(root.left), calcHeight(root.right));
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
//3.Given a binary tree, find its height.
//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1
package com.company;

public class Main3 {

    public static void main(String[] args) {

    }

    public static int calcHeight(Node root) {
        //TC = O(n),MC = O(n)
        //Basic recursion
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(calcHeight(root.left), calcHeight(root.right));
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
