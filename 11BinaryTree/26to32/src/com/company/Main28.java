<<<<<<< HEAD
//28.Given a binary tree and two node values your task is to find the minimum distance between them.
//https://practice.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1
package com.company;

public class Main28 {

    public static void main(String[] args) {

    }

    static int findDist(Node root, int p, int q) {
        //TC = O(n),MC = O(n)
        //Pretty much same as prev question with a slight modification, if you think about it min. distance b/w any nodes of the tree would be
        //the sum of distance of each node from the lca of the nodes.Ezpz
        Node lcaNode = lca(root, p, q);
        return find(lcaNode, p, 0) + find(lcaNode, q, 0);
    }

    static int find(Node root, int val, int lvl) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        if (root.data == val) {
            return lvl;
        }
        return Math.min(find(root.left, val, lvl + 1), find(root.right, val, lvl + 1));
    }

    static Node lca(Node root, int p, int q) {
        if (root == null || root.data == p || root.data == q) {
            return root;
        }
        Node left = lca(root.left, p, q);
        Node right = lca(root.right, p, q);
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
=======
//28.Given a binary tree and two node values your task is to find the minimum distance between them.
//https://practice.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1
package com.company;

public class Main28 {

    public static void main(String[] args) {

    }

    static int findDist(Node root, int p, int q) {
        //TC = O(n),MC = O(n)
        //Pretty much same as prev question with a slight modification, if you think about it min. distance b/w any nodes of the tree would be
        //the sum of distance of each node from the lca of the nodes.Ezpz
        Node lcaNode = lca(root, p, q);
        return find(lcaNode, p, 0) + find(lcaNode, q, 0);
    }

    static int find(Node root, int val, int lvl) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        if (root.data == val) {
            return lvl;
        }
        return Math.min(find(root.left, val, lvl + 1), find(root.right, val, lvl + 1));
    }

    static Node lca(Node root, int p, int q) {
        if (root == null || root.data == p || root.data == q) {
            return root;
        }
        Node left = lca(root.left, p, q);
        Node right = lca(root.right, p, q);
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
>>>>>>> 26b1aac (Final Commit_1)
