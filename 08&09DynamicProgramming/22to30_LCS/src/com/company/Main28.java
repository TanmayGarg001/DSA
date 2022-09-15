package com.company;

//https://www.geeksforgeeks.org/print-shortest-common-supersequence/
//Very good question!

public class Main28 {

    public static void main(String[] args) {
        System.out.println(printShortestCommonSuperSequence("AGGTAB", "GXTXAYB"));
    }

    public static int printShortestCommonSuperSequence(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        int n = a.length;
        int m = b.length;
        int[][] t = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i - 1] == b[j - 1]) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }

        StringBuilder s = new StringBuilder();
        while (n > 0 && m > 0) {
            if (a[n - 1] == b[m - 1]) {
                s.append(a[n - 1]);
                n--;
                m--;
            } else if (t[n][m - 1] > t[n - 1][m]) {
                s.append(b[m - 1]);
                m--;
            } else {
                s.append(a[n - 1]);
                n--;
            }
        }

        System.out.println(s.reverse());

        return s1.length() + s2.length() - t[n][m];
    }

}


