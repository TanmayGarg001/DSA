//10.Given an m x n matrix, find all common elements present in all rows in O(mn) time.
package com.company;

import java.util.HashSet;

public class Main10 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 1, 4, 8}, {3, 7, 8, 5, 1}, {8, 7, 7, 3, 1}, {8, 1, 2, 7, 9},};
        approach1(matrix);
    }

    public static void approach1(int[][] matrix) {
        //TC = O(n*m),MC = O(n)
        //Make hashSets find intersection of first 2 and then just retain the new row of the matrix.
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for (int i = 0; i < matrix[0].length; i++) {
            hs1.add(matrix[0][i]);
            hs2.add(matrix[1][i]);
        }
        hs1.retainAll(hs2);

        HashSet<Integer> hs3 = new HashSet<>();
        for (int i = 2; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                hs3.add(matrix[i][j]);
            }
            hs1.retainAll(hs3);
            hs3.clear();
        }
        System.out.println(hs1);
    }

}