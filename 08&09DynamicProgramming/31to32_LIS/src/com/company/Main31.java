package com.company;

import java.util.Arrays;

public class Main31 {
    //https://leetcode.com/problems/longest-increasing-subsequence/
    //Given an integer array nums, return the length of the longest strictly increasing subsequence.
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 6, 3, 6, 9, 7};
        int[][] t = new int[arr.length][arr.length];
        System.out.println(lisRecursive(-1, 0, arr));
        System.out.println(lisMemo(-1, 0, arr, t));
        System.out.println(lisDp(arr, arr.length));
        System.out.println(lisUltimate(arr));
    }

    public static int lisRecursive(int prev, int curr, int[] arr) {
        if (curr == arr.length) {//can't pick more elements as end is reached
            return 0;
        }
        int op1 = 0;//if we consider current element in recursive tree for LIS
        if (prev == -1 || arr[prev] < arr[curr]) {//if prev==-1 then we will consider the 0th element ofc once to find LIS
            op1 = 1 + lisRecursive(curr, curr + 1, arr);//increase the count by 1 and solve for rest of the arr to find LIS
        }
        int op2 = lisRecursive(prev, curr + 1, arr);//if we don't consider current element in recursive tree for LIS
        return Math.max(op1, op2);
    }

    public static int lisMemo(int prev, int curr, int[] arr, int[][] t) {
        if (curr == arr.length) {
            return 0;
        }
        if (prev != -1 && t[prev][curr] != 0) {//memo cached storage call [lookup]
            return t[prev][curr];
        }
        int op1 = 0;//if we consider current element in recursive tree for LIS
        if (prev == -1 || arr[prev] < arr[curr]) {//if prev==-1 then we will consider the 0th element ofc once to find LIS
            op1 = 1 + lisMemo(curr, curr + 1, arr, t);//increase the count by 1 and solve for rest of the arr to find LIS
        }
        int op2 = lisMemo(prev, curr + 1, arr, t);//if we don't consider current element in recursive tree for LIS
        if (prev != -1) {
            t[prev][curr] = Math.max(op1, op2);
        }
        return Math.max(op1, op2);
    }

    public static int lisDp(int[] arr, int n) {
        int ans = 1;
        int[] t = new int[arr.length];
        Arrays.fill(t, 1);//coz we can always say that a single element is a LIS
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {//we will check the if arr[i]>arr[j] if it is then we add 1 to the t[]
                if (arr[i] > arr[j]) {
                    t[i] = Math.max(t[i], 1 + t[j]);
                }
            }
            ans = Math.max(ans, t[i]);
        }
        return ans;
    }

    public static int lisUltimate(int[] arr) {
        //https://leetcode.com/problems/longest-increasing-subsequence/discuss/1326552/Optimization-From-Brute-Force-to-Dynamic-Programming-Explained!
        int[] t = new int[arr.length];
        int len = 0;
        for (int x : arr) {
            int i = Arrays.binarySearch(t, 0, len, x);
            //returns index of the search key, if it is contained in the array within the specified range; otherwise, (-(insertion point) - 1).
            //The insertion point is defined as the point at which the key would be inserted into the array:
            if (i < 0) {
                i = -(i + 1);
            }
            t[i] = x;
            if (i == len) len++;
        }
        return len;
    }


}
