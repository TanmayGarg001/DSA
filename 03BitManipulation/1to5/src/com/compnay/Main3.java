//3.You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.
package com.compnay;

public class Main3 {

    public static void main(String[] args) {
        System.out.println(approach1(5, 2));
    }

    public static int approach1(int a, int b) {
        //TC = O(logn),MC = O(1)
        //Its an observation :- XOR both the numbers and then return the set bits.
        return countSetBits(a ^ b);
    }

    public static int countSetBits(int n) {
        int count = 0;//We can replace all this by return Integer.bitCount(n);
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

}