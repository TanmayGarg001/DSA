//A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.
//A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j  is set to 1 it means ith person knows jth person.
//Here M[i][i] will always be 0.
//https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1#
package com.company;

import java.util.Stack;

public class Main8 {

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1, 0}, {0, 0, 1, 0}, {1, 1, 0, 1}, {0, 1, 0, 0}};
        System.out.println(celebrity(matrix));
    }

    public static int celebrity(int[][] matrix) {
        //TC= O(n),MC = O(n)
        //We use the fact that celeb is the one who knows no one but is known by everybody
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < matrix.length; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {
            int i = stack.pop();
            int j = stack.pop();
            if (matrix[i][j] == 1) {
                stack.push(j);//i knows j so i must not be a celeb
            } else {
                stack.push(i);
            }
        }
        int celeb = stack.peek();
        int countCelebKnows = 0;
        int countPeople = 0;
        //Now we check the whole column and row for celeb to confirm if he/she is a celeb or not
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[celeb][i] == 0) {
                countCelebKnows++;
            }
            if (matrix[i][celeb] == 1) {
                countPeople++;
            }
        }
        return countCelebKnows == countPeople + 1 ? celeb : -1;
    }

}
