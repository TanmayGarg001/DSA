package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//1st and last occurrence of an element in a sorted array.
//best way is to use list.lastIndexOf(); and indexOf();//TC = O(n) and MC = O(1)
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class Main4 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2, 3, 4, 10, 10, 10, 10, 10, 10, 10, 15, 21, 32, 55));
        System.out.println(arrayList.lastIndexOf(10));
        System.out.println(arrayList.indexOf(10));
        System.out.println("=========");
        firstAndLastOccurrence(arrayList, 10);
        firstAndLastOccur(arrayList, 10);
    }

    public static void firstAndLastOccurrence(ArrayList<Integer> arrayList, int number) {
        //TC = O(n),MC = O(1)
        //Just find the value first
        int ans = Collections.binarySearch(arrayList, number);
        if (ans < 0) {
            System.out.println("Element not found");
        } else {
            int firstOccurrence = 0;
            int lastOccurrence = 0;
            int temp = ans;
            if (ans > 0) {
                while (ans >= 0) {
                    if (arrayList.get(ans) == number) {
                        firstOccurrence = ans;
                        ans--;
                    } else {
                        break;
                    }
                }
                while (temp <= arrayList.size() - 1) {
                    if (arrayList.get(temp) == number) {
                        lastOccurrence = temp;
                        temp++;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(firstOccurrence);
            System.out.println(lastOccurrence);
        }
    }

    public static void firstAndLastOccur(ArrayList<Integer> arrayList, int number) {
        //TC = O(logn),MC =O(1)
        //Similar to binary search but if we found element at mid we still keep searching for 1st or last occurrence.
        int low = 0;
        int high = arrayList.size() - 1;
        int ans = -1;
        int ans2 = -1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arrayList.get(mid) == number) {
                ans = mid;
                high = mid - 1;
            } else if (arrayList.get(mid) > number) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        low = 0;
        high = arrayList.size() - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arrayList.get(mid) == number) {
                ans2 = mid;
                low = mid + 1;
            } else if (arrayList.get(mid) > number) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
        System.out.println(ans2);
    }


}

