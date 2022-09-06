<<<<<<< HEAD
//6.Inorder Tree Traversal – Iterative and Recursive
//https://leetcode.com/problems/binary-tree-inorder-traversal/
//https://www.techiedelight.com/inorder-tree-traversal-iterative-recursive/
package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main6 {

    public static void main(String[] args) {

    }

    static public List<Integer> inorderTraversalIter(Node root) {
        //TC = O(n),MC = O(n)
        //Iterative
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (!stack.empty() || curr != null) { // if the current node is null and the stack is also empty, we are done
            if (curr != null) {// if the current node exists, push it into the stack and move to its left child
                stack.push(curr);
                curr = curr.left;
            } else {//else pop the stack and add that value to result and move to right of the stack
                curr = stack.pop();
                ans.add(curr.data);
                curr = curr.right;
            }
        }
        return ans;
    }

    public static List<Integer> inorderTraversal(Node root) {
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
            ans.add(root.data);
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
=======
//6.Inorder Tree Traversal – Iterative and Recursive
//https://leetcode.com/problems/binary-tree-inorder-traversal/
//https://www.techiedelight.com/inorder-tree-traversal-iterative-recursive/
package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main6 {

    public static void main(String[] args) {

    }

    static public List<Integer> inorderTraversalIter(Node root) {
        //TC = O(n),MC = O(n)
        //Iterative
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (!stack.empty() || curr != null) { // if the current node is null and the stack is also empty, we are done
            if (curr != null) {// if the current node exists, push it into the stack and move to its left child
                stack.push(curr);
                curr = curr.left;
            } else {//else pop the stack and add that value to result and move to right of the stack
                curr = stack.pop();
                ans.add(curr.data);
                curr = curr.right;
            }
        }
        return ans;
    }

    public static List<Integer> inorderTraversal(Node root) {
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
            ans.add(root.data);
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
>>>>>>> 26b1aac (Final Commit_1)
