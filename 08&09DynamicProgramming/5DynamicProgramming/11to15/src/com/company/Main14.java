<<<<<<< HEAD
//14.Given two sequences, find the length of the longest subsequence present in both of them. Both the strings are of uppercase.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[][] t = new int[1002][1002];

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (i == 0) {
                    t[i][j] = 0;
                } else if (j == 0) {
                    t[i][j] = 0;
                } else {
                    t[i][j] = -1;
                }
            }
        }
        System.out.print("Enter the number of test cases: ");
        int tc = Integer.parseInt(br.readLine());
        testCases(tc);
    }

    public static void testCases(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter the 1st string: ");
            String s1 = br.readLine();
            System.out.print("Enter the 2nd string: ");
            String s2 = br.readLine();
            System.out.println("=====");
            System.out.println(approach1(s1.length(), s2.length(), s1, s2));
            System.out.println("=====");
            System.out.println(approach2(s1.length(), s2.length(), s1, s2));
            System.out.println("=====");
            System.out.println(approach3(s1.length(), s2.length(), s1, s2));
        }
    }

    public static int approach1(int x, int y, String s1, String s2) {
        //TC = O(2^n),MC = O(heap)
        //basic recursive code.
        if (x <= 0 || y <= 0) {
            return 0;
        }
        if (s1.charAt(x - 1) == s2.charAt(y - 1)) {
            return approach1(x - 1, y - 1, s1, s2) + 1;
        } else {
            return Math.max(approach1(x - 1, y, s1, s2), approach1(x, y - 1, s1, s2));
        }
    }

    public static int approach2(int n, int m, String s1, String s2) {
        //TC = O(n^2,MC = O(n^2)
        //basic recursive code memoization.
        if (t[n][m] != -1) {
            return t[n][m];
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return t[n][m] = approach2(n - 1, m - 1, s1, s2) + 1;
        } else {
            return t[n][m] = Math.max(approach2(n - 1, m, s1, s2), approach2(n, m - 1, s1, s2));
        }
    }

    public static int approach3(int n, int m, String s1, String s2) {
        //TC = O(n^2),MC = O(n^2)
        //using DP table.
        char[] a = s1.toCharArray();//prefer to do like this instead of str.charAt coz it sometimes results in error from website side, your code might be right tho.
        char[] b = s2.toCharArray();
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
        return t[n][m];
    }

}
=======
//14.Given two sequences, find the length of the longest subsequence present in both of them. Both the strings are of uppercase.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[][] t = new int[1002][1002];

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (i == 0) {
                    t[i][j] = 0;
                } else if (j == 0) {
                    t[i][j] = 0;
                } else {
                    t[i][j] = -1;
                }
            }
        }
        System.out.print("Enter the number of test cases: ");
        int tc = Integer.parseInt(br.readLine());
        testCases(tc);
    }

    public static void testCases(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter the 1st string: ");
            String s1 = br.readLine();
            System.out.print("Enter the 2nd string: ");
            String s2 = br.readLine();
            System.out.println("=====");
            System.out.println(approach1(s1.length(), s2.length(), s1, s2));
            System.out.println("=====");
            System.out.println(approach2(s1.length(), s2.length(), s1, s2));
            System.out.println("=====");
            System.out.println(approach3(s1.length(), s2.length(), s1, s2));
        }
    }

    public static int approach1(int x, int y, String s1, String s2) {
        //TC = O(2^n),MC = O(heap)
        //basic recursive code.
        if (x <= 0 || y <= 0) {
            return 0;
        }
        if (s1.charAt(x - 1) == s2.charAt(y - 1)) {
            return approach1(x - 1, y - 1, s1, s2) + 1;
        } else {
            return Math.max(approach1(x - 1, y, s1, s2), approach1(x, y - 1, s1, s2));
        }
    }

    public static int approach2(int n, int m, String s1, String s2) {
        //TC = O(n^2,MC = O(n^2)
        //basic recursive code memoization.
        if (t[n][m] != -1) {
            return t[n][m];
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return t[n][m] = approach2(n - 1, m - 1, s1, s2) + 1;
        } else {
            return t[n][m] = Math.max(approach2(n - 1, m, s1, s2), approach2(n, m - 1, s1, s2));
        }
    }

    public static int approach3(int n, int m, String s1, String s2) {
        //TC = O(n^2),MC = O(n^2)
        //using DP table.
        char[] a = s1.toCharArray();//prefer to do like this instead of str.charAt coz it sometimes results in error from website side, your code might be right tho.
        char[] b = s2.toCharArray();
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
        return t[n][m];
    }

}
>>>>>>> 26b1aac (Final Commit_1)
