<<<<<<< HEAD
//2.Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
//Integers in each row are sorted from left to right.
//The first integer of each row is greater than the last integer of the previous row.
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        approach1(matrix, 11);
        System.out.println(approach2(matrix, 11));
    }

    public static void approach1(int[][] matrix, int target) {
        //TC = O(n^2),MC = O(n)//here n is the number of elements in the matrix
        //Can be optimized by adding if condition instead of adding to them to arrayList.
        //Keep adding all the elements of the matrix to ArrayList and at last find the target element using binarySearch, as it is provided that array is sorted.
        ArrayList<Integer> al = new ArrayList<>();
        int columns = matrix[0].length;
        int rows = matrix.length;
        int i = 0;
        int j = 0;
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
        int ans = Collections.binarySearch(al, target);
        if (ans >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean approach2(int[][] matrix, int target) {
        //TC=O(logn),MC=O(1)
        //This is faster than above approach.But does somewhat similar stuff.
        int l = 0;
        int r = matrix.length * matrix[0].length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            int i = mid / matrix[0].length;
            int j = mid % matrix[0].length;
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }
}
=======
//2.Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
//Integers in each row are sorted from left to right.
//The first integer of each row is greater than the last integer of the previous row.
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        approach1(matrix, 11);
        System.out.println(approach2(matrix, 11));
    }

    public static void approach1(int[][] matrix, int target) {
        //TC = O(n^2),MC = O(n)//here n is the number of elements in the matrix
        //Can be optimized by adding if condition instead of adding to them to arrayList.
        //Keep adding all the elements of the matrix to ArrayList and at last find the target element using binarySearch, as it is provided that array is sorted.
        ArrayList<Integer> al = new ArrayList<>();
        int columns = matrix[0].length;
        int rows = matrix.length;
        int i = 0;
        int j = 0;
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
        int ans = Collections.binarySearch(al, target);
        if (ans >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean approach2(int[][] matrix, int target) {
        //TC=O(log(n*m)),MC=O(1)
        //This is faster than above approach.But does somewhat similar stuff.
        int l = 0;
        int r = matrix.length * matrix[0].length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            int i = mid / matrix[0].length;
            int j = mid % matrix[0].length;
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }
}
>>>>>>> 26b1aac (Final Commit_1)
