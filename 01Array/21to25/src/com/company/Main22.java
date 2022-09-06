<<<<<<< HEAD
//22.Given an integer N, find its factorial.
package com.company;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main22 {

    public static void main(String[] args) {
        System.out.println(approach1(18));
        System.out.println(approach2(18));
        System.out.println(approach3(18));
    }

    public static ArrayList<Integer> approach1(int n) {
        BigInteger bi = BigInteger.valueOf(1);
        for (long i = n; i > 1; i--) {
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        String val = bi.toString();

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < val.length(); i++) {
            al.add(Integer.parseInt(String.valueOf(val.charAt(i))));
        }
        return al;
    }

    public static double approach2(double number) {
        //TC = O(n),MC = O(1); remember the decimal format thingy
        //use bigDecimal when N is large ;requires import java.math.BigDecimal;
        double ans = 1;
        for (double i = number; i > 0; i--) {
            ans = ans * i;
        }
        // DecimalFormat dc = new DecimalFormat("0.#"); //need to import java.text.DecimalFormat
        // return dc.format(ans);

        // String op = String.format("%.0f",ans);
        // System.out.println(op);
        // ans = Double.parseDouble(op);
        return ans;
    }

    public static double approach3(double number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return number * approach3(number - 1);
    }


=======
//22.Given an integer N, find its factorial.
package com.company;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main22 {

    public static void main(String[] args) {
        System.out.println(approach1(18));
        System.out.println(approach2(18));
        System.out.println(approach3(18));
    }

    public static ArrayList<Integer> approach1(int n) {
        BigInteger bi = BigInteger.valueOf(1);
        for (long i = n; i > 1; i--) {
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        String val = bi.toString();

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < val.length(); i++) {
            al.add(Integer.parseInt(Character.toString(val.charAt(i))));//or we can use String.toValue
        }
        return al;
    }

    public static double approach2(double number) {
        //TC = O(n),MC = O(1); remember the decimal format thingy
        //use bigDecimal when N is large ;requires import java.math.BigDecimal;
        double ans = 1;
        for (double i = number; i > 0; i--) {
            ans = ans * i;
        }
        // DecimalFormat dc = new DecimalFormat("0.#"); //need to import java.text.DecimalFormat
        // return dc.format(ans);

        // String op = String.format("%.0f",ans);
        // System.out.println(op);
        // ans = Double.parseDouble(op);
        return ans;
    }

    public static double approach3(double number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return number * approach3(number - 1);
    }


>>>>>>> 26b1aac (Final Commit_1)
}