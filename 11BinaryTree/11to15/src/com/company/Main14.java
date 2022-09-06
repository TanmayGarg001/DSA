<<<<<<< HEAD
//14.Given a binary tree, find if it is height balanced or not.
//A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree.
//A height balanced tree:
//        1
//     /     \
//   10      39
//  /
//5
//An unbalanced tree:
//        1
//     /
//   10
//  /
//5
//https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1#
package com.company;

public class Main14 {

    public static void main(String[] args) {

    }

    public static boolean isBalanced(Node root) {
        //TC = O(n),MC = O(n)
        //can also be done with level order traversal.
        if (root == null) {
            return true;
        }
        int leftSubtreeHeight = height(root.left);//calculates the height of left subTree
        int rightSubtreeHeight = height(root.right);//calculates the height of right subTree
        if (Math.abs(leftSubtreeHeight - rightSubtreeHeight) > 1) {//given condition check
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);//now check for the lower subTrees the same condition
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
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
//14.Given a binary tree, find if it is height balanced or not.
//A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree.
//A height balanced tree:
//        1
//     /     \
//   10      39
//  /
//5
//An unbalanced tree:
//        1
//     /
//   10
//  /
//5
//https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1#
package com.company;

public class Main14 {

    public static void main(String[] args) {

    }

    public static boolean isBalanced(Node root) {
        //TC = O(n),MC = O(n)
        //can also be done with level order traversal.
        if (root == null) {
            return true;
        }
        int leftSubtreeHeight = height(root.left);//calculates the height of left subTree
        int rightSubtreeHeight = height(root.right);//calculates the height of right subTree
        if (Math.abs(leftSubtreeHeight - rightSubtreeHeight) > 1) {//given condition check
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);//now check for the lower subTrees the same condition
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
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
