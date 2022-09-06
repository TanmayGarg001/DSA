package com.company;

public class Main9 {
    //Given an integer array arr of size N, the task is to divide it into two sets S1 and S2 such
    //that the absolute difference between their sums is minimum and find the minimum difference
    //https://www.geeksforgeeks.org/partition-a-set-into-two-subsets-such-that-the-difference-of-subset-sums-is-minimum/

    // "WATCH THIS!" :=   https://www.youtube.com/watch?v=-GtpxG6l_Mc&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=10
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 65, 21, 11, 8};
        System.out.println(minDiff(arr));
    }

    public static int minDiff(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        int ans = solve(arr, arr.length, sum);
        return sum - 2 * ans;
    }

    public static int solve(int[] arr, int n, int w) {
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
                if (arr[i - 1] > j) {
                    t[i][j] = t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j] || t[i - 1][j - arr[i - 1]];
                }
            }
        }
        // return t[n][w/2];//coz we don't know if w/2 will have t[n][w/2] as true. i.e. it's not necessary that there will be a subset in arr which will be half
        // of the net sum of the arr.
        int ans = 0;
        for (int j = 0; j <= w / 2; j++) {
            if (t[n][j]) {
                ans = j;
            }
        }
        return ans;
    }

}
