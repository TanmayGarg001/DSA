//32.Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values along the path equals targetSum.
//The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).
//https://www.geeksforgeeks.org/print-k-sum-paths-binary-tree/
//https://leetcode.com/problems/path-sum-iii/
package com.company;

import java.util.ArrayList;

public class Main32 {

    public static void main(String[] args) {

    }

    public static int solve(Node root, ArrayList<Integer> path, int targetSum) {
        //TC= O(n*h*h),MC = O(n)
        if (root == null) {
            return 0;
        }
        path.add(root.data);//preOrder traversal to store path in arrayList along the way
        int ans = 0;
        int sum = 0;
        int size = path.size();
        while (--size >= 0) {
            sum += path.get(size);
            if (targetSum == sum) {
                ans++;
            }
        }
        ans += solve(root.left, path, targetSum);
        ans += solve(root.right, path, targetSum);
        path.remove(path.size() - 1);//after printing all the possible targetSums for a particular path we remove the last node in that path, to explore further
        return ans;
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