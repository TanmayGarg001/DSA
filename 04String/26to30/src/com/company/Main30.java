//30.You are given a string S of 2N characters consisting of N ‘[‘ brackets and N ‘]’ brackets. A string is considered balanced if it can be represented in the
//for S2[S1] where S1 and S2 are balanced strings. We can make an unbalanced string balanced by swapping adjacent characters. Calculate the minimum number of swaps
//necessary to make a string balanced. Note - Strings S1 and S2 can be empty.
package com.company;

public class Main30 {

    public static void main(String[] args) {
        System.out.println(approach1("[][][[[["));
        System.out.println(approach1("[]][]["));
    }

    static int approach1(String s) {
        //TC = O(n),MC = O(1)
        int close = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                close++;
            } else {
                if (close > 0) {
                    sum = sum + close;
                }
                close--;
            }
        }
        return sum;
    }

}