<<<<<<< HEAD
//3.The stock span problem is a financial problem where we have a series of n daily price quotes for a stock,
//and we need to calculate the span of stocks prices for all n days.
//The span Si of the stocks price on a given day i is defined as the maximum number of consecutive days just before the given day,
//for which the price of the stock on the current day is less than or equal to its price on the given day.
//https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1/#
package com.company;

import java.util.Arrays;
import java.util.Stack;

public class Main3 {

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(Arrays.toString(calculateSpan(arr)));
    }

    public static int[] calculateSpan(int[] arr) {
        //TC = O(n),MC = O(n)
        //It's just a slight modification of The Nearest Greater to Left
        int[] ans = new int[arr.length];
        Stack<Pair> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (stack.size() > 0 && stack.peek().val <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - stack.peek().index;
            }
            stack.push(new Pair(arr[i], i));
        }
        return ans;
    }

    public static class Pair {
        int val;
        int index;

        Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }

}
=======
//3.The stock span problem is a financial problem where we have a series of n daily price quotes for a stock,
//and we need to calculate the span of stocks prices for all n days.
//The span Si of the stocks price on a given day i is defined as the maximum number of consecutive days just before the given day,
//for which the price of the stock on the current day is less than or equal to its price on the given day.
//https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1/#
package com.company;

import java.util.Arrays;
import java.util.Stack;

public class Main3 {

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(Arrays.toString(calculateSpan(arr)));
    }

    public static int[] calculateSpan(int[] arr) {
        //TC = O(n),MC = O(n)
        //It's just a slight modification of The Nearest Greater to Left
        int[] ans = new int[arr.length];
        Stack<Pair> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (stack.size() > 0 && stack.peek().val <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - stack.peek().index;
            }
            stack.push(new Pair(arr[i], i));
        }
        return ans;
    }

    public static class Pair {
        int val;
        int index;

        Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
