<<<<<<< HEAD
//15.Consider lines of slope -1 passing between nodes. Given a Binary Tree, print all diagonal elements in a binary tree belonging to the same line.
//https://www.geeksforgeeks.org/diagonal-traversal-of-binary-tree/
package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main15 {

    public static void main(String[] args) {
        /* Construct the following tree
               1
             /   \
            /     \
          2        3
         /        /  \
        /        /    \
       4        5      6
               / \
             /    \
            7      8
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        printDiagonalTraversal(root);
    }

    public static void printDiagonalTraversal(Node root) {
        //TC = O(n),MC = O(n)
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (root.right != null) {
            q.add(root.right);
            root=root.right;
        }
        //till now, we have queued all the rightmost elements of root node in this ex:1,3,6
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp!=null){
                System.out.print(temp.data+" ");//print the node
                Node node = temp.left;//and now queue the left node of the node
                while (node!=null){
                    q.add(node);
                    node=node.right;//and then queue all the following right nodes of that node we just made.
                }
            }else{
                System.out.println();
            }
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
//15.Consider lines of slope -1 passing between nodes. Given a Binary Tree, print all diagonal elements in a binary tree belonging to the same line.
//https://www.geeksforgeeks.org/diagonal-traversal-of-binary-tree/
package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main15 {

    public static void main(String[] args) {
        /* Construct the following tree
               1
             /   \
            /     \
          2        3
         /        /  \
        /        /    \
       4        5      6
               / \
             /    \
            7      8
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        printDiagonalTraversal(root);
    }

    public static void printDiagonalTraversal(Node root) {
        //TC = O(n),MC = O(n)
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (root.right != null) {
            q.add(root.right);
            root = root.right;
        }
        //till now, we have queued all the rightmost elements of root node in this ex:1,3,6
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp != null) {
                System.out.print(temp.data + " ");//print the node
                Node node = temp.left;//and now queue the left node of the node
                while (node != null) {
                    q.add(node);
                    node = node.right;//and then queue all the following right nodes of that node we just made.
                }
            } else {
                System.out.println();
            }
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
