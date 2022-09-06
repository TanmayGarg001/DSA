package com.company;

public class Main32 {
    //https://leetcode.com/problems/increasing-triplet-subsequence/
    //Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k].
    //If no such indices exists, return false.
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 0, 6};
        System.out.println(increasingTriplet(arr));
    }

    public static boolean increasingTriplet(int[] arr) {
        // start with two largest values, as soon as we find a number bigger than both, while both have been updated, return true.
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n <= a) {
                a = n;// update if n is smaller than both a & b
            } else if (n <= b) {
                b = n;// update only if greater than a but smaller than b
            } else return true; // return if you find a number bigger than both
        }
        return false;
    }
}
