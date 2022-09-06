<<<<<<< HEAD
//9.Given a string str, find the length of the longest repeating subsequence such that it can be found twice in the given string. The two identified subsequences
//A and B can use the same ith character from string str if and only if that ith character has different indices in A and B.
package com.company;

public class Main9 {

    public static void main(String[] args) {
        System.out.println(approach1("axxxy"));
    }

    public static int approach1(String str) {
        //TC = O(n^2),MC = O(n^2); Uses DP LCS
        char[] a = str.toCharArray();
        char[] b = str.toCharArray();
        int n = a.length;
        int m = b.length;
        int[][] t = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i - 1] == b[j - 1] && i != j) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return t[n][m];
    }

=======
//9.Given a string str, find the length of the longest repeating subsequence such that it can be found twice in the given string. The two identified subsequences
//A and B can use the same ith character from string str if and only if that ith character has different indices in A and B.
package com.company;

public class Main9 {

    public static void main(String[] args) {
        System.out.println(approach1("axxxy"));
    }

    public static int approach1(String str) {
        //TC = O(n^2),MC = O(n^2); Uses DP LCS
        char[] a = str.toCharArray();
        char[] b = str.toCharArray();
        int n = a.length;
        int m = b.length;
        int[][] t = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i - 1] == b[j - 1] && i != j) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return t[n][m];
    }

>>>>>>> 26b1aac (Final Commit_1)
}