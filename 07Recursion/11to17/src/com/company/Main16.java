package com.company;

//Given a positive integer N, the task is to find all the N bit binary numbers having more than or equal 1’s than 0’s for any prefix of the number.
//Input:  N = 3
//Output: 111 110 101
//Explanation: 111, 110 and 101 have more
//than or equal 1's than 0's

import java.util.ArrayList;

public class Main16 {

    private static final ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        printNBit(3);
    }

    public static void printNBit(int n) {
        printAllCombinations(n, 0, 0, "");
        System.out.println(arrayList);
    }

    public static void printAllCombinations(int n, int zeros, int ones, String output) {
        if (n == 0) {
            arrayList.add(output);
            return;
        }
        printAllCombinations(n - 1, zeros, ones + 1, output + "1");
        if (ones > zeros) {
            printAllCombinations(n - 1, zeros + 1, ones, output + "0");
        }
    }

}
