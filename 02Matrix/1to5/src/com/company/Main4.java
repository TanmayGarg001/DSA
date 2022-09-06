<<<<<<< HEAD
//4.Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.
//Basically, print the row number with maximum number of ones.
package com.company;

public class Main4 {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1, 1}, {0, 0, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}};
        System.out.println(approach1(matrix, 4, 4));
    }

    public static int approach1(int[][] matrix, int rows, int columns) {
        //TC = O(n+m), MC = O(1)
        //This approach is very smart, we will always update the maxRowIndex if while's condition is fulfilled
        //but the condition is written in a way such that it would always result in increment of number of ones.
        int j = columns - 1;
        int maxRowIndex = -1;
        for (int i = 0; i < rows; i++) {
            while (j >= 0 && matrix[i][j] == 1) {
                j--;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
    }

}
=======
//4.Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.
//Basically, print the row number with maximum number of ones.
package com.company;

public class Main4 {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1, 1}, {0, 0, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}};
        System.out.println(approach1(matrix, 4, 4));
    }

    public static int approach1(int[][] matrix, int rows, int columns) {
        //TC = O(n+m), MC = O(1)
        //This approach is very smart, we will always update the maxRowIndex if while's condition is fulfilled
        //but the condition is written in a way such that it would always result in increment of number of ones.
        int j = columns - 1;
        int maxRowIndex = -1;
        for (int i = 0; i < rows; i++) {
            while (j >= 0 && matrix[i][j] == 1) {
                j--;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
    }

}
>>>>>>> 26b1aac (Final Commit_1)
