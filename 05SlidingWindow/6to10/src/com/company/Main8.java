//Given a string s, find the length of the longest substring without repeating characters.
package com.company;

import java.util.HashMap;

public class Main8 {

    public static void main(String[] args) {
        System.out.println(longestUniqueSubString("AABBBCDBBAC"));
    }

    public static int longestUniqueSubString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if (map.size() == j - i + 1) {
                ans = Math.max(ans, j - i + 1);
            } else {
                while (map.size() < j - i + 1) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
            }
            j++;
        }
        return ans;
    }

}