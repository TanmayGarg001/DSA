package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main7 {
    //find the index of an element in a rotated sorted array

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 12, 0, 1, 2, 5, 6, 9));
        System.out.println(findNumberInRotatedSortedArray(arrayList, 12));
        System.out.println(findNumberInRotatedSortedArray(arrayList, 6));
        System.out.println(findNumberInRotatedSortedArray(arrayList, 9));
        System.out.println(findNumberInRotatedSortedArray(arrayList, 10));
        System.out.println(findNumberInRotatedSortedArray(arrayList, 1000));
    }

    public static int smallestNumberInRotatedArray(ArrayList<Integer> arrayList) {
        int left = 0;
        int right = arrayList.size() - 1;
        int n = arrayList.size();

        while (left <= right) {
            if (arrayList.get(left) <= arrayList.get(right)) {
                return left;
            }
            int mid = left + ((right - left) / 2);
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;
            if (arrayList.get(mid) < arrayList.get(next) && arrayList.get(mid) < arrayList.get(prev)) {
                return mid;
            }
            if (arrayList.get(mid) < arrayList.get(right)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int findNumberInRotatedSortedArray(ArrayList<Integer> arrayList, int number) {
        //TC = O(logn),MC = O(1)
        //If we find the number at mid we break the loop else we check if the number we are trying to find is greater than the number at mid and is smaller than
        //the element at right(right extreme that keeps changing) then we reduce the 1st half of the array else we do otherwise.
        int smallestIndex = smallestNumberInRotatedArray(arrayList);
        //now we have smallestIndex, so we have 2 halves in the array which are fully sorted
        if (arrayList.size() == 1) {
            if (arrayList.get(0) == number) {
                return arrayList.get(0);
            } else {
                return -1;
            }
        } else {
            int a = binarySearch(arrayList, number, 0, smallestIndex - 1);
            int b = binarySearch(arrayList, number, smallestIndex, arrayList.size() - 1);
            return Math.max(a, b);
        }
    }

    public static int binarySearch(ArrayList<Integer> integers, int number, int left, int right) {
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (integers.get(mid) == number) {
                return mid;
            }
            if (integers.get(mid) > number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private static int solve(int[] arr, int key) {
        int si = smallestNum(arr);//split index
        int ans1 = binarySearch(arr, key, 0, si - 1);
        int ans2 = binarySearch(arr, key, si, arr.length - 1);
        return Math.max(ans1, ans2);
    }

    private static int smallestNum(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + ((high - low) / 2);
            if (arr[high] < arr[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private static int binarySearch(int[] arr, int key, int low, int high) {
        if (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, key, low, mid - 1);
            }
            return binarySearch(arr, key, mid + 1, high);
        }
        return -1;
    }

}
