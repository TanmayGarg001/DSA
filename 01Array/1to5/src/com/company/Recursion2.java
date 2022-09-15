package com.company;

import java.util.ArrayList;

//https://youtu.be/6IIgSFBPQ0U
public class Recursion2 {
    //When a function calls itself is called recursion. It is used to solve a big problem by breaking it into smaller sub problems but with same goal in mind.
    //Divide and conquer heavily uses recursion.

    //3 major steps to solve any recursion problem :-

    //STEP 1. Make the base conditions i.e. condition where we need to stop making recursive calls, now we have reached the point where we go back.
    //So we use if condition with a mandatory return statement for base condition.OR think of base case as simplest possible input for the function.
    //Other 2 steps are called work or processing( here we have to find the relation between larger and smaller problem) the data and the last step is recursive call.
    //At last step make all of that into a general form.

    //Whenever we write a code some memory is allocated to it, and it is divided to 4 parts.
    // 1st is heap memory where dynamic memory allocation is done.
    // 2nd is stack memory which is used for allocating memory for data members of a function.
    // 3rd is used for allocating global or static variables.
    // 4th is used for instructions i.e. code.


    public static void main(String[] args) {
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        count(7);
        System.out.println("======");
        count2(7);
        System.out.println("======");
        System.out.println(factorial(5));
        System.out.println("======");
        System.out.println(fibonacciSeries(6));
        fibonacciSeriesOptimized(6);
        System.out.println("======");
        printSpelling(83562, str);
        System.out.println("======");
        System.out.println(power(2, 5));
        System.out.println(fastPower(2, 7));
        System.out.println("======");
        System.out.println(sortCheck(new int[]{5, 6, 8, 9, 11, 8}, 1));
        System.out.println("======");
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(89);
        integers.add(0);
        integers.add(41);
        ArrayList<Integer> integers2 = new ArrayList<>();
        powerSet(integers, integers2, 0);
        System.out.println("======");
        System.out.println(stairCase(4));
        System.out.println("======");
        StringSubsequences("cat", "", 0);
        System.out.println("======");
        printPermutationOfString(new StringBuilder("tim"), 0);
        System.out.println("======");
        System.out.println(grid(4, 5));
    }

    //Some questions on recursion, for better understanding :-

    //========================================================================================================================================================================//
    //1.Counting
    //prints the number from n to 1 or in reverse order
    public static void count(int n) {
        //this is tail recursion as recursive call is at last like a tail
        if (n == 0) {
            return;
        }
        System.out.println(n);
        count(n - 1);

    }

    public static void count2(int n) {
        //this is head recursion as recursive call is at front like a head
        if (n == 0) {
            return;
        }
        count2(n - 1);
        System.out.println(n);
    }

    //========================================================================================================================================================================//
    //2.Factorial
    //finds the factorial of a number
    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //In the case of factorial, stack space is allocated for recursive calls and pops and pushes calls in stack.See the image for better understanding.
    //Limitation is stack space for recursion

    //========================================================================================================================================================================//
    //3.Fibonacci Series
    //each number is the sum of the two preceding ones, starting from 0 and 1. Prints the sequence. (0,1,1,2,3,5,8 and so on)
    //n is the nth term we need, remember terms are starting from 0th term.
    public static int fibonacciSeries(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }

    public static void fibonacciSeriesOptimized(int n) {
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println(b);
    }

    //========================================================================================================================================================================//
    //4.Print Spelling
    //for an input number spell the words individually.also number does not contain any zero
    public static void printSpelling(int n, String[] str) {
        if (n == 0) {
            return;
        }
        printSpelling(n / 10, str);
        System.out.println(str[n % 10] + " ");
    }

    //========================================================================================================================================================================//
    //5.Exponent
    //find the answer for a^b
    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }

    public static int fastPower(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return fastPower(a * a, b / 2);
        }
        return a * power(a, b - 1);
    }

    //========================================================================================================================================================================//
    //6.Sorted Check
    //given an array check if It's sorted or not
    public static boolean sortCheck(int[] array, int index) {
        if (index >= array.length) {
            return true;
        }
        if (array[index] < array[index - 1]) {
            return false;
        }
        return sortCheck(array, index + 1);
    }

    //========================================================================================================================================================================//
    //7.Subset
    //find all the possible sets of a set (power set:- set which contains all the possible combinations from set, 2^n)
    public static void powerSet(ArrayList<Integer> arrayIn, ArrayList<Integer> arrayOut, int index) {
        if (index >= arrayIn.size()) {
            //print
            for (int i = 0; i < arrayOut.size(); i++) {
                System.out.print(arrayOut.get(i) + " ");
            }
            System.out.println();
            return;
        }
        powerSet(arrayIn, arrayOut, index + 1);
        arrayOut.add(arrayIn.get(index));
        powerSet(arrayIn, arrayOut, index + 1);


    }

    //========================================================================================================================================================================//
    //8.Jumps
    //find total no. of ways to reach the nth stair from thr bottom of staircase we are only allowed to  climb 1,2 or 3 stairs at a time.
    public static int stairCase(int steps) {
        if (steps < 0) {
            return 0;
        }
        if (steps == 0) {
            return 1;
        }
        return stairCase(steps - 1) + stairCase(steps - 2) + stairCase(steps - 3);
    }

    //========================================================================================================================================================================//
    //9.Subsequence
    //print all the subsequences of a given string
    public static void StringSubsequences(String input, String current, int index) {

        if (index >= input.length()) {
            System.out.println(current);
            return;
        }

        StringSubsequences(input, current, index + 1);
        StringSubsequences(input, current + input.charAt(index), index + 1);
    }

    //========================================================================================================================================================================//
    //10.Permutation
    //prints all the possible permutation of a given string i.e. for a string abc = bca,abc,bac -- etc. are permutations.
    //We can't use string as they are immutable in java.
    public static void printPermutationOfString(StringBuilder string, int index) {
        if (index == string.length()) {
            System.out.println(string);
            return;
        }

        for (int i = index; i < string.length(); i++) {
            swap(string, index, i);
            printPermutationOfString(string, index + 1);
            swap(string, index, i);
        }
    }

    public static void swap(StringBuilder string, int a, int b) {
        char temp = string.charAt(a);
        char temp2 = string.charAt(b);
        string.setCharAt(a, temp2);
        string.setCharAt(b, temp);
    }

    //========================================================================================================================================================================//
    //11.Source to destination
    //find number of paths in n*m grid provided that you can move in up and right direction only.
    public static int grid(int n, int m) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return grid(m, n - 1) + grid(n, m - 1);
    }

}