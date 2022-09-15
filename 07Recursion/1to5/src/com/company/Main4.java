package com.company;

import java.util.Stack;

public class Main4 {
    //sort a stack, it is very similar to array sort if you think about it.
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(45);
        stack.push(5);
        stack.push(-5);
        stack.push(0);
        stack.push(-51);
        stack.push(9785);
        System.out.println(stack);
        sortStack(stack);
        System.out.println(stack);

    }

    public static void sortStack(Stack<Integer> stack) {
        if (stack.size() == 1) {
            return;
        }
        int temp = stack.pop();
        sortStack(stack);
        insert(stack, temp);
    }

    public static void insert(Stack<Integer> stack, int number) {
        if (stack.size() == 0 || stack.peek() <= number) {//change sign to reverse sort
            stack.push(number);
            return;
        }
        int temp = stack.pop();
        insert(stack, number);
        stack.push(temp);
    }

}
