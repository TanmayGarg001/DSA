package com.company;

import java.util.ArrayList;

public class Main10 {
    private static final ArrayList<String> al = new ArrayList<>();

    public static void main(String[] args) {
        powerSet("abac");
        System.out.println(al);
    }

    static void powerSet(String s) {
        ans(s, "");
    }

    static void ans(String input, String output) {
        if (input.length() == 0) {
            al.add(output);
            return;
        }
        String op = output;
        op = op + input.charAt(0);
        input = input.substring(1);
        ans(input, output);
        ans(input, op);
    }
//    https://leetcode.com/problems/subsets-ii/
//    public static HashSet<ArrayList<Integer>> ans = new HashSet<>();
//
//    public static void helper(ArrayList<Integer> ip, ArrayList<Integer> op) {
//        if (ip.size() == 0 && !ans.contains(op)) {
//            ans.add(op);
//            return;
//        }
//        ArrayList<Integer> op1 = new ArrayList<>(op);
//        op1.add(ip.remove(0));
//        helper(ip, op);
//        helper(ip, op1);
//    }
//
//    public List<List<Integer>> subsetsWithDup(int[] nums) {
//        ArrayList<Integer> ip = new ArrayList<>();
//        for (int n : nums) {
//            ip.add(n);
//        }
//        helper(ip, new ArrayList<>());
//        System.out.println(ans);
//        return null;
//    }
}
