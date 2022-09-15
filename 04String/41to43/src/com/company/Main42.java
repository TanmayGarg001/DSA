//42.Given two strings s and t, determine if they are isomorphic.
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//All occurrences of a character must be replaced with another character while preserving the order of characters.
//No two characters may map to the same character, but a character may map to itself.
package com.company;

import java.util.HashMap;

public class Main42 {

    public static void main(String[] args) {
//        System.out.println(approach1("paper", "title"));
        System.out.println(approach2("paper", "title"));
    }

    public static boolean approach1(String s, String t) {
        //TC = O(n),MC = O(512); it can't be more than 512 coz of ASCII.
        if (s.length() != t.length()) {
            return false;
        }
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static boolean approach2(String s, String t) {
        //TC = O(n),MC = O(n)
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if ((m1.put(s.charAt(i), i) != m2.put(t.charAt(i), i))) {//this line compares the old value of the mapping that means
                // the last value of that key which was overwritten, as map.put() returns the previous value associated with key
                return false;
            }
            System.out.println(m1);
            System.out.println(m2);
        }

        return true;
    }

}