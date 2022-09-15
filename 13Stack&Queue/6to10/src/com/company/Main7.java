//7.Given a stack, the task is to sort it such that the top of the stack has the greatest element.
//https://practice.geeksforgeeks.org/problems/sort-a-stack/1#
package com.company;

import java.util.Stack;

public class Main7 {

    public static void main(String[] args) {

    }

    public static void sortStack(Stack<Integer> stack) {
        //TC = O(n^2),MC = O(n),Basic Stuff
        if (stack.size() == 1) {
            return;
        }
        int temp = stack.pop();
        sortStack(stack);
        insert(stack, temp);
    }

    public static void insert(Stack<Integer> stack, int number) {
        if (stack.size() == 0 || stack.peek() <= number) {
            stack.push(number);
            return;
        }
        int temp = stack.pop();
        insert(stack, number);
        stack.push(temp);
    }

}