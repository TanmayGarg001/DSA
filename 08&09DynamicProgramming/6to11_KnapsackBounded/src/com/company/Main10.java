package com.company;

public class Main10 {
    //Count the number of subset with a given difference. Ezpz similar to previous ques and some basic maths

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};
        System.out.println(countSubsetWithDiffD(arr, 1));
        System.out.println(countSubsetWithDiff(arr, 1));
    }

    //Valid only if there is not a condition that the array must be divided into 2 parts some elements can be left behind.
    public static int countSubsetWithDiffD(int[] arr, int d) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int s1 = (d + sum) / 2;//maths equations: S1+S2=arrSumTotal ; S1-S2=d;
        return countSubSets(arr, s1, arr.length);
    }

    public static int countSubSets(int[] arr, int w, int n) {
        int[][] t = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (j == 0) {
                    t[i][j] = 1;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (j >= arr[i - 1]) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }

    //This below is the right way if the array has to be divided in 2 parts.
    public static int countSubsetWithDiff(int[] arr, int d) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return solve(arr, sum, d, arr.length);
    }

    public static int solve(int[] arr, int w, int d, int n) {
        boolean[][] t = new boolean[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (j == 0) {
                    t[i][j] = true;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (j >= arr[i - 1]) {
                    t[i][j] = t[i - 1][j] || t[i - 1][j - arr[i - 1]];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        int ans = 0;
        for (int j = 0; j <= w; j++) {
            if (t[n][j]) {
                int temp = (w - j) - (j);
                if (temp == d) {
                    ans++;
                }
            }
        }
        return ans;
    }


}
