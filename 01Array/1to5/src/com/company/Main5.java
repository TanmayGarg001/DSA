//5.Move all negative numbers to beginning and positive to end with constant extra space
package com.company;

import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {

        int[] array = {-13, 1, 3, 1, 0, 1, 0, -14, 2, 1, -9, -14, -13, 1, 3};
        int[] array2 = {-13, 1, 3, 1, 0, 1, 0, -14, 2, 1, -9, -14, -13, 1, 3};
        int[] array3 = {-13, 1, 3, 1, 0, 1, 0, -14, 2, 1, -9, -14, -13, 1, 3};
        approach1(array);
        System.out.println();
        approach2(array2);
        System.out.println();
        approach3(array3);

    }

    public static void approach1(int[] array) {
        //TC = O(n*logn),MC = O(1)
        //Sorts and prints the array in the required manner :- TC = O(n*(logn))
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array);
        }

        System.out.print(Arrays.toString(array));
    }

    public static void approach2(int[] array) {
        //TC = O(n),MC = O(1)
        //Using 2 pointer approach
        int left = 0;
        int right = array.length - 1;
        int temp;

        while (left < right) {
            if (array[left] < 0 && array[right] < 0) {
                left++;
            } else if (array[left] >= 0 && array[right] < 0) {
                temp = array[right];
                array[right] = array[left];
                array[left] = temp;
                left++;
                right--;
            } else if (array[left] < 0 && array[right] > 0) {
                left++;
                right--;
            } else {
                right--;
            }

        }
        System.out.print(Arrays.toString(array));
    }

    public static void approach3(int[] array) {
        //TC = O(n),MC = O(1)
        //Traverse the array if we find the negative element we swap that element with the leftmost positive element in that array.
        int left = 0;

        for (int right = 0; right <= array.length - 1; right++) {
            if (array[right] < 0) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
            }
        }
        System.out.print(Arrays.toString(array));
    }

}