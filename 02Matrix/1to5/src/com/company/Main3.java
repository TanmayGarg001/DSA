//3.Given a row wise sorted matrix of size RxC where R and C are always odd, find the median of the matrix.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main3 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        approach1(matrix, 3, 3);
        approach2(matrix, 3, 3);
        approach3(matrix, matrix.length, matrix[0].length);
    }

    public static void approach1(int[][] matrix, int rows, int columns) {
        //TC = O(n*logn),MC = O(n)
        //Make an arrayList of the matrix and sort the arrayList.
        //Now,return the median.(middle element if odd else sum of middle 2 elements divided by 2).
        ArrayList<Integer> al = new ArrayList<>();
        int j = 0;
        int i = 0;
        int temp = 0;
        while (temp < rows * columns) {
            al.add(matrix[i][j]);
            j++;
            if (j == columns) {
                j = 0;
                i++;
            }
            temp++;
        }
        int ans;
        Collections.sort(al);
        if (al.size() % 2 == 0) {
            ans = al.get(al.size() / 2) + al.get((al.size() / 2) - 1);
            ans = ans / 2;
        } else {
            ans = al.get(al.size() / 2);
        }
        System.out.println("Median : " + ans);
    }

    public static void approach2(int[][] matrix, int rows, int columns) {
        //Does not work for larger inputs due to round error ig.
        int i = 0;
        int ans = 0;
        if (columns % 2 != 0) {
            while (i < rows) {
                ans = ans + matrix[i][columns / 2];
                i++;
            }
        } else {
            while (i < rows) {
                ans = ans + ((matrix[i][columns / 2] + matrix[i][(columns / 2) - 1]) + 1) / 2;
                i++;
            }
        }
        System.out.println(ans / rows);
    }
    //BEST:-
    //https://www.geeksforgeeks.org/find-median-row-wise-sorted-matrix/

    public static void approach3(int[][] m, int r, int c) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < r; i++) {

            // Finding the minimum element
            if (m[i][0] < min) min = m[i][0];

            // Finding the maximum element
            if (m[i][c - 1] > max) max = m[i][c - 1];
        }

        int desired = (r * c + 1) / 2;
        while (min < max) {
            int mid = min + (max - min) / 2;
            int place = 0;
            int get;

            // Find count of elements smaller than mid
            for (int i = 0; i < r; ++i) {

                get = Arrays.binarySearch(m[i], mid);

                // If element is not found in the array the
                // binarySearch() method returns
                // (-(insertion_point) - 1). So once we know
                // the insertion point we can find elements
                // Smaller than the searched element by the
                // following calculation
                if (get < 0) get = Math.abs(get) - 1;

                    // If element is found in the array it returns
                    // the index(any index in case of duplicate). So we go to last
                    // index of element which will give  the number of
                    // elements smaller than the number including
                    // the searched element.
                else {
                    while (get < m[i].length && m[i][get] == mid) get += 1;
                }

                place = place + get;
            }

            if (place < desired) min = mid + 1;
            else max = mid;
        }
        System.out.println(min);
    }
}