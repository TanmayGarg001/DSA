package com.company;

import java.util.ArrayList;

//All subsets are same as powerSet.(PowerSet is a set of all subsets of a set)
//Substring:-continuous string from the given string only. EX:- mmy or imm is a substring of Timmy but Tiy is not a substring
//Subsequences:-In a subsequence order matters, and we can select string non-continuously.Ex:- Tiy is a subsequence of Timmy but miy is not as order is not maintained.
//Subsets:-It's somewhat similar to subsequence but here order does not matter. Ex:- miy is a subset of Timmy so is imy but both are treated as same.
//In order to avoid so many possible combinations of a subset, in questions they ask you to print subsequences.
//So to solve this we use the same old RecursiveTree way.
//Hence, all substrings are subsequences and all subsequences are subsets.
//Therefore, as a rule of thumb if asked to print powerSet or all subsets or all subsequences we will always do this same way as this always print in order.

public class Main11 {

    private static final ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        powerSet("cbc");
    }

    public static void powerSet(String s) {
        subSets(s, "");
        System.out.println(arrayList);
    }

    public static void subSets(String input, String output) {
        if (input.length() == 0) {
            //So It's same as previous , now if they ask to print in lexicographical order, then do this :-
//            char[] chars = output.toCharArray();
//            Arrays.sort(chars);
//            String s = new String(chars);
//            if (!arrayList.contains(s)) {
//                arrayList.add(s);
//            }
            arrayList.add(output);
            return;
        }
        String op = output;
        op = op + input.charAt(0);
        input = input.substring(1);
        subSets(input, output);
        subSets(input, op);
    }


}
