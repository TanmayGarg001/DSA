package com.company;

public class Main9 {
    //You are given a string. You need to print the lexicographically sorted power-set of the string.
    //print all possible combinations of a string.

    public static void main(String[] args) {
        printPowerSet("abc");
    }

    public static void printPowerSet(String s) {
        printAllSubSets(s, "");
    }

    public static void printAllSubSets(String input, String output) {
        if (input.length() == 0) {
            System.out.print(output + " ");
            return;
        }
        String temp2 = output;
        temp2 = temp2 + input.charAt(0);
        input = input.substring(1);
        printAllSubSets(input, output);
        printAllSubSets(input, temp2);

    }

}
