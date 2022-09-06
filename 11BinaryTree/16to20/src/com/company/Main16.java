<<<<<<< HEAD
//16.Given a Binary Tree, find its Boundary Traversal. The traversal should be in the following order:
//Left boundary nodes: defined as the path from the root to the left-most node ie- the leaf node you could reach when you always travel preferring
//the left subtree over the right subtree.
//Leaf nodes: All the leaf nodes except for the ones that are part of left or right boundary.
//Reverse right boundary nodes: defined as the path from the right-most node to the root. The right-most node is the leaf node you could reach when
//you always travel preferring the right subtree over the left subtree. Exclude the root from this as it was already included in the traversal of left boundary nodes.
//https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main16 {

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> boundary(Node root) {
        //TC = O(n),MC= O(n)
        //We divide the question in 3 parts 1st we do left view print then bottom and then right view.
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        if (isLeafNode(root)) {//base cases
            ans.add(root.data);
            return ans;
        }
        ans.add(root.data);
        leftView(root.left, ans);//from top to bottom left view
        bottomView(root, ans);//from left to right bottom view
        ArrayList<Integer> temp = rightView(root.right);//here the problem is we have to print right view from bottom to top, so we reverse the arrayList for this part
        ans.addAll(temp);//and at last add all the elements of right side to our answer and then return it.
        return ans;
    }

    public static void leftView(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }
        Node node = root;
        while (!isLeafNode(node)) {
            ans.add(node.data);
            if (node.left != null) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
    }

    public static void bottomView(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }
        bottomView(root.left, ans);
        if (isLeafNode(root)) {
            ans.add(root.data);
        }
        bottomView(root.right, ans);
    }

    public static ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> al = new ArrayList<>();
        if (root == null) {
            return al;
        }
        Node node = root;
        while (!isLeafNode(node)) {
            al.add(node.data);
            if (node.right != null) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
        Collections.reverse(al);
        return al;
    }

    public static boolean isLeafNode(Node node) {
        return node.left == null && node.right == null;
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
//16.Given a Binary Tree, find its Boundary Traversal. The traversal should be in the following order:
//Left boundary nodes: defined as the path from the root to the left-most node ie- the leaf node you could reach when you always travel preferring
//the left subtree over the right subtree.
//Leaf nodes: All the leaf nodes except for the ones that are part of left or right boundary.
//Reverse right boundary nodes: defined as the path from the right-most node to the root. The right-most node is the leaf node you could reach when
//you always travel preferring the right subtree over the left subtree. Exclude the root from this as it was already included in the traversal of left boundary nodes.
//https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class  Main16 {

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> boundary(Node root) {
        //TC = O(n),MC= O(n)
        //We divide the question in 3 parts 1st we do left view print then bottom and then right view.
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        if (isLeafNode(root)) {//base cases
            ans.add(root.data);
            return ans;
        }
        ans.add(root.data);
        leftView(root.left, ans);//from top to bottom left view
        bottomView(root, ans);//from left to right bottom view
        ArrayList<Integer> temp = rightView(root.right);//here the problem is we have to print right view from bottom to top, so we reverse the arrayList for this part
        ans.addAll(temp);//and at last add all the elements of right side to our answer and then return it.
        return ans;
    }

    public static void leftView(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }
        Node node = root;
        while (!isLeafNode(node)) {
            ans.add(node.data);
            if (node.left != null) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
    }

    public static void bottomView(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }
        bottomView(root.left, ans);
        if (isLeafNode(root)) {
            ans.add(root.data);
        }
        bottomView(root.right, ans);
    }

    public static ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> al = new ArrayList<>();
        if (root == null) {
            return al;
        }
        Node node = root;
        while (!isLeafNode(node)) {
            al.add(node.data);
            if (node.right != null) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
        Collections.reverse(al);
        return al;
    }

    public static boolean isLeafNode(Node node) {
        return node.left == null && node.right == null;
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
