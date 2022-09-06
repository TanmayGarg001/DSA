package com.company;

//Very good question, generally in printing questions try to fill the dp table i.e. when you are asked to print max/min value first find the max/min amount
//using dp/memo-recursion and after that all you need to do is make dp table and observe pattern in the table we will get the answer most likely.
//https://www.geeksforgeeks.org/printing-longest-common-subsequence/

public class Main24 {

    public static void main(String[] args) {
        System.out.println(lcsDp("abcdefg", "albcpfiig", 7, 9));//ans: abcfg
        System.out.println(lcsDp("afcf", "afc", 4, 3));
    }


    private static String lcsDp(String s1, String s2, int n, int m) {
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
        System.out.println(t[n][m]);
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i != s1.length() && j != s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {//if char matches then append to StringBuilder
                ans.append(s1.charAt(i));
                i++;
                j++;
            } else if (t[i][j - 1] > t[i - 1][j]) {
                j++;
            } else {
                i++;
            }
        }
        return ans.toString();
    }
}

