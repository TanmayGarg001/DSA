package com.company;

import java.util.Arrays;

public class Main17 {

    public static void main(String[] args) {
        //Given a number n print the fibonacci series.
        System.out.println(Arrays.toString(printFib(9)));//https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1
        System.out.println(fibNth(9));//https://leetcode.com/problems/fibonacci-number/
        //https://practice.geeksforgeeks.org/problems/nth-fibonacci-number1335/1
        System.out.println(nthFibonacci(9));
    }

    public static long[] printFib(int n) {
        if (n == 1) {
            return new long[]{1};
        }
        long[] t = new long[n];
        t[0] = 1;
        t[1] = 1;
        for (int i = 2; i < n; i++) {
            t[i] = t[i - 1] + t[i - 2];
        }
        return t;
    }

    public static int fibNth(int n) {
        if (n == 0) {
            return 0;
        }
        int back2 = 0;//0,1,1,2,3,5,8....
        int back1 = 1;
        int temp;
        for (int i = 2; i < n; i++) {
            temp = back1 + back2;
            back2 = back1;
            back1 = temp;
        }
        return back1 + back2;
    }

    public static long nthFibonacci(long n) {
        if (n == 0) {
            return 0;
        }
        long back2 = 0;
        long back1 = 1;
        long temp;
        for (int i = 2; i < n; i++) {
            temp = (back1 + back2) % 1000000007;
            back2 = back1 % 1000000007;
            back1 = temp % 1000000007;
        }
        return (back1 + back2) % 1000000007;
    }

}
