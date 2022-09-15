//25.Given an array arr[] of size N and an element k. The task is to find all elements in array that appear more than n/k times.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main25 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 5, 1, 2, 5, 2, 5, 2};
        int[] arr3 = {7, 8, 7, 8, 9, 8, 5, 4, 7, 1, 7, 1, 2, 4, 7, 7, 7};
        System.out.println(approach1(arr, arr.length / 3));
        System.out.println(approach2(arr, arr.length / 3));
        System.out.println(approach1(arr3, arr3.length / 5));
        System.out.println(approach2(arr3, arr3.length / 5));
    }

    public static int approach1(int[] arr, int count) {
        //TC = O(nlogn),MC = O(1)
        Arrays.sort(arr);
        int temp = 1;
        int ans = 0;
        // ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && i != arr.length - 2) {
                temp++;
            } else {
                if (arr[i] == arr[i + 1] && i == arr.length - 2) {
                    temp++;
                }
                if (temp > count) {
                    // al.add(arr[i]);
                    ans++;
                }
                temp = 1;
            }
        }
        // System.out.println(al);
        return ans;
    }

    public static int approach2(int[] arr, int count) {
        //TC = O(n),MC = O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> al1 = new ArrayList<>(map.keySet());
        ArrayList<Integer> al2 = new ArrayList<>(map.values());
//        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < al1.size(); i++) {
            if (al2.get(i) > count) {
//                al.add(al1.get(i));
                ans++;
            }
        }
        return ans;
    }
}
