<<<<<<< HEAD
//10.Given a gold mine called M of (n x m) dimensions. Each field in this mine contains a positive integer which is the amount of gold in tons.
//Initially the miner can start from any row in the first column. From a given cell, the miner can move
//to the cell diagonally up towards the right, to the right, to the cell diagonally down towards the right
//Find out maximum amount of gold which he can collect.
package com.company;

public class Main10 {

    public static void main(String[] args) {
        int[][] temp = {{1, 3, 3}, {2, 1, 4}, {0, 6, 4}};
        System.out.println(approach1(temp, 3, 3));
    }

    public static int approach1(int[][] grid, int n, int m) {
        //TC = O(n*m),MC = O(n*m)
        //the first column will have all the possible max paths possible stored in it.
        int[][] t = new int[n][m];
        for (int j = m - 1; j >= 0; j--) {//starts from extreme right
            for (int i = 0; i < n; i++) {//starts from top row
                //in every move we check right column, and we keep doing that till column 0
                int right = (j == m - 1) ? 0 : t[i][j + 1];
                int rightUp = (j == m - 1 || i == 0) ? 0 : t[i - 1][j + 1];
                int rightDown = (j == m - 1 || i == n - 1) ? 0 : t[i + 1][j + 1];
                t[i][j] = grid[i][j] + Math.max(right, Math.max(rightDown, rightUp));//stores the max value in each iteration
            }
        }
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            ans = Math.max(ans, t[i][0]);
        }
        return ans;
    }

}
=======
//10.Given a gold mine called M of (n x m) dimensions. Each field in this mine contains a positive integer which is the amount of gold in tons.
//Initially the miner can start from any row in the first column. From a given cell, the miner can move
//to the cell diagonally up towards the right, to the right, to the cell diagonally down towards the right
//Find out maximum amount of gold which he can collect.
package com.company;

public class Main10 {

    public static void main(String[] args) {
        int[][] temp = {{1, 3, 3}, {2, 1, 4}, {0, 6, 4}};
        System.out.println(approach1(temp, 3, 3));
    }

    public static int approach1(int[][] grid, int n, int m) {
        //TC = O(n*m),MC = O(n*m)
        //the first column will have all the possible max paths possible stored in it.
        int[][] t = new int[n][m];
        for (int j = m - 1; j >= 0; j--) {//starts from extreme right
            for (int i = 0; i < n; i++) {//starts from top row
                //in every move we check right column, and we keep doing that till column 0
                int right = (j == m - 1) ? 0 : t[i][j + 1];
                int rightUp = (j == m - 1 || i == 0) ? 0 : t[i - 1][j + 1];
                int rightDown = (j == m - 1 || i == n - 1) ? 0 : t[i + 1][j + 1];
                t[i][j] = grid[i][j] + Math.max(right, Math.max(rightDown, rightUp));//stores the max value in each iteration
            }
        }
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            ans = Math.max(ans, t[i][0]);
        }
        return ans;
    }

}
>>>>>>> 26b1aac (Final Commit_1)
