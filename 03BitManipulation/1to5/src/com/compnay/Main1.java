//1.Given a positive integer N, print count of set bits in it.
package com.compnay;

public class Main1 {
    //all have pros and cons, utf-8 uses the least memory but its O(n) to access a specific codepoint because of the variable length
    //utf-32 is fixed length but uses 4 byte for each character but is O(1) to access a specific codepoint because of fixed length
    //utf-16 is basically somewhere between
    public static void main(String[] args) {
        approach1(8);
        approach2(10);
        //Returns the number of one-bits in the two's complement binary representation of the specified int value. This function is sometimes referred to as the population count.
        System.out.println(Integer.bitCount(10));//approach3 FAST AF BOI!
    }

    public static void approach1(int n) {
        //TC = O(n),MC = O(1)
        //Convert the number to binary and count the number of ones using linear search.
        String s = Integer.toBinaryString(n);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static void approach2(int n) {
        //TC = O(logn),MC = O(1)
        //Brian Kernighan’s Algorithm:
        //Subtracting 1 from a decimal number flips all the bits after the rightmost set bit(which is 1) including the rightmost set bit.
        //for example :
        //10 in binary is 00001010
        //9 in binary is 00001001
        //8 in binary is 00001000
        //7 in binary is 00000111
        //So if we subtract a number by 1 and do it bitwise & with itself (n & (n-1)), we unset the rightmost set bit. If we do n & (n-1)
        //in a loop and count the number of times the loop executes, we get the set bit count.
        //The beauty of this solution is the number of times it loops is equal to the number of set bits in a given integer.
        int ans = 0;
        while (n != 0) {
            n = n & n - 1;
            ans++;
        }
        System.out.println(ans);
    }


}