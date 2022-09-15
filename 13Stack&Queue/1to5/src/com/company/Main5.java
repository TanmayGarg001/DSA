//5.Reverse a string using Stack
//https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
package com.company;

import java.util.Stack;

public class Main5 {

    public static void main(String[] args) {

    }

    public String reverse(String s) {
        //TC = O(n),MC = O(n)
        //Basic stuff
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        String ans = "";
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}