//https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashMap;

public class Main6 {

    public int lengthOfLongestSubstring(String s) {//O(n),O(n)
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while (s.length() > j) {
            char key = s.charAt(j);
            map.put(key, map.getOrDefault(key, 0) + 1);
            if (map.size() == j - i + 1) {
                ans = Math.max(ans, j - i + 1);
            } else {
                while (j - i + 1 > map.size()) {
                    char key2 = s.charAt(i);
                    map.put(key2, map.getOrDefault(key2, 0) - 1);
                    if (map.get(key2) == 0) {
                        map.remove(key2);
                    }
                    i++;
                }
            }
            j++;
        }
        return ans;
    }

}
