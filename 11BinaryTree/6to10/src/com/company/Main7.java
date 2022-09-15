//7.Preorder Tree Traversal – Iterative and Recursive
//https://leetcode.com/problems/binary-tree-preorder-traversal/
//https://www.techiedelight.com/preorder-tree-traversal-iterative-recursive/
package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main7 {

    public static void main(String[] args) {

    }

    static public List<Integer> preorderTraversalIter(Node root) {
        //TC = O(n),MC = O(n)
        //Iterative
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            ans.add(curr.data);
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
        return ans;
    }

    public static List<Integer> preOrderTraversal(Node root) {
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
            ans.add(root.data);
            solve(root.left, ans);
            solve(root.right, ans);
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