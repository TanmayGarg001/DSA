package com.company;

import java.util.Stack;

public class Main6 {

    //delete middle element from a stack
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(546);
        stack.push(12);
        stack.push(123);
        stack.push(-23);
        stack.push(-252983);
        stack.push(13523);
        stack.push(17);
        System.out.println(stack);
        deleteMid(stack, stack.size());
        System.out.println(stack);
    }

    public static void deleteMid(Stack<Integer> stack, int size) {
        if (stack.size() == (size / 2) + 1) {
            stack.pop();
            return;
        }
        int temp = stack.pop();
        deleteMid(stack, size);
        stack.push(temp);
    }


}
