//6.Given a string S consisting only of opening and closing parenthesis 'ie '('  and ')', find out the length of the longest valid(well-formed) parentheses substring.
//NOTE: Length of the smallest valid substring ( ) is 2.
//https://practice.geeksforgeeks.org/problems/valid-substring0624/1
package com.company;

import java.util.Stack;

public class Main6 {

    public static void main(String[] args) {
        
    }

    static int findMaxLen(String s) {
        //TC = O(n),MC = O(1)
        //See the algorithm , we just traverse the string from left to right and then right to left and keep track of maxCounter which is achieved when the
        //open(==close). We run loop twice coz of strings like "(()()"
        int max = 0;
        int open = 0;
        int close = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            if (open == close) {
                max = Math.max(max, open + close);
            } else if (close > open) {
                open = 0;
                close = 0;
            }
        }
        close = 0;
        open = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            if (open == close) {
                max = Math.max(max, open + close);
            } else if (open > close) {
                open = 0;
                close = 0;
            }
        }
        return max;
    }

    public int longestValidParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        int result = 0;
        int lastI = -1; //it will remain -1 for ()() , (()). Will change if extra closing ')' is encountered e.g. ) ()()
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stk.push(i);
            } else {
                if (!stk.isEmpty()) { // there is matching '(' in stack
                    stk.pop();  //remove matching '('
                    //find valid string start based on stack emptiness
                    if (!stk.isEmpty()) { //there are unclosed '(' other than the one popped '(' in prev line e.g. for (()  , ( is still in stack
                        result = Math.max(result, i - stk.peek()); //so valid str len will start after unclosed '(' which is still in stack
                    } else {
                        result = Math.max(result, i - lastI); //stack is empty now, use lastI to find the beginning which is either after 0 for which
                        // lastI = -1 for it or  after extra ) e.g. ()() - lastI =-1 or )()() - lastI = 0
                    }

                } else { // there is extra ) that has no matching '(', preserve the lastI
                    lastI = i;
                }
            }
        }
        return result;
    }


}