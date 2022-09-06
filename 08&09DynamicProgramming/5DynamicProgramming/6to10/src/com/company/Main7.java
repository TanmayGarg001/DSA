<<<<<<< HEAD
//7.Given two strings s and t. Find the minimum number of operations that need to be performed on str1 to convert it to str2. The possible operations are:
//Insert a character at any position of the string.
//Remove any character from the string.
//Replace any character from the string with any other character.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main7 {
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

    private static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter string 1: ");
            String a = br.readLine();
            System.out.print("Enter string 2: ");
            String b = br.readLine();
            System.out.println("=====");
            System.out.println(approach1(a, b, a.length(), b.length()));
            System.out.println("=====");
            System.out.println(approach2(a, b, a.length(), b.length()));
            System.out.println("=====");
            System.out.println(approach3(a, b, a.length(), b.length()));
        }
    }
//Code to find LCS
//    public static int approach1(String a, String b, int n, int m) {
//        if (n == 0 || m == 0) {
//            return 0;
//        }
//        if (a.charAt(n - 1) == b.charAt(m - 1)) {
//            return approach1(a, b, n - 1, m - 1) + 1;
//        } else {
//            return Math.max(approach1(a, b, n - 1, m), approach1(a, b, n, m - 1));
//        }
//    }

//    public static int approach1(String a, String b, int n, int m) {
//        int[][] t = new int[n + 1][m + 1];
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                if (a.charAt(i - 1) == b.charAt(j - 1)) {
//                    t[i][j] = t[i - 1][j - 1] + 1;
//                } else {
//                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
//                }
//            }
//        }
//        return t[n][m];
//    }

    public static int approach1(String a, String b, int n, int m) {
        //TC = O(2^n),MC = O(heap)
        //Basic recursive code.
        if (n == 0) {
            return m;//if string is empty then we add all the characters of the other string.
        }
        if (m == 0) {
            return n;//if string is empty then we add all the characters of the other string.
        }
        if (a.charAt(n - 1) == b.charAt(m - 1)) {
            return approach1(a, b, n - 1, m - 1);//if the characters are equal then we don't need to do anything, so we decrease both the pointers
        }
        return 1 + Math.min(approach1(a, b, n - 1, m - 1), Math.min(approach1(a, b, n - 1, m), approach1(a, b, n, m - 1)));
    }

    public static int approach2(String a, String b, int n, int m) {
        //TC = O(n^2),MC = O(n^2)
        //Basic recursive code with memoization.
        if (n == 0) {
            return t[n][m] = m;
        }
        if (m == 0) {
            return t[n][m] = n;
        }
        if (t[n][m] != -1) {
            return t[n][m];
        }
        if (a.charAt(n - 1) == b.charAt(m - 1)) {
            return approach2(a, b, n - 1, m - 1);
        } else {
            return t[n][m] = 1 + Math.min(approach2(a, b, n - 1, m - 1), Math.min(approach2(a, b, n - 1, m), approach2(a, b, n, m - 1)));
        }
    }

    public static int approach3(String a, String b, int n, int m) {
        //TC = O(n^2),MC = O(n^2)
        //using DP table
        int[][] t = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0) {
                    t[i][j] = j;
                } else if (j == 0) {
                    t[i][j] = i;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    t[i][j] = t[i - 1][j - 1];
                } else {
                    t[i][j] = 1 + Math.min(t[i - 1][j], Math.min(t[i][j - 1], t[i - 1][j - 1]));
                }
            }
        }
        return t[n][m];
    }

}
=======
//7.Given two strings s and t. Find the minimum number of operations that need to be performed on str1 to convert it to str2. The possible operations are:
//Insert a character at any position of the string.
//Remove any character from the string.
//Replace any character from the string with any other character.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main7 {
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

    private static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter string 1: ");
            String a = br.readLine();
            System.out.print("Enter string 2: ");
            String b = br.readLine();
            System.out.println("=====");
            System.out.println(approach1(a, b, a.length(), b.length()));
            System.out.println("=====");
            System.out.println(approach2(a, b, a.length(), b.length()));
            System.out.println("=====");
            System.out.println(approach3(a, b, a.length(), b.length()));
        }
    }
//Code to find LCS
//    public static int approach1(String a, String b, int n, int m) {
//        if (n == 0 || m == 0) {
//            return 0;
//        }
//        if (a.charAt(n - 1) == b.charAt(m - 1)) {
//            return approach1(a, b, n - 1, m - 1) + 1;
//        } else {
//            return Math.max(approach1(a, b, n - 1, m), approach1(a, b, n, m - 1));
//        }
//    }

//    public static int approach1(String a, String b, int n, int m) {
//        int[][] t = new int[n + 1][m + 1];
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                if (a.charAt(i - 1) == b.charAt(j - 1)) {
//                    t[i][j] = t[i - 1][j - 1] + 1;
//                } else {
//                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
//                }
//            }
//        }
//        return t[n][m];
//    }

    public static int approach1(String a, String b, int n, int m) {
        //TC = O(2^n),MC = O(heap)
        //Basic recursive code.
        if (n == 0) {
            return m;//if string is empty then we add all the characters of the other string.
        }
        if (m == 0) {
            return n;//if string is empty then we add all the characters of the other string.
        }
        if (a.charAt(n - 1) == b.charAt(m - 1)) {
            return approach1(a, b, n - 1, m - 1);//if the characters are equal then we don't need to do anything, so we decrease both the pointers
        }
        return 1 + Math.min(approach1(a, b, n - 1, m - 1), Math.min(approach1(a, b, n - 1, m), approach1(a, b, n, m - 1)));
    }

    public static int approach2(String a, String b, int n, int m) {
        //TC = O(n^2),MC = O(n^2)
        //Basic recursive code with memoization.
        if (n == 0) {
            return t[n][m] = m;
        }
        if (m == 0) {
            return t[n][m] = n;
        }
        if (t[n][m] != -1) {
            return t[n][m];
        }
        if (a.charAt(n - 1) == b.charAt(m - 1)) {
            return approach2(a, b, n - 1, m - 1);
        } else {
            return t[n][m] = 1 + Math.min(approach2(a, b, n - 1, m - 1), Math.min(approach2(a, b, n - 1, m), approach2(a, b, n, m - 1)));
        }
    }

    public static int approach3(String a, String b, int n, int m) {
        //TC = O(n^2),MC = O(n^2)
        //using DP table
        int[][] t = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0) {
                    t[i][j] = j;
                } else if (j == 0) {
                    t[i][j] = i;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    t[i][j] = t[i - 1][j - 1];
                } else {
                    t[i][j] = 1 + Math.min(t[i - 1][j], Math.min(t[i][j - 1], t[i - 1][j - 1]));
                }
            }
        }
        return t[n][m];
    }

}
>>>>>>> 26b1aac (Final Commit_1)
