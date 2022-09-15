package com.company;

public class Main23 {
    //Longest Common SubString size and print it
    //https://www.geeksforgeeks.org/longest-common-substring-dp-29/

    public static void main(String[] args) {
        System.out.println(longestCommonSubstring("ABCDGH", "DEFABC", 6, 6));
        System.out.println(longestCommonSubstring("RANDOM", "HANDSOME", 5, 5));
    }

    static int longestCommonSubstring(String S1, String S2, int n, int m) {
        return longestSS(S1.toCharArray(), S2.toCharArray(), n, m);
    }

    static int longestSS(char[] a, char[] b, int n, int m) {
        int[][] t = new int[n + 1][m + 1];
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i - 1] == b[j - 1]) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                    result = Math.max(result, t[i][j]);
                } else {
                    t[i][j] = 0;
                }
            }
        }
        return result;
    }


}
