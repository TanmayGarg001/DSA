package com.company;

import java.util.ArrayList;

public class Main12 {
//Given a string you need to print all possible strings that can be made by placing spaces (zero or one) in between them.
//The output should be printed in sorted increasing order of strings

    private static final ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        spaces("ABC");
    }

    public static void spaces(String str) {
        String op = Character.toString(str.charAt(0));
        allPossibleCombinations(str.substring(1), op);
        System.out.println(arrayList);
    }

    public static void allPossibleCombinations(String input, String output) {
        if (input.length() == 0) {
            arrayList.add(output);
            return;
        }
        String temp1 = output;
        String temp2 = output;
        temp1 = temp1 + input.charAt(0);
        temp2 = temp2 + "_" + input.charAt(0);
        input = input.substring(1);
        allPossibleCombinations(input, temp1);
        allPossibleCombinations(input, temp2);
    }

}
