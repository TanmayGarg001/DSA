<<<<<<< HEAD
//13.Given an array nums[] of size n, where nums[i] denotes the number of characters in one word. Let K be the limit on the number of characters that can be
//put in one line (line width). Put line breaks in the given sequence such that the lines are printed neatly.
//Assume that the length of each word is smaller than the line width. When line breaks are inserted there is a possibility that extra
//spaces are present in each line. The extra spaces include spaces put at the end of every line except the last one.
//You have to minimize the following total cost where total cost = Sum of cost of all lines, where cost of line is = (Number of extra spaces in the line)^2.
package com.company;

import java.util.Arrays;

public class Main13 {

    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 5};
        System.out.println(approach1(arr, 6));
    }

    public static int approach1(int[] nums, int k) {
        int[][] t = new int[k + 1][nums.length + 1];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        return cost(nums, k, 0, 0, t);
    }

    public static int cost(int[] num, int k, int prev, int index, int[][] t) {
        if (index >= num.length) {
            return 0;
        }
        if (t[prev][index] != -1) {
            return t[prev][index];
        }
        int cost1 = Integer.MAX_VALUE;
        if (prev > num[index]) {
            cost1 = cost(num, k, prev - num[index] - 1, index + 1, t);
        }
        int cost2 = prev * prev + cost(num, k, k - num[index], index + 1, t);
        return t[prev][index] = Math.min(cost1, cost2);
    }

}
=======
//13.Given an array nums[] of size n, where nums[i] denotes the number of characters in one word. Let K be the limit on the number of characters that can be
//put in one line (line width). Put line breaks in the given sequence such that the lines are printed neatly.
//Assume that the length of each word is smaller than the line width. When line breaks are inserted there is a possibility that extra
//spaces are present in each line. The extra spaces include spaces put at the end of every line except the last one.
//You have to minimize the following total cost where total cost = Sum of cost of all lines, where cost of line is = (Number of extra spaces in the line)^2.
package com.company;

import java.util.Arrays;

public class Main13 {

    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 5};
        System.out.println(approach1(arr, 6));
    }

    public static int approach1(int[] nums, int k) {
        int[][] t = new int[k + 1][nums.length + 1];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        return cost(nums, k, 0, 0, t);
    }

    public static int cost(int[] num, int k, int prev, int index, int[][] t) {
        if (index >= num.length) {
            return 0;
        }
        if (t[prev][index] != -1) {
            return t[prev][index];
        }
        int cost1 = Integer.MAX_VALUE;
        if (prev > num[index]) {
            cost1 = cost(num, k, prev - num[index] - 1, index + 1, t);
        }
        int cost2 = prev * prev + cost(num, k, k - num[index], index + 1, t);
        return t[prev][index] = Math.min(cost1, cost2);
    }

}
>>>>>>> 26b1aac (Final Commit_1)
