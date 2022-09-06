package com.company;

import java.util.Arrays;

public class Main16 {

//The Fibonacci numbers were originally defined by the Italian mathematician Fibonacci in the thirteenth century to model the growth of rabbit populations.
//Rabbits breed, well, like rabbits. Fibonacci surmised that the number of pairs of rabbits
//born in a given year is equal to the number of pairs of rabbits born in each of the two previous years, starting from one pair of rabbits in the first year. To count the
//number of rabbits born in the nth year, he defined the recurrence relation:
//Fn = Fn−1 + Fn−2
//with basis cases F0 = 0 and F1 = 1. Thus, F2 = 1, F3 = 2, and the series continues {3, 5, 8, 13, 21, 34, 55, 89, 144,...}. As it turns out, Fibonacci’s formula didn’t do a
//very good job of counting rabbits, but it does have a host of interesting properties.

    private static final int[] t = new int[1002];//storage (to store func calls), don't make it final for online judges coz in some it will not reset code.

    public static void main(String[] args) {
        System.out.println(recursiveFib(38));//takes a lot of time.
        System.out.println(fibMemo(38));//optimized solution
        System.out.println(fibDp(38));//optimized solution without any recursive calls.
        System.out.println(fibUltimate(38));//optimized solution without any recursive calls and no memory use.
        System.out.println(fib(38));//Constant space and time algorithm.
    }

    //See the img.
    public static int recursiveFib(int n) {//TC = O(2^n), MC = O(Stack which will overflow at high values)
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return recursiveFib(n - 1) + recursiveFib(n - 2);
    }

    //See the img_1.
    public static int fibMemo(int n) {//TC = O(n), MC = O(Stack which will overflow at very very very high values will not happen in 99.99% cases + O(n))
        Arrays.fill(t, -1);
        t[0] = 0;
        t[1] = 1;
        return helper(n);
    }

    public static int helper(int n) {
        if (t[n] != -1) {
            return t[n];
        }
        return t[n] = helper(n - 1) + helper(n - 2);
    }

    public static int fibDp(int n) {//TC = O(n),MC = O(n)
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static int fibUltimate(int n) {//TC = O(n),MC = O(1)
        if (n == 0) {
            return 0;
        }
        int back2 = 0;//in series back1=1;back0=0; initially
        int back1 = 1;//series is like : 0,1,1,2,3,5,8,13 and so on..
        int temp;
        for (int i = 2; i < n; i++) {
            temp = back1 + back2;
            back2 = back1;
            back1 = temp;
        }
        return back1 + back2;
    }

    //See the img_2
    public static double fib(int n) {//TC = O(1),MC = O(1)
        double a = ((1 + Math.sqrt(5)) / 2);
        double b = ((1 - Math.sqrt(5)) / 2);
        return (Math.pow(a, n) - Math.pow(b, n)) / Math.sqrt(5);
    }

}
