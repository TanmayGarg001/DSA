//15.Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
//If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).
//The replacement must be in place and use only constant extra memory.
//Think of the list of numbers as a single integer. For example, think of [1,3,7,3,2] as 13732.
//Your goal is to create the next highest number, using only the same digits. In this case, the next biggest number is 17233.
package com.company;

import java.util.Arrays;

public class Main15 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(Arrays.toString(array));
        approach1(array);
        System.out.println(Arrays.toString(array));
    }

    public static void approach1(int[] array) {
        //TC = O(n),MC = O(1)
        int i = array.length - 2;
        while (i >= 0 && array[i + 1] <= array[i]) {
            i--;
        }

        if (i >= 0) {
            int j = array.length - 1;
            while (array[i] >= array[j]) {
                j--;
            }
            swap(array, i, j);
        }
        reverse(array, i + 1);
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void reverse(int[] array, int i) {
        //reverses the leftover array in order to minimize the appending elements
        int j = array.length - 1;
        while (i < j) {
            swap(array, i, j);
            i++;
            j--;
        }
    }

}