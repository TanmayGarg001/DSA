<<<<<<< HEAD
//20.Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the
//relative order of positive and negative numbers.
//Note: Array should start with positive number.
package com.company;

import java.util.ArrayList;

public class Main20 {

    public static void main(String[] args) {
        int[] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        approach1(arr);
    }

    public static void approach1(int[] array) {
        //TC = O(n),MC= O(n)
        //make 2 arrays one holds positive numbers other negative numbers and then print the answer.
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                neg.add(array[i]);
            } else {
                pos.add(array[i]);
            }
        }
        int i = 0;
        int j = 0;
        while (i < pos.size() && j < neg.size()) {
            System.out.print(pos.get(i++) + " ");
            System.out.print(neg.get(j++) + " ");
        }
        while (i < pos.size()) {
            System.out.print(pos.get(i++) + " ");
        }
        while (j < neg.size()) {
            System.out.print(neg.get(j++) + " ");
        }

    }

=======
//20.Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the
//relative order of positive and negative numbers.
//Note: Array should start with positive number.
package com.company;

import java.util.ArrayList;

public class Main20 {

    public static void main(String[] args) {
        int[] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        approach1(arr);
    }

    public static void approach1(int[] array) {
        //TC = O(n),MC= O(n)
        //make 2 arrays one holds positive numbers other negative numbers and then print the answer.
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                neg.add(array[i]);
            } else {
                pos.add(array[i]);
            }
        }
        int i = 0;
        int j = 0;
        while (i < pos.size() && j < neg.size()) {
            System.out.print(pos.get(i++) + " ");
            System.out.print(neg.get(j++) + " ");
        }
        while (i < pos.size()) {
            System.out.print(pos.get(i++) + " ");
        }
        while (j < neg.size()) {
            System.out.print(neg.get(j++) + " ");
        }

    }

>>>>>>> 26b1aac (Final Commit_1)
}