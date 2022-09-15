//14.Given a binary tree. Find the size of its largest subtree that is a Binary Search Tree.
//Note: Here Size is equal to the number of nodes in the subtree.
//https://practice.geeksforgeeks.org/problems/largest-bst/1
package com.company;

public class Main14 {

    public static void main(String[] args) {
        //Approach1: Validate BST and then count number of nodes after validation but TC is O(n^2)

        //Approach2: To optimize it, think of this like: for a BST, a node will be a BST if it is greater than the greatest element on its LHS
        //and if the node is smaller than the smallest element on its RHS. To achieve this we build up BST from bottom so that we can have track of
        //Max,Min and Size till that point. To store these variables we make a class.
        //To solve this we need to perform postOrder traversal as we go to the left side first and then right side and at last we do the work at node.
        //If we encounter a null node then we will compare the currMax with MIN_VAl and vice versa.
    }

    static int largestBst(Node root) {
        //TC = O(n),MC = O(h)
        return getSize(root).size;
    }

    static StoreNode getSize(Node node) {
        if (node == null) {
            StoreNode temp = new StoreNode();
            temp.size = 0;
            temp.min = Integer.MAX_VALUE;
            temp.max = Integer.MIN_VALUE;
            return temp;
        }

        StoreNode np = new StoreNode();
        StoreNode l = getSize(node.left);
        StoreNode r = getSize(node.right);

        if (l.max < node.data && node.data < r.min) {
            np.size = l.size + r.size + 1;
            np.min = Math.min(node.data, l.min);
            np.max = Math.max(node.data, r.max);
        } else {
            np.size = Math.max(l.size, r.size);
            np.min = Integer.MIN_VALUE;
            np.max = Integer.MAX_VALUE;
        }
        return np;
    }

    public static class StoreNode {
        int size;
        int min;
        int max;
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
//    static int largestBst(Node root) {
//        ArrayList<Integer> al = new ArrayList<>();
//        inOrder(root, al);
//        int i = 0;
//        int j = 0;
//        int ans = 0;
//        while (j < al.size() - 1) {
//            if (al.get(j) > al.get(j + 1)) {
//                int temp = j - i;
//                ans = Math.max(ans, temp);
//                i = j;
//            }
//            j++;
//        }
//        return ans;
//    }
//
//    static void inOrder(Node root, ArrayList<Integer> al) {
//        if (root != null) {
//            inOrder(root.left, al);
//            al.add(root.data);
//            inOrder(root.right, al);
//        }
//    }