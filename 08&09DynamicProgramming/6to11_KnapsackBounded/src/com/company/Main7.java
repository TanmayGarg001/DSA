package com.company;

public class Main7 {
    //Partition problem is to determine whether a given set can be partitioned into two subsets such that the sum of elements in both subsets is the same.
//https://www.geeksforgeeks.org/partition-problem-dp-18/
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 4, 3, 9, 12};
        System.out.println(equalPartition(7, arr));
    }

    public static int equalPartition(int n, int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = i + sum;
        }
        if (sum % 2 != 0) {
            return 0;//can't be divided into 2 same sum subsets.
        } else {
            if (table(arr, sum / 2, n)) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean table(int[] arr, int w, int n) {
        boolean[][] t = new boolean[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (j == 0) {
                    t[i][j] = true;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }


}
