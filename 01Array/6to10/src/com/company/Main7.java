//7.Cyclically rotate an array by one
package com.company;

import java.util.Arrays;

public class Main7 {

    public static void main(String[] args) {

        int[] array = {17, 0, -59, 0, 6, 6, -987, 98};
        System.out.println("Original Array: " + Arrays.toString(array));
        approach1(array);
        approach2(array);

    }

    public static void approach1(int[] array) {
        //TC = O(n),MC = O(1), very fast and simple approach
        //Iterate the array and keep over-writing the elements nth element by (n-1)th element in reverse traversal order fashion, and at last simply swap the
        //first value of the array with the original last value in the array.
        int temp1 = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp1;
        System.out.println("Changed Array: " + Arrays.toString(array));
    }


    public static void approach2(int[] array) {
        //TC = O(n),MC = O(1)
        //2 pointer approach
        int i = 0;
        int j = array.length - 1;

        while (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
        }
        System.out.println("Changed Array: " + Arrays.toString(array));
    }
    
}