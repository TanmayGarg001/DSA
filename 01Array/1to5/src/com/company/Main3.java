//3.Given an array arr[] and a number K where K is smaller than size of array,the task is to find the Kth the smallest element in the given array.
//It is given that all array elements are distinct.
package com.company;

import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        int[] array = {7, 4, 6, 3, 9, 1};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : array) {
            al.add(i);
        }
        System.out.println(approach2(3, al));
        approach3(3, array);
        approach1(3, array);

    }

    public static void approach1(int k, int[] array) {
        //TC = O(n*logn),MC = O(1)
        //Just sort the array and return the kth largest and smallest integer.
        Arrays.sort(array);
        System.out.println(k + " smallest element : " + array[k - 1]);
        System.out.println(k + " largest element : " + array[array.length - k]);

    }

    public static int approach2(int k, ArrayList<Integer> ints) {
        //TC = O(n*logk),(kinda logn not exactly) [if we intake priority queue as an input instead of array],MC = O(n)
        //Using priorityQueue (use of heap) and get the kth largest and smallest integer.
        if (ints == null || ints.size() < k) {
            return Integer.MIN_VALUE;
        }

        // create a min-heap (peek in min heap returns the smallest element) using the `PriorityQueue` class and insert
        // the first `k` array elements into the heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(ints.subList(0, k));
//        System.out.println(pq);
//        System.out.println(pq.peek());
        // do for remaining array elements
        for (int i = k; i < ints.size(); i++) {
            // if the current element is more than the root of the heap
            if (ints.get(i) > pq.peek()) {
                // replace root with the current element
                pq.poll();
                pq.add(ints.get(i));
            }
        }

        // return the root of min-heap
        return pq.peek();

    }

    public static void approach3(int k, int[] array) {
        //TC = O(n*logn),TC = O(logn) [if we intake treeSet as an input instead of array],MC = O(n)
        //TreeSet is very fast for add, remove, and contains methods has time complexity of O(log (n)).But we can't get() element in set we have to use
        //iterator. Set has unique values only so it works even when the question has duplicate values.
        //Also, we can sort the TreeSet in reverse order by using same Collections.reverse() as we did in PriorityQueue.
        //By default, java sorts everything in ascending order i.e. from smallest to largest :D
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            treeSet.add(array[i]);
        }
        Iterator<Integer> iterator = treeSet.iterator();
        Iterator<Integer> iterator2 = treeSet.iterator();
        int small = 0;
        int large = 0;
        int i = 0;
        int j = 0;
        while (iterator.hasNext()) {
            i++;
            small = iterator.next();
            if (i == k) {
                break;
            }
        }

        while (iterator2.hasNext()) {
            j++;
            large = iterator2.next();
            if (j == array.length - k + 1) {
                break;
            }
        }

        System.out.println(k + " smallest element : " + small);
        System.out.println(k + " smallest element : " + large);

    }

    public static void temp(int[] arr) {
        //find 2nd largest/smallest
        int max = arr[0];
        int max2 = max;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        // print
    }

}