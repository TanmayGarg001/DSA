//8.Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
package com.company;

public class Main8 {

    public static void main(String[] args) {
        int[] array = {1, 3, 2, -2, 5, 2, -5};
        approach1(array);
        approach2(array);
    }

    public static void approach1(int[] array) {
        //TC = O(n), MC=O(1)
        //This is very useful approach and is also known as Kadane's algorithm.
        //Basically we traverse the array, and we have one max which store the maximum answer.Now during traversal define a sum which is equal to the previous elements
        //sum and the just next element. If this sum is higher than max we change the value of max. But if the sum is negative that means that sub-array is leading to
        //a negative sum which will not matter as it will decrease the net sum, so we assign sum=0 in that case as we only want max sum.
        int max = array[0];
        int sum = 0;

        for (int i : array) {
            sum = sum + i;
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max);

    }

    public static void approach2(int[] array) {
        //TC = O(n^2),MC = O(1)
        //Brute force approach, make all the possible sub arrays for the given array and then find the largest element and return it.
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum = sum + array[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("Max sub-array sum = " + max);
    }
    
}