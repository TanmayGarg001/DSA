package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main5 {
    //Count of an element in a sorted array
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0, 2, 3, 4, 4, 5, 7, 10));
        countOfElement(arrayList, 10);
    }

    public static void countOfElement(ArrayList<Integer> arrayList, int number) {
        //TC = O(logn),MC = O(1)
        //find first and second occurrence subtract them and add 1 to it, we will get the count.
        //We can do it using linear search or using indexOf and lastIndexOf methods too but TC = O(n)
        int left = 0;
        int right = arrayList.size() - 1;
        int a = -1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arrayList.get(mid) == number) {
                a = mid;
                right = mid - 1;
            } else if (arrayList.get(mid) > number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        left = 0;
        right = arrayList.size() - 1;
        int b = -1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arrayList.get(mid) == number) {
                b = mid;
                left = mid + 1;
            } else if (arrayList.get(mid) > number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (a == -1 & b == -1) {
            System.out.println(0);
        } else {
            System.out.println(b - a + 1);
        }
    }
    
}
