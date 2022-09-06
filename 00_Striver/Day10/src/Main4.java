//https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1#

import java.util.ArrayList;

public class Main4 {

    ArrayList<String> ans = new ArrayList<>();

    public ArrayList<String> findPath(int[][] m, int n) {
        int[][] visited = new int[n][n];
        findAllPaths(m, 0, 0, "", visited);
        return ans;
    }

    public void findAllPaths(int[][] m, int row, int col, String op, int[][] visited) {
        if (row < 0 || col < 0 || row >= m.length || col >= m.length || m[row][col] == 0 || visited[row][col] == 1) {
            return;
        }
        if (row == m.length - 1 && col == m.length - 1) {
            ans.add(op);
            return;
        }
        visited[row][col] = 1;
        findAllPaths(m, row - 1, col, op + "U", visited);
        findAllPaths(m, row + 1, col, op + "D", visited);
        findAllPaths(m, row, col - 1, op + "L", visited);
        findAllPaths(m, row, col + 1, op + "R", visited);
        visited[row][col] = 0;
    }

}
