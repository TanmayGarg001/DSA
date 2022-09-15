//17.Construct a binary tree from a string consisting of parenthesis and integers. The whole input represents a binary tree. It contains an integer followed by zero,
//one or two pairs of parenthesis. The integer represents the root’s value and a pair of parenthesis contains a child binary tree with the same structure.
//Always start to construct the left child node of the parent first if it exists.
//https://www.geeksforgeeks.org/construct-binary-tree-string-bracket-representation/
package com.company;

import java.util.Stack;

public class Main17 {

    public static void main(String[] args) {
        String s = "4(2(3)(1))(6(5))";
        preOrder(treeFromString(s));
    }

    public static Node treeFromString(String s) {
        if (s.length() == 0) {
            return null;
        }
        if (s.length() == 1) {
            return new Node(Integer.parseInt(s));
        }
        Node root = new Node(Integer.parseInt(String.valueOf(s.charAt(0))));
        Node rt = root;
        Node temp = null;
        Stack<Character> stack = new Stack<>();
        stack.push('(');
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                stack.pop();
                rt = temp;
            } else {
                temp = rt;
                int data = Integer.parseInt(String.valueOf(s.charAt(i)));
                if (rt.left == null) {
                    rt.left = new Node(data);
                    rt = rt.left;
                } else {
                    rt.right = new Node(data);
                }
            }
        }
        System.out.println(stack);
        return root;
    }

    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
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