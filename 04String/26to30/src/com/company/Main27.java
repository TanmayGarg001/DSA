//27.Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".
package com.company;

import java.util.Arrays;

public class Main27 {

    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        System.out.println(approach1(strings));
    }

    public static String approach1(String[] strings) {
        //TC = O(nlogn),MC = O(1)
        if (strings == null || strings[0].equals("")) {
            return "";
        }
        Arrays.sort(strings);
        int ans = 0;
        while (ans < strings[0].length()) {
            if (strings[0].charAt(ans) == strings[strings.length - 1].charAt(ans)) {
                ans++;
            } else {
                break;
            }
        }
        return ans > 0 ? strings[0].substring(0, ans) : "";
    }

}