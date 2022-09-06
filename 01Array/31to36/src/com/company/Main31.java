<<<<<<< HEAD
//31.Given an array of integers and a number x, find the smallest subarray with sum greater than the given value.
package com.company;

public class Main31 {

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 45, 6, 0, 9};
        int[] arr2 = {1, 10, 5, 2, 7};
        int[] arr3 = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        int[] arr4 = {1, 2, 4};
        System.out.println(approach1(arr1, 51));
        System.out.println(approach1(arr2, 9));
        System.out.println(approach1(arr3, 280));
        System.out.println(approach1(arr4, 8));
    }

    public static int approach1(int[] arr, int sum) {
        //TC = O(n),MC = O(1)
        int temp = 0;
        int ans = Integer.MAX_VALUE;
        int i = 0;
        int j = 1;
        while (i < j && j < arr.length) {
            if (temp <= sum) {
                temp = temp + arr[j - 1];
                j++;
            } else {
                ans = Math.min(ans, j - i - 1);
                temp = temp - arr[i];
                i++;
            }

        }
        return ans;
    }

=======
//31.Given an array of integers and a number x, find the smallest subarray with sum greater than the given value.
package com.company;

public class Main31 {

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 45, 6, 0, 9};
        int[] arr2 = {1, 10, 5, 2, 7};
        int[] arr3 = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        int[] arr4 = {1, 2, 4};
        System.out.println(approach1(arr1, 51));
        System.out.println(approach1(arr2, 9));
        System.out.println(approach1(arr3, 280));
        System.out.println(approach1(arr4, 8));
    }

    public static int approach1(int[] arr, int sum) {
        //TC = O(n),MC = O(1)
        int temp = 0;
        int ans = Integer.MAX_VALUE;
        int i = 0;
        int j = 1;
        while (i < j && j < arr.length) {
            if (temp <= sum) {
                temp = temp + arr[j - 1];
                j++;
            } else {
                ans = Math.min(ans, j - i - 1);
                temp = temp - arr[i];
                i++;
            }

        }
        return ans;
    }

>>>>>>> 26b1aac (Final Commit_1)
}