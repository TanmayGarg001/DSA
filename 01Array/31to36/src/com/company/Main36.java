//36.Given two sorted arrays, a[] and b[], the task is to find the median of these sorted arrays, in O(log n + log m) time complexity,
//when n is the number of elements in the first array, and m is the number of elements in the second array.
package com.company;

import java.util.ArrayList;

public class Main36 {

    public static void main(String[] args) {
        int[] ar1 = {-5, 3, 6, 12, 15};
        int[] ar2 = {-12, -10, -6, -3, 4, 10};
        System.out.println(approach1(ar1, ar2));
    }

    public static int approach1(int[] a, int[] b) {
        //TC = O(m+n),MC = O(m+n)
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                arrayList.add(b[j]);
                j++;
            } else if (a[i] == b[j]) {
                arrayList.add(b[j]);
                i++;
                j++;
            } else {
                arrayList.add(a[i]);
                i++;
            }
        }
        if (j == b.length) {
            for (int x = i; x < a.length; x++) {
                arrayList.add(a[x]);
            }
        } else {
            for (int x = j; x < b.length; x++) {
                arrayList.add(b[x]);
            }
        }
        System.out.println(arrayList);
        return arrayList.size() % 2 == 0 ? (arrayList.get(arrayList.size() / 2) + arrayList.get((arrayList.size() / 2) - 1)) / 2 : arrayList.get(arrayList.size() / 2);
    }

}