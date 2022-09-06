<<<<<<< HEAD
package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class StackO1 {

    int min = Integer.MAX_VALUE;
    private ArrayList<Integer> stack;
    private Stack<Integer> minStack;

    public StackO1() {
        stack = new ArrayList<>();
        minStack = new Stack<>();
    }

    public int getMin() {
        return minStack.peek();
    }

    public int pop() {
        if (Objects.equals(minStack.peek(), stack.get(stack.size() - 1))) {
            minStack.pop();
        }
        int temp = -1;
        if (isEmpty()) {
            System.out.println("Stack is empty already!");
        } else {
            temp = stack.remove(stack.size() - 1);
        }
        return temp;
    }

    public void push(int number) {
        if (isEmpty()) {
            minStack.push(number);
        } else {
            if (number < minStack.peek()) {
                minStack.push(number);
            }
        }
        stack.add(number);
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
=======
package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class StackO1 {

    int min = Integer.MAX_VALUE;
    private ArrayList<Integer> stack;
    private Stack<Integer> minStack;

    public StackO1() {
        stack = new ArrayList<>();
        minStack = new Stack<>();
    }

    public int getMin() {
        return minStack.peek();
    }

    public int pop() {
        if (Objects.equals(minStack.peek(), stack.get(stack.size() - 1))) {
            minStack.pop();
        }
        int temp = -1;
        if (isEmpty()) {
            System.out.println("Stack is empty already!");
        } else {
            temp = stack.remove(stack.size() - 1);
        }
        return temp;
    }

    public void push(int number) {
        if (isEmpty()) {
            minStack.push(number);
        } else {
            if (number < minStack.peek()) {
                minStack.push(number);
            }
        }
        stack.add(number);
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
>>>>>>> 26b1aac (Final Commit_1)
