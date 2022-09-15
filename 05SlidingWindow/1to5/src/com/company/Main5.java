package com.company;

public class Main5 {

    public static void main(String[] args) {
        int[] s = {15, 29, -54, 560, 4, -4, 0, 78, 485, 420, 100};
        temp(s);
    }

    public static void temp(int[] arr) {
        int max = arr[0];
        int max2 = max;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println(max + "////" + max2);
    }

}
