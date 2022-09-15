package com.company;

import java.util.Arrays;

//https://www.includehelp.com/algorithms/egg-dropping-problem-using-dynamic-programming.aspx
public class Main35 {
    //Problem statement: You are given N floor and K eggs. You have to minimize the number of times you have to drop the eggs to find the critical
//floor where critical floor means the floor beyond which eggs start to break. Assumptions of the problem:
//If egg breaks at ith floor then it also breaks at all greater floors.
//If egg does not break at ith floor then it does not break at all lower floors.
//Unbroken egg can be used again.
//Note: You have to find minimum trials required to find the critical floor not the critical floor.
    private static int[][] t = new int[501][501];

    public static void main(String[] args) {
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        System.out.println(solve(2, 36));
    }

    private static int solve(int e, int f) {//e=no. of eggs, f = no. of floors
        if (t[e][f] != -1) {
            return t[e][f];
        }
        if (f == 0 || f == 1) {
            return t[e][f] = f;
        }
        if (e == 1) {
            return t[e][f] = f;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = 1; k < f; k++) {
            int temp = 1 + Math.max(solve(e - 1, k - 1), solve(e, f - k));//for calculating worst case as egg may break or may not
            ans = Math.min(temp, ans);//min. no. of attempts in worst case
        }
        return t[e][f] = ans;
    }
}
