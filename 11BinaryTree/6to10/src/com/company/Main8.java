//8.Postorder Tree Traversal – Iterative and Recursive
//https://leetcode.com/problems/binary-tree-postorder-traversal/
//https://www.techiedelight.com/postorder-tree-traversal-iterative-recursive/
package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main8 {

    public static void main(String[] args) {

    }

    // Iterative function to perform postorder traversal on the tree
    public static List<Integer> postorderIterative(Node root) {
        //TC = O(n),MC = O(n)
        //Iterative
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Stack<Node> stack = new Stack<>();// create an empty stack and push the root node
        stack.push(root);
        Stack<Integer> out = new Stack<>();// create another stack to store postorder traversal

        while (!stack.empty()) {// loop till stack is empty
            Node curr = stack.pop();// pop a node from the stack and push the data into the output stack
            out.push(curr.data);
            if (curr.left != null) {// push the left and right child of the popped node into the stack
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        while (!out.empty()) {
            ans.add(out.pop());
        }
        return ans;
    }

    public static List<Integer> postorderTraversal(Node root) {
        //TC = O(n),MC = O(n)
        //Recursion
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        solve(root, ans);
        return ans;
    }

    public static void solve(Node root, ArrayList<Integer> ans) {
        if (root != null) {
            solve(root.left, ans);
            solve(root.right, ans);
            ans.add(root.data);
        }
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