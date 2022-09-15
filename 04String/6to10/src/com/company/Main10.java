//Given a string, we have to find out all subsequences of it. A String is a subsequence of a given String, that is generated by deleting some character of a
//given string without changing its order.
package com.company;

import java.util.ArrayList;

public class Main10 {

    public static void main(String[] args) {
        approach1("abcd");
    }

    public static void approach1(String s) {
        //TC = O(2^n), MC = O(1)
        //There is stack memory, but we don't consider that.//OutOfMemoryError
        //To solve this we use simple recursion and solve this using recursive tree.
        ArrayList<String> al = new ArrayList<>();
        generateSubStrings("", s, al);
        System.out.println(al);
    }

    public static void generateSubStrings(String output, String input, ArrayList<String> al) {
        if (input.length() == 0) {
            al.add(output);
            return;
        }
        String op1 = output;
        op1 = op1 + input.charAt(0);
        input = input.substring(1);
        generateSubStrings(op1, input, al);
        generateSubStrings(output, input, al);
    }
    
}