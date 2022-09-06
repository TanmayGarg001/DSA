package com.company;

import java.util.Arrays;

public class Main22 {
    //Till now, we have completed DP of type knapsack, which was one of the most important type!
    //Now we will move on to the next topic LCS (The Longest common sub-string\sub-sequence).
    //[This is very significant topic and large variety can be made from this topic not only in DP but in programming overall, so be fucking prepared!].

    //find longest common sub-sequence.
    //https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/

    //Easy af :D
    static int[][] t = new int[1002][1002];

    public static void main(String[] args) {
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        String s1 = "random";
        String s2 = "handsome";
        System.out.println(lcsRecursive(s1, s2, s1.length(), s2.length()));
        System.out.println(lcsMemo(s1, s2, s1.length(), s2.length()));
        System.out.println(lcsDp(s1, s2, s1.length(), s2.length()));
    }

    private static int lcsRecursive(String s1, String s2, int n, int m) {//Recursive solution
        if (n == 0 || m == 0) {
            return 0;
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {//if chars are equal then we increase matchCount by 1 and call function by decreasing length of string by 1
            return 1 + lcsRecursive(s1, s2, n - 1, m - 1);
        }
        return Math.max(lcsRecursive(s1, s2, n - 1, m), lcsRecursive(s1, s2, n, m - 1));//else we find max possible ans [optimal solution]
    }

    private static int lcsMemo(String s1, String s2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return t[n][m] = 1 + lcsMemo(s1, s2, n - 1, m - 1);
        }
        if (t[n][m] != -1) {
            return t[n][m];
        }
        return t[n][m] = Math.max(lcsMemo(s1, s2, n - 1, m), lcsMemo(s1, s2, n, m - 1));
    }

    private static int lcsDp(String s1, String s2, int n, int m) {
        int[][] t = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return t[n][m];
    }

}