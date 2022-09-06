package com.company;

public class Main8 {
    //Given an array arr[] of length N and an integer X, the task is to find the number of subsets with a sum equal to X.
    //https://www.geeksforgeeks.org/count-of-subsets-with-sum-equal-to-x/
    //https://www.youtube.com/watch?v=F7wqWbqYn9g&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=9
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        https://stackoverflow.com/questions/1650505/what-is-the-inclusive-range-of-float-and-double-in-java
        System.out.println(subSet(arr, 10, 5));
    }

    public static int subSet(int[] arr, int w, int n) {
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
                    t[i][j] = (t[i - 1][j - (arr[i - 1])] + t[i - 1][j]) % 1_000_000_007;//provided in the question.
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }

}
