package com.company;

//Target sum problem
//https://leetcode.com/problems/target-sum/

public class Main11 {
    //BC BILKUL SAME HAI PICHLE JAISE SOCH KE DEKH SIMPLE MATHS!

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 1};
        System.out.println(findTargetSumWays(arr, 1));
    }

    public static int findTargetSumWays(int[] arr, int target) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        if (((sum - target) % 2 != 0) || (target > sum)) {
            return 0;
        }

        int n = arr.length;
        int s2 = (sum - target) / 2;
        int[][] t = new int[n + 1][s2 + 1];
        t[0][0] = 1;
        //We won't do true for all when j==0 coz the arr can have 0 elements and for arr 0,1 and target=1 ans is 2 instead of 1 coz +0 and -0 is same.
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < s2 + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j] + t[i - 1][j - arr[i - 1]];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][s2];
    }


}
