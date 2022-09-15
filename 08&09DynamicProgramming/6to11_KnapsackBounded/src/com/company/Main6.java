package com.company;

import java.util.ArrayList;
import java.util.Arrays;

//Given an array of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.
//https://www.geeksforgeeks.org/subset-sum-problem-dp-25/

public class Main6 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3, 34, 4, 12, 5, 2));
        int[] arr = {2, 3, 7, 8, 10};
        System.out.println(recursiveWay(arrayList, 9, arrayList.size()));
        System.out.println(table(arr, 5, 5));

    }

    public static boolean recursiveWay(ArrayList<Integer> input, int sum, int n) {
        if (sum == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (sum < input.get(n - 1)) {
            return recursiveWay(input, sum, n - 1);
        } else {
            return recursiveWay(input, sum - input.get(n - 1), n - 1) || recursiveWay(input, sum, n - 1);
        }
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
                    //i-1 means that nth element is processed whereas j is the amount w which we want to reach 0 as knapsack capacity reduces
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }

    public static boolean subsetSum(int[] A, int k) {
        int n = A.length;
        boolean[][] T = new boolean[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            T[i][0] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (A[i - 1] > j) {
                    T[i][j] = T[i - 1][j];
                } else {
                    T[i][j] = T[i - 1][j] || T[i - 1][j - A[i - 1]];
                }
            }
        }
        return T[n][k];
    }



}
