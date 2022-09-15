package com.company;
//sliding window is applied on questions which deals with sub arrays. For example 2,3,5,8,12,94,-415,0,4 is an array and sliding window or sub array size would be given like 4,
//and you'll be asked to return maxSum of sub array etc.
//there are 2 types of sliding window protocol:- fixed size window and variable size window.

public class Main1 {
    //find max subArray for length k.
    //kadane's algorithm is for max sum sub-array in an array i.e. k is not specified.
    public static void main(String[] args) {
        int[] arr = {12, 15, 31, 20, 100, 5, 0, 44, 2};
        maxSumSubArray(arr, 3);
    }

    public static void maxSumSubArray(int[] array, int k) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;

        while (j < array.length) {//while j pointer is less than window size
            sum = sum + array[j]; //do these operations in each iteration
            if (j - i + 1 < k) {  //do this till we hit window size.
                j++;
            } else if (j - i + 1 == k) { //once we hit window size do the required operations
                ans = Math.max(sum, ans);
                sum = sum - array[i];
                i++;                     //now increase j and i by 1 to slide the window
                j++;
            }
        }
        System.out.println(ans);
    }

}
