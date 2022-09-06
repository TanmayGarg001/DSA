package com.company;

//https://www.geeksforgeeks.org/longest-repeated-subsequence/

public class Main29 {

    public static void main(String[] args) {
        System.out.println(longestRepeatingSubsequence("axxxy"));
        System.out.println(longestRepeatingSubsequence("aab"));
    }

    public static int longestRepeatingSubsequence(String str) {
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

//Sequence Pattern Matching
// we can take two pointer i and j, i for larger string and j for smaller string
//run a loop for bigger string:
//           if ith char of bigger == jth char of smaller than j++
//           now check if j==size then it is present,
//or we can use LCS  because smaller string if it is a subsequence, then it will be an LCS of other string.

}
