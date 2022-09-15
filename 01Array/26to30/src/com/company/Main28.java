//28.Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.
package com.company;

import java.util.Arrays;

public class Main28 {

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        System.out.println(approach1(arr, 13));
    }

    public static boolean approach1(int[] arr, int sum) {
        //TC = O(n^2),MC = O(1)
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] == sum) {
                    return true;
                } else if (arr[i] + arr[j] + arr[k] < sum) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return false;
    }

    //Other approach would be using HashMap similar to Q18, but then TC = O(n^2),MC = O(n)

}