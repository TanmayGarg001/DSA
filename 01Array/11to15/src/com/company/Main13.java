//13.Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
package com.company;

public class Main13 {
    public static void main(String[] args) {
        int[] array = {-2, -1, -3, -4};
        approach1(array);
    }

    public static void approach1(int[] array) {
        //TC = O(n),MC = O(1); kadane's algorithm
        int maxSum = array[0];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (sum >= maxSum) {
                maxSum = sum;
            }
            if (sum <= 0) {
                sum = 0;
            }
        }

        System.out.println("Maximum continuous sub array sum: " + maxSum);

    }

}