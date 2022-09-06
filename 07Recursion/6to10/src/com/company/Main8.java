package com.company;

public class Main8 {
    //tower of hanoi
    //http://ianparberry.com/TowersOfHanoi/index64.html

    public static void main(String[] args) {
        towerOfHanoi(2, 1, 2, 3);
        System.out.println("=====");
        System.out.println(toh(2, 1, 2, 3));
    }

    public static void towerOfHanoi(int numberOfDisks, int source, int helper, int destination) {
        if (numberOfDisks == 1) {
            System.out.println("Disk " + numberOfDisks + " moved from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(numberOfDisks - 1, source, destination, helper);
        System.out.println("Disk " + numberOfDisks + " moved from " + source + " to " + destination);
        towerOfHanoi(numberOfDisks - 1, helper, source, destination);
    }

    public static int toh(int n, int source, int destination, int helper) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            System.out.println("move disk " + n + " from rod " + source + " to rod " + destination);
            return 1;
        }
        toh(n - 1, source, helper, destination);
        System.out.println("move disk " + n + " from rod " + source + " to rod " + destination);
        toh(n - 1, helper, destination, source);
        return (int) (Math.pow(2, n) - 1);
    }

}
