//23.Given an array Arr that contains N integers (maybe positive, negative or zero). Find the product of the maximum product sub-array.
package com.company;

public class Main23 {

    public static void main(String[] args) {
        int[] arr = {12, -10, 0, 98, -55, 123, -45, 55, 60};
        System.out.println(approach1(arr));
        System.out.println(approach2(arr));
    }

    public static long approach1(int[] array) {
        //TC = O(n),MC = O(1);based on dynamic programming
        //It's similar to kadane's algorithm
        //Loop through the array, each time remember the max and min value for the previous product, the most important thing is to update the max and min value:
        // we have to compare among max * A[i], min * A[i] as well as A[i], since this is product, a negative * negative could be positive.
        if (array == null || array.length == 0) {
            return 0;
        }
        long max = array[0], min = array[0];
        long result = array[0];
        for (int i = 1; i < array.length; i++) {
            long temp = max;
            max = Math.max(Math.max(max * array[i], min * array[i]), array[i]);
            min = Math.min(Math.min(temp * array[i], min * array[i]), array[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    public static long approach2(int[] arr) {
        //TC = O(n), MC = O(1)
        long product = 1;
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
            max1 = Math.max(max1, product);
            if (arr[i] == 0) {
                product = 1;
            }
        }
        product = 1;
        for (int i = arr.length - 1; i > 0; i--) {
            product = product * arr[i];
            max2 = Math.max(max2, product);
            if (arr[i] == 0) {
                product = 1;
            }
        }

        return Math.max(max1, max2);
    }

}