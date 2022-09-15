package com.company;

public class Main5 {

    //Identification of knapsack problems and induction.
    //https://www.youtube.com/watch?v=iBnWHZmlIyY&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=6
    public static void main(String[] args) {
        System.out.println(toh(3, 1, 3, 2));
    }

    public static long toh(int N, int from, int to, int aux) {
        long totalCount = 0L;
        tohSol(N, from, to, aux, totalCount);
        System.out.println(totalCount);
        return totalCount;
    }

    public static void tohSol(int N, int from, int to, int aux, long totalCount) {
        totalCount++;
        if (N == 1) {
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            return;
        }
        tohSol(N - 1, from, aux, to, totalCount);
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        tohSol(N - 1, aux, to, from, totalCount);
    }


}
