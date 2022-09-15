//8.Rotate an n*n matrix by 90 degree in clockwise direction without using any extra space.
//https://leetcode.com/problems/rotate-image/
//Its one of the best questions related to matrix
package com.company;

public class Main8 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, -1, -10, -11}, {5, 6, 7, 8, -2, -12, -13}, {9, 10, 11, 12, -3, -14, -15}, {13, 14, 15, 16, -4, -16, -17},
                {17, 18, 19, 20, -5, -18, -19}, {21, 22, 23, 24, -6, -20, -21}, {25, 26, 27, 28, -7, -22, -23}};

        int[][] matrix2 = {{2, 29, 20, 26, 16, 28}, {12, 27, 9, 25, 13, 21}, {32, 33, 32, 2, 28, 14}, {13, 14, 32, 27, 22, 26}, {33, 1, 20, 7, 21, 7}, {4, 24, 1, 6, 32, 34}};
        // transposeMatrix(matrix);
        approach1(matrix);
        System.out.println("===============");
        approach1(matrix2);
        System.out.println();
        System.out.println();
        approach2(matrix2);

    }

    public static void approach2(int[][] matrix) {
        //TC = O(n^2), MC = O(1)
        //If we keep swapping the 1st row with last,2nd row with second last and so on, and after that we transpose the matrix we will get the  same result.
        int top = 0;//first row
        int bottom = matrix.length - 1;//last row

        while (top < bottom) {//This code takes care of the 1st part
            int[] temp = matrix[top];
            matrix[top] = matrix[bottom];
            matrix[bottom] = temp;
            top++;
            bottom--;
        }

        for (int i = 0; i < matrix.length; i++) {//this takes care of the transpose part
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        //Prints the matrix
        int rows = matrix.length;
        int columns = matrix[0].length;
        int i = 0;
        int j = 0;
        int temp = 0;

        while (temp < rows * columns) {
            System.out.print(matrix[i][j] + " ");
            j++;
            if (j == columns) {
                j = 0;
                i++;
                System.out.println();
            }
            temp++;
        }

    }

    public static void approach1(int[][] matrix) {
        if (matrix.length == 1) {
            return;
        }
        transposeMatrix(matrix);
        int rows = matrix.length;
        int columns = matrix[0].length;
        int i = 0;
        int j = 0;
        int temp = 0;
        if (columns % 2 == 0) {
            while (temp < rows * columns / 2) {
                int storage = matrix[i][j];
                matrix[i][j] = matrix[i][columns - 1 - j];
                matrix[i][columns - 1 - j] = storage;
                j++;
                if (j == columns / 2) {
                    j = 0;
                    i++;
                }
                temp++;
            }
        } else {
            while (temp < (rows * columns / 2) + columns / 2) {
                int storage = matrix[i][j];
                matrix[i][j] = matrix[i][columns - 1 - j];
                matrix[i][columns - 1 - j] = storage;
                j++;
                if (j == columns / 2 + 1) {
                    j = 0;
                    i++;
                }
                temp++;
            }
        }
        System.out.println("90deg rotated:- ");
        printMatrix(matrix);
    }

    public static void transposeMatrix(int[][] matrix) {
        //TC = O(n^2), MC = O(1)
        //Use copy pen to see, you will easily observe a pattern
        //To solve this basically transpose the whole matrix and then just mirror the whole matrix and BOOM we got the answer.
        //There is one more observation to take care of i.e. Loop has to run (n*n-1)/2 +1 times because if it runs all the way then we will get the original matrix only.
        //So by limiting loop runs we swap only times when necessary and get the desired result just make a 4*4 matrix, and you will understand.
        int rows = matrix.length;
        int columns = matrix[0].length;
        int i = 0;
        int j = 0;
        int temp = 0;
        System.out.println("Original Matrix: ");
        printMatrix(matrix);
        while (temp < ((rows * rows + 1) / 2) + columns / 2) {
            int storage = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = storage;
            j++;
            if (j == columns) {
                i++;
                j = i;
            }
            temp++;
        }
        System.out.println("Transpose Matrix: ");
        printMatrix(matrix);
    }

}