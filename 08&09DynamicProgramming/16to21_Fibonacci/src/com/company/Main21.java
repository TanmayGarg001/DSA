package com.company;

//https://leetcode.com/problems/unique-paths/
//https://leetcode.com/problems/unique-paths-ii/

import java.util.Arrays;

public class Main21 {

    public static void main(String[] args) {
        int[][] obsGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(uniquePaths(3, 7));
        System.out.println(uniquePathsWithObstacles(obsGrid));
    }

    //Without obstacles:
    public static int uniquePaths(int m, int n) {
        int[][] t = new int[m + 1][n + 1];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        return solve(m, n, t);
    }

    public static int solve(int m, int n, int[][] t) {
        if (m == 1 || n == 1) {
            return t[m][n] = 1;
        }
        if (t[m][n] != -1) {
            return t[m][n];
        }
        return t[m][n] = solve(m, n - 1, t) + solve(m - 1, n, t);
    }

    //With obstacles:
    public static int uniquePathsWithObstacles(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[][] t = new int[r][c];
        return solve(grid, 0, 0, r, c, t);
    }

    public static int solve(int[][] grid, int r, int c, int m, int n, int[][] t) {
        if (r == m || c == n || grid[r][c] == 1) {
            return 0;
        }
        if (r == m - 1 && c == n - 1) {
            if (grid[r][c] == 1) {
                return 0;
            }
            return 1;
        }
        if (t[r][c] != 0) {
            return t[r][c];
        }
        return t[r][c] = solve(grid, r + 1, c, m, n, t) + solve(grid, r, c + 1, m, n, t);
    }

}
