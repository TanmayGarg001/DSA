<<<<<<< HEAD
//32.Given an array of size n and a range [a, b]. The task is to partition the array around the range such that array is divided into three parts.
//1) All elements smaller than a come first.
//2) All elements in range a to b come next.
//3) All elements greater than b appear in the end.
//The individual elements of three sets can appear in any order. You are required to return the modified array.
package com.company;

import java.util.Arrays;

public class Main32 {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 33, 41, 21, 847};
        approach1(arr, 1, 5);
        approach2(arr, 1, 5);
    }

    public static void approach1(int[] array, int a, int b) {
        //This is literally the easiest way to do this, and question in useless af
        //TC = O(n*logn),MC = O(1)
        Arrays.sort(array);
    }

    public static void approach2(int[] array, int a, int b) {
        //TC = O(n),MC = O(1)
        //Just rearranges the elements accordingly, this does not sort the array but works due to constraints provided
        int i = 0;
        int j = 0;
        int k = array.length - 1;
        while (i <= k) {
            if (array[i] < a) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j++;
            } else if (array[i] > b) {
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
                k--;
            } else {
                i++;
            }
        }
    }

=======
//32.Given an array of size n and a range [a, b]. The task is to partition the array around the range such that array is divided into three parts.
//1) All elements smaller than a come first.
//2) All elements in range a to b come next.
//3) All elements greater than b appear in the end.
//The individual elements of three sets can appear in any order. You are required to return the modified array.
package com.company;

import java.util.Arrays;

public class Main32 {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 33, 41, 21, 847};
        approach1(arr, 1, 5);
        approach2(arr, 1, 5);
    }

    public static void approach1(int[] array, int a, int b) {
        //This is literally the easiest way to do this, and question in useless af
        //TC = O(n*logn),MC = O(1)
        Arrays.sort(array);
    }

    public static void approach2(int[] array, int a, int b) {
        //TC = O(n),MC = O(1)
        //Just rearranges the elements accordingly, this does not sort the array but works due to constraints provided
        int i = 0;
        int j = 0;
        int k = array.length - 1;
        while (i <= k) {
            if (array[i] < a) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j++;
            } else if (array[i] > b) {
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
                k--;
            } else {
                i++;
            }
        }
    }

>>>>>>> 26b1aac (Final Commit_1)
}