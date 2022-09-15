//12.Split the binary string into substrings with equal number of 0s and 1s
//Given a binary string str of length N, the task is to find the maximum count of consecutive substrings str can be divided into such that all
//the substrings are balanced i.e. they have equal number of 0s and 1s. If it is not possible to split str satisfying the conditions then print -1.
package com.company;

public class Main12 {

    public static void main(String[] args) {
        approach1("0111000101110001");
    }

    public static void approach1(String s) {
        //TC = O(n),MC = O(1)
        //Keep counting 0's and 1's when they are equal count increases, and we print the substring.
        //A boolean is required because initially we don't have start of substring and after that we can keep track of it.
        int count0 = 0;
        int count1 = 0;
        int temp = 0;
        int ans = 0;
        boolean yes = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count0++;
            } else {
                count1++;
            }
            if (count0 == count1) {
                if (yes) {
                    System.out.println(s.substring(0, count0 + count1));
                    yes = false;
                } else {
                    System.out.println(s.substring(temp, count0 + count1));
                }
                temp = count0 + count1;
                ans++;
            }
        }
        if (ans == 0) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }

}