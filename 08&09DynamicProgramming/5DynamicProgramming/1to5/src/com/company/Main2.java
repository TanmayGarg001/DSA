<<<<<<< HEAD
//2.You are given weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
// Note that we have only one quantity of each item.
//In other words, given two integer arrays val[0..N-1] and wt[0..N-1] which represent values and weights associated with N items respectively.
//Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of
//this subset is smaller than or equal to W.
//You cannot break an item, either pick the complete item or don’t pick it (0-1 property).
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[][] t = new int[1002][1002];

    public static void main(String[] args) throws IOException {
        System.out.print("Enter number of test cases: ");
        int t = Integer.parseInt(br.readLine());
        testCase(t);
    }

    private static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter numberOfItems & capacity: ");
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int w = Integer.parseInt(s[1]);
            System.out.print("Enter the values: ");
            String[] b = br.readLine().split(" ");
            System.out.print("Enter the weights: ");
            String[] c = br.readLine().split(" ");
            int[] val = new int[n];
            int[] wt = new int[n];
            for (int j = 0; j < n; j++) {
                val[j] = Integer.parseInt(b[j]);
                wt[j] = Integer.parseInt(c[j]);
            }
            System.out.println("=====");
            System.out.println(approach1(w, wt, val, n));
            System.out.println("=====");
            System.out.println(approach2(w, wt, val, n));
            System.out.println("=====");
            System.out.println(approach3(w, wt, val, n));
        }
    }

    public static int approach1(int w, int[] wt, int[] val, int n) {
        //TC = O(2^n),MC = O(heap)
        //Basic recursive code.
        if (w == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= w) {
            return Math.max(val[n - 1] + approach1(w - wt[n - 1], wt, val, n - 1), approach1(w, wt, val, n - 1));
        } else {
            return approach1(w, wt, val, n - 1);
        }
    }

    public static int approach2(int w, int[] wt, int[] val, int n) {
        //TC = O(n^2),MC = O(n^2)
        //Basic recursive code with memoization.
        for (int[] r : t) {
            Arrays.fill(r, -1);
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }
        return approach2Memo(w, wt, val, n);
    }

    private static int approach2Memo(int w, int[] wt, int[] val, int n) {
        if (t[n][w] != -1) {
            return t[n][w];
        }
        if (wt[n - 1] <= w) {
            return t[n][w] = Math.max(val[n - 1] + approach2Memo(w - wt[n - 1], wt, val, n - 1), approach2Memo(w, wt, val, n - 1));
        } else {
            return t[n][w] = approach2Memo(w, wt, val, n - 1);
        }
    }

    public static int approach3(int w, int[] wt, int[] val, int n) {
        //TC = O(n^2),MC = O(n^2)
        //using DP table
        int[][] t = new int[n + 1][w + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }


}
=======
//2.You are given weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
// Note that we have only one quantity of each item.
//In other words, given two integer arrays val[0..N-1] and wt[0..N-1] which represent values and weights associated with N items respectively.
//Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of
//this subset is smaller than or equal to W.
//You cannot break an item, either pick the complete item or don’t pick it (0-1 property).
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[][] t = new int[1002][1002];

    public static void main(String[] args) throws IOException {
        System.out.print("Enter number of test cases: ");
        int t = Integer.parseInt(br.readLine());
        testCase(t);
    }

    private static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter numberOfItems & capacity: ");
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int w = Integer.parseInt(s[1]);
            System.out.print("Enter the values: ");
            String[] b = br.readLine().split(" ");
            System.out.print("Enter the weights: ");
            String[] c = br.readLine().split(" ");
            int[] val = new int[n];
            int[] wt = new int[n];
            for (int j = 0; j < n; j++) {
                val[j] = Integer.parseInt(b[j]);
                wt[j] = Integer.parseInt(c[j]);
            }
            System.out.println("=====");
            System.out.println(approach1(w, wt, val, n));
            System.out.println("=====");
            System.out.println(approach2(w, wt, val, n));
            System.out.println("=====");
            System.out.println(approach3(w, wt, val, n));
        }
    }

    public static int approach1(int w, int[] wt, int[] val, int n) {
        //TC = O(2^n),MC = O(heap)
        //Basic recursive code.
        if (w == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= w) {
            return Math.max(val[n - 1] + approach1(w - wt[n - 1], wt, val, n - 1), approach1(w, wt, val, n - 1));
        } else {
            return approach1(w, wt, val, n - 1);
        }
    }

    public static int approach2(int w, int[] wt, int[] val, int n) {
        //TC = O(n^2),MC = O(n^2)
        //Basic recursive code with memoization.
        for (int[] r : t) {
            Arrays.fill(r, -1);
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }
        return approach2Memo(w, wt, val, n);
    }

    private static int approach2Memo(int w, int[] wt, int[] val, int n) {
        if (t[n][w] != -1) {
            return t[n][w];
        }
        if (wt[n - 1] <= w) {
            return t[n][w] = Math.max(val[n - 1] + approach2Memo(w - wt[n - 1], wt, val, n - 1), approach2Memo(w, wt, val, n - 1));
        } else {
            return t[n][w] = approach2Memo(w, wt, val, n - 1);
        }
    }

    public static int approach3(int w, int[] wt, int[] val, int n) {
        //TC = O(n^2),MC = O(n^2)
        //using DP table
        int[][] t = new int[n + 1][w + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }


}
>>>>>>> 26b1aac (Final Commit_1)
