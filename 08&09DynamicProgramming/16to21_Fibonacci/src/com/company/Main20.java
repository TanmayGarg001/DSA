package com.company;

//https://leetcode.com/problems/decode-ways/
//A message containing letters from A-Z can be encoded into numbers using the following mapping:
//'A' -> "1",'B' -> "2"...'Z' -> "26"
//To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways).
//For example, "11106" can be mapped into:
//"AAJF" with the grouping (1 1 10 6); "KJF" with the grouping (11 10 6)
//Note: that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".
//Given a string s containing only digits, return the number of ways to decode it. The test cases are generated so that the answer fits in a 32-bit integer.
public class Main20 {

    public static void main(String[] args) {
        System.out.println(numDecoding("226"));
        System.out.println(numDecodingDp("226"));
    }

    public static int numDecoding(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[] t = new int[s.length()];
        return solve(0, s, t);
    }

    public static int solve(int p, String s, int[] t) {
        int n = s.length();
        if (p == n) {
            return 1;
        }
        if (s.charAt(p) == '0') {
            return 0;
        }
        if (t[p] != 0) {
            return t[p];
        }
        int ans = solve(p + 1, s, t);
        if (p < n - 1 && (s.charAt(p) == '1' || s.charAt(p) == '2' && s.charAt(p + 1) < '7')) {
            ans = ans + solve(p + 2, s, t);
        }
        return t[p] = ans;
    }

    public static int numDecodingDp(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--)
            if (s.charAt(i) != '0') {
                dp[i] = dp[i + 1];
                if (i < n - 1 && (s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i + 1) < '7')) {
                    dp[i] += dp[i + 2];
                }
            }
        return dp[0];
    }

}
