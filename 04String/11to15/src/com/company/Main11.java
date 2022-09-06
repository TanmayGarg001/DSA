<<<<<<< HEAD
//11.Given a string S. The task is to print all permutations of a given string.
package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main11 {

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        String op = "";
        approach1("ABCD", op, al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println(al.size());
    }

//("", "abc")
//  -> ("a", "bc")
//    -> ("ab", "c")
//      -> ("abc", "")
//    -> ("ac", "b")
//      -> ("acb", "")
//  -> ("b", "ac")
//    -> ("ba", "c")
//      -> ("bac", "")
//    -> ("bc", "a")
//      -> ("bca", "")
//  -> ("c", "ab")
//    -> ("ca", "b")
//      -> ("cab", "")
//    -> ("cb", "a")
//      -> ("cba", "")

    private static void approach1(String ip, String op, List<String> al) {
        //TC = O(n!*n),MC = O(1)//Stack ofc
        //It's very similar to recursion, backtracking is generally a recursive call in loop.
        //Backtracking is not like DP coz we don't have to maximize/minimize something we have to make all combinations like P&C.
        //Here, in order to understand this, run the outer loop first then the loop by loop
        //("", "abc")
        // 1 -> ("a", "bc")
        // 2 -> ("b", "ac")
        // 3 -> ("c", "ab")
        //after this run the 1st one even further and that then even further
        if (ip.length() == 0) {
            al.add(op);
        } else {
            for (int i = 0; i < ip.length(); i++) {
                approach1(ip.substring(0, i) + ip.substring(i + 1), op + ip.charAt(i), al);
            }
        }
    }

=======
//11.Given a string S. The task is to print all permutations of a given string.
package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main11 {

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        String op = "";
        approach1("ABCD", op, al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println(al.size());
    }

//("", "abc")
//  -> ("a", "bc")
//    -> ("ab", "c")
//      -> ("abc", "")
//    -> ("ac", "b")
//      -> ("acb", "")
//  -> ("b", "ac")
//    -> ("ba", "c")
//      -> ("bac", "")
//    -> ("bc", "a")
//      -> ("bca", "")
//  -> ("c", "ab")
//    -> ("ca", "b")
//      -> ("cab", "")
//    -> ("cb", "a")
//      -> ("cba", "")

    private static void approach1(String ip, String op, List<String> al) {
        //TC = O(n!*n),MC = O(1)//Stack ofc
        //It's very similar to recursion, backtracking is generally a recursive call in loop.
        //Backtracking is not like DP coz we don't have to maximize/minimize something we have to make all combinations like P&C.
        //Here, in order to understand this, run the outer loop first then the loop by loop
        //("", "abc")
        // 1 -> ("a", "bc")
        // 2 -> ("b", "ac")
        // 3 -> ("c", "ab")
        //after this run the 1st one even further and that then even further
        if (ip.length() == 0) {
            al.add(op);
        } else {
            for (int i = 0; i < ip.length(); i++) {
                approach1(ip.substring(0, i) + ip.substring(i + 1), op + ip.charAt(i), al);
            }
        }
    }

>>>>>>> 26b1aac (Final Commit_1)
}