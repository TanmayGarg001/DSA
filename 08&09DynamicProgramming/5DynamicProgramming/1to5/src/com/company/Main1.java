<<<<<<< HEAD
//1.Given a value N, find the number of ways to make change for N cents, if we have infinite supply of each of S = { S1, S2, .. , SM } valued coins.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long[][] t = new long[1002][1002];

    public static void main(String[] args) throws IOException {
        System.out.print("Enter number of test cases: ");
        int t = Integer.parseInt(br.readLine());
        testCase(t);
    }

    private static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter capacity & numberOfCoins: ");
            String[] s = br.readLine().split(" ");
            int w = Integer.parseInt(s[0]);
            int n = Integer.parseInt(s[1]);
            System.out.print("Enter the coins: ");
            String[] x = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(x[j]);
            }
            System.out.println("=====");
            System.out.println(approach1(arr, n, w));
            System.out.println("=====");
            System.out.println(approach2(arr, n, w));
            System.out.println("=====");
            System.out.println(approach3(arr, n, w));
        }
    }

    public static long approach1(int[] arr, int n, int w) {
        //TC = O(2^n),MC = O(heap)
        //Basic recursive code.
        if (w == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        if (arr[n - 1] <= w) {
            return approach1(arr, n, w - arr[n - 1]) + approach1(arr, n - 1, w);
        } else {
            return approach1(arr, n - 1, w);
        }
    }

    public static long approach2(int[] arr, int n, int w) {
        //TC = O(n^2),MC = O(n^2)
        //Basic recursive code with memoization.
        for (long[] r : t) {
            Arrays.fill(r, -1);
        }
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (i == 0) {
                    t[i][j] = 0;
                }
                if (j == 0) {
                    t[i][j] = 1;
                }
            }
        }
        return approach2Memo(arr, n, w);
    }

    public static long approach2Memo(int[] arr, int n, int w) {
        if (t[n][w] != -1) {
            return t[n][w];
        }
        if (arr[n - 1] <= w) {
            return t[n][w] = approach2Memo(arr, n, w - arr[n - 1]) + approach2Memo(arr, n - 1, w);
        } else {
            return t[n][w] = approach2Memo(arr, n - 1, w);
        }
    }


    public static long approach3(int[] arr, int n, int w) {
        //TC = O(n^2),MC = O(n^2)
        //using DP table
        long[][] t = new long[n + 1][w + 1];
        for (long[] r : t) {
            r[0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i][j - arr[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }

}
=======
//1.Given a value N, find the number of ways to make change for N cents, if we have infinite supply of each of S = { S1, S2, .. , SM } valued coins.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long[][] t = new long[1002][1002];

    public static void main(String[] args) throws IOException {
        System.out.print("Enter number of test cases: ");
        int t = Integer.parseInt(br.readLine());
        testCase(t);
    }

    private static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter capacity & numberOfCoins: ");
            String[] s = br.readLine().split(" ");
            int w = Integer.parseInt(s[0]);
            int n = Integer.parseInt(s[1]);
            System.out.print("Enter the coins: ");
            String[] x = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(x[j]);
            }
            System.out.println("=====");
            System.out.println(approach1(arr, n, w));
            System.out.println("=====");
            System.out.println(approach2(arr, n, w));
            System.out.println("=====");
            System.out.println(approach3(arr, n, w));
        }
    }

    public static long approach1(int[] arr, int n, int w) {
        //TC = O(2^n),MC = O(heap)
        //Basic recursive code.
        if (w == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        if (arr[n - 1] <= w) {
            return approach1(arr, n, w - arr[n - 1]) + approach1(arr, n - 1, w);
        } else {
            return approach1(arr, n - 1, w);
        }
    }

    public static long approach2(int[] arr, int n, int w) {
        //TC = O(n^2),MC = O(n^2)
        //Basic recursive code with memoization.
        for (long[] r : t) {
            Arrays.fill(r, -1);
        }
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (i == 0) {
                    t[i][j] = 0;
                }
                if (j == 0) {
                    t[i][j] = 1;
                }
            }
        }
        return approach2Memo(arr, n, w);
    }

    public static long approach2Memo(int[] arr, int n, int w) {
        if (t[n][w] != -1) {
            return t[n][w];
        }
        if (arr[n - 1] <= w) {
            return t[n][w] = approach2Memo(arr, n, w - arr[n - 1]) + approach2Memo(arr, n - 1, w);
        } else {
            return t[n][w] = approach2Memo(arr, n - 1, w);
        }
    }


    public static long approach3(int[] arr, int n, int w) {
        //TC = O(n^2),MC = O(n^2)
        //using DP table
        long[][] t = new long[n + 1][w + 1];
        for (long[] r : t) {
            r[0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i][j - arr[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }

}
>>>>>>> 26b1aac (Final Commit_1)
