package com.company;
//if we are given sorted array/list then its most likely that binary search will be used
//Generally we use it on ascending sorted array. (Low to high (as everything in java basically :D))
//If array is in descending sorted order either you can code yourself the whole binarySearch approach or just reverse the array using Collections.reverse();

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main1 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10;
        }
        System.out.println(Arrays.toString(arr));
        binarySearch(arr, 0);
        binarySearch(arr, 10);
        binarySearch(arr, 30);
        binarySearch(arr, 70);
        binarySearch(arr, 90);
        System.out.println("=====");
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 10));
        System.out.println(binarySearch(arrayList, 5, 0, arrayList.size() - 1));
        System.out.println(Collections.binarySearch(arrayList, 6));
    }

    public static void binarySearch(int[] arr, int number) {
        //binary search, works only on sorted array. TC = O(logn),MC = O(1)
        //iterative approach
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = low + ((high - low) / 2);//this is to neglect big additions i.e. overflow
            if (arr[mid] == number) {
                System.out.println(number + " found at index " + mid);
                break;
            }
            if (number > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }

    public static int binarySearch(ArrayList<Integer> integers, int number, int low, int high) {
        //binary search, works only on sorted array. TC = O(logn),MC = O(1)
        //recursive approach
        if (low <= high) {
            int mid = low + ((high - low) / 2);//this is to neglect big additions i.e. overflow
            if (integers.get(mid) == number) {
                return mid;
            }
            if (integers.get(mid) > number) {
                return binarySearch(integers, number, low, mid - 1);
            }
            return binarySearch(integers, number, mid + 1, high);
        }
        return -1;
    }


}
