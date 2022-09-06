package com.company;

//Given an array of integers A.  There is a sliding window of size B which is moving from the very left of the array to the very right.
//You can only see the w numbers in the window. Each time the sliding window moves rightwards by one position. You have to find the maximum for each window.
//The following example will give you more clarity. The array A is [1 3 -1 -3 5 3 6 7], and B is 3.

import java.util.*;

public class Main4 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 125, -415, 31, 0, 589, -15, 265, 0, 59};
        System.out.println(slidingMaximum(arr, 3));
        System.out.println(slidingMaxFast(arr, 3));
    }

    public static ArrayList<Integer> slidingMaximum(int[] arr, int k) {
        //TC = O(n*logk)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            pq.add(arr[j]);
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                ans.add(pq.peek());
                pq.remove(arr[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static ArrayList<Integer> slidingMaxFast(int[] arr, int k) {
        //TC = O(n)
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            while (!dq.isEmpty() && arr[j] > dq.getLast()) {
                dq.removeLast();
            }
            dq.add(arr[j]);
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                ans.add(dq.getFirst());
                if (arr[i] == dq.getFirst()) {
                    dq.removeFirst();
                }
                i++;
                j++;
            }
        }
        return ans;
    }

}