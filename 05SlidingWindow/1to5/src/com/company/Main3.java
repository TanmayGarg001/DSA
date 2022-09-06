package com.company;

//This is a hard question not so easy to get your head around it, so be prepared.
//Generate a map of all character occurrences of the 2nd string, i.e. char and its count.
//The window size becomes the length of 2nd string, as the anagrams will also be of this length,
//and another variable count denotes the distinct characters left in a sliding window.
//In a window if the current character is present in map, then decrease its count, and if the count becomes 0, decrease the 'count' variable.
//If the window size is lesser than k just move forward the window
//When the window is hit ->
//If the count is 0, it means all the characters needed for its anagram is here in it, therefore increase your answer
//To remove the last part (arr[i] part) so that the window can be shifted ->
//If the s[i] is present in map then increase its count and if it changes from 0->1 then increase the 'count' variable

import java.util.ArrayList;
import java.util.HashMap;

public class Main3 {
    //Given a word pat and a text txt. Return the count of the occurrences of anagrams of the word in the text.
    //https://practice.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1
    public static void main(String[] args) {
        search("for", "forxxorfxdofr");
        search2("forxxorfxdofr", "for");
    }

    public static void search(String pat, String txt) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < pat.length(); i++) {
            char c = pat.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int i = 0, j = 0, count = map.size(), ans = 0;
        int k = pat.length();//window size
        while (j < txt.length()) {
            if (map.containsKey(txt.charAt(j))) {
                map.put(txt.charAt(j), map.get(txt.charAt(j)) - 1);
                if (map.get(txt.charAt(j)) == 0) {
                    count--;
                }
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (count == 0) {
                    ans++;
                }
                if (map.containsKey(txt.charAt(i))) {
                    map.put(txt.charAt(i), map.get(txt.charAt(i)) + 1);
                    if (map.get(txt.charAt(i)) == 1) {
                        count++;
                    }
                }
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }

    private static void search2(String txt, String pat) {//https://leetcode.com/problems/find-all-anagrams-in-a-string/
        HashMap<Character, Integer> mapP = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < pat.length(); i++) {
            char key = pat.charAt(i);
            mapP.put(key, mapP.getOrDefault(key, 0) + 1);
        }
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int k = pat.length();
        while (j < txt.length()) {
            char key = txt.charAt(j);
            mapT.put(key, mapT.getOrDefault(key, 0) + 1);
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (mapT.equals(mapP)) {
                    ans.add(i);
                }
                char key2 = txt.charAt(i);
                mapT.put(key2, mapT.getOrDefault(key2, 0) - 1);
                if (mapT.get(key2) == 0) {
                    mapT.remove(key2);
                }
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }

}
