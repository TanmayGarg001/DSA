package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main9 {
    //Floor and ceiling means for a number of lets say 7.1 to 7.9, The floor is 7.0 and ceiling is 8.0 (think is as a ceiling and floor of a room).
    //System.out.println(Math.floor(12.4));
    //System.out.println(Math.ceil(12.4));

    public static void main(String[] args) {
        //given a sorted array return the floor of the asked element. here floor is defined as the greatest element smaller than the asked number.
        //Example = 1 2 3 4 5 . In this array floor of 3 is 3 and in array 1 2 4 5 , floor of 3 is 2.
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3, 5, 8, 9, 12, 15, 18, 22, 23, 25, 33, 41, 45, 50));
        System.out.println(floor(arrayList, 45));
        System.out.println(floor(arrayList, 7));
        System.out.println(floor(arrayList, 1));
        System.out.println(floor(arrayList, 24));
        System.out.println(floor(arrayList, 44));
        System.out.println(floor(arrayList, 57));
        System.out.println("=========================");
        System.out.println(ceil(arrayList, 45));
        System.out.println(ceil(arrayList, 7));
        System.out.println(ceil(arrayList, 1));
        System.out.println(ceil(arrayList, 24));
        System.out.println(ceil(arrayList, 44));
        System.out.println(ceil(arrayList, 57));
    }

    public static int floor(ArrayList<Integer> arrayList, int number) {
        //TC = O(logn),MC = O(1)
        //Its similar to what we do in binary search the only thing is we keep track of mid and store that in a variable.
        //Because that would be the floor
        int ans = -1;
        int left = 0;
        int right = arrayList.size() - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arrayList.get(mid) == number) {
                return arrayList.get(mid);
            } else if (arrayList.get(mid) > number) {
                right = mid - 1;
            } else {
                ans = mid;
                left = mid + 1;
            }
        }
        if (ans != -1) {
            return arrayList.get(ans);
        } else {
            return -1;
        }
    }

    public static int ceil(ArrayList<Integer> arrayList, int number) {
        //TC = O(logn),MC = O(1)
        int ans = -1;
        int left = 0;
        int right = arrayList.size() - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arrayList.get(mid) == number) {
                return arrayList.get(mid);
            } else if (arrayList.get(mid) < number) {
                left = mid + 1;
            } else {
                ans = mid;
                right = mid - 1;
            }
        }
        if (ans != -1) {
            return arrayList.get(ans);
        } else {
            return -1;
        }
    }

    private static int solve(int[] arr, int key) {
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == key) {
                return arr[mid];
            }
            if (arr[mid] > key) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }
        if (ans == -1) {
            return -1;
        }
        return arr[ans];
    }


}
