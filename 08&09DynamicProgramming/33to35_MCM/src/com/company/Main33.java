package com.company;

import java.util.Arrays;

public class Main33 {
    //Now we have mostly completed important topics in DP, let's move on to MCM (Matrix Chain Multiplication).
    //One of the mind-bending topics of DP
    //We won't learn how to do this in the form of DP because it gets quite tricky and messy.
    //Here we will be given an array or string. To solve this what we do is: we generally split the array/string into parts
    //i.e. initially there were 2 pointers i and j now we have 3 i to k and then k+1 to j we work on these 2 temp functions(k moves from i to j generally)
    //which will return temp answers and then after that we combine and process them to get the final ans.
    //solve questions to understand this properly.
    static int[][] t = new int[101][101];

    public static void main(String[] args) {
        //think of the invalid i/p in these questions instead of thinking about the smallest valid input.
        //https://www.geeksforgeeks.org/matrix-chain-multiplication-dp-8/
        for (int[] r : t) {
            Arrays.fill(r, -1);
        }
        int[] arr = {40, 20, 30, 10, 30};
        System.out.println(recursiveApproach(arr, 1, arr.length - 1));
        System.out.println(recursiveApproachMemo(arr, 1, arr.length - 1));
    }

    private static int recursiveApproach(int[] arr, int i, int j) {
        if (i >= j) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int temp = recursiveApproach(arr, i, k) + recursiveApproach(arr, k + 1, j) + (arr[i - 1] * arr[k] * arr[j]);
            ans = Math.min(temp, ans);
//            recursiveApproach(arr, i, k);//or recursiveApproach(arr,i,k-1)
//            recursiveApproach(arr, k + 1, j);//or recursiveApproach(arr,k,j)
        }
        return ans;
    }

    private static int recursiveApproachMemo(int[] arr, int i, int j) {
        if (i >= j) {
            return 0;
        }
        if (t[i][j] != -1) {
            return t[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int temp = recursiveApproachMemo(arr, i, k) + recursiveApproachMemo(arr, k + 1, j) + (arr[i - 1] * arr[k] * arr[j]);
            ans = Math.min(temp, ans);
        }
        return t[i][j] = ans;
    }

}