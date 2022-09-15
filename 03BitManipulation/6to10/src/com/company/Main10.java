//10.Given a string S find all possible subsequences of the string in lexicographically-sorted order.
//https://www.geeksforgeeks.org/generating-distinct-subsequences-of-a-given-string-in-lexicographic-order/
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main10 {

    public static void main(String[] args) {
        approach1("aa");
    }

    public static void approach1(String s) {
        ArrayList<String> arrayList = new ArrayList<>();
        allPossibleStrings(s, "", arrayList);
        Collections.sort(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
    }

    public static void allPossibleStrings(String input, String output, ArrayList<String> arrayList) {
        if (input.length() == 0) {
            arrayList.add(output);
            return;
        }
        String op = output;
        op = op + input.charAt(0);
        input = input.substring(1);
        allPossibleStrings(input, op, arrayList);
        allPossibleStrings(input, output, arrayList);
    }

}