package com.company;

public class Main8 {
    //Searching in a nearly sorted array.
    //here nearly sorted means an ith index can have its index as i/i+1/i-1
    //Ex for array = 5 10 20 30 40
    //Nearly sorted array will be = 5 10 30 20 40
    //Now obvious way is to do a linear search but TC = O(n)
    public static void main(String[] args) {
        int[] arr = {3, 13, 7, 19, 20, 25, 21, 35, 72, 50};
        System.out.println(modifiedBinarySearch(arr, 13));
        System.out.println(modifiedBinarySearch(arr, 20));
        System.out.println(modifiedBinarySearch(arr, 72));
        System.out.println(modifiedBinarySearch(arr, 50));
        System.out.println(modifiedBinarySearch(arr, 3));
        System.out.println(modifiedBinarySearch(arr, 35));
        System.out.println(modifiedBinarySearch(arr, 100));
    }

    public static int modifiedBinarySearch(int[] arr, int key) {
        //BOOM! TC = O(logn),MC = O(1)
        //Similar to binarySearch very easy if you think about it all you have to do is some tweaking in binary search.
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[next] == key) {
                return next;
            }
            if (arr[prev] == key) {
                return prev;
            }
            if (arr[mid] < key) {
                low = mid + 2;
            } else {
                high = mid - 2;
            }
        }
        return -1;
    }

}
