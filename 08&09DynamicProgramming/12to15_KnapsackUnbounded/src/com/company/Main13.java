package com.company;

import java.util.Arrays;

public class Main13 {
    //Rod cutting problem
    //Given a rod of length N inches and an array of prices, price[] that contains prices of all pieces of size smaller than N.
    //Determine the maximum value obtainable by cutting up the rod and selling the pieces.
    //https://www.geeksforgeeks.org/cutting-a-rod-dp-13/
    public static int[][] t = new int[1002][1002];


    public static void main(String[] args) {
        int n = 8;
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(cutRod(price, n));
        System.out.println(cutRod2(price, n));
    }

    public static int cutRod(int[] price, int n) {
        int[] len = new int[n];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        for (int i = 0; i < n; i++) {
            len[i] = i + 1;
        }
        return solve(len, price, n, n);
    }

    public static int solve(int[] len, int[] pr, int w, int n) {
        if (w == 0 || n == 0) {
            return t[n][w] = 0;
        }
        if (t[n][w] != -1) {
            return t[n][w];
        }
        if (w >= len[n - 1]) {
            return t[n][w] = Math.max(pr[n - 1] + solve(len, pr, w - len[n - 1], n), solve(len, pr, w, n - 1));
        }
        if (w < len[n - 1]) {
            return t[n][w] = solve(len, pr, w, n - 1);
        }
        return -1;
    }

    public static int cutRod2(int[] price, int n) {
        int[] len = new int[n];
        for (int i = 0; i < n; i++) {
            len[i] = i + 1;
        }
        return solve2(len, price, n, n);
    }

    public static int solve2(int[] len, int[] pr, int w, int n) {
        int[][] t = new int[n + 1][w + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (j >= len[i - 1]) {
                    t[i][j] = Math.max(pr[i - 1] + t[i][j - len[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }

}
