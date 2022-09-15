//33.Given an array of n positive integers and a number k. Find the minimum number of swaps required to bring all the numbers less than or equal to k together.
package com.company;

public class Main33 {

    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 5, 8, 7, 4};
        approach1(arr, 6);
    }

    public static void approach1(int[] array, int k) {
        //TC = O(n),MC = O(1)
        //Sliding window algorithm and 2 pointers
        int lowEqual = 0;
        int high = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= k) {
                lowEqual++;
            }
        }

        for (int i = 0; i < lowEqual; i++) {
            if (array[i] > k) {
                high++;
            }
        }

        int ans = high;
        for (int i = 0, j = lowEqual; j < array.length; ++i, ++j) {
            if (array[i] > k) {
                high--;
            }
            if (array[j] > k) {
                high++;
            }
            ans = Math.min(ans, high);
        }
        System.out.println(ans);
    }

}