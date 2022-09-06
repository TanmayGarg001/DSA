//2.Your task is to implement 2 stacks in one array efficiently.
//https://practice.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1#
package com.company;

public class Main2 {

    public static void main(String[] args) {

    }

    static class TwoStack {

        int size;
        int top1, top2;
        int[] arr = new int[100];

        TwoStack() {
            size = 100;
            top1 = -1;
            top2 = size;
        }
    }

    static class Stacks {
        void push1(int x, TwoStack sq) {
            sq.top1++;
            sq.arr[sq.top1] = x;
        }

        void push2(int x, TwoStack sq) {
            sq.top2--;
            sq.arr[sq.top2] = x;
        }

        int pop1(TwoStack sq) {
            if (sq.top1 == -1) {
                return -1;
            }
            return sq.arr[sq.top1--];
        }

        int pop2(TwoStack sq) {
            if (sq.top2 == sq.size) {
                return -1;
            }
            return sq.arr[sq.top2++];
        }
    }
}
