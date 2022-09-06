<<<<<<< HEAD
//39.Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:
//'?' Matches any single character.
//'*' Matches any sequence of characters (including the empty sequence).
//The matching should cover the entire input string (not partial).
package com.company;

public class Main39 {

    public static void main(String[] args) {
        System.out.println(approach1("abcdefg", "a?c*?g"));
    }

    public static boolean approach1(String str, String pt) {
        //TC = O(n*m),MC = O(1)
        int s = 0;//string pointer
        int p = 0;//pattern pointer
        int matchTrack = 0;//keeps track of matched chars
        int starIdx = -1;//keeps track of last index where '*' was found.
        while (s < str.length()) {
            // advancing both pointers when match is found or ? is there but also pattern length is not vanished.
            if (p < pt.length() && (pt.charAt(p) == '?' || str.charAt(s) == pt.charAt(p))) {
                s++;
                p++;
            }
            //when * is found, we only advance the pattern pointer, keep track of startIndex pointer and track of matched chars.
            else if (p < pt.length() && pt.charAt(p) == '*') {
                starIdx = p;
                matchTrack = s;
                p++;
            }
            // last pattern pointer was *, advancing string pointer
            else if (starIdx != -1) {
                p = starIdx + 1;
                matchTrack++;
                s = matchTrack;
            }
            //current pattern pointer is not star, last pattern pointer was not * ,hence characters do not match
            else {
                return false;
            }
        }

        //check for remaining characters in pattern
        while (p < pt.length() && pt.charAt(p) == '*') {
            p++;
        }
        return p == pt.length();
    }


}
=======
//39.Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:
//'?' Matches any single character.
//'*' Matches any sequence of characters (including the empty sequence).
//The matching should cover the entire input string (not partial).
package com.company;

public class Main39 {

    public static void main(String[] args) {
        System.out.println(approach1("abcdefg", "a?c*?g"));
    }

    public static boolean approach1(String str, String pt) {
        //TC = O(n*m),MC = O(1)
        int s = 0;//string pointer
        int p = 0;//pattern pointer
        int matchTrack = 0;//keeps track of matched chars
        int starIdx = -1;//keeps track of last index where '*' was found.
        while (s < str.length()) {
            // advancing both pointers when match is found or ? is there but also pattern length is not vanished.
            if (p < pt.length() && (pt.charAt(p) == '?' || str.charAt(s) == pt.charAt(p))) {
                s++;
                p++;
            }
            //when * is found, we only advance the pattern pointer, keep track of startIndex pointer and track of matched chars.
            else if (p < pt.length() && pt.charAt(p) == '*') {
                starIdx = p;
                matchTrack = s;
                p++;
            }
            // last pattern pointer was *, advancing string pointer
            else if (starIdx != -1) {
                p = starIdx + 1;
                matchTrack++;
                s = matchTrack;
            }
            //current pattern pointer is not star, last pattern pointer was not * ,hence characters do not match
            else {
                return false;
            }
        }

        //check for remaining characters in pattern
        while (p < pt.length() && pt.charAt(p) == '*') {
            p++;
        }
        return p == pt.length();
    }


}
>>>>>>> 26b1aac (Final Commit_1)
