//17.You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
package com.company;

public class Main17 {

    public static void main(String[] args) {
        int[] array = {7, 1, 5, 3, 6, 4};
        approach1(array);
        approach2(array);
        System.out.println(approach3(array));
        System.out.println(approach4(array));
    }

    public static void approach1(int[] array) {
        //TC = O(n*n),MC = O(1)
        //2 pointer approach ezpz
        int max = 0;
        int sum;
        int j = 0;
        int i = array.length - 1;

        while (i > j) {
            sum = array[i] - array[j];
            j++;
            if (j == i) {
                i--;
                j = 0;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }

    public static void approach2(int[] array) {
        //TC = O(n),MC = O(1)
        //Using kadane's algorithm
        int maxCurr = 0;
        int maxSoFar = 0;
        for (int i = 1; i < array.length; i++) {
            maxCurr = maxCurr + array[i] - array[i - 1];
            maxCurr = Math.max(0, maxCurr);
            maxSoFar = Math.max(maxSoFar, maxCurr);
        }
        System.out.println(maxSoFar);
    }

    public static int approach3(int[] array) {
        //TC = O(n),MC = O(1)
        if (array.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int minPrice = array[0];
        for (int i = 1; i < array.length; i++) {
            minPrice = Math.min(minPrice, array[i]);
            maxProfit = Math.max(maxProfit, array[i] - minPrice);
        }

        return maxProfit;
    }

    public static int approach4(int[] array) {
        //TC = O(n),MC = O(1)
        int minPrice = array[0];
        int maxProfit = 0;
        int gap;
        for (int i = 0; i < array.length; i++) {
            gap = array[i] - minPrice;
            if (gap > maxProfit) {
                maxProfit = gap;
            }
            if (minPrice > array[i]) {
                minPrice = array[i];
            }
        }
        return maxProfit;
    }

    public int maxProfit(int[] prices) {
        //TC = O(n),MC = O(1)
        //Greedy approach :the fastest one!
        int max = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {

            if (min < prices[i])
                max = Math.max(prices[i] - min, max);
            else
                min = prices[i];
        }
        return max;
    }

}