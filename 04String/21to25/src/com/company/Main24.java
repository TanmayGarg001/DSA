<<<<<<< HEAD
//24.Given a 2D grid of n*m of characters and a word, find all occurrences of given word in grid. A word can be matched in all 8 directions at any point.
//Word is said be found in a direction if all characters match in this direction (not in zigzag form). The 8 directions are, horizontally left,
//horizontally right, vertically up, vertically down and 4 diagonal directions.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main24 {

    public static void main(String[] args) {
        char[][] grid = {{'a', 'b', 'c'}, {'d', 'r', 'f'}, {'g', 'h', 'i'}};
        System.out.println(approach1(grid, "abc".toCharArray()));
        char[][] grid2 = {{'a', 'b', 'a', 'b'}, {'a', 'b', 'e', 'b'}, {'e', 'b', 'e', 'b'}};
        System.out.println(approach1(grid2, "abe".toCharArray()));
    }

    public static ArrayList<ArrayList<Integer>> approach1(char[][] grid, char[] s) {
        //TC = O(n*m*k),MC = O(n)//TC might seem n^4, but it's not coz 8 is constant and there are only 8(k) directions
        //This is probably the toughest question till now or maybe till ever.
        //think of it as a 2-d plane where the word we have to find must be in series of 8 possible directions (see the image)
        //if we find the 1st character of the string at a position then we start searching in every direction from the current position.
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
        int[][] ret = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < 2; j++) {
                ret[i][j] = ans.get(i).get(j);
            }
        }
        for (int[] r : ret) {
            System.out.print(Arrays.toString(r) + " ");
        }
        return ans;
    }

    private static boolean search(int i, int j, int n, int m, char[][] grid, char[] s) {
        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(-1, 0, 1, 1, 1, 0, -1, -1));//all the co-ordinates from a direction
        ArrayList<Integer> y = new ArrayList<>(Arrays.asList(1, 1, 1, 0, -1, -1, -1, 0));//all the co-ordinates from a direction
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
        return searchInAllDrns(i + pos1, j + pos2, n, m, s, grid, index + 1, pos1, pos2);
    }

}
=======
//24.Given a 2D grid of n*m of characters and a word, find all occurrences of given word in grid. A word can be matched in all 8 directions at any point.
//Word is said be found in a direction if all characters match in this direction (not in zigzag form). The 8 directions are, horizontally left,
//horizontally right, vertically up, vertically down and 4 diagonal directions.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main24 {

    public static void main(String[] args) {
        char[][] grid = {{'a', 'b', 'c'}, {'d', 'r', 'f'}, {'g', 'h', 'i'}};
        System.out.println(approach1(grid, "abc".toCharArray()));
        char[][] grid2 = {{'a', 'b', 'a', 'b'}, {'a', 'b', 'e', 'b'}, {'e', 'b', 'e', 'b'}};
        System.out.println(approach1(grid2, "abe".toCharArray()));
    }

    public static ArrayList<ArrayList<Integer>> approach1(char[][] grid, char[] s) {
        //TC = O(n*m*k),MC = O(n)//TC might seem n^4, but it's not coz 8 is constant and there are only 8(k) directions
        //This is probably the toughest question till now or maybe till ever.
        //think of it as a 2-d plane where the word we have to find must be in series of 8 possible directions (see the image)
        //if we find the 1st character of the string at a position then we start searching in every direction from the current position.
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
        return ans;
    }

    private static boolean search(int i, int j, int n, int m, char[][] grid, char[] s) {
        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(-1, 0, 1, 1, 1, 0, -1, -1));//all the co-ordinates from a direction
        ArrayList<Integer> y = new ArrayList<>(Arrays.asList(1, 1, 1, 0, -1, -1, -1, 0));//all the co-ordinates from a direction
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
        return searchInAllDrns(i + pos1, j + pos2, n, m, s, grid, index + 1, pos1, pos2);
    }

}
>>>>>>> 26b1aac (Final Commit_1)
