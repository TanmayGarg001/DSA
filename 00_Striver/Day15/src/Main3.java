//https://leetcode.com/problems/longest-common-prefix/

import java.util.Arrays;

public class Main3 {

    public String longestCommonPrefix(String[] strs) {//O(nlogn),O(1)
        if (strs == null || strs[0].equals("")) {
            return "";
        }
        Arrays.sort(strs);
        int i = 0;
        while (i < strs[0].length() && strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
            i++;
        }
        return strs[0].substring(0, i);
    }

}
