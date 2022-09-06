package com.company;

import java.util.HashMap;

//If you can solve this you can pretty much solve any sliding window problem.
//https://leetcode.com/problems/minimum-window-substring/
public class Main10 {

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }
        int i = 0;
        int j = 0;
        int count = 0;
        int temp = Integer.MAX_VALUE;
        String ans = "";

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

