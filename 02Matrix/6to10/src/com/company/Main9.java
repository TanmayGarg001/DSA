<<<<<<< HEAD
//9.Given an N x N matrix, where every row and column is sorted in non-decreasing order. Find the kth the smallest element in the matrix.
package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main9 {

    public static void main(String[] args) {
        int[][] matrix = {{4, 5, 8, 1}, {32, 185, 0, 98}, {11, 352, 481, 100}};
        approach1(matrix, 4);
        approach2(matrix, 4);
    }

    public static void approach1(int[][] matrix, int k) {
        //TC = O(n^2) ,MC = O(n)
        //Add all the elements in arrayList and sort them , we can use TreeSet if we are required to give distinct kth the smallest answer.
        //Can be further optimized using sort of BinarySearch see approach2 for that
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                al.add(matrix[i][j]);
            }
        }
        Collections.sort(al);
        TreeSet<Integer> treeSet = new TreeSet<>(al);
        ArrayList<Integer> ans = new ArrayList<>(treeSet);
        System.out.println(ans.get(k - 1));
    }

    public static void approach2(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[m - 1][n - 1];

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] <= mid) {
                        count++;
                    }
                }
            }
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(low);
    }

}
=======
//9.Given an N x N matrix, where every row and column is sorted in non-decreasing order. Find the kth the smallest element in the matrix.
package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main9 {

    public static void main(String[] args) {
        int[][] matrix = {{4, 5, 8, 1}, {32, 185, 0, 98}, {11, 352, 481, 100}};
        approach1(matrix, 4);
        approach2(matrix, 4);
    }

    public static void approach1(int[][] matrix, int k) {
        //TC = O(n^2) ,MC = O(n)
        //Add all the elements in arrayList and sort them , we can use TreeSet if we are required to give distinct kth the smallest answer.
        //Can be further optimized using sort of BinarySearch see approach2 for that
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                al.add(matrix[i][j]);
            }
        }
        Collections.sort(al);
        TreeSet<Integer> treeSet = new TreeSet<>(al);
        ArrayList<Integer> ans = new ArrayList<>(treeSet);
        System.out.println(ans.get(k - 1));
    }

    public static void approach2(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[m - 1][n - 1];

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] <= mid) {
                        count++;
                    }
                }
            }
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(low);
    }

}
>>>>>>> 26b1aac (Final Commit_1)
