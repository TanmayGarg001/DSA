//https://leetcode.com/problems/valid-anagram/

import java.util.HashMap;

public class Main2 {

    public boolean isAnagram(String s, String t) {//O(n),O(1)
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }
        return smap.equals(tmap);
    }

    public boolean isAnagramOther(String s, String t) {//O(n),O(1)//only for 26 alphabets
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            freq[c - 'a'] -= 1;
        }
        for (int num : freq) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

}
