package com.company;

public class Main14 {
    //Coin change problem 1
    //https://www.geeksforgeeks.org/coin-change-dp-7/

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(coin(arr, 10, 3));
        System.out.println(coinRec(arr, 10, 3));
    }

    public static int coin(int[] coins, int w, int n) {
        int[][] t = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (j == 0) {
                    t[i][j] = 1;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (j >= coins[i - 1]) {
                    t[i][j] = t[i][j - coins[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }

    public static int coinRec(int[] coins, int w, int n) {
        if (n == 0) {
            return 0;
        }
        if (w == 0) {
            return 1;
        }
        if (w >= coins[n - 1]) {
            return coinRec(coins, w - coins[n - 1], n) + coinRec(coins, w, n - 1);
        } else {
            return coinRec(coins, w, n - 1);
        }
    }

}
