//9.Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by increasing or decreasing them by K
//only once. After modifying, height should be a non-negative integer.
//Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.
package com.company;

import java.util.Arrays;

public class Main9 {

    public static void main(String[] args) {
        int[] array = {3, 9, 12, 16, 20};
        System.out.println(approach1(array, array.length, 3));
    }

    public static int approach1(int[] arr, int n, int k) {
        //TC = O(n*logn),MC = O(1)
        //This question was a good one, and it requires a lot of brainstorming.
        //The basic principle of solving this is we have to minimize the difference of tallest and smallest tower to get the answer.
        //But the catch is the tallest tower must be subtracted by k and smallest increased by k. In this way we can minimize the difference.
        //But this only holds true if all the elements in the array are unique and the array is sored and k is less than the smallest tower, if you think so.

        //What we think is that one should subtract k from the right side towers and add k to the left side towers.
        //Now the left-tower whose height we are trying to increase, it is possible that after increase its height it becomes taller tower than the following towers.
        //So is possible that tower we are trying to increase the height of does not have the maximum height.So we need to check whether its height is more than the
        //last tower i.e. the rightmost tower. As the array is sorted if the tower's height is greater than the last tower then we have found our new tallest tower.
        //Similarly, for minimum tower we already know that 0th index is the smallest tower after sorting the array.
        //now we add to it and check if any following tower if we subtract k from it is smaller than this. If there is we found new smallest tower.
        //Now you might think why do this,we should rather add k to the following towers but if we keep doing that we might make a tower larger than the tallest tower
        //also we have result stored if the min. we got and max. we got is smaller than the previous minimum than only we will update the result else loop continues.

        //IF ALL OF THIS STILL DOES NOT HELP YOU TO UNDERSTAND, SEE IT LIKE THIS:-
        //At the very first we subtracted both the ends of the array to get the result now we're doing that but with a condition that if we found a smaller tower than
        //the one we had initially and a larger tower than the one we had initially by subtracting and adding k in each iteration and there difference is less than the
        //one we had initially we update them and BOOM! we got our answer.

        //Check for k=5,n=10,arr={1,2,2,2,3,3,4,6,7,10}
        Arrays.sort(arr);
        if (arr.length <= 1 || arr[0] == arr[arr.length - 1]) {
            return 0;
        }
        int diff = arr[n - 1] - arr[0];
        int max;
        int min;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - k < 0) {//only iff diff can't be negative (ofc)
                continue;
            }
            max = Math.max(arr[n - 1] - k, arr[i - 1] + k);//max candidate
            min = Math.min(arr[0] + k, arr[i] - k);//min candidate
            diff = Math.min(max - min, diff);
        }
        return diff;
    }

}