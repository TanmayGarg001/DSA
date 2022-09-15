//35.Given a string str we need to tell minimum characters to be added at front of string to make string palindrome.
package com.company;

public class Main35 {

    public static void main(String[] args) {
        System.out.println(approach1("AACECAAAA"));
        System.out.println(approach1("ABCDE"));
        System.out.println(approach1("FNHH"));
    }

    public static int approach1(String s) {
        //TC = O(n^2),MC = O(1)
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(s);
        sb2.reverse();
        if (s.length() == 0 || s.length() == 1 || sb1.compareTo(sb2) == 0) {
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder s1 = new StringBuilder(s.substring(0, s.length() - i));
            StringBuilder s2 = new StringBuilder(s1);
            s2.reverse();
            if (s1.compareTo(s2) == 0) {
                break;
            }
            ans++;
        }
        return ans;
    }

}