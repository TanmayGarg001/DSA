<<<<<<< HEAD
//31.Given two Binary Trees. Check whether they are Isomorphic or not.
//Two trees are called isomorphic if one can be obtained from another by a series of flips, i.e. by swapping left and right children of several nodes.
//Any number of nodes at any level can have their children swapped. Two empty trees are isomorphic.
//For example, the following two trees are isomorphic with the following subtrees flipped: 2 and 3, NULL and 6, 7 and 8.
//https://practice.geeksforgeeks.org/problems/check-if-tree-is-isomorphic/1#
package com.company;

public class Main31 {

    public static void main(String[] args) {

    }

    static boolean isIsomorphic(Node root1, Node root2) {
        //TC = O(n),MC = O(n),basic recursion
        if (root1 == null && root2 == null) return true;//base case
        if (root1 == null || root2 == null || root1.data != root2.data) return false;
        return (isIsomorphic(root1.left, root2.left) && isIsomorphic(root1.right, root2.right)) || //we consider both the cases coz we don't know if nodes were flipped or not
                (isIsomorphic(root1.left, root2.right) && isIsomorphic(root1.right, root2.left));
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
//31.Given two Binary Trees. Check whether they are Isomorphic or not.
//Two trees are called isomorphic if one can be obtained from another by a series of flips, i.e. by swapping left and right children of several nodes.
//Any number of nodes at any level can have their children swapped. Two empty trees are isomorphic.
//For example, the following two trees are isomorphic with the following subtrees flipped: 2 and 3, NULL and 6, 7 and 8.
//https://practice.geeksforgeeks.org/problems/check-if-tree-is-isomorphic/1#
package com.company;

public class Main31 {

    public static void main(String[] args) {

    }

    static boolean isIsomorphic(Node root1, Node root2) {
        //TC = O(n),MC = O(n),basic recursion
        if (root1 == null && root2 == null) return true;//base case
        if (root1 == null || root2 == null || root1.data != root2.data) return false;
        return (isIsomorphic(root1.left, root2.left) && isIsomorphic(root1.right, root2.right)) || //we consider both the cases coz we don't know if nodes were flipped or not
                (isIsomorphic(root1.left, root2.right) && isIsomorphic(root1.right, root2.left));
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
