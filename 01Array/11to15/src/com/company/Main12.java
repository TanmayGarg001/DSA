<<<<<<< HEAD
//12.Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order.
//Merge the two arrays into one sorted array in non-decreasing order without using any extra space.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main12 {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        approach1(arr1, arr2);
        approach2(arr1, arr2, arr1.length, arr2.length);
    }

    public static void approach1(int[] arr1, int[] arr2) {
        //TC = O(nlogn),MC = O(n)
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : arr1) {
            arrayList.add(i);
        }
        for (int i : arr2) {
            arrayList.add(i);
        }
        Collections.sort(arrayList);
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arrayList.get(i);
            j++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arrayList.get(i + j);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void approach2(int[] arr1, int[] arr2, int n, int m) {
        //TC = O(nlogn),MC = O(1)
        int i = 0;
        int j = 0;
        int k = n - 1;
        while (i <= k && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

=======
//12.Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order.
//Merge the two arrays into one sorted array in non-decreasing order without using any extra space.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main12 {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        approach1(arr1, arr2);
        approach2(arr1, arr2, arr1.length, arr2.length);
    }

    public static void approach1(int[] arr1, int[] arr2) {
        //TC = O(nlogn),MC = O(n)
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : arr1) {
            arrayList.add(i);
        }
        for (int i : arr2) {
            arrayList.add(i);
        }
        Collections.sort(arrayList);
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arrayList.get(i);
            j++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arrayList.get(i + j);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void approach2(int[] arr1, int[] arr2, int n, int m) {
        //TC = O(nlogn),MC = O(1)
        int i = 0;
        int j = 0;
        int k = n - 1;
        while (i <= k && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

>>>>>>> 26b1aac (Final Commit_1)
}