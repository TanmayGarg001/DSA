//9.Given an integer n, calculate the square of a number without using *, / and pow().
//https://www.geeksforgeeks.org/calculate-square-of-a-number-without-using-and-pow/
package com.company;

public class Main9 {

    public static void main(String[] args) {
        approach1(13);
        approach2(12);
    }

    public static void approach1(int n) {
        //TC = O(n),MC = O(1)
        //Basic maths, keep adding n, to n ,n times to get n-square XD
        n = Math.abs(n);
        int sum = 0;
        int count = 0;
        while (count < n) {
            sum = sum + n;
            count++;
        }
        System.out.println(sum);
    }

    public static void approach2(int num) {
        //TC = O(logn),MC = O(1)
        //For a given number `num` we get square of it by multiplying number as `num * num`.
        //Now write one of `num` in square `num * num` in terms of power of `2`. Check below examples.
        //Eg: num = 10, square(num) = 10 * 10
        //                          = 10 * (8 + 2) = (10 * 8) + (10 * 2)
        //    num = 15, square(num) = 15 * 15
        //                          = 15 * (8 + 4 + 2 + 1) = (15 * 8) + (15 * 4) + (15 * 2) + (15 * 1)
        //Multiplication with power of 2's can be done by left shift bitwise operator.
        num = Math.abs(num);
        int result = 0;
        int times = num;

        while (times > 0) {
            int possibleShifts = 0;
            int currTimes = 1;

            while ((currTimes << 1) <= times) {
                currTimes = currTimes << 1;
                possibleShifts++;
            }

            result = result + (num << possibleShifts);
            times = times - currTimes;
        }

        System.out.println(result);
    }

}