<<<<<<< HEAD
//4.The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two end nodes.
//The diagram below shows two trees each with diameter nine, the leaves that form the ends of the longest path are shaded
//(note that there is more than one path in each tree of length nine, but no path longer than nine nodes).
//https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1
package com.company;

public class Main4 {

    private static int ans = 0;

    public static void main(String[] args) {

    }

    static int diameter(Node root) {
        //TC = O(n),MC = O(n)
        //Uses DFS
        //Somewhat similar to prev questions with slight modifications i.e.
        //the left side max height and the right side max height of tree and their sum would be the answer (observation)
        if (root == null) {
            return 0;
        }
        ans = 0;
        solve(root);
        return ans;
    }

    public static int solve(Node root) {
        if (root == null) {
            return 0;
        }
        int left = solve(root.left);
        int right = solve(root.right);
        ans = Math.max(ans, left + right);
        return 1 + Math.max(left, right);
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
//4.The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two end nodes.
//The diagram below shows two trees each with diameter nine, the leaves that form the ends of the longest path are shaded
//(note that there is more than one path in each tree of length nine, but no path longer than nine nodes).
//https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1
package com.company;

public class Main4 {

    private static int ans = 0;

    public static void main(String[] args) {

    }

    static int diameter(Node root) {
        //TC = O(n),MC = O(n)
        //Uses DFS
        //Somewhat similar to prev questions with slight modifications i.e.
        //the left side max height and the right side max height of tree and their sum would be the answer (observation)
        if (root == null) {
            return 0;
        }
        ans = 0;
        solve(root);
        return ans;
    }

    public static int solve(Node root) {
        if (root == null) {
            return 0;
        }
        int left = solve(root.left);
        int right = solve(root.right);
        ans = Math.max(ans, left + right + 1);
        return 1 + Math.max(left, right);
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
