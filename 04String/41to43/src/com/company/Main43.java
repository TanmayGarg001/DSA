<<<<<<< HEAD
//43.Given a list of word lists, print all sentences possible taking one word from a list at a time via recursion.
package com.company;

public class Main43 {

    public static void main(String[] args) {
        String[][] grid = {{"you", "we"}, {"have", "are"}, {"sleep", "eat", "drink"}};
        approach1(grid);
    }

    public static void approach1(String[][] grid) {
        //Similar to DFS in graph.
        //TC = O(),MC = O(n)
        String[] output = new String[grid.length];
        for (int i = 0; i < grid[0].length; i++) {
            if (grid[0][i] != "") {
                printUtil(grid, 0, i, output);
            }
        }
    }

    static void printUtil(String[][] arr, int m, int n, String[] output) {
        output[m] = arr[m][n];
        if (m == arr.length - 1) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < arr[0].length; i++) {
            if (arr[m + 1][i] != "" && m < arr[0].length) {
                printUtil(arr, m + 1, i, output);
            }
        }
    }

}
=======
//43.Given a list of word lists, print all sentences possible taking one word from a list at a time via recursion.
package com.company;

public class Main43 {

    public static void main(String[] args) {
        String[][] grid = {{"you", "we"}, {"have", "are"}, {"sleep", "eat", "drink"}};
        approach1(grid);
    }

    public static void approach1(String[][] grid) {
        //Similar to DFS in graph.
        //TC = O(),MC = O(n)
        String[] output = new String[grid.length];
        for (int i = 0; i < grid[0].length; i++) {
            if (grid[0][i] != "") {
                printUtil(grid, 0, i, output);
            }
        }
    }

    static void printUtil(String[][] arr, int m, int n, String[] output) {
        output[m] = arr[m][n];
        if (m == arr.length - 1) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < arr[0].length; i++) {
            if (arr[m + 1][i] != "" && m < arr[0].length) {
                printUtil(arr, m + 1, i, output);
            }
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
