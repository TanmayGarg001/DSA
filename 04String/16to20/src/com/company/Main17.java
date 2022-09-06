<<<<<<< HEAD
//17.Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
//Note that the same word in the dictionary may be reused multiple times in the segmentation.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main17 {


    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>(Arrays.asList("cats", "dog", "sand", "and", "cat"));
        ArrayList<String> al2 = new ArrayList<>(Arrays.asList("apple", "pen"));
        System.out.println(approach1Call("catsandog", al1));
        System.out.println(approach2Call("catsandog", al1));
        System.out.println(approach1Call("applepenapple", al2));
        System.out.println(approach2Call("applepenapple", al2));

    }

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
=======
//17.Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
//Note that the same word in the dictionary may be reused multiple times in the segmentation.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main17 {

    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>(Arrays.asList("cats", "dog", "sand", "and", "cat"));
        ArrayList<String> al2 = new ArrayList<>(Arrays.asList("apple", "pen"));
        System.out.println(approach1Call("catsandog", al1));
        System.out.println(approach2Call("catsandog", al1));
        System.out.println(approach1Call("applepenapple", al2));
        System.out.println(approach2Call("applepenapple", al2));

    }

    public static boolean approach1Call(String s, ArrayList<String> al) {
        //TC = O(2^n),MC = O(n)
        //Make a hashSet so that searching can be done in O(1) time, and also it is a dictionary.
        //after that we keep checking recursively for the segmentation.
        HashSet<String> hs = new HashSet<>(al);
        return approach1(s, hs);
    }

    public static boolean approach1(String s, HashSet<String> hs) {
        if (s.length() == 0) {
            return true;
        }
        for (int i = 1; i <= s.length(); i++) {
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
>>>>>>> 26b1aac (Final Commit_1)
