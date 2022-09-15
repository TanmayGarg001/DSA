//5.Given an NxN matrix Mat. Sort all elements of the matrix.
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main5 {

    public static void main(String[] args) {
        int[][] matrix = {{10, 205, -30, 40}, {15, 25, 12, 10}, {-27, 29, -37, 48}, {32, 133, 39, 250}};
        approach1(4, matrix);
    }

    public static void approach1(int n, int[][] matrix) {
        //TC = O(n^2),MC = O(n^2)
        //Make an arraylist of the matrix sort the arrayList and re-write the arrayList to matrix or print the arrayList as required.
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;
        int j = 0;
        int temp = 0;

        while (temp < n * n) {
            al.add(matrix[i][j]);
            j++;
            if (j == n) {
                i++;
                j = 0;
            }
            temp++;
        }

        Collections.sort(al);
        System.out.println(al);

        i = 0;
        j = 0;
        temp = 0;
        while (temp < n * n) {
            matrix[i][j] = al.get(temp);
            j++;
            if (j == n) {
                i++;
                j = 0;
            }
            temp++;
        }

    }

}