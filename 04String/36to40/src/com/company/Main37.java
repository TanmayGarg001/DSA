//37.Given two strings S and P. Find the smallest window in the string S consisting of all the characters(including duplicates) of the string P.
//Return "-1" in case there is no such window present. In case there are multiple such windows of same length, return the one with the least starting index.
package com.company;

import java.util.HashMap;

public class Main37 {

    public static void main(String[] args) {
        System.out.println(approach1("timetopractice", "toc"));
    }

    public static String approach1(String s, String t) {
        //TC = O(n^2),MC = O(n)
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }
        int i = 0;
        int j = 0;
        int count = 0;
        int temp = Integer.MAX_VALUE;
        String ans = "-1";

        while (j < s.length()) {
            char c = s.charAt(j);
            smap.put(c, smap.getOrDefault(c, 0) + 1);
            if (smap.get(c).equals(tmap.get(c))) {
                count++;
            }
            while (count == tmap.size()) {
                if (temp > j - i + 1) {
                    temp = j - i + 1;
                    ans = s.substring(i, j + 1);
                }
                char ch = s.charAt(i);
                smap.put(ch, smap.get(ch) - 1);
                if (tmap.containsKey(ch) && smap.get(ch) < tmap.get(ch)) {
                    count--;
                }
                i++;
            }
            j++;
        }
        return ans;
    }

}