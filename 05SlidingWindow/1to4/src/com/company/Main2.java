package com.company;

import java.util.ArrayList;

//Given an array A[] of size N and a positive integer K, find the first negative integer for each and every window(contiguous sub-array) of size K.
public class Main2 {

    public static void main(String[] args) {
        int[] arr = {-12, -1, 7, 8, -15, 30, -16, 28};
        printFirstNegativeInteger(arr, 3);
    }

    public static void printFirstNegativeInteger(int[] arr, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if (arr[j] < 0) {
                temp.add(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (!temp.isEmpty()) {
                    ans.add(temp.get(0));
                } else {
                    ans.add(0);
                }
                if (arr[i] < 0) {
                    temp.remove(0);
                }
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }

}