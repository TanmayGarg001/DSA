//4.You are given a number N. Find the total count of set bits for all numbers from 1 to N(both inclusive).
//https://www.geeksforgeeks.org/count-total-set-bits-in-all-numbers-from-1-to-n/
package com.compnay;

public class Main4 {

    public static void main(String[] args) {
        System.out.println(approach1(8741));
        System.out.println(approach2(8741));
        System.out.println(approach3(8741));
    }

    public static int approach1(int n) {
        //TC = O(n*logn),MC = O(1)
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int x = i;
            while (x != 0) {
                x = x & x - 1;
                count++;
            }
            ans = ans + count;
        }
        return ans;
    }

    public static int approach2(int n) {
        //TC = O(n),MC = O(1)
        //Keep looping and add all bitCounts from 1ton and then return it.
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = ans + Integer.bitCount(i);
        }
        return ans;
    }

    public static int approach3(int n) {
        //TC = O(logn),MC = O(1)
        if (n == 0) {
            return 0;
        }
        int floorPowerOf2FromN = (int) (Math.log(n) / Math.log(2));//nearest lowest 2's power of n number.Example for n=60, it will be 32,hence ans = 5.
        int decimalEquivOfFPFN = (int) (Math.pow(2, floorPowerOf2FromN));//here FPFN is =  floorPowerOf2FromN
        floorPowerOf2FromN = (int) (Math.pow(2, floorPowerOf2FromN - 1)) * (floorPowerOf2FromN);//real count of set bits till that 2th power
        int leftIntsToCalc = n - decimalEquivOfFPFN + 1;
        return leftIntsToCalc + floorPowerOf2FromN + approach3(n - decimalEquivOfFPFN);
    }


}