package com.company;

//Till now, we have completed 0/1 knapsack.
//Fractional knapsack is not a DP it's just a greedy approach.
//We are now left with unbounded knapsack, so let's continue.
//Problems related to unbounded knapsack:-
//Rod Cutting
//CoinChange 1 and 2

public class Main12 {

    public static void main(String[] args) {
        //The main difference bw 0/1 and unbounded are:- in 0/1 knapsack we decide to include an item or not we can't include it more than once,that's why we reduce
        //i by 1 if we include it or not because that item it processed and is no longer useful to us, but in unbounded knapsack we can include that particular item
        //multiple times.So multiple occurrences of a same item are allowed if we decide to include that item.If we don't take that item then it is already processed.
        //So it can't be included again.See the picture.
        int[] arr1 = {1, 3, 4, 5};//wt
        int[] arr2 = {1, 4, 5, 20};//val
        System.out.println(knapsack01Recursive(arr1, arr2, 10, 4));
        System.out.println(unboundedKnapsackRecursive(arr1, arr2, 10, 4));
        System.out.println(dp01(arr1, arr2, 10, 4));
        System.out.println(dpUnbounded(arr1, arr2, 10, 4));

    }

    public static int knapsack01Recursive(int[] wt, int[] val, int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (w >= wt[n - 1]) {
            return Math.max(val[n - 1] + knapsack01Recursive(wt, val, w - wt[n - 1], n - 1), knapsack01Recursive(wt, val, w, n - 1));
        }
        if (w < wt[n - 1]) {
            return knapsack01Recursive(wt, val, w, n - 1);
        }
        return -1;
    }

    //ezpz
    public static int unboundedKnapsackRecursive(int[] wt, int[] val, int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        } else if (w >= wt[n - 1]) {
            return Math.max(val[n - 1] + unboundedKnapsackRecursive(wt, val, w - wt[n - 1], n), unboundedKnapsackRecursive(wt, val, w, n - 1));
        } else if (w < wt[n - 1]) {
            return unboundedKnapsackRecursive(wt, val, w, n - 1);
        }
        return -1;
    }

    public static int dp01(int[] wt, int[] val, int w, int n) {
        int[][] t = new int[n + 1][w + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (j >= wt[i - 1]) {
                    t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }

    //ezpz
    public static int dpUnbounded(int[] wt, int[] val, int w, int n) {
        int[][] t = new int[n + 1][w + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (j >= wt[i - 1]) {
                    t[i][j] = Math.max(val[i - 1] + t[i][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }

    //This all is very easy if you really understand 0/1 knapsack :D
}
