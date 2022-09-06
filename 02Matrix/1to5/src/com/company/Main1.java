<<<<<<< HEAD
//1.Given a matrix of size r*c. Traverse the matrix in spiral form.
package com.company;

import java.util.ArrayList;

public class Main1 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        approach1(matrix, 4, 4);
    }

    public static void approach1(int[][] matrix, int rowEnd, int colEnd) {
        //TC = O(n*m),MC = O(n*m)
        //This can't really be optimised in terms of time, tho to reduce space we can just print the output instead of adding to ArrayList.
        //It's pretty basic if you think about it, in each spiral path the bounds of the matrix gets smaller,
        //So we set 4 virtual pointers, rowStart,rowEnd,ColStart,colEnd which keeps track of the matrix restrictions and keep printing accordingly.
        ArrayList<Integer> al = new ArrayList<>();
        int colStart = 0;
        int rowStart = 0;

        while (rowStart < rowEnd && colStart < colEnd) {
            for (int i = colStart; i < colEnd; i++) {
                al.add(matrix[rowStart][i]);
            }
            rowStart++;

            for (int i = rowStart; i < rowEnd; i++) {
                al.add(matrix[i][colEnd - 1]);
            }
            colEnd--;

            if (rowStart < rowEnd) {
                for (int i = colEnd - 1; i >= colStart; i--) {
                    al.add(matrix[rowEnd - 1][i]);
                }
                rowEnd--;
            }
            if (colStart < colEnd) {
                for (int i = rowEnd - 1; i >= rowStart; i--) {
                    al.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }
        System.out.println(al);
    }

}
=======
//1.Given a matrix of size r*c. Traverse the matrix in spiral form.
package com.company;

import java.util.ArrayList;

public class Main1 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        approach1(matrix, 4, 4);
    }

    public static void approach1(int[][] matrix, int rowEnd, int colEnd) {
        //TC = O(n*m),MC = O(n*m)
        //This can't really be optimised in terms of time, tho to reduce space we can just print the output instead of adding to ArrayList.
        //It's pretty basic if you think about it, in each spiral path the bounds of the matrix gets smaller,
        //So we set 4 virtual pointers, rowStart,rowEnd,ColStart,colEnd which keeps track of the matrix restrictions and keep printing accordingly.
        ArrayList<Integer> al = new ArrayList<>();
        int colStart = 0;
        int rowStart = 0;

        while (rowStart < rowEnd && colStart < colEnd) {
            for (int i = colStart; i < colEnd; i++) {
                al.add(matrix[rowStart][i]);
            }
            rowStart++;

            for (int i = rowStart; i < rowEnd; i++) {
                al.add(matrix[i][colEnd - 1]);
            }
            colEnd--;

            if (rowStart < rowEnd) {
                for (int i = colEnd - 1; i >= colStart; i--) {
                    al.add(matrix[rowEnd - 1][i]);
                }
                rowEnd--;
            }
            if (colStart < colEnd) {
                for (int i = rowEnd - 1; i >= rowStart; i--) {
                    al.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }
        System.out.println(al);
    }

}
>>>>>>> 26b1aac (Final Commit_1)
