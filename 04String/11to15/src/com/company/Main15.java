<<<<<<< HEAD
//15.Implement the next permutation, which rearranges the list of numbers into Lexicographically next greater permutation of list of numbers.
//If such arrangement is not possible, it must be rearranged to the lowest possible order i.e. sorted in ascending order.
//You are given a list of numbers arr[] of size N.
package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main15 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5, 4};
        System.out.println(approach1(arr.length, arr));
    }

    public static List<Integer> approach1(int n, int[] arr) {
        //TC = O(n),MC = O(1)
        //2 pointer approach, we make a pointer at end and keep decreasing till we find a number lesser than number in front of it.
        //Now we have location of one pointer, we start other pointer from end ofc and keep decreasing it till its greater than the element at pointer 1st.
        //When we find it, we know that we need to swap those elements and the left array after that point just need to be reversed.
        ArrayList<Integer> al = new ArrayList<>();
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);

        }
        reverse(arr, i + 1);
        for (int x : arr) {
            al.add(x);
        }
        return al;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void reverse(int[] array, int i) {
        int j = array.length - 1;
        while (i < j) {
            swap(array, i, j);
            i++;
            j--;
        }
    }

=======
//15.Implement the next permutation, which rearranges the list of numbers into Lexicographically next greater permutation of list of numbers.
//If such arrangement is not possible, it must be rearranged to the lowest possible order i.e. sorted in ascending order.
//You are given a list of numbers arr[] of size N.
package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main15 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5, 4};
        System.out.println(approach1(arr.length, arr));
    }

    public static List<Integer> approach1(int n, int[] arr) {
        //TC = O(n),MC = O(1)
        //2 pointer approach, we make a pointer at end and keep decreasing till we find a number lesser than number in front of it.
        //Now we have location of one pointer, we start other pointer from end ofc and keep decreasing it till its greater than the element at pointer 1st.
        //When we find it, we know that we need to swap those elements and the left array after that point just need to be reversed.
        ArrayList<Integer> al = new ArrayList<>();
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);

        }
        reverse(arr, i + 1);
        for (int x : arr) {
            al.add(x);
        }
        return al;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void reverse(int[] array, int i) {
        int j = array.length - 1;
        while (i < j) {
            swap(array, i, j);
            i++;
            j--;
        }
    }

>>>>>>> 26b1aac (Final Commit_1)
}