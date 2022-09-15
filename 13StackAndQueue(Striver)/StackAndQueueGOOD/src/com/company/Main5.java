//5.Given string S representing a postfix expression, the task is to evaluate the expression and find the final value.
//Operators will only include the basic arithmetic operators like *, /, + and -
//https://leetcode.com/problems/evaluate-reverse-polish-notation/
//https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1
package com.company;

import java.util.Stack;

public class Main5 {

    public static void main(String[] args) {
        //Due to ASCII character representation
        char c1 = '7';
        char c2 = '5';
        System.out.println(c1 - '0' + c2 - '0');
        System.out.println(c1 + c2);
        System.out.println(evaluatePostFix("231*+9-"));
    }

    public static int evaluatePostFix(String s) {
        //TC = O(n),MC = O(n)
        //1.Convert the expression in Reverse Polish notation(post-fix notation).
        //2.Push the operands into the stack in the order they appear.
        //3.When any operator encounters then pop two topmost operands for executing the operation.
        //4.After execution push the result obtained into the stack.
        //5.After the complete execution of expression, the final result remains on the top of the stack.
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int oprnd1, oprnd2;
            char c = s.charAt(i);
            if (c == '/' || c == '*' || c == '+' || c == '-') {
                oprnd2 = stack.pop();
                oprnd1 = stack.pop();
                switch (c) {
                    case '/' -> stack.push(oprnd1 / oprnd2);
                    case '*' -> stack.push(oprnd1 * oprnd2);
                    case '+' -> stack.push(oprnd1 + oprnd2);
                    case '-' -> stack.push(oprnd1 - oprnd2);
                }
            } else {
                stack.push(c - '0');
            }
        }
        return stack.pop();
    }


}
