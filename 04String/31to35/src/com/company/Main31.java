<<<<<<< HEAD
//31.Given two sequences, find the length of the longest subsequence present in both of them. Both the strings are of uppercase.
package com.company;

import java.util.Arrays;

public class Main31 {

    private static final int[][] t = new int[1002][1002];

    public static void main(String[] args) {
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        System.out.println(approach(s1, s2, s1.length(), s2.length()));
    }

    public static int approach(String s1, String s2, int n, int m) {
        //TC = O(n^2), MC = O(n^2), Typical base LCS scenario. Solved using memoization.
        if (n == 0 || m == 0) {
            return t[n][m] = 0;
        }
        if (t[n][m] != -1) {
            return t[n][m];
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return t[n][m] = 1 + approach(s1, s2, n - 1, m - 1);
        } else {
            return t[n][m] = Math.max(approach(s1, s2, n - 1, m), approach(s1, s2, n, m - 1));
        }
    }

}
=======
//31.Given two sequences, find the length of the longest subsequence present in both of them. Both the strings are of uppercase.
package com.company;

import java.util.Arrays;

public class Main31 {

    private static final int[][] t = new int[1002][1002];

    public static void main(String[] args) {
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        System.out.println(approach(s1, s2, s1.length(), s2.length()));
    }

    public static int approach(String s1, String s2, int n, int m) {
        //TC = O(n^2), MC = O(n^2), Typical base LCS scenario. Solved using memoization.
        if (n == 0 || m == 0) {
            return t[n][m] = 0;
        }
        if (t[n][m] != -1) {
            return t[n][m];
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return t[n][m] = 1 + approach(s1, s2, n - 1, m - 1);
        } else {
            return t[n][m] = Math.max(approach(s1, s2, n - 1, m), approach(s1, s2, n, m - 1));
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
