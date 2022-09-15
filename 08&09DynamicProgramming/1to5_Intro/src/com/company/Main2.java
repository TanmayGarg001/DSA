package com.company;
//*************************REMEMBER***************************//
//You will be given choice similar to recursion.
//Optimal things like max,min largest etc. will be asked in DP.
//*************************REMEMBER***************************//

//0-1 Knapsack Problems:=
//Understand 0-1 approach and then solving these types of problems would be easy af.
//Subset sum
//Equal sum partition
//Count of subset sum
//Minimum subset sum difference
//Target sum
//Number of subset with given difference d

public class Main2 {

    //Before solving let's get know what knapsack really is.
    //Knapsack in layman words is a bag.
    //We are given some items along with their weight and its value , now we have to choose the items in such a way that the capacity of bag should not exceed
    //and the profit we gain is maximum.This is the main idea of knapsack.
    //Now knapsack has 3 types of variation:- 0/1 Knapsack, Fractional Knapsack, Unbounded Knapsack.
    //By its name only 0/1 suggest that the item can be added or not added in knapsack.
    //In Fractional knapsack item can be added in fractions in order to maximize profit.
    //Example:- Lets say a knapsack bag has capacity of 10 kg, now in 0/1 knapsack type lets say we can achieve max profit at 9 kg.
    //So that would be our answer but 1 kg is left empty .In fractional knapsack a 2 kg item can be divided into fraction and will be added to knapsack for max. profit.
    //In fractional knapsack there is no use of DP as it is a greedy approach, we can simply sort and maximize the answer accordingly.
    //0/1 :- in this type we have one type of each item.
    //Unbounded :- in this type we have infinite supply of each item.

    public static void main(String[] args) {
        //Weight : 1 3 4 5
        //Value  : 1 4 5 7
        //Calculate max profit.given bag cap. = 7
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {1, 4, 5, 7};
        System.out.println(knapsackRecursive(arr1, arr2, 8, 4));
    }

    public static int knapsackRecursive(int[] wt, int[] val, int cap, int n) {
        //This is a recursive way of doing it its little tricky, but its code is very less also TC is higher than memoization.
        //So we will always use recursion along with memoization and then use top-down approach if we need to but in must cases memoization will work if you
        //can code for the recursion.
        //Just write the recursive code for the given problem and all you need to do is 2-3 lines of code for memoization ezpz DP.
        if (n == 0 || cap == 0) {
            return 0;
        }
        if (wt[n - 1] <= cap) {
            return Math.max(val[n - 1] + knapsackRecursive(wt, val, cap - wt[n - 1], n - 1), knapsackRecursive(wt, val, cap, n - 1));
        } else if (wt[n - 1] > cap) {
            return knapsackRecursive(wt, val, cap, n - 1);
        }
        return -1;
    }


}


