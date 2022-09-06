//Design a Stack that supports getMin() in O(1) time and O(1) extra space.
//https://www.geeksforgeeks.org/design-a-stack-that-supports-getmin-in-o1-time-and-o1-extra-space/
//https://practice.geeksforgeeks.org/problems/get-minimum-element-from-stack/1/
//https://leetcode.com/problems/min-stack/
package com.company;

import java.util.Stack;

public class Main9 {

    static Stack<Integer> s = new Stack<>();
    int minEle;

    public static void main(String[] args) {
        //TC = O(1),MC = O(n)
        //this is pretty basic and ez
        StackO1 stackO1 = new StackO1();
        stackO1.push(44);
        stackO1.push(10);
        System.out.println(stackO1.getMin());
        stackO1.push(-7);
        stackO1.push(15);
        System.out.println(stackO1.getMin());
        stackO1.push(7);
        System.out.println(stackO1);
        stackO1.pop();
        stackO1.push(99);

        //Now we have to do the same in O(1),O(1)
    }

    int getMin() {
        return s.isEmpty() ? -1 : minEle;
    }

    void push(int x) {
        if (s.isEmpty()) {
            s.push(x);
            minEle = x;
        } else {
            if (x >= minEle) {
                s.push(x);
            } else {
                s.push(2 * x - minEle);
                minEle = x;
            }
        }
    }

    int pop() {
        if (s.isEmpty()) {
            return -1;
        } else if (s.peek() < minEle) {
            int min = minEle;
            minEle = 2 * minEle - s.pop();
            return min;
        } else {
            return s.pop();
        }
    }

}