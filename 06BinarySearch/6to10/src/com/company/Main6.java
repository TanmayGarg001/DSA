package com.company;

//Number of Times a Sorted array is Rotated
//Example:- 5,7,10,17,25,32,38,40
//Now this array is given rotated to us like :- 10,17,25,32,38,40,5,7
//Here array is rotated 2 times. We have to find how many times the given array is rotated.

//What we could do is a linear search and whenever we find an element smaller than the previous one we could subtract its index from array length, and we will find the answer.
//But this wil result in TC= O(n).

public class Main6 {

    public static void main(String[] args) {
        int[] arr = {10, 24, 38, 44, 80, 152, 4, 7, 9};
        int[] arr2 = {3, 5, 6, 7, 8, 15, 1, 2};
        System.out.println(rotateCount(arr));//returns no. of times a sorted array is rotated
        System.out.println(rotateCount(arr2));
        System.out.println("====");
        System.out.println(solve(arr));//return value of smallest num in rotated sorted array
        System.out.println(solve(arr2));
    }

    public static int rotateCount(int[] arr) {
        //So,our task boils down to find the minimum element in this array using binary search in O(logn).
        //Tc = O(logn),MC = O(1)
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[high] < arr[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr.length - low;
    }

    public static int solve(int[] arr) {//returns the smallest number in rotated sorted array in O(logn)
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[high] < arr[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr[low];
    }

}
