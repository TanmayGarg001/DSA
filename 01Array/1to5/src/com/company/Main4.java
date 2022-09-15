//4.Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
package com.company;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] array = {2, 2, 1, 0, 0, 2, 2, 0, 0};
        approach1(array, array.length);

        int[] array2 = {2, 2, 1, 0, 0, 2, 2, 0, 0};
        approach2(array2, array2.length);
    }

    public static void approach1(int[] array, int n) {
        //TC = O(n),MC = O(1)
        //simply count the number of one's two's and three's and then overwrite the original array
        //requires 2 traversal of the array
        int zero = 0;
        int one = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                zero++;
            }
            if (array[i] == 1) {
                one++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (i < zero) {
                array[i] = 0;
            } else if (i < zero + one) {
                array[i] = 1;
            } else {
                array[i] = 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void approach2(int[] array, int n) {
        //TC = O(n),MC = O(1),relatively faster than approach1
        //we set 3 virtual pointers to low,mid and high and keep swapping elements in each iteration with mid-pointer and increase it by 1 in each iteration.
        //requires 1 traversal of the array only.
        int low = 0;
        int mid = 0;
        int high = n - 1;
        int temp;

        while (mid <= high) {
            switch (array[mid]) {
                case 0:
                    temp = array[low];
                    array[low] = array[mid];
                    array[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = array[high];
                    array[high] = array[mid];
                    array[mid] = temp;
                    high--;
                    break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    
}