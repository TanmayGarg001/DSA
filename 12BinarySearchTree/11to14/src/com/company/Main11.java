<<<<<<< HEAD
//11.Given two BSTs containing N1 and N2 distinct nodes respectively and given a value x. Your task is to complete the function countPairs(),
//that returns the count of all pairs from both the BSTs whose sum is equal to x.
//https://practice.geeksforgeeks.org/problems/brothers-from-different-root/1#
package com.company;

import java.util.ArrayList;

public class Main11 {

    public static void main(String[] args) {

    }

    public static int countPairs(Node root1, Node root2, int x) {
        //TC = O(n),MC = O(n)
        //Just make 2 arrayLists add inOrder so that we can have sorted order and then just use a loop to count the answer.
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        inOrder(root1, al1);
        inOrder(root2, al2);
        int i = 0;
        int j = al2.size() - 1;
        int ans = 0;
        while (i < al1.size() && j >= 0) {
            int sum = al1.get(i) + al2.get(j);
            if (sum == x) {
                ans++;
                i++;
                j--;
            } else if (sum > x) {
                j--;
            } else {
                i++;
            }
        }
        return ans;
    }

    public static void inOrder(Node root, ArrayList<Integer> al) {
        if (root != null) {
            inOrder(root.left, al);
            al.add(root.data);
            inOrder(root.right, al);
        }
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
=======
//11.Given two BSTs containing N1 and N2 distinct nodes respectively and given a value x. Your task is to complete the function countPairs(),
//that returns the count of all pairs from both the BSTs whose sum is equal to x.
//https://practice.geeksforgeeks.org/problems/brothers-from-different-root/1#
package com.company;

import java.util.ArrayList;

public class Main11 {

    public static void main(String[] args) {

    }

    public static int countPairs(Node root1, Node root2, int x) {
        //TC = O(n),MC = O(n)
        //Just make 2 arrayLists add inOrder so that we can have sorted order and then just use a loop to count the answer.
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        inOrder(root1, al1);
        inOrder(root2, al2);
        int i = 0;
        int j = al2.size() - 1;
        int ans = 0;
        while (i < al1.size() && j >= 0) {
            int sum = al1.get(i) + al2.get(j);
            if (sum == x) {
                ans++;
                i++;
                j--;
            } else if (sum > x) {
                j--;
            } else {
                i++;
            }
        }
        return ans;
    }

    public static void inOrder(Node root, ArrayList<Integer> al) {
        if (root != null) {
            inOrder(root.left, al);
            al.add(root.data);
            inOrder(root.right, al);
        }
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
>>>>>>> 26b1aac (Final Commit_1)
