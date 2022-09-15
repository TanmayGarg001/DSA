//26.Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
//I 1//V 5//X 10//L 50//C 100//D 500//M 1000
package com.company;

public class Main26 {

    public static void main(String[] args) {
        approach1("MCMIV");
        approach1("XIV");
    }

    public static void approach1(String s) {
        //TC = O(1),MC = O(1)
        //Store the equivalent values for the roman character in a method and keep comparing the ith character in the string to the i+1st character
        //if ith character is larger than do nothing if it is not then add the i+1st char and subtract ith char.Easy observation.
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = valueRoman(s.charAt(i));
            if (i + 1 < s.length()) {
                int temp2 = valueRoman(s.charAt(i + 1));
                if (temp >= temp2) {
                    ans = ans + temp;
                } else {
                    ans = ans + temp2 - temp;
                    i++;
                }
            } else {
                ans = ans + temp;
            }
        }
        System.out.println(ans);
    }

    public static int valueRoman(char a) {
        return switch (a) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }

}