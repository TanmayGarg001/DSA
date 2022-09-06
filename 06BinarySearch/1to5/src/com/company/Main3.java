package com.company;

import java.util.ArrayList;
import java.util.Arrays;

//order agnostic search
//this means array is sorted, but we don't know if array is ascending or descending order
public class Main3 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(20, 17, 15, 14, 13, 12, 10, 9, 8, 4));
        System.out.println(binarySearch(arrayList, 8, 0, arrayList.size() - 1));
        System.out.println(binarySearch(arrayList2, 15, 0, arrayList.size() - 1));
    }

    public static int binarySearch(ArrayList<Integer> al, int key, int low, int high) {
        //TC = O(logn),MC = O(1)
        //same as before just add an if-else condition
        if (al.size() == 1 && al.get(0) == key) {
            return al.get(0);
        }
        if (al.get(0) < al.get(al.size() - 1)) {
            if (low <= high) {
                int mid = low + ((high - low) / 2);
                if (al.get(mid) == key) {
                    return mid;
                }
                if (al.get(mid) > key) {
                    return binarySearch(al, key, low, mid - 1);
                }
                return binarySearch(al, key, mid + 1, high);
            }

        } else {
            if (high >= low) {
                int mid = low + ((high - low) / 2);
                if (al.get(mid) == key) {
                    return mid;
                }
                if (al.get(mid) > key) {
                    return binarySearch(al, key, mid + 1, high);
                }
                return binarySearch(al, key, low, mid - 1);

            }
        }
        return -1;
    }
}
