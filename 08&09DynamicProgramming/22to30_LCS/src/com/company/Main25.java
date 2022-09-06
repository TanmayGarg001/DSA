package com.company;

//https://www.geeksforgeeks.org/shortest-common-supersequence/
//Ezy observations

public class Main25 {

    public static void main(String[] args) {
        System.out.println(shortestCommonSuperSequence("afcgeef", "apfcsde", 7, 7));
    }

    public static int shortestCommonSuperSequence(String s1, String s2, int n, int m) {
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

        return n + m - t[n][m];
    }

}