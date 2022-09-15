package com.company;
//John is at a toy store help him pick maximum number of toys. He can only select in a continuous manner, and he can select only two types of toys.Select maximum sub string.
//Example: abaccab
//ans = 4

import java.util.HashMap;

public class Main8 {

    public static void main(String[] args) {
        toys("abaccab", 2);//you can return string's length if given that toys can be only of one type i.e. in a case where i/p is :- aaaaaaa
    }

    public static void toys(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if (map.size() < k) {
                j++;
            } else if (map.size() == k) {
                ans = Math.max(ans, j - i + 1);
                j++;
            } else {
                while (map.size() > k) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        System.out.println(ans);
    }

}
