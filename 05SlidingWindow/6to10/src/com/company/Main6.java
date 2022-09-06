package com.company;

import java.util.HashMap;

public class Main6 {

    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 1, 2, 3, 5};
        largestArrayWithSumK(arr, 5);
        subarraySum(arr, 5);
    }

    //see the image
    public static void largestArrayWithSumK(int[] arr, int k) {//https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1#
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 0;
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum = sum + arr[i];
            if (sum == k) {
                j = i + 1;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (map.containsKey(sum - k)) {
                if (j < (i - map.get(sum - k))) {
                    j = i - map.get(sum - k);
                }
            }
            i++;
        }
        System.out.println(j);
    }

    public static void subarraySum(int[] nums, int k) {//https://leetcode.com/problems/subarray-sum-equals-k/
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }

}
