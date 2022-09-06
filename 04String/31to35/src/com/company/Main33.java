<<<<<<< HEAD
//33.Given a string 's'. The task is to find the smallest window length that contains all the characters of the given string at least one time.
//For e.g. A = “aabcbcdbca”, then the result would be 4 as of the smallest window will be “dbca”.
package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Main33 {
    //Solved using sliding window technique.
    public static void main(String[] args) {
        System.out.println(approach1("AABBBCBBAC"));
        System.out.println(approach2("AABBBCBBAC"));
    }

    public static String approach1(String s) {
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
        return ans + "";
    }

    public static String approach2(String s) {
        HashSet<Character> hs = new HashSet<>();
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int k = 0;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) hs.add(s.charAt(i));
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
            if (map.size() == hs.size()) {
                while (k < map.get(s.charAt(k))) k = k + 1;
                if (i - k < max) {
                    max = i - k;
                    start = k;
                    end = i + 1;
                }
                map.remove(s.charAt(k));
                k = k + 1;
            }
        }
        return s.substring(start, end);
    }


}


=======
//33.Given a string 's'. The task is to find the smallest window length that contains all the characters of the given string at least one time.
//For e.g. A = “aabcbcdbca”, then the result would be 4 as of the smallest window will be “dbca”.
package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Main33 {
    //Solved using sliding window technique.
    public static void main(String[] args) {
        System.out.println(approach1("AABBBCBBAC"));
        System.out.println(approach2("AABBBCBBAC"));
    }

    public static String approach1(String s) {
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
        return ans + "";
    }

    public static String approach2(String s) {
        HashSet<Character> hs = new HashSet<>();
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int k = 0;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) hs.add(s.charAt(i));
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
            if (map.size() == hs.size()) {
                while (k < map.get(s.charAt(k))) k = k + 1;
                if (i - k < max) {
                    max = i - k;
                    start = k;
                    end = i + 1;
                }
                map.remove(s.charAt(k));
                k = k + 1;
            }
        }
        return s.substring(start, end);
    }


}


>>>>>>> 26b1aac (Final Commit_1)
