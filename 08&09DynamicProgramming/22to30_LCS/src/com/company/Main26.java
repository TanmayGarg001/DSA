package com.company;

//https://www.geeksforgeeks.org/minimum-number-deletions-insertions-transform-one-string-another/

public class Main26 {

    public static void main(String[] args) {
        System.out.println(minOperations("axbyzc", "efaytq"));
    }

    public static int minOperations(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] t = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return str1.length() - t[n][m] + str2.length() - t[n][m];
    }

}
