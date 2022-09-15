//27.Given two arrays: a1[0.....n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not.
//Both the arrays can be sorted or unsorted. It may be assumed that elements in both array are distinct.
package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Main27 {

    public static void main(String[] args) {
        long[] a1 = {8, 4, 5, 3, 1, 7, 9};
        long[] a2 = {5, 1, 3, 7, 9};
        System.out.println(approach1(a1, a2));
        System.out.println(approach2(a1, a2));
    }

    public static String approach1(long[] a1, long[] a2) {
        //TC = O(n*logn),MC= O(n)
        //make two treeSet as values are distinct, and we will get them in sorted order.Now copy them in two arrayLists.
        //As a2 is subset of a1 so a2'size must be smaller or equal to a1'size.
        //Apply binary search for each element in a2 and if found in a2 then return true else false.
        TreeSet<Long> ts1 = new TreeSet<>();
        TreeSet<Long> ts2 = new TreeSet<>();
        for (int i = 0; i < a1.length; i++) {
            ts1.add(a1[i]);
        }
        for (int i = 0; i < a2.length; i++) {
            ts2.add(a2[i]);
        }
        ArrayList<Long> al1 = new ArrayList<>(ts1);
        ArrayList<Long> al2 = new ArrayList<>(ts2);
        if (al1.size() >= al2.size()) {
            for (int i = 0; i < al2.size(); i++) {
                if (Collections.binarySearch(al1, al2.get(i)) < 0) {
                    return "No";
                }
            }
        }
        if (al2.size() > al1.size()) {
            return "No";
        }

        return "Yes";

    }

    public static String approach2(long[] a1, long[] a2) {
        //TC = O(1),MC = O(1)
        HashSet<Long> hs1 = new HashSet<>();
        HashSet<Long> hs2 = new HashSet<>();

        for (long i : a1) {
            hs1.add(i);
        }

        for (long i : a2) {
            hs2.add(i);
        }

        String ans;
        if (hs1.containsAll(hs2)) {
            ans = "Yes";
        } else {
            ans = "No";
        }
        return ans;
    }

}