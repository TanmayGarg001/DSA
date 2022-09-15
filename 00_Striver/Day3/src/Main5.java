//https://leetcode.com/problems/unique-paths/

import java.util.Arrays;

public class Main5 {

    public static int uniquePaths(int m, int n) {//O(n^2),O(n^2)
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

}
