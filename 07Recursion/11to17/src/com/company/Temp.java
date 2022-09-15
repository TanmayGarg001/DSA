package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Temp {

    public static void main(String[] args) {
        int[] arr = {2, 1, 2};
        System.out.println(AllSubsets(arr, 3));
    }

    public static ArrayList<ArrayList<Integer>> AllSubsets(int arr[], int n) {
        return allSubsets(arr);
    }

    public static ArrayList<ArrayList<Integer>> allSubsets(int arr[]) {
        String input = "";
        for (int i : arr) {
            input = input + arr[i];
        }
        ArrayList<String> ans = new ArrayList<>();
        solveAns(input, "", ans);
        Collections.sort(ans);
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for (int i = 0; i < ans.size(); i++) {
            char[] temp = ans.get(i).toCharArray();
            int[] t = new int[temp.length];
            for (int j = 0; j < temp.length; j++) {
                t[j] = Character.getNumericValue(temp[j]);
            }
            ArrayList<Integer> tal = new ArrayList<>();
            for (int a = 0; a < t.length; a++) {
                tal.add(t[a]);
            }
            al.add(tal);
        }
        return al;
    }

    public static void solveAns(String input, String output, ArrayList<String> ans) {
        if (input.length() == 0) {
            char[] temp = output.toCharArray();
            Arrays.sort(temp);
            String s = String.valueOf(temp);
            if (!ans.contains(s)) {
                ans.add(s);
            }
            return;
        }
        String op = output;
        op = op + input.charAt(0);
        input = input.substring(1);
        solveAns(input, output, ans);
        solveAns(input, op, ans);

    }


}
