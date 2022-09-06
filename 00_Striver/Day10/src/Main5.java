//https://leetcode.com/problems/word-break/

import java.util.ArrayList;
import java.util.HashSet;

public class Main5 {

    public static boolean approach1Call(String s, ArrayList<String> al) {
        //TC = O(2^n),MC = O(n)
        //Make a hashSet so that searching can be done in O(1) time, and also it is a dictionary.
        //after that we keep checking recursively for the segmentation.
        HashSet<String> hs = new HashSet<>(al);
        return approach1(s, hs);
    }

    public static boolean approach1(String s, HashSet<String> hs) {
        int len = s.length();
        if (len == 0) {
            return true;
        }
        for (int i = 1; i <= len; i++) {
            if (hs.contains(s.substring(0, i)) && approach1(s.substring(i), hs)) {
                return true;
            }
        }
        return false;
    }

    public static boolean approach2Call(String s, ArrayList<String> al) {
        //TC = O(n^2),MC = O(n)
        //Similar to above approach just optimized it using DP.
        HashSet<String> hs = new HashSet<>(al);
        return approach2(s, hs);
    }

    public static boolean approach2(String s, HashSet<String> hs) {
        boolean[] t = new boolean[s.length() + 1];
        t[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (t[j] && hs.contains(s.substring(j, i))) {
                    t[i] = true;
                    break;
                }
            }
        }
        return t[s.length()];
    }

}
