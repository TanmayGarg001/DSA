package com.company;

public class Main15 {
    //Coin change problem 2
    //https://www.geeksforgeeks.org/find-minimum-number-of-coins-that-make-a-change/
    //https://www.youtube.com/watch?v=I-l6PBeERuc&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=16
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(coins(arr, 5, 3));
    }

    public static int coins(int[] coins, int w, int n) {
        int[][] t = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0) {
                    t[i][j] = Integer.MAX_VALUE - 1;
                }
            }
        }
        t[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (j >= coins[i - 1]) {
                    t[i][j] = Math.min(1 + t[i][j - coins[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        if (t[n][w] > 214783640) {//INT MAX RANGE!
            return -1;
        }
        return t[n][w];
    }


}
