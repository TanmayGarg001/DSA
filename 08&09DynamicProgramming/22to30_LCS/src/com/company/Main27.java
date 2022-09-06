package com.company;

//https://www.geeksforgeeks.org/longest-palindromic-subsequence-dp-12/
//https://www.geeksforgeeks.org/minimum-number-deletions-make-string-palindrome/

public class Main27 {

    public static void main(String[] args) {
        System.out.println("=================");
        System.out.println(minimumNumberOfDeletions("agbcba"));
        System.out.println(minimumNumberOfDeletions("raedxear"));
        System.out.println(minimumNumberOfDeletions("radar"));
    }

    private static int minimumNumberOfDeletions(String s1) {
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        String s2 = sb.toString();
        return solve(s1, s2, s1.length(), s2.length());
    }

    public static int solve(String s1, String s2, int n, int m) {
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

        return n - t[n][m];

    }


}
