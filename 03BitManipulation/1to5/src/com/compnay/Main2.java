<<<<<<< HEAD
//2.Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas the other two number occur exactly once and are distinct.
//Find the other two numbers.
package com.compnay;

import java.util.Arrays;
import java.util.HashMap;

public class Main2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};
        approach1(arr);//Check the blog for bitManipulations method.
        approach2(arr);//https://www.geeksforgeeks.org/find-two-non-repeating-elements-in-an-array-of-repeating-elements/
    }

    public static void approach1(int[] nums) {
        //TC = O(n*logn),MC = O(1)
        //Sort the array,make a pointer and keep increasing it by +2 in each iteration and when ith element is equal to i+1st do nothing if it's not we found the ans.
        Arrays.sort(nums);
        int[] ans = new int[2];
        int temp = 0;
        int i = 0;
        while (i < nums.length) {
            if (i == nums.length - 1) {
                ans[temp] = nums[i];
                break;
            }
            if (nums[i] == nums[i + 1]) {
                i += 2;
            } else {
                ans[temp] = nums[i];
                i++;
                temp++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }


    public static void approach2(int[] nums) {
        //TC = O(n),MC = O(n)
        //Make a hashMap and add if the value of the key is 1 and then just print it/add it.
        int j = 0;
        int[] ans = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]).equals(1)) {
                ans[j] = nums[i];
                j++;
            }
        }
        if (ans[0] > ans[1]) {//To sort in increasing order
            int temp = ans[0];
            ans[0] = ans[1];
            ans[1] = temp;
        }
        System.out.println(Arrays.toString(ans));
    }


    public static int[] solve(int[] arr) {
        //TC = O(n),MC = O(1)
        int[] ans = new int[2];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum ^ arr[i];
        }
        int rmb = sum & ~(sum - 1);
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((rmb & arr[i]) != 0) {
                a = a ^ arr[i];
            } else {
                b = b ^ arr[i];
            }
        }
        ans[0] = a;
        ans[1] = b;
        if (ans[0] > ans[1]) {
            int temp = ans[0];
            ans[0] = ans[1];
            ans[1] = temp;
        }
        return ans;
    }

}
=======
//2.Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas the other two number occur exactly once and are distinct.
//Find the other two numbers.
package com.compnay;

import java.util.Arrays;
import java.util.HashMap;

public class Main2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};
        approach1(arr);//Check the blog for bitManipulations method.
        approach2(arr);//https://www.geeksforgeeks.org/find-two-non-repeating-elements-in-an-array-of-repeating-elements/
    }

    public static void approach1(int[] nums) {
        //TC = O(n*logn),MC = O(1)
        //Sort the array,make a pointer and keep increasing it by +2 in each iteration and when ith element is equal to i+1st do nothing if it's not we found the ans.
        Arrays.sort(nums);
        int[] ans = new int[2];
        int temp = 0;
        int i = 0;
        while (i < nums.length) {
            if (i == nums.length - 1) {
                ans[temp] = nums[i];
                break;
            }
            if (nums[i] == nums[i + 1]) {
                i += 2;
            } else {
                ans[temp] = nums[i];
                i++;
                temp++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }


    public static void approach2(int[] nums) {
        //TC = O(n),MC = O(n)
        //Make a hashMap and add if the value of the key is 1 and then just print it/add it.
        int j = 0;
        int[] ans = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]).equals(1)) {
                ans[j] = nums[i];
                j++;
            }
        }
        if (ans[0] > ans[1]) {//To sort in increasing order
            int temp = ans[0];
            ans[0] = ans[1];
            ans[1] = temp;
        }
        System.out.println(Arrays.toString(ans));
    }


    public static int[] solve(int[] arr) {
        //TC = O(n),MC = O(1)
        int[] ans = new int[2];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum ^ arr[i];
        }
        int rmb = sum & ~(sum - 1);
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((rmb & arr[i]) != 0) {
                a = a ^ arr[i];
            } else {
                b = b ^ arr[i];
            }
        }
        ans[0] = a;
        ans[1] = b;
        if (ans[0] > ans[1]) {
            int temp = ans[0];
            ans[0] = ans[1];
            ans[1] = temp;
        }
        return ans;
    }

}
>>>>>>> 26b1aac (Final Commit_1)
