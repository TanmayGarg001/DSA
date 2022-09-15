package com.company;

//Given a bitonic array find the maximum value of the array. An array is said to be
//bitonic if it has an increasing sequence of integers followed immediately by a decreasing sequence of integers.
//Input:
//1 4 8 3 2
//Output:
//8

import java.util.ArrayList;
import java.util.Arrays;

public class Main14 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(11, 31, 81, 121, 555, 4, 2, 1, 0, -546, -5145));
        System.out.println(bitonicArray(arrayList));
    }

    public static int bitonicArray(ArrayList<Integer> arrayList) {
        //same as peak element
        int low = 0;
        int high = arrayList.size() - 1;
        if (arrayList.size() < 2) {
            return arrayList.get(arrayList.size() - 1);
        }

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arrayList.get(mid) > arrayList.get(mid + 1) && arrayList.get(mid) > arrayList.get(mid - 1)) {
                return mid;
            } else if (arrayList.get(mid) > arrayList.get(mid - 1) && arrayList.get(mid + 1) > arrayList.get(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
