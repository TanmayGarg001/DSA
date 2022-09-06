package com.company;

//Generate all balanced parenthesis.
//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*n.
//For example, given n = 3, a solution set is:
//"((()))", "(()())", "(())()", "()(())", "()()()"
//Make sure the returned list of strings are sorted.

import java.util.ArrayList;

public class Main15 {

    private static final ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        generateBalancedParentheses(3);
    }

    public static void generateBalancedParentheses(int n) {
        generateBrackets("", n, n);
        System.out.println(arrayList);
    }

    public static void generateBrackets(String op, int open, int close) {
        if (open == 0 && close == 0) {
            arrayList.add(op);
            return;
        }
        if (open != 0) {
            String op1 = op;
            op1 = op1 + "(";
            generateBrackets(op1, open - 1, close);
        }
        if (close > open) {
            String op2 = op;
            op2 = op2 + ")";
            generateBrackets(op2, open, close - 1);
        }
    }


}
