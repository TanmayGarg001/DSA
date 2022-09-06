<<<<<<< HEAD
//6.Reverse a stack using recursion
//https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
package com.company;

import java.util.Stack;

public class Main6 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(-54);
        stack.push(10);
        stack.push(0);
        stack.push(98);
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }

    public static void reverseStack(Stack<Integer> stack) {
        //TC = O(n),MC = O(n),Basic Stuff
        if (stack.size() == 0) {
            return;
        }
        int temp = stack.remove(0);
        reverseStack(stack);
        stack.push(temp);
    }

}
=======
//6.Reverse a stack using recursion
//https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
package com.company;

import java.util.Stack;

public class Main6 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(-54);
        stack.push(10);
        stack.push(0);
        stack.push(98);
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }

    public static void reverseStack(Stack<Integer> stack) {
        //TC = O(n),MC = O(n),Basic Stuff
        if (stack.size() == 0) {
            return;
        }
        int temp = stack.remove(0);
        reverseStack(stack);
        stack.push(temp);
    }

}
>>>>>>> 26b1aac (Final Commit_1)
