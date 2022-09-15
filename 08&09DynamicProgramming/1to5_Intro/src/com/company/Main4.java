package com.company;

public class Main4 {

    //Top-down approach.This is different from Recursive code and then memoization.
    //Top down table is generally the real Dynamic Programming.Time complexity is same as memo, but it will never fill the stack like while using recursion
    //but that will happen never.
    //What we did before was we coded the recursion version of the Dp and to optimize that we memoized that.
    //In top-down approach our motive is to complete destroy the recursive calls thingy and just make a table and solve from that only.
    //The benefit of this approach it totally avoids stack overflow error.
    //But only lik 0.5% of the questions will do that.Example:- scrambled string (MatrixChainMultiplication).

    //Now to solve the problem using top-down approach solve 'em like this:-
    //Make a matrix of only those parameters whose value is changing similar to memo. and dimensions are also same like memo.
    //Now initialization is different from memo, in memo we fill the whole matrix by -1 generally, but here it's different.
    //first row and column is used for initialization in top-down approach, so 1st row is basically the 0th index.
    //make a matrix of n+1*w+1 //n is arr.length and w is capacity.Here n = 4 and w = 7, so we make a matrix of 5*8
    //See the image.Now by doing that we have sub-problems in matrix from that we calculate bigger answer.
    //So from image we can conclude that the last element in the matrix will give us the answer to the solution.
    //the base condition in recursion changes to initialization in the table approach.
    //So in our question 1st row and 1st column we fill that matrix with 0;//See base condition in recursion.
    //https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/

    public static void main(String[] args) {
        int[] wt = {1, 3, 5, 8, 11, 15};
        int[] val = {6, 2, 8, 5, 1, 3};
        System.out.println(tabularApproach(wt, val, 15, 6));
    }

    public static int tabularApproach(int[] wt, int[] val, int cap, int n) {
        int i, j;
        int[][] t = new int[n + 1][cap + 1];
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= cap; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;//we can do this separately.
                } else if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][cap];
    }

}
