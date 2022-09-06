package com.company;

//Very amazing concept!
//BinarySearch on answer
//For binary search array should be sorted or nearly sorted.Which is true in most of the cases.
//But in some cases it can be applied to unsorted array too!
//here is each case i.e. when arr[mid]==or>or<number we will have to make modifications.

import java.util.ArrayList;
import java.util.Arrays;

public class Main13 {
//A peak element is an element that is strictly greater than its neighbors.
//Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
//You may imagine that nums[-1] = nums[n] = -∞.
//You must write an algorithm that runs in O(log n) time.
//if more than 1 peak elements exist then return any. if array is sorted than last element would be peak element, although it has 1 neighbour only.

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 3, 5, 6, 4));
        System.out.println(peakElement(arrayList));
    }

    //This problem is similar to Local Minimum. And according to the given condition, num[i] != num[i+1],
    //there must exist a O(logN) solution. So we use binary search for this problem.
    //If num[i-1] < num[i] > num[i+1], then num[i] is peak
    //If num[i-1] < num[i] < num[i+1], then num[i+1...n-1] must contains a peak
    //If num[i-1] > num[i] > num[i+1], then num[0...i-1] must contains a peak
    //If num[i-1] > num[i] < num[i+1], then both sides have peak

    public static int peakElement(ArrayList<Integer> arrayList) {
        int low = 0;
        int high = arrayList.size() - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (mid > 0 && mid < arrayList.size() - 1) {
                if (arrayList.get(mid) > arrayList.get(mid - 1) && arrayList.get(mid) > arrayList.get(mid + 1)) {
                    return mid;
                } else if (arrayList.get(mid - 1) > arrayList.get(mid) && arrayList.get(mid) > arrayList.get(mid + 1)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (mid == 0) {
                if (arrayList.get(0) > arrayList.get(1)) {
                    return 0;
                } else {
                    return 1;
                }
            } else if (mid == arrayList.size() - 1) {
                if (arrayList.get(arrayList.size() - 1) > arrayList.get(arrayList.size() - 2)) {
                    return arrayList.get(arrayList.size() - 1);
                } else {
                    return arrayList.get(arrayList.size() - 2);
                }
            }
        }
        return -1;
    }

}
