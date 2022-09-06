package com.company;

import java.util.HashMap;

//If you can solve this you can pretty much solve any sliding window problem.
//https://leetcode.com/problems/minimum-window-substring/
public class Main9 {

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }
        HashMap<Character, Integer> smap = new HashMap<>();
        int i = 0;
        int j = 0;
        int temp = Integer.MAX_VALUE;
        int count = 0;
        String ans = "";
        while (j < s.length()) {
            char key = s.charAt(j);
            smap.put(key, smap.getOrDefault(key, 0) + 1);
            if (smap.get(key).equals(tmap.get(key))) {
                count++;
            }
            while (tmap.size() == count) {
                if (temp > j - i + 1) {
                    temp = j - i + 1;
                    ans = s.substring(i, j + 1);
                }
                char key2 = s.charAt(i);
                smap.put(key2, smap.getOrDefault(key2, 0) - 1);
                if (tmap.containsKey(key2) && tmap.get(key2) > smap.get(key2)) {
                    count--;
                }
                if (smap.get(key2) == 0) {
                    smap.remove(key2);
                }
                i++;
            }
            j++;
        }
        return ans;
    }

}
