package com.company;

public class Main18 {
    //https://leetcode.com/problems/n-th-tribonacci-number/
    //The Tribonacci sequence Tn is defined as follows:
    //T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
    //Given n, return the value of Tn.
    public static void main(String[] args) {
        System.out.println(tribonacci(20));
    }

    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int back3 = 0;
        int back2 = 1;
        int back1 = 1;
        int temp;
        for (int i = 3; i < n; i++) {
            //0,1,1,2,4,7,13,24,44...
            temp = back3 + back2 + back1;
            back3 = back2;
            back2 = back1;
            back1 = temp;
        }
        return back1 + back2 + back3;
    }

}
