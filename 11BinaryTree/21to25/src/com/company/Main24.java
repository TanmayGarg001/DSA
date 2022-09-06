<<<<<<< HEAD
//24.Given the root of a binary tree, return all duplicate subtrees.For each kind of duplicate subtrees, you only need to return the root node of any one of them.
//Two trees are duplicate if they have the same structure with the same node values.
//https://www.geeksforgeeks.org/serialize-deserialize-binary-tree/
//https://leetcode.com/problems/find-duplicate-subtrees/
package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main24 {

    public static void main(String[] args) {

    }

    public List<Node> findDuplicateSubtrees(Node root) {
        //TC = O(n^2),MC = O(n)
        //We perform postorder traversal, serializing and hashing the serials of subtrees in the process. We can recognize a duplicate subtree by its serialization.
        List<Node> res = new LinkedList<>();
        postorder(root, new HashMap<>(), res);
        return res;
    }

    public String postorder(Node cur, HashMap<String, Integer> map, List<Node> res) {
        if (cur == null) return "#";
        String serial = cur.data + "," + postorder(cur.left, map, res) + "," + postorder(cur.right, map, res);
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        if (map.get(serial) == 2) res.add(cur);
        return serial;
    }

    public boolean isSubtree(Node tree, Node subTree) {
        //TC = O(n),MC =O(n)
        if (tree == null) {
            return false;
        }
        if (isSame(tree, subTree)) {
            return true;
        }
        return isSubtree(tree.left, subTree) || isSubtree(tree.right, subTree);
    }

    private boolean isSame(Node tree, Node subTree) {
        if (tree == null && subTree == null) {
            return true;
        }
        if (tree == null || subTree == null) {
            return false;
        }
        if (tree.data != subTree.data) {
            return false;
        }
        return isSame(tree.left, subTree.left) && isSame(tree.right, subTree.right);
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
//24.Given the root of a binary tree, return all duplicate subtrees.For each kind of duplicate subtrees, you only need to return the root node of any one of them.
//Two trees are duplicate if they have the same structure with the same node values.
//https://www.geeksforgeeks.org/serialize-deserialize-binary-tree/
//https://leetcode.com/problems/find-duplicate-subtrees/
package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main24 {

    static HashMap<String, Integer> hmap;

    public static void findDuplicateSubtrees(Node root) {
        //TC = O(n^2),MC = O(n)
        //We perform postorder traversal, serializing and hashing the serials of subtrees in the process. We can recognize a duplicate subtree by its serialization.
        hmap = new HashMap<>();
        ArrayList<Node> ans = new ArrayList<>();
        solve(root, ans);
    }

    public static String solve(Node root, ArrayList<Node> ans) {
        if (root == null) {
            return "#";
        }
        String left = solve(root.left, ans);
        String right = solve(root.right, ans);
        String s = left + root.data + right;
        hmap.put(s, hmap.getOrDefault(s, 0) + 1);
        if (hmap.get(s) == 2) {
            ans.add(root);
        }
        return s;
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
