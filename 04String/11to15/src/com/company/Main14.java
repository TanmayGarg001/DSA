//14.Given two strings s and t. Find the minimum number of operations that need to be performed on str1 to convert it to str2. The possible operations are:
//Insert
//Remove
//Replace
package com.company;

public class Main14 {

    public static void main(String[] args) {
        System.out.println(approach1("adbcfer", "abcfqr"));
        System.out.println(recursive("sunday", "saturday", 6, 8));
    }

    public static int approach1(String s, String t) {
        //TC = O(n^2),MC = O(n*m)
        //Firstly try to write code for to find minimum number of operations that need to be performed on str1 to convert it to str2 if only
        //insertion and removal can be done. It's pretty easy as we need to find the longest common subsequence, and then just modify somewhat result of that
        //by a simple observation based upon removal and insertion in respective order.
        //After that is done, we need to modify the code for replacement operation.
        return calcDp(s.toCharArray(), t.toCharArray(), s.length(), t.length());
    }

    public static int calcDp(char[] a, char[] b, int n, int m) {
        int[][] t = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0) {
                    t[i][j] = j;//insert all the other strings characters
                } else if (j == 0) {
                    t[i][j] = i;//insert all the other strings characters
                } else if (a[i - 1] == b[j - 1]) {
                    t[i][j] = t[i - 1][j - 1];//if they are equal we won't do anything
                } else {//if they aren't we choose minimum from 3 possible options
                    t[i][j] = 1 + Math.min(Math.min(t[i][j - 1], t[i - 1][j]), t[i - 1][j - 1]);//insert,remove,replace
                }
            }
        }
        return t[n][m];
    }

    public static int recursive(String a, String b, int n, int m) {
        //TC = O(3^n), MC = O(1) [Stack memory ofc]
        if (n == 0) {
            return m;
        }
        if (m == 0) {
            return n;
        }
        if (a.charAt(n - 1) == b.charAt(m - 1)) {
            return recursive(a, b, n - 1, m - 1);
        } else {
            return 1 + Math.min(Math.min(recursive(a, b, n, m - 1), recursive(a, b, n - 1, m)), recursive(a, b, n - 1, m - 1));
        }

    }
}