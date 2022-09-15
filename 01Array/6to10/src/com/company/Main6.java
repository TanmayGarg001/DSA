//6.Find the Union and Intersection of the two sorted arrays.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Main6 {

    public static void main(String[] args) {
        int[] arr1 = {3, 15, 5, 0};
        int[] arr2 = {17, 15, 10, 0, -10, 32};
        System.out.println("Array 1:" + Arrays.toString(arr1));
        System.out.println("Array 2:" + Arrays.toString(arr2));
        System.out.println("======================");
        approach1(arr1, arr2);
        System.out.println("======================");
        approach2(arr1, arr2);
        System.out.println("======================");
        approach3(arr1, arr2);
        System.out.println("======================");
        approach4(arr1, arr2);
    }

    public static void approach1(int[] array1, int[] array2) {
        //TC = O(n+m),MC = O(n+m)
        //We could use a HashMap for finding union only as map can have distinct keys only, and it overwrites the same key if it is stored again.
        //Make use of HashSet as sets only have unique values and in built methods are godlike. Very powerful and best way of doing this question.
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s3 = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            s1.add(array1[i]);
        }
        HashSet<Integer> s2 = new HashSet<>(s1);//similar to addAll
        for (int i = 0; i < array2.length; i++) {
            s1.add(array2[i]);
            s3.add(array2[i]);
        }
        s2.retainAll(s3);//removes from this collection all of its elements that are not contained in the specified collection.
        System.out.println("Union: " + s1);
        System.out.println("Intersection: " + s2);
    }

    public static void approach2(int[] array1, int[] array2) {
        //TC = O(n^2),MC = O(n+m)
        //Copy the elements of 1st array to a arrayList and then compare that to other array in each iteration.When we find something inclusive It's for intersection
        //else after traversing the whole array if elements compared were not equal add them to union. Not a good way of doing this as it is a brute force strategy.
        ArrayList<Integer> union = new ArrayList<>();
        ArrayList<Integer> intersection = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            union.add(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            if (union.contains(array1[i])) {
                intersection.add(array1[i]);
            } else {
                union.add(array1[i]);
            }
        }

        System.out.println("Union:" + union);
        System.out.println("Intersection:" + intersection);

    }

    public static void approach3(int[] array1, int[] array2) {
        //TC = O(n*logn),MC=O(n+m)
        //Sort any of the 2 arrays can be optimized of we selected to sort the array whose length is less.
        //Sort the selected array and add to intersection if we find that other array has an element common with the sorted array.
        //For searching use binary search as it has timeComplexity of O(logn),binarySearch won't work unless array is sorted!
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> intersection = new ArrayList<>();
        ArrayList<Integer> union = new ArrayList<>();

        Arrays.sort(array2);
        for (int i = 0; i < array2.length; i++) {
            integers.add(array2[i]);
            union.add(array2[i]);
        }

        for (int i = 0; i < array1.length; i++) {
            if (Collections.binarySearch(integers, array1[i]) >= 0) {
                intersection.add(array1[i]);
            } else {
                union.add(array1[i]);
            }
        }

        System.out.println("Union:" + union);
        System.out.println("Intersection:" + intersection);
    }

    public static void approach4(int[] array1, int[] array2) {
        //TC=O(n*logn+m*logm),MC = O(1) here too sorting is bottleneck
        //2 pointer approach, very powerful godlike stuff!
        Arrays.sort(array1);
        Arrays.sort(array2);

        int i = 0;
        int j = 0;
        System.out.print("Union: [");
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                System.out.print(array1[i] + " ");
                i++;
            } else if (array1[i] > array2[j]) {
                System.out.print(array2[j] + " ");
                j++;
            } else {
                System.out.print(array2[j] + " ");
                i++;
                j++;
            }
        }
        while (i < array1.length) {
            System.out.print(array1[i] + " ");
            i++;
        }
        while (j < array2.length) {
            System.out.print(array2[j] + " ");
            j++;
        }
        System.out.print("]");

        i = 0;
        j = 0;
        System.out.print("\nIntersection: [");
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                i++;
            } else if (array1[i] > array2[j]) {
                j++;
            } else {
                System.out.print(array2[j] + " ");
                i++;
                j++;
            }
        }
        System.out.print("]");
    }
}