<<<<<<< HEAD
//23.Given a 2-Dimensional character array and a string, we need to find the given string in 2-dimensional character
//array such that individual characters can be present left to right, right to left, top to down or down to top.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main23 {
    //To understand this legendary problem understand Main24 code's.
    public static void main(String[] args) {
        char[][] grid = {{'a', 'b', 'a', 'b'}, {'a', 'b', 'e', 'b'}, {'e', 'b', 'e', 'b'}};
        System.out.println(approach1(grid, "abe".toCharArray()));
    }

    public static int approach1(char[][] grid, char[] s) {
        //TC = O(n*m*k),MC = O(n)
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == s[0]) {
                    if (search(i, j, grid.length, grid[0].length, grid, s)) {
                        ArrayList<Integer> integers = new ArrayList<>();
                        integers.add(i);
                        integers.add(j);
                        ans.add(integers);
                    }
                }
            }
        }
        return ans.size();
    }

    private static boolean search(int i, int j, int n, int m, char[][] grid, char[] s) {
        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(-1, 0, 1, 1, 1, 0, -1, -1));
        ArrayList<Integer> y = new ArrayList<>(Arrays.asList(1, 1, 1, 0, -1, -1, -1, 0));
        for (int dir = 0; dir < 8; dir++) {
            if (searchInAllDrns(i, j, n, m, s, grid, 0, y.get(dir), x.get(dir))) {
                return true;
            }
        }
        return false;
    }

    private static boolean searchInAllDrns(int i, int j, int n, int m, char[] s, char[][] grid, int index, Integer pos1, Integer pos2) {
        if (index == s.length) {
            return true;
        }
        if (i < 0 || j < 0 || i >= n || j >= m || s[index] != grid[i][j]) {
            return false;
        }
        return searchInAllDrns(i + pos1, j + pos2, n, m, s, grid, index + 1, pos1, pos2);//recursively search in all drns
    }

}
=======
//23.Given a 2-Dimensional character array and a string, we need to find the given string in 2-dimensional character
//array such that individual characters can be present left to right, right to left, top to down or down to top.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main23 {
    //To understand this legendary problem understand Main24 code's.
    public static void main(String[] args) {
        char[][] grid = {{'a', 'b', 'a', 'b'}, {'a', 'b', 'e', 'b'}, {'e', 'b', 'e', 'b'}};
        System.out.println(approach1(grid, "abe".toCharArray()));
    }

    public static int approach1(char[][] grid, char[] s) {
        //TC = O(n*m*k),MC = O(n)
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == s[0]) {
                    if (search(i, j, grid.length, grid[0].length, grid, s)) {
                        ArrayList<Integer> integers = new ArrayList<>();
                        integers.add(i);
                        integers.add(j);
                        ans.add(integers);
                    }
                }
            }
        }
        return ans.size();
    }

    private static boolean search(int i, int j, int n, int m, char[][] grid, char[] s) {
        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(-1, 0, 1, 1, 1, 0, -1, -1));
        ArrayList<Integer> y = new ArrayList<>(Arrays.asList(1, 1, 1, 0, -1, -1, -1, 0));
        for (int dir = 0; dir < 8; dir++) {
            if (searchInAllDrns(i, j, n, m, s, grid, 0, y.get(dir), x.get(dir))) {
                return true;
            }
        }
        return false;
    }

    private static boolean searchInAllDrns(int i, int j, int n, int m, char[] s, char[][] grid, int index, Integer pos1, Integer pos2) {
        if (index == s.length) {
            return true;
        }
        if (i < 0 || j < 0 || i >= n || j >= m || s[index] != grid[i][j]) {
            return false;
        }
        return searchInAllDrns(i + pos1, j + pos2, n, m, s, grid, index + 1, pos1, pos2);//recursively search in all drns
    }

}
>>>>>>> 26b1aac (Final Commit_1)
