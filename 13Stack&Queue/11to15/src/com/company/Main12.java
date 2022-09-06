<<<<<<< HEAD
//12.Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of a number of contiguous bars.
//For simplicity, assume that all bars have same width and the width is 1 unit.
//https://www.geeksforgeeks.org/largest-rectangle-under-histogram/?ref=lbp
//https://leetcode.com/problems/largest-rectangle-in-histogram/
package com.company;

import java.util.Stack;

public class Main12 {


    public static void main(String[] args) {
        long[] arr = {4, 2, 0, 3, 2, 5};
        System.out.println(getMaxArea(arr, arr.length));
    }

    public static long getMaxArea(long[] arr, long n) {
        //TC = O(n),MC = O(n)
        //maxArea can be calculated by finding the NSL and NSR for each element in arr[] and then updating max ans by traversing the result.
        long max = 0;
        Stack<Integer> stack = new Stack<>();
        int[] nsr = new int[(int) n];
        int[] nsl = new int[(int) n];

        // NSL
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }

        // NSR
        stack = new Stack<>();
        for (int i = (int) (n - 1); i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsr[i] = (int) n;
            } else {
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }

        // calculate max( arr[i] * (right-left-1))
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i] * (nsr[i] - nsl[i] - 1));
        }
        return max;
    }

}
=======
//12.Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of a number of contiguous bars.
//For simplicity, assume that all bars have same width and the width is 1 unit.
//https://www.geeksforgeeks.org/largest-rectangle-under-histogram/?ref=lbp
//https://leetcode.com/problems/largest-rectangle-in-histogram/
package com.company;

import java.util.Stack;

public class Main12 {


    public static void main(String[] args) {
        long[] arr = {4, 2, 0, 3, 2, 5};
        System.out.println(getMaxArea(arr, arr.length));
    }

    public static long getMaxArea(long[] arr, long n) {
        //TC = O(n),MC = O(n)
        //maxArea can be calculated by finding the NSL and NSR for each element in arr[] and then updating max ans by traversing the result.
        long max = 0;
        Stack<Integer> stack = new Stack<>();
        int[] nsr = new int[(int) n];
        int[] nsl = new int[(int) n];

        // NSL
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }

        // NSR
        stack = new Stack<>();
        for (int i = (int) (n - 1); i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsr[i] = (int) n;
            } else {
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }

        // calculate max( arr[i] * (right-left-1))
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i] * (nsr[i] - nsl[i] - 1));
        }
        return max;
    }

}
>>>>>>> 26b1aac (Final Commit_1)
