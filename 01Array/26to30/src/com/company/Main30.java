<<<<<<< HEAD
//30.Given an array A[] of positive integers of size N, where each value represents the number of chocolates in a packet.
// Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
//1. Each student gets exactly one packet.
//2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main30 {

    public static void main(String[] args) {
        ArrayList<Long> al = new ArrayList<>(Arrays.asList(17L, 83L, 59L, 25L, 38L, 63L, 25L, 1L, 37L));
        System.out.println(approach1(al, al.size(), 9));
    }

    public static long approach1(ArrayList<Long> a, long n, long m) {
        //TC = O(n*logn),MC = O(1)
        //Sort the array and keep shifting the array size by number of students in the loop in each iteration.
        Collections.sort(a);
        if (m == 0 || n == 0) {
            return 0L;
        }
        if (m > n) {
            return -1L;
        }

        long ans = Long.MAX_VALUE;

        for (int i = 0; i + m - 1 < a.size(); i++) {
            long temp = a.get((int) (i + m - 1)) - a.get(i);
            if (temp < ans) {
                ans = temp;
            }
        }
        return ans;
    }
}
=======
//30.Given an array A[] of positive integers of size N, where each value represents the number of chocolates in a packet.
// Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
//1. Each student gets exactly one packet.
//2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main30 {

    public static void main(String[] args) {
        ArrayList<Long> al = new ArrayList<>(Arrays.asList(17L, 83L, 59L, 25L, 38L, 63L, 25L, 1L, 37L));
        System.out.println(approach1(al, al.size(), 9));
    }

    public static long approach1(ArrayList<Long> a, long n, long m) {
        //TC = O(n*logn),MC = O(1)
        //Sort the array and keep shifting the array size by number of students in the loop in each iteration.
        Collections.sort(a);
        if (m == 0 || n == 0) {
            return 0L;
        }
        if (m > n) {
            return -1L;
        }

        long ans = Long.MAX_VALUE;

        for (int i = 0; i + m - 1 < a.size(); i++) {
            long temp = a.get((int) (i + m - 1)) - a.get(i);
            if (temp < ans) {
                ans = temp;
            }
        }
        return ans;
    }
}
>>>>>>> 26b1aac (Final Commit_1)
