<<<<<<< HEAD
//5.Given a binary tree, the task is to create a new binary tree which is a mirror image of the given binary tree.
//https://www.geeksforgeeks.org/create-a-mirror-tree-from-the-given-binary-tree/
//https://leetcode.com/problems/invert-binary-tree/
package com.company;

public class Main5 {

    public static void main(String[] args) {

    }

    public Node invertTree(Node root) {
        //TC = O(n),MC = O(n)
        //Again similar as prev questions
        //Other way could be to swap whilst using level order traversal.
        if (root == null) {
            return null;
        }
        Node left = invertTree(root.left);
        Node right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
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
//5.Given a binary tree, the task is to create a new binary tree which is a mirror image of the given binary tree.
//https://www.geeksforgeeks.org/create-a-mirror-tree-from-the-given-binary-tree/
//https://leetcode.com/problems/invert-binary-tree/
package com.company;

public class Main5 {

    public static void main(String[] args) {

    }

    public Node invertTree(Node root) {
        //TC = O(n),MC = O(n)
        //Again similar as prev questions
        //Other way could be to swap whilst using level order traversal.
        if (root == null) {
            return null;
        }
        Node left = invertTree(root.left);
        Node right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
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
