//22.Given a string str of length N, you have to find number of palindromic subsequence (need not necessarily be distinct) which could be formed from the string str.
//Note: You have to return the answer module 10^9+7;
package com.company;

import java.util.Arrays;

public class Main22 {

    private static final int[][] t = new int[1002][1002];

    public static void main(String[] args) {
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        String s = "bccb";
        System.out.println(approach1(s, 0, s.length() - 1));
    }


    public static int approach1(String s, int n, int m) {
        //TC = O(n^2),MC = O(n^2)
        if (n > m) {//if start pointer is further than last than return 0
            return 0;
        }
        if (t[n][m] != -1) {//if memo table has value already
            return t[n][m];
        }
        if (n == m) {//if both pointers point to same element that means we have a palindrome of 1 letter only, ex: "a"
            return t[n][m] = 1;
        } else if (s.charAt(n) == s.charAt(m)) {//if both pointers are at diff. pos. but have same char that means we have one more palindrome
            return t[n][m] = 1 + approach1(s, n + 1, m) + approach1(s, n, m - 1);//If first and last characters are same, then we consider it as palindrome subsequence and
            // check for the rest subsequence (i+1, j), (i, j-1)
        } else {// check for rest sub-sequence and  remove common palindromic subsequences as they are counted twice when we do countPS(i+1, j) + countPS(i,j-1)
            return t[n][m] = approach1(s, n + 1, m) + approach1(s, n, m - 1) - approach1(s, n + 1, m - 1);
        }
    }

}