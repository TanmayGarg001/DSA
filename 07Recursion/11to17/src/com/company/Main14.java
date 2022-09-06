package com.company;

//Given a string s, we can transform every letter individually to be lowercase or uppercase to create another string.
//Return a list of all possible strings we could create. You can return the output in any order.
//Input: s = "a1b2"
//Output: ["a1b2","a1B2","A1b2","A1B2"]

import java.util.ArrayList;

public class
Main14 {

    private static final ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        letterCase("a1B2");
    }

    public static void letterCase(String str) {
        allCombinations(str.toLowerCase(), "");
        System.out.println(arrayList);
    }

    public static void allCombinations(String input, String output) {
        if (input.length() == 0) {
            if (!arrayList.contains(output)) {
                arrayList.add(output);
            }
            return;
        }
        String op1 = output + input.charAt(0);
        String op2 = output + Character.toString(input.charAt(0)).toUpperCase();
        input = input.substring(1);
        allCombinations(input, op1);
        allCombinations(input, op2);
    }

}
