<<<<<<< HEAD
//18.Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
package com.company;

import java.util.HashMap;

public class Main18 {

    public static void main(String[] args) {
        int[] array = {1, 5, 7, 1};
        approach1(array, 2);
        System.out.println(approach2(array, array.length, 2));
    }

    public static void approach1(int[] array, int k) {
        //TC = O(n^2), MC=O(1)
        //Brute force
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static int approach2(int[] arr, int n, int k) {
        //TC = O(n),MC = O(1)
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(k - arr[i])) {
                ans = ans + map.get(k - arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return ans;
    }

=======
//18.Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
package com.company;

import java.util.HashMap;

public class Main18 {

    public static void main(String[] args) {
        int[] array = {1, 5, 7, 1};
        approach1(array, 2);
        System.out.println(approach2(array, array.length, 2));
    }

    public static void approach1(int[] array, int k) {
        //TC = O(n^2), MC=O(1)
        //Brute force
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static int approach2(int[] arr, int n, int k) {
        //TC = O(n),MC = O(1)
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(k - arr[i])) {
                ans = ans + map.get(k - arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return ans;
    }

>>>>>>> 26b1aac (Final Commit_1)
}