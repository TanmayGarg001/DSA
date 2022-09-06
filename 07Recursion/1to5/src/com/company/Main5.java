package com.company;

import java.util.Stack;

public class Main5 {

    //reverse a stack //similarly we can reverse an array
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(91);
        stack.push(-32);
        stack.push(0);
        stack.push(-821);
        stack.push(9234);
        System.out.println(stack);
        reverseStack(stack);
        reverseStack2(stack);
        System.out.println(stack);
        reverseStack2(stack);
        System.out.println(stack);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.size() == 1) {
            return;
        }
        stackReversal(stack);
    }

    public static void stackReversal(Stack<Integer> stack) {
        if (stack.size() == 0) {
            return;
        }
        int temp = stack.pop();
        stackReversal(stack);
        stack.add(0, temp);
    }

    private static void reverseStack2(Stack<Integer> stack) {
        if (stack.size() == 0) {
            return;
        }
        int temp = stack.remove(0);
        reverseStack2(stack);
        stack.push(temp);
    }
}
