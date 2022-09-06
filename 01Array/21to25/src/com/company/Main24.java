<<<<<<< HEAD
//24.Given an array of positive integers. Find the length of the longest sub-sequence such that elements
//in the subsequence are consecutive integers, the consecutive numbers can be in any order
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Main24 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 5, 987, 10, 1, 18, 55, 13, 15, 12, 16, 17, 20, 19};
        System.out.println(approach1(arr));
        System.out.println(approach2(arr));
        System.out.println(approach3(arr));
    }

    static int approach1(int[] arr) {
        //TC = O(nlogn),MC = O(n)
        //Instead of sorting which results in more than 2 elements together ,use TreeSet as it will hold distinct values in sorted order.
        //Loop the arrayList which holds the same values at same order like treeSet and keep checking if the next element is one greater than the previous one.
        //If it is then increase count and update the max variable if count is greater than max.
        //Keep doing this and you've got your answer!
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i : arr) {
            ts.add(i);
        }
        ArrayList<Integer> al = new ArrayList<>(ts);
        int ans = 0;
        int max = 0;
        for (int i = 0; i < al.size() - 1; i++) {
            if (al.get(i) + 1 == al.get(i + 1)) {
                ans++;
                max = Math.max(ans, max);
            } else {
                ans = 0;
            }
        }
        return max + 1;
    }


    public static int approach2(int[] nums) {
        //TC = O(nlogn) , MC=O(1)
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int temp = 1, max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) continue;
            if (nums[i - 1] == nums[i] - 1) temp++;
            else {
                temp = 1;
            }
            max = Math.max(temp, max);
        }
        return max;
    }

    static int approach3(int[] arr) {
        //TC = O(n) , MC=O(1)
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(arr[i] - 1)) {
                int j = arr[i];
                while (hs.contains(j)) {
                    j++;
                }
                ans = Math.max(ans, j - arr[i]);
            }
        }
        return ans;
    }


}
=======
//24.Given an array of positive integers. Find the length of the longest sub-sequence such that elements
//in the subsequence are consecutive integers, the consecutive numbers can be in any order
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Main24 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 5, 987, 10, 1, 18, 55, 13, 15, 12, 16, 17, 20, 19};
        System.out.println(approach1(arr));
        System.out.println(approach2(arr));
        System.out.println(approach3(arr));
    }

    static int approach1(int[] arr) {
        //TC = O(nlogn),MC = O(n)
        //Instead of sorting which results in more than 2 elements together ,use TreeSet as it will hold distinct values in sorted order.
        //Loop the arrayList which holds the same values at same order like treeSet and keep checking if the next element is one greater than the previous one.
        //If it is then increase count and update the max variable if count is greater than max.
        //Keep doing this and you've got your answer!
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i : arr) {
            ts.add(i);
        }
        ArrayList<Integer> al = new ArrayList<>(ts);
        int ans = 0;
        int max = 0;
        for (int i = 0; i < al.size() - 1; i++) {
            if (al.get(i) + 1 == al.get(i + 1)) {
                ans++;
                max = Math.max(ans, max);
            } else {
                ans = 0;
            }
        }
        return max + 1;
    }


    public static int approach2(int[] nums) {
        //TC = O(nlogn) , MC=O(1)
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int temp = 1, max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) continue;
            if (nums[i - 1] == nums[i] - 1) temp++;
            else {
                temp = 1;
            }
            max = Math.max(temp, max);
        }
        return max;
    }

    static int approach3(int[] arr) {
        //TC = O(n) , MC=O(1)
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }
        int ans = 0;//Ex = {3,5,4,8,9,6,1,7}
        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(arr[i] - 1)) {//if hs contains 3-1 = 2 that means we can't start the count of longest-subsequence from here coz we need element whose value-1
                int j = arr[i];             //isn't there in the hashset
                while (hs.contains(j)) {//now if we find that element we simply keep finding i+1 elements from that in hashSet in O(1) lookup and
                    j++;
                }
                ans = Math.max(ans, j - arr[i]);//update the max ans. We do j-arr[i] coz we need to remove arr[i] value from j when we initialized j as j=arr[i] instead of 0
            }
        }
        return ans;
    }


}
>>>>>>> 26b1aac (Final Commit_1)
