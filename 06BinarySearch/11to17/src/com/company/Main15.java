package com.company;

public class Main15 {
    //Given a bitonic sequence of n distinct elements, write a program to find a given element x in the bitonic sequence in O(log n) time.
    //A Bitonic Sequence is a sequence of numbers which is first strictly increasing then after a point strictly decreasing
    public static void main(String[] args) {
        //somewhat similar to rotated array problem
        //but bitonic sorted array is not rotated sorted array
        int[] arr = {11, 31, 81, 121, 555, 984, 2, 1, 0, -546, -5145};
        System.out.println(solve(arr, 11));
        System.out.println(solve(arr, 31));
        System.out.println(solve(arr, 555));
        System.out.println(solve(arr, 984));
        System.out.println(solve(arr, 0));
        System.out.println(solve(arr, -5145));
        System.out.println(solve(arr, 100));
    }

    private static int solve(int[] arr, int key) {
        //We are given a bitonic array if we find the breakpoint, and then we just apply the binary search to the 2 arrays which will be sorted.
        int si = findIndex(arr);
        int a = binarySearch(arr, key, 0, si);
        int b = binarySearchReverse(arr, key, si + 1, arr.length - 1);
        return Math.max(a, b);
    }

    private static int findIndex(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        if (arr.length < 2) {
            return 0;
        }
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            } else if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int key, int low, int high) {
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearchReverse(int[] arr, int key, int low, int high) {
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
