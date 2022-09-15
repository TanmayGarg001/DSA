package com.company;

import java.util.Arrays;

public class Main3 {

    static int[][] t = new int[1002][1002];//memo-matrix

    public static void main(String[] args) {
        //Weight : 1 3 4 5
        //Value  : 1 4 5 7
        //Calculate max profit.given bag cap. = 7

        for (int[] row : t) {
            Arrays.fill(row, -1);//now matrix is initialized by -1;
        }
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 5, 7};
        System.out.println(knapsackMemo(arr1, arr2, 8, 4));
    }
    //here we will make a matrix (somewhat similar to Top-down but approach is totally diff) for only those parameters which are changing in the recursive code
    //We make a matrix of order n*m. Here n,m should be variable like :-
    //As you can see above only cap and n are changing we are never messing with wt[] or val[].
    //So we have to make matrix for only those variables which are changing in recursive code.
    //In this we will make matrix of n+1 and w+1, where w is capacity and n is array pointer that changes.
    //+1 is because we want our matrix to be n*w,in order to store till n and w. So by adding 1 we guarantee that. else it would be if n-1 and w-1;
    //now initialize that whole matrix by -1; //or depending on the question generally its -1.
    //https://www.geeksforgeeks.org/print-2-d-array-matrix-java/
    //https://stackoverflow.com/questions/7118178/arrays-fill-with-multidimensional-array-in-java

    //Use arrays.deepToString to print a 2d matrix and a simple for each loop in each row to initialize the matrix to desired value.
    //        int[][] matrix = {{1, 2, 3, 4},
    //                {5, 6, 7, 8},
    //                {9, 10, 11, 12}};
    //        System.out.println(Arrays.deepToString(matrix));
    //        for (int[] row: matrix){
    //            Arrays.fill(row,-1);
    //        }
    //        System.out.println(Arrays.deepToString(matrix));

    //Now if you think about it this matrix will store recursive calls outputs in a 2d matrix, and we locate the desired call by n,m index
    //This will optimize the time complexity a lot.
    //What we can do now is before making any recursive call we'll check if the result already exists in our memo matrix, if it does than we'll use that only
    //else we will call the recursive function which in turn will call other recursive functions inside it but whose results will already be present in our matrix!
    //It's totally like a magic.
    //in order to achieve this make a global static matrix.We can make that in function to but that's a pain in the ass.
    //And the size of matrix will be according to the constraints given in the question.
    //In our question it is provided that n and w are <=1000. We will make matrix of 1002*1002 for safety.and initialize it by -1.
    //After that all that left is a little modification in recursive code and BOOM!
    //PROBLEM SOLVED!

    public static int knapsackMemo(int[] wt, int[] val, int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (t[w][n] != -1) {
            return t[w][n];
        }
        if (w >= wt[n - 1]) {
            return t[w][n] = Math.max(val[n - 1] + knapsackMemo(wt, val, w - wt[n - 1], n - 1), knapsackMemo(wt, val, w, n - 1));
        }
        if (w < wt[n - 1]) {
            return t[w][n] = knapsackMemo(wt, val, w, n - 1);
        }
        return -1;
    }

}
