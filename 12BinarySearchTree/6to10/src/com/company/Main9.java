<<<<<<< HEAD
//9.Given preorder traversal of a binary search tree, construct the BST.
//https://www.geeksforgeeks.org/construct-bst-from-given-preorder-traversal-set-2/?ref=lbp
package com.company;

import java.util.Arrays;

public class Main9 {

    private static Node root = null;
    private static int[] arr = {10, 5, 1, 7, 40, 50, 45, 69, 85};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        buildBST();
        inOrder(root);
    }

    public static void buildBST() {
        //TC = O(nlogn),MC = O(n)
        //We sort the given array to have InOrderTraversal, and then we just update it simply
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            root = solve(root, arr[i]);
        }
    }

    public static Node solve(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else if (root.data > data) {
            root.left = solve(root.left, data);
        } else if (root.data < data) {
            root.right = solve(root.right, data);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
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
=======
//9.Given preorder traversal of a binary search tree, construct the BST.
//https://www.geeksforgeeks.org/construct-bst-from-given-preorder-traversal-set-2/?ref=lbp
package com.company;

import java.util.Arrays;

public class Main9 {

    private static Node root = null;
    private static int[] arr = {10, 5, 1, 7, 40, 50, 45, 69, 85};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        buildBST();
        inOrder(root);
    }

    public static void buildBST() {
        //TC = O(nlogn),MC = O(n)
        //We sort the given array to have InOrderTraversal, and then we just update it simply
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            root = solve(root, arr[i]);
        }
    }

    public static Node solve(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else if (root.data > data) {
            root.left = solve(root.left, data);
        } else if (root.data < data) {
            root.right = solve(root.right, data);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
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
>>>>>>> 26b1aac (Final Commit_1)
