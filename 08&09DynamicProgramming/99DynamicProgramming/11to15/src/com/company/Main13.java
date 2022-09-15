<<<<<<< HEAD
//13.Given an integer N denoting the Length of a line segment. You need to cut the line segment in such a way that the cut length of a line segment each time
//is either x , y or z. Here x, y, and z are integers. After performing all the cut operations, your total number of cut segments must be maximum.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main13 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[][] t = new int[4][10006];

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (i == 0) {
                    t[i][j] = 0;
                } else if (j == 0) {
                    t[i][j] = 1;
                } else {
                    t[i][j] = -1;
                }
            }
        }
        System.out.print("Enter the number of test cases: ");
        int tc = Integer.parseInt(br.readLine());
        testCases(tc);
    }

    public static void testCases(int tc) throws IOException {
        for (int i = 0; i < tc; i++) {
            System.out.print("Enter the length of line segment: ");
            int w = Integer.parseInt(br.readLine());
            System.out.print("Enter the x,y and z: ");
            String[] s = br.readLine().split(" ");
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(s[0]);
            arr[1] = Integer.parseInt(s[1]);
            arr[2] = Integer.parseInt(s[2]);
            System.out.println("=====");
            System.out.println(approach1(arr, w, 3));
        }
    }

    private static int approach1(int[] arr, int w, int n) {
        if (t[n][w] != -1) {
            return t[n][w];
        }
        if (arr[n - 1] <= w) {
            return t[n][w] = Math.max(1 + approach1(arr, w - arr[n - 1], n), approach1(arr, w, n - 1));
        } else {
            return t[n][w] = approach1(arr, w, n - 1);
        }
    }

=======
//13.Given an integer N denoting the Length of a line segment. You need to cut the line segment in such a way that the cut length of a line segment each time
//is either x , y or z. Here x, y, and z are integers. After performing all the cut operations, your total number of cut segments must be maximum.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main13 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[][] t = new int[4][10006];

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (i == 0) {
                    t[i][j] = 0;
                } else if (j == 0) {
                    t[i][j] = 1;
                } else {
                    t[i][j] = -1;
                }
            }
        }
        System.out.print("Enter the number of test cases: ");
        int tc = Integer.parseInt(br.readLine());
        testCases(tc);
    }

    public static void testCases(int tc) throws IOException {
        for (int i = 0; i < tc; i++) {
            System.out.print("Enter the length of line segment: ");
            int w = Integer.parseInt(br.readLine());
            System.out.print("Enter the x,y and z: ");
            String[] s = br.readLine().split(" ");
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(s[0]);
            arr[1] = Integer.parseInt(s[1]);
            arr[2] = Integer.parseInt(s[2]);
            System.out.println("=====");
            System.out.println(approach1(arr, w, 3));
        }
    }

    private static int approach1(int[] arr, int w, int n) {
        if (t[n][w] != -1) {
            return t[n][w];
        }
        if (arr[n - 1] <= w) {
            return t[n][w] = Math.max(1 + approach1(arr, w - arr[n - 1], n), approach1(arr, w, n - 1));
        } else {
            return t[n][w] = approach1(arr, w, n - 1);
        }
    }

>>>>>>> 26b1aac (Final Commit_1)
}