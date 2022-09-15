<<<<<<< HEAD
//6.Given a sequence of matrices, find most efficient way to multiply these matrices together. The efficient way is the one that involves the least number of multiplications.
//The dimensions of the matrices are given in an array arr[] of size N (such that N = number of matrices + 1) where the ith matrix has the dimensions (arr[i-1] x arr[i]).
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main6 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[][] t = new int[101][101];

    public static void main(String[] args) throws IOException {
        for (int[] r : t) {
            Arrays.fill(r, -1);
        }
        System.out.print("Enter the number of test cases: ");
        int t = Integer.parseInt(br.readLine());
        testCase(t);
    }

    public static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter the number of items: ");
            int n = Integer.parseInt(br.readLine());
            System.out.print("Enter the items: ");
            String[] s = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int x = 0; x < n; x++) {
                arr[x] = Integer.parseInt(s[x]);
            }
            System.out.println("=====");
            System.out.println(approach1(arr, 1, n - 1));
            System.out.println("=====");
            System.out.println(approach2(arr, 1, n - 1));
        }
    }

    public static int approach1(int[] arr, int i, int j) {
        //TC = O(2^n),MC = O(heap)
        //Basic recursive code.
        if (i >= j) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int temp = approach1(arr, i, k) + approach1(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];
            ans = Math.min(temp, ans);
        }
        return ans;
    }

    private static int approach2(int[] arr, int i, int j) {
        //TC = O(n^2),MC = O(n^2)
        //Basic recursive code with memoization.
        if (i >= j) {
            return t[i][j] = 0;
        }
        if (t[i][j] != -1) {
            return t[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int temp = approach2(arr, i, k) + approach2(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];
            ans = Math.min(temp, ans);
        }
        return t[i][j] = ans;
    }

}

=======
//6.Given a sequence of matrices, find most efficient way to multiply these matrices together. The efficient way is the one that involves the least number of multiplications.
//The dimensions of the matrices are given in an array arr[] of size N (such that N = number of matrices + 1) where the ith matrix has the dimensions (arr[i-1] x arr[i]).
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main6 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[][] t = new int[101][101];

    public static void main(String[] args) throws IOException {
        for (int[] r : t) {
            Arrays.fill(r, -1);
        }
        System.out.print("Enter the number of test cases: ");
        int t = Integer.parseInt(br.readLine());
        testCase(t);
    }

    public static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter the number of items: ");
            int n = Integer.parseInt(br.readLine());
            System.out.print("Enter the items: ");
            String[] s = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int x = 0; x < n; x++) {
                arr[x] = Integer.parseInt(s[x]);
            }
            System.out.println("=====");
            System.out.println(approach1(arr, 1, n - 1));
            System.out.println("=====");
            System.out.println(approach2(arr, 1, n - 1));
        }
    }

    public static int approach1(int[] arr, int i, int j) {
        //TC = O(2^n),MC = O(heap)
        //Basic recursive code.
        if (i >= j) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int temp = approach1(arr, i, k) + approach1(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];
            ans = Math.min(temp, ans);
        }
        return ans;
    }

    private static int approach2(int[] arr, int i, int j) {
        //TC = O(n^2),MC = O(n^2)
        //Basic recursive code with memoization.
        if (i >= j) {
            return t[i][j] = 0;
        }
        if (t[i][j] != -1) {
            return t[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int temp = approach2(arr, i, k) + approach2(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];
            ans = Math.min(temp, ans);
        }
        return t[i][j] = ans;
    }

}

>>>>>>> 26b1aac (Final Commit_1)
