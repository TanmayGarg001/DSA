<<<<<<< HEAD
//8.Given an array arr[] of size N, check if it can be partitioned into two parts such that the sum of elements in both parts is the same.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main8 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final boolean[] t = new boolean[101];

    public static void main(String[] args) throws IOException {
        System.out.print("Enter the number of test cases: ");
        int t = Integer.parseInt(br.readLine());
        testCase(t);
    }

    public static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter the array size: ");
            int n = Integer.parseInt(br.readLine());
            System.out.print("Enter the elements: ");
            String[] s = br.readLine().split(" ");
            int[] arr = new int[n];
            int sum = 0;
            for (int x = 0; x < n; x++) {
                arr[x] = Integer.parseInt(s[x]);
                sum = sum + arr[x];
            }
            if (sum % 2 != 0) {
                System.out.println("false");
            }
            System.out.println("=====");
            System.out.println(approach1(n, arr, sum / 2));
            System.out.println("=====");
            System.out.println(approach2(n, arr, sum / 2));
            System.out.println("=====");
            System.out.println(approach3(n, arr, sum / 2));
        }
    }

    private static boolean approach1(int n, int[] arr, int sum) {
        //TC = O(2^n),MC = O(heap)
        //Basic recursive code.
        if (n == 0 && sum != 0) {
            return false;
        }
        if (sum == 0) {
            return true;
        }
        if (sum >= arr[n - 1]) {
            return approach1(n - 1, arr, sum - arr[n - 1]) || approach1(n - 1, arr, sum);
        } else {
            return approach1(n - 1, arr, sum);
        }

    }

    private static boolean approach2(int n, int[] arr, int sum) {
        //TC = O(n^2),MC = O(n^2)
        //Basic recursive code with memoization.
        if (n == 0 && sum != 0) {
            return t[n] = false;
        }
        if (sum == 0) {
            return t[n] = true;
        }
        if (t[n]) {
            return t[n];
        }
        if (sum >= arr[n - 1]) {
            return t[n] = approach2(n - 1, arr, sum - arr[n - 1]) || approach2(n - 1, arr, sum);
        } else {
            return t[n] = approach2(n - 1, arr, sum);
        }
    }

    private static boolean approach3(int n, int[] arr, int w) {
        //TC = O(n^2),MC = O(n^2)
        //using DP table
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
                if (j >= arr[i - 1]) {
                    t[i][j] = t[i - 1][j] || t[i - 1][j - arr[i - 1]];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }


}
=======
//8.Given an array arr[] of size N, check if it can be partitioned into two parts such that the sum of elements in both parts is the same.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main8 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final boolean[] t = new boolean[101];

    public static void main(String[] args) throws IOException {
        System.out.print("Enter the number of test cases: ");
        int t = Integer.parseInt(br.readLine());
        testCase(t);
    }

    public static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter the array size: ");
            int n = Integer.parseInt(br.readLine());
            System.out.print("Enter the elements: ");
            String[] s = br.readLine().split(" ");
            int[] arr = new int[n];
            int sum = 0;
            for (int x = 0; x < n; x++) {
                arr[x] = Integer.parseInt(s[x]);
                sum = sum + arr[x];
            }
            if (sum % 2 != 0) {
                System.out.println("false");
            }
            System.out.println("=====");
            System.out.println(approach1(n, arr, sum / 2));
            System.out.println("=====");
            System.out.println(approach2(n, arr, sum / 2));
            System.out.println("=====");
            System.out.println(approach3(n, arr, sum / 2));
        }
    }

    private static boolean approach1(int n, int[] arr, int sum) {
        //TC = O(2^n),MC = O(heap)
        //Basic recursive code.
        if (n == 0 && sum != 0) {
            return false;
        }
        if (sum == 0) {
            return true;
        }
        if (sum >= arr[n - 1]) {
            return approach1(n - 1, arr, sum - arr[n - 1]) || approach1(n - 1, arr, sum);
        } else {
            return approach1(n - 1, arr, sum);
        }

    }

    private static boolean approach2(int n, int[] arr, int sum) {
        //TC = O(n^2),MC = O(n^2)
        //Basic recursive code with memoization.
        if (n == 0 && sum != 0) {
            return t[n] = false;
        }
        if (sum == 0) {
            return t[n] = true;
        }
        if (t[n]) {
            return t[n];
        }
        if (sum >= arr[n - 1]) {
            return t[n] = approach2(n - 1, arr, sum - arr[n - 1]) || approach2(n - 1, arr, sum);
        } else {
            return t[n] = approach2(n - 1, arr, sum);
        }
    }

    private static boolean approach3(int n, int[] arr, int w) {
        //TC = O(n^2),MC = O(n^2)
        //using DP table
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
                if (j >= arr[i - 1]) {
                    t[i][j] = t[i - 1][j] || t[i - 1][j - arr[i - 1]];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }


}
>>>>>>> 26b1aac (Final Commit_1)
