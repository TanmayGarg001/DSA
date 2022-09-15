//14.Given an array of intervals where intervals[i] = [start_i, end_i], merge all overlapping intervals,
// and return an array of the non-overlapping intervals that cover all //the intervals in the input.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Main14 {

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        approach1(intervals);
//        approach2(intervals);
    }

    public static void approach1(int[][] intervals) {
        //TC = O(n*logn),MC = O(n)
        //if we write some cases we will get to know that if we sort the intervals ,then we can easily merge them (if it is possible ofc)
        //as if the following interval starting value is smaller than or equal to the previous interval ending value, this implies that
        //there exists an overlap.
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> mergedList = new LinkedList<>();
        for (int[] interval : intervals) {
            if (mergedList.isEmpty() || mergedList.getLast()[1] < interval[0]) {
                mergedList.add(interval);
            } else {
                mergedList.getLast()[1] = Math.max(interval[1], mergedList.getLast()[1]);
            }

        }

        for (int[] merge : mergedList) {
            System.out.println(Arrays.toString(merge));
        }
    }

    public static void approach2(int[][] array) {
        //This solution does not work for all case but there is a lot to learn from this.
        Arrays.sort(array, Comparator.comparingInt(i -> i[0]));
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(array[i][0]);
            integers.add(array[i][1]);
            arrayList.add(integers);

        }
        System.out.println(arrayList);
        System.out.println("=========");

        for (int i = array.length - 2; i >= 0; i--) {
            if (arrayList.get(i).get(1) >= arrayList.get(i + 1).get(0)) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arrayList.get(i).get(0));
                if (arrayList.get(i + 1).get(1) > arrayList.get(i).get(1)) {
                    temp.add(arrayList.get(i + 1).get(1));
                } else {
                    temp.add(arrayList.get(i).get(1));
                }
                arrayList.set(i, temp);
                arrayList.remove(i + 1);
            }
        }

        int[][] ans = new int[arrayList.size()][2];
        for (int i = 0; i < arrayList.size(); i++) {
            ans[i][0] = arrayList.get(i).get(0);
            ans[i][1] = arrayList.get(i).get(1);
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println("[" + ans[i][0] + "," + ans[i][1] + "]");
        }

        System.out.println("=========");
        System.out.println(arrayList);

    }

}
