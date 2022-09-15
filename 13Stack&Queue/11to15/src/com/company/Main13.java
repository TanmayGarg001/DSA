//13.Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1,
//compute how much water can be trapped between the blocks during the rainy season.
//https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
//https://leetcode.com/problems/trapping-rain-water/submissions/
package com.company;

public class Main13 {

    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 0, 0, 6, 4, 0, 3};
        System.out.println(trappingWater(arr, arr.length));
    }

    static long trappingWater(int[] arr, int n) {
        //TC = O(n),MC = O(n)
        //Basically we keep track of maxLeft and maxRight of the whole arr and keep updating accordingly which reduces TC to O(n) from normal Brute force method,
        //where leftMax and rightMax would be calculated for each element in the arr[].And after making these arrays the SumOf{min(maxL[i],maxR[i])-ar[i]} will be ans.
        int[] maxL = new int[n];
        int[] maxR = new int[n];
        maxL[0] = arr[0];//initialization
        maxR[n - 1] = arr[n - 1];//initialization
        int temp = maxL[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
                maxL[i] = temp;
            }
            maxL[i] = temp;
        }
        temp = maxR[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > temp) {
                temp = arr[i];
                maxR[i] = temp;
            }
            maxR[i] = temp;
        }
        long ans = 0L;
        for (int i = 0; i < arr.length; i++) {
            ans = Math.min(maxL[i], maxR[i]) - arr[i] + ans;
        }
        return ans;
    }
}