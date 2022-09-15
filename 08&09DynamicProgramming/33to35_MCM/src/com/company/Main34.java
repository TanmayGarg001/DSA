package com.company;

import java.util.Arrays;

public class Main34 {
//https://practice.geeksforgeeks.org/problems/palindromic-patitioning/0

    private static  int[][] t = new int[501][501];

    public static void main(String[] args) {
        System.out.println(palindromicPartition("aaabba"));
        System.out.println(palindromicPartition("nvbdsadnvbsnvdsbvsandnvsasnbvas"));
    }

    static int palindromicPartition(String str) {
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        return recursiveApproach(str, 0, str.length() - 1);
    }

    public static int recursiveApproach(String s, int i, int j) {
        if (t[i][j] != -1) {
            return t[i][j];
        }
        if (i >= j || isPalindrome(s.substring(i, j + 1))) {
            return t[i][j] = 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int temp = recursiveApproach(s, i, k) + recursiveApproach(s, k + 1, j) + 1;
            ans = Math.min(temp, ans);
        }
        return t[i][j] = ans;
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(s);
        sb2.reverse();
        return sb1.compareTo(sb2) == 0;
    }

}
