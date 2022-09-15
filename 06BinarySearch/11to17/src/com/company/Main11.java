package com.company;

import java.util.ArrayList;

public class Main11 {
    //Find position of an element in a sorted array of infinite numbers
    //It is not possible to ask this question in coding round or to code but this can be asked in face 2 face interview

    //Now in this question if we compare this question to original binary search we find that right extreme can't be reached.
    //But we need left and right to decide the bounds of the number we are trying to find, once we do that we keep shrinking the bound till we found that element.
    //to solve this what we can do is we will assign right just next to left.
    //Now left=0 and right=1. We will keep checking in each iteration that if the number we are trying to find is included in bounds if not,
    //we will increase right by a factor of 2 i.e. right = right*2. This will maintain a time complexity of O(logn).

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 999; i++) {
            arrayList.add(i * 10);
        }
        System.out.println(binarySearchVirtualInfinite(arrayList, 140));
        System.out.println(binarySearchVirtualInfinite(arrayList, 6180));
        System.out.println(binarySearchVirtualInfinite(arrayList, 6190));//out of bounds coz array is not infinite
        System.out.println(otherApproach(arrayList, 140));
        System.out.println(otherApproach(arrayList, 6180));
        System.out.println(otherApproach(arrayList, 6190));
    }

    //Code would look something like this
    //It will only work for an infinite sorted array coz of the fact right pointer can go out of bounds in code if you reach at the extreme rights of the array.
    public static int binarySearchVirtualInfinite(ArrayList<Integer> arrayList, int number) {
        int left = 0;
        int right = 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (number == arrayList.get(mid)) {
                return mid;
            }
            if (number > arrayList.get(mid)) {
                left = mid + 1;
                right = right * 2;
            } else if (number < arrayList.get(mid)) {
                right = mid - 1;
            }
            //we can simply use Collections.binarySearch() here if we want to cover out of bounds exception, but it doesn't make sense question wise.
        }
        return -1;
    }

    public static int otherApproach(ArrayList<Integer> arrayList, int number) {
        int left = 0;
        int right = 1;
        while (number > arrayList.get(right)) {
            left = right;
            right = right * 2;
        }
        return binarySearch(arrayList, number, left, right);
    }

    public static int binarySearch(ArrayList<Integer> arrayList, int number, int left, int right) {
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arrayList.get(mid) == number) {
                return mid;
            } else if (arrayList.get(mid) < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    //Given an infinite sorted array consisting 0s and 1s. The problem is to find the index of first ‘1’ in that array.
    //As the array is infinite, therefore it is guaranteed that number ‘1’ will be present in the array.
    //Similar to the question infinite sorted array and to find first occurrence of the given number.
}
