//28.Given a binary string, that is it contains only 0s and 1s. We need to make this string a sequence of alternate characters by
//flipping some bits, our goal is to minimize the number of bits to be flipped.
package com.company;

public class Main28 {

    public static void main(String[] args) {
        System.out.println(approach1("1001010011"));
        System.out.println(approach1("011101010110"));
    }

    public static int approach1(String s) {
        //TC = O(n),MC = O(1)
        //It's an observation.We check at even and odd place in the string.
        //Besides, this we can make 2 strings one of type 101010 and other 01010101 and then compare the given string to that.
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && s.charAt(i) == '1' || i % 2 != 0 && s.charAt(i) == '0') {
                count++;
            } else if (i % 2 == 0 && s.charAt(i) == '0' || i % 2 != 0 && s.charAt(i) == '1') {
                count1++;
            }
        }
        return Math.min(count, count1);
    }

}