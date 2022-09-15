//1.Nearest Greater to Right(NGR)/NGL + Nearest Smallest to Right(NSR)/NSL
//https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1#
//https://practice.geeksforgeeks.org/problems/fab3dbbdce746976ba35c7b9b24afde40eae5a04/1/#
//https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1/#
package com.company;

import java.util.Arrays;
import java.util.Stack;

public class Main1 {

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        System.out.println(Arrays.toString(nextLargerElementRight(arr, arr.length)));
        System.out.println(Arrays.toString(nextSmallerElementRight(arr, arr.length)));
        System.out.println(Arrays.toString(leftSmallerElement(arr, arr.length)));
    }

    public static int[] nextLargerElementRight(int[] arr, int n) {
        //TC = O(n),MC = O(n)
        //We traverse the given arr from right to left and add elements in stack of the arr, if stack is empty that means no larger element is found at RHS, so we return -1
        //and if no larger element is found at RHS we keep popping the elements till stack.size>=0 and if everything goes fine, and we have found the element greater than
        //the required elements at RHS then we update the ans[]
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (stack.size() > 0 && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }

    public static int[] nextSmallerElementRight(int[] arr, int n) {
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (stack.size() > 0 && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }

    public static int[] leftSmallerElement(int[] arr, int n) {
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (stack.size() > 0 && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }

}
