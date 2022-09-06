<<<<<<< HEAD
//35.Given an array arr[] of N integers, calculate the median
package com.company;

import java.util.Arrays;

public class Main35 {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8};
        System.out.println(approach1(arr));
    }

    public static int approach1(int[] arr) {
        //TC = O(n*logn),MC = O(1)
        //Sort the array return middle element if no. of elements are odd else add middle 2 elements and half the sum and return it.
        Arrays.sort(arr);
        return arr.length % 2 == 0 ? (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2 : arr[arr.length / 2];
    }
}
=======
//35.Given an array arr[] of N integers, calculate the median
package com.company;

import java.util.Arrays;

public class Main35 {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8};
        System.out.println(approach1(arr));
    }

    public static int approach1(int[] arr) {
        //TC = O(n*logn),MC = O(1)
        //Sort the array return middle element if no. of elements are odd else add middle 2 elements and half the sum and return it.
        Arrays.sort(arr);
        return arr.length % 2 == 0 ? (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2 : arr[arr.length / 2];
    }
}
>>>>>>> 26b1aac (Final Commit_1)
