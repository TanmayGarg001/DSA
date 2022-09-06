<<<<<<< HEAD
//29.Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1,
//compute how much water can be trapped between the blocks during the rainy season.
package com.company;

public class Main29 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 4};
        int[] arr2 = {2, 0, 4, 0, 2, 0, 0, 1, 0, 3};
        System.out.println(approach1(arr));
        System.out.println(approach1(arr2));
        System.out.println("==============");
        System.out.println(approach2(arr));
        System.out.println(approach2(arr2));
        System.out.println("==============");
        System.out.println(approach3(arr));
        System.out.println(approach3(arr2));
    }

    public static int approach1(int[] arr) {
        //TC = O(n^2), MC = O(1)
        int ans = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int leftMax = arr[i];
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, arr[j]);
            }
            int rightMax = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }
            ans = ans + (Math.min(leftMax, rightMax) - arr[i]);
        }
        return ans;
    }

    public static int approach2(int[] arr) {
        //TC = O(n), MC = O(n)
        int ans = 0;
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            ans = ans + (Math.min(left[i], right[i]) - arr[i]);
        }
        return ans;
    }

    public static int approach3(int[] arr) {
        //TC = O(n), MC = O(1)
        int ans = 0;
        int leftMax = 0;
        int rightMax = 0;
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            if (arr[l] < arr[r]) {
                if (arr[l] > leftMax) {
                    leftMax = arr[l];
                } else {
                    ans = ans + leftMax - arr[l];
                }
                l++;
            } else {
                if (arr[r] > rightMax) {
                    rightMax = arr[r];
                } else {
                    ans = ans + rightMax - arr[r];
                }
                r--;
            }
        }
        return ans;
    }
}
=======
//29.Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1,
//compute how much water can be trapped between the blocks during the rainy season.
package com.company;

public class Main29 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 4};
        int[] arr2 = {2, 0, 4, 0, 2, 0, 0, 1, 0, 3};
        System.out.println(approach1(arr));
        System.out.println(approach1(arr2));
        System.out.println("==============");
        System.out.println(approach2(arr));
        System.out.println(approach2(arr2));
        System.out.println("==============");
        System.out.println(approach3(arr));
        System.out.println(approach3(arr2));
    }

    public static int approach1(int[] arr) {
        //TC = O(n^2), MC = O(1)
        int ans = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int leftMax = arr[i];
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, arr[j]);
            }
            int rightMax = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }
            ans = ans + (Math.min(leftMax, rightMax) - arr[i]);
        }
        return ans;
    }

    public static int approach2(int[] arr) {
        //TC = O(n), MC = O(n)
        int ans = 0;
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            ans = ans + (Math.min(left[i], right[i]) - arr[i]);
        }
        return ans;
    }

    public static int approach3(int[] arr) {
        //TC = O(n), MC = O(1)
        int ans = 0;
        int leftMax = 0;
        int rightMax = 0;
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            if (arr[l] < arr[r]) {
                if (arr[l] > leftMax) {
                    leftMax = arr[l];
                } else {
                    ans = ans + leftMax - arr[l];
                }
                l++;
            } else {
                if (arr[r] > rightMax) {
                    rightMax = arr[r];
                } else {
                    ans = ans + rightMax - arr[r];
                }
                r--;
            }
        }
        return ans;
    }
}
>>>>>>> 26b1aac (Final Commit_1)
