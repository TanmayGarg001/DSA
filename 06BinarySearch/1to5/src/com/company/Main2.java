package com.company;
//implementation of binary search if array is sorted in reverse order.(descending order)

import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(20, 17, 15, 14, 13, 12, 10, 9, 8, 4));
        System.out.println(arrayList);
        System.out.println(binarySearch(arrayList, 15, 0, arrayList.size() - 1));
        binarySearch(arrayList, 9);
    }

    public static void binarySearch(ArrayList<Integer> arrayList, int number) {
        //TC = O(logn),MC = O(1)
        //iterative approach
        int left = 0;
        int right = arrayList.size() - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arrayList.get(mid) == number) {
                System.out.println(number + " found at index " + mid);
            }
            if (arrayList.get(mid) > number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

    }

    public static int binarySearch(ArrayList<Integer> arrayList, int number, int left, int right) {
        //TC = O(logn),MC = O(1)
        //recursive approach
        if (right >= left) {
            int mid = left + ((right - left) / 2);
            if (arrayList.get(mid) == number) {
                return mid;
            }
            if (arrayList.get(mid) > number) {
                return binarySearch(arrayList, number, mid + 1, right);
            }
            return binarySearch(arrayList, number, left, mid - 1);

        }
        return -1;
    }

}
