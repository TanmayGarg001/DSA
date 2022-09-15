package com.company;

import java.util.Arrays;

public class Main16 {
//https://www.youtube.com/watch?v=VS0BcOiKaGI&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=20
//Given an n x n matrix and a number x, find the position of x in the matrix if it is present in it. Otherwise, print “Not Found”.
//In the given matrix, every row and column is sorted in increasing order. The designed algorithm should have linear time complexity.

    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        binarySearchIn2d(arr, 20);
        System.out.println();
        binarySearchIn2d(arr, 35);
        System.out.println();
        binarySearchIn2d(arr, 37);
        System.out.println();
        binarySearchIn2d(arr, 39);
        System.out.println();
        binarySearchIn2d(arr, 100);
    }

    public static void binarySearchIn2d(int[][] mat, int key) {
        int[] ans = {-1, -1};
        int i = 0;
        int j = mat.length - 1;
        while (i < mat.length && j >= 0) {
            if (mat[i][j] == key) {
                ans[0] = i;
                ans[1] = j;
                System.out.println(Arrays.toString(ans));
                return;
            }
            if (mat[i][j] > key)
                j--;
            else
                i++;
        }
        System.out.println(Arrays.toString(ans));
    }

    public static boolean binarySearchIn2dFast(int[][] matrix, int target) {//whole is sorted
        int low = 0;
        int high = (matrix.length * matrix[0].length) - 1;
        while (high >= low) {
            int mid = low + ((high - low) / 2);
            int x = mid / matrix[0].length;
            int y = mid % matrix[0].length;
            if (matrix[x][y] == target) {
                return true;
            } else if (matrix[x][y] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

}