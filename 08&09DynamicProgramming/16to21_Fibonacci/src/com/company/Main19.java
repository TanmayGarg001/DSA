package com.company;

public class Main19 {

    //Q1 You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    //Q2 You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
    //You can either start from the step with index 0, or the step with index 1.Return the minimum cost to reach the top of the floor.

    public static void main(String[] args) {
        //Climbing stairs and Min. cost climbing stairs.
        //https://leetcode.com/problems/climbing-stairs/
        //https://leetcode.com/problems/min-cost-climbing-stairs/
        System.out.println(climbStairs(32));
        int[] arr = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(arr));
        System.out.println(minCostClimbingStairsFast(arr));
    }

    //Q1
    public static int climbStairs(int n) {
        int[] t = new int[46];//can be replaced with n+1 instead of 46 to save some memory.
        t[0] = 1;
        t[1] = 1;
        for (int i = 2; i <= n; i++) {
            t[i] = t[i - 1] + t[i - 2];
        }
        return t[n];
    }

    //Q2, see img_3 for more ways
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return Math.min(solve(cost, n - 1), solve(cost, n - 2));
    }

    public static int solve(int[] cost, int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return cost[n];
        }
        return cost[n] + Math.min(solve(cost, n - 1), solve(cost, n - 2));
    }

    public static int minCostClimbingStairsFast(int[] cost) {
        int[] t = new int[cost.length];
        return Math.min(solve(cost, cost.length - 1, t), solve(cost, cost.length - 2, t));
    }

    public static int solve(int[] cost, int n, int[] t) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return cost[n];
        }
        if (t[n] != 0) {
            return t[n];
        }
        return t[n] = cost[n] + Math.min(solve(cost, n - 1, t), solve(cost, n - 2, t));
    }


}