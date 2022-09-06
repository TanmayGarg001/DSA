package com.company;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main0 {
    //https://leetcode.com/problems/implement-stack-using-queues/
    //https://leetcode.com/problems/implement-queue-using-stacks/
    //1. Implement Stack using Queues
    static class MyStack {
        Queue<Integer> q = new LinkedList<>();

        public void push(int x) {
            q.add(x);
            for (int i = 0; i < q.size() - 1; i++) {
                int temp = q.poll();
                q.add(temp);
            }
        }

        public int pop() {
            return q.poll();
        }

        public int top() {
            return q.peek();
        }

        public boolean empty() {
            return q.isEmpty();
        }
    }

    static class MyStack0 {
        Deque<Integer> dq = new LinkedList<>();

        public void push(int x) {
            dq.add(x);
        }

        public int pop() {
            return dq.removeLast();
        }

        public int top() {
            return dq.getLast();
        }

        public boolean empty() {
            return dq.isEmpty();
        }
    }

    //2. Implement Queue using Stack
    static class MyQueue {
        Stack<Integer> queue = new Stack<>();

        public void push(int x) {
            Stack<Integer> temp = new Stack<>();
            while (!queue.empty()) {
                temp.push(queue.pop());
            }
            queue.push(x);
            while (!temp.empty()) {
                queue.push(temp.pop());
            }
        }

        public int pop() {
            return queue.pop();
        }

        public int peek() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.empty();
        }

    }

    static class MyQueue0 {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public void push(int x) {
            s1.push(x);
        }

        public void pop() {
            peek();
            s2.pop();
        }

        public int peek() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.peek();
        }

        public boolean empty() {
            return s1.isEmpty() && s2.isEmpty();
        }

    }
}
