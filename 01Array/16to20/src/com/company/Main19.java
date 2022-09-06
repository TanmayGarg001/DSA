<<<<<<< HEAD
//19.Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
package com.company;

import java.util.*;

public class Main19 {

    public static void main(String[] args) {
        int[] a = {1, 5, 10, -20, 40, 80};
        int[] b = {6, 7, 20, 80, 100};
        int[] c = {3, 4, 15, 20, 30, 70, 180, 120};
        System.out.println(approach1(a, b, c));
        approach2(a, b, c);
    }

    public static ArrayList<Integer> approach1(int[] array1, int[] array2, int[] array3) {
        //TC = O(n1 + n2 + n3),MC = O(n1 + n2 + n3)
        //TreeSet stores data unique and in ordered form we make use of that here
        TreeSet<Integer> ts1 = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        TreeSet<Integer> ts3 = new TreeSet<>();

        for (int i = 0; i < array1.length; i++) {
            ts1.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            ts2.add(array2[i]);
        }
        for (int i = 0; i < array3.length; i++) {
            ts3.add(array3[i]);
        }

        ts1.retainAll(ts2);
        ts1.retainAll(ts3);

        if (ts1.isEmpty()) {
            ts1.add(-1);
        }
        return new ArrayList<>(ts1);
    }

    public static void approach2(int[] array1, int[] array2, int[] array3) {
        //TC = O(n)[n is the length of the smallest array],MC = O(n) [note that memory in real cases will be far less than O(n)]
        //This is efficient than the approach1//DLL = doubly linked list
        LinkedHashSet<Integer> integers = new LinkedHashSet<>();//Can use TreeSet too but add would take O(logn) although it is faster in this scenario coz LinkedHashSet is DLL.
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array1.length && j < array2.length && k < array3.length) {
            if (array1[i] == array2[j] && array2[j] == array3[k]) {
                integers.add(array1[i]);
                i++;
                j++;
                k++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else if (array2[j] < array3[k]) {
                j++;
            } else {
                k++;
            }
        }
        if (integers.isEmpty()) {
            integers.add(-1);
        }
        ArrayList<Integer> arrayList = new ArrayList<>(integers);
        System.out.println(arrayList);
    }


=======
//19.Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
package com.company;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main19 {

    public static void main(String[] args) {
        int[] a = {1, 5, 10, -20, 40, 80};
        int[] b = {6, 7, 20, 80, 100};
        int[] c = {3, 4, 15, 20, 30, 70, 80, 180, 120};
        System.out.println(approach1(a, b, c));
        approach2(a, b, c);
    }

    public static ArrayList<Integer> approach1(int[] array1, int[] array2, int[] array3) {
        //TC = O(n1logn1 + n2logn2 + n3logn3),MC = O(n1 + n2 + n3)
        //TreeSet stores data unique and in sorted form we make use of that here
        TreeSet<Integer> ts1 = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        TreeSet<Integer> ts3 = new TreeSet<>();

        for (int i = 0; i < array1.length; i++) {
            ts1.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            ts2.add(array2[i]);
        }
        for (int i = 0; i < array3.length; i++) {
            ts3.add(array3[i]);
        }

        ts1.retainAll(ts2);
        ts1.retainAll(ts3);

        if (ts1.isEmpty()) {
            ts1.add(-1);
        }
        return new ArrayList<>(ts1);
    }

    public static void approach2(int[] array1, int[] array2, int[] array3) {
        //TC = O(n)[n is the length of the smallest array],MC = O(n) [note that memory in real cases will be far less than O(n)]
        ArrayList<Integer> integers = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array1.length && j < array2.length && k < array3.length) {
            if (array1[i] == array2[j] && array2[j] == array3[k]) {
                integers.add(array1[i]);
                i++;
                j++;
                k++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else if (array2[j] < array3[k]) {
                j++;
            } else {
                k++;
            }
        }
        if (integers.isEmpty()) {
            integers.add(-1);
        }
        System.out.println(integers);
    }


>>>>>>> 26b1aac (Final Commit_1)
}