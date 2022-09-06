<<<<<<< HEAD
//11.A car factory has two assembly lines, each with n stations. A station is denoted by Si,j where i is either 1 or 2 and indicates the assembly line the
//station is on, and j indicates the number of the station. The time taken per station is denoted by ai,j. Each station is dedicated to some sort of work like
//engine fitting, body fitting, painting, and so on. So, a car chassis must pass through each of the n stations in order before exiting the factory. The parallel
//stations of the two assembly lines perform the same task. After it passes through station Si,j, it will continue to station Si,j+1 unless it decides to transfer
//to the other line. Continuing on the same line incurs no extra cost, but transferring from line i at station j – 1 to station j on the other line takes time ti,j.
//Each assembly line takes an entry time ei and exit time xi which may be different for the two lines. Give an algorithm for computing the minimum time it will take
//to build a car chassis
package com.company;

public class Main11 {

    public static void main(String[] args) {
        int[][] a = {{4, 5, 3, 2}, {2, 10, 1, 4}};
        int[][] t = {{0, 7, 4, 5}, {0, 9, 2, 8}};
        int[] e = {10, 12};
        int[] x = {18, 7};
        System.out.println(assemblyLineScheduling(a, t, e, x));
    }

    public static int assemblyLineScheduling(int[][] a, int[][] t, int[] e, int[] x) {
        //TC = O(n),MC = O(n^2)
        int[] t1 = new int[a[0].length];
        int[] t2 = new int[a[0].length];
        t1[0] = e[0] + a[0][0];//time taken to enter and do the very 1st task of assemblyLine1
        t2[0] = e[1] + a[1][0];//time taken to enter and do the very 1st task of assemblyLine1
        for (int i = 1; i < a[0].length; i++) {
            t1[i] = Math.min(a[0][i] + t1[i - 1], t2[i - 1] + t[1][i] + a[0][i]);
            //minimum among the line which is in the same continuous line or the line which is shifted from line 2 to line 1.
            t2[i] = Math.min(a[1][i] + t2[i - 1], t1[i - 1] + t[0][i] + a[1][i]);
            //minimum among the line which is in the same continuous line or the line which is shifted from line 1 to line 2.
        }
        return Math.min(t1[a[0].length - 1] + x[0], t2[a[0].length - 1] + x[1]);
    }

}
=======
//11.A car factory has two assembly lines, each with n stations. A station is denoted by Si,j where i is either 1 or 2 and indicates the assembly line the
//station is on, and j indicates the number of the station. The time taken per station is denoted by ai,j. Each station is dedicated to some sort of work like
//engine fitting, body fitting, painting, and so on. So, a car chassis must pass through each of the n stations in order before exiting the factory. The parallel
//stations of the two assembly lines perform the same task. After it passes through station Si,j, it will continue to station Si,j+1 unless it decides to transfer
//to the other line. Continuing on the same line incurs no extra cost, but transferring from line i at station j – 1 to station j on the other line takes time ti,j.
//Each assembly line takes an entry time ei and exit time xi which may be different for the two lines. Give an algorithm for computing the minimum time it will take
//to build a car chassis
package com.company;

public class Main11 {

    public static void main(String[] args) {
        int[][] a = {{4, 5, 3, 2}, {2, 10, 1, 4}};
        int[][] t = {{0, 7, 4, 5}, {0, 9, 2, 8}};
        int[] e = {10, 12};
        int[] x = {18, 7};
        System.out.println(assemblyLineScheduling(a, t, e, x));
    }

    public static int assemblyLineScheduling(int[][] a, int[][] t, int[] e, int[] x) {
        //TC = O(n),MC = O(n^2)
        int[] t1 = new int[a[0].length];
        int[] t2 = new int[a[0].length];
        t1[0] = e[0] + a[0][0];//time taken to enter and do the very 1st task of assemblyLine1
        t2[0] = e[1] + a[1][0];//time taken to enter and do the very 1st task of assemblyLine1
        for (int i = 1; i < a[0].length; i++) {
            t1[i] = Math.min(a[0][i] + t1[i - 1], t2[i - 1] + t[1][i] + a[0][i]);
            //minimum among the line which is in the same continuous line or the line which is shifted from line 2 to line 1.
            t2[i] = Math.min(a[1][i] + t2[i - 1], t1[i - 1] + t[0][i] + a[1][i]);
            //minimum among the line which is in the same continuous line or the line which is shifted from line 1 to line 2.
        }
        return Math.min(t1[a[0].length - 1] + x[0], t2[a[0].length - 1] + x[1]);
    }

}
>>>>>>> 26b1aac (Final Commit_1)
