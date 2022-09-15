//6.Check if a string is a valid shuffle of two distinct strings
//1XY2 is a valid shuffle of XY and 12
//Y1X2 is a valid shuffle of XY and 12
//Y21XX is not a valid shuffle of XY and 12
//In the above example, we have a string array named results. It contains three strings: 1XY2, Y1X2, and Y21XX.
//We are checking if these three strings are valid shuffle of strings first(XY) and second(12).
package com.company;

import java.util.HashMap;

public class Main6 {
    public static void main(String[] args) {
        System.out.println(approach1("hello12", "ll2o", "1he"));
        System.out.println(approach2("hello12", "ll2o", "1he"));
    }

    public static boolean approach1(String str, String s1, String s2) {
        //TC = O(n),MC = O(n)
        //Make 2 hashmaps one for the original string and other for the 2 strings combined of key-value count matches then we found a valid shuffle!
        String temp = s1 + s2;
        if (temp.length() != str.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key1 = str.charAt(i);
            char key2 = temp.charAt(i);
            map1.put(key1, map1.getOrDefault(key1, 0) + 1);
            map2.put(key2, map2.getOrDefault(key2, 0) + 1);
        }
        return map1.equals(map2);
    }

    public static boolean approach2(String str, String s1, String s2) {
        //TC = O(n),MC = O(1)
        //This is god technique it does this in O(N) and without memory usage.We take benefit of the fact that ASCII code of each char is different.
        String temp = s1 + s2;
        if (temp.length() != str.length()) {
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < str.length(); i++) {
            sum1 = sum1 + (int) (str.charAt(i));
            sum2 = sum2 + (int) (temp.charAt(i));
        }
        return sum1 == sum2;
    }

}