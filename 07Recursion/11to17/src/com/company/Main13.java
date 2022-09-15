package com.company;

//Permute a string by changing case
//Input : ab
//Output : AB Ab ab aB
//Input : ABC
//Output : abc Abc aBc ABc abC AbC aBC ABC

import java.util.ArrayList;

public class Main13 {

    private static final ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        caseChange("abc");
    }

    public static void caseChange(String str) {
        allCombinations(str, "");
        System.out.println(arrayList);
    }

    public static void allCombinations(String input, String output) {
        if (input.length() == 0) {
            arrayList.add(output);
            return;
        }
        String op1 = output + input.charAt(0);
        String op2 = output + Character.toString(input.charAt(0)).toUpperCase();
        input = input.substring(1);
        allCombinations(input, op1);
        allCombinations(input, op2);

    }

}
