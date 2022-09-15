<<<<<<< HEAD
//5.Given a number N. The task is to find the Nth catalan number.
//The first few Catalan numbers for N = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …
//Note: Positions start from 0 as shown above.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main5 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.print("Enter number of test cases: ");
        int t = Integer.parseInt(br.readLine());
        testCase(t);
    }

    private static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            int s = Integer.parseInt(br.readLine());
            System.out.println(approach1(s));
        }
    }

    public static BigInteger approach1(int n) {
        //TC = O(n^2),MC = O(n)
        //its just fucking maths
        BigInteger[] t = new BigInteger[101];
        for (int i = 0; i < 101; i++) {
            t[i] = BigInteger.valueOf(0);
        }
        t[0] = BigInteger.valueOf(1);
        t[1] = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                t[i] = t[i].add(t[j].multiply(t[i - j - 1]));

            }
        }
        return t[n];
    }


}
=======
//5.Given a number N. The task is to find the Nth catalan number.
//The first few Catalan numbers for N = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …
//Note: Positions start from 0 as shown above.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main5 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.print("Enter number of test cases: ");
        int t = Integer.parseInt(br.readLine());
        testCase(t);
    }

    private static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            int s = Integer.parseInt(br.readLine());
            System.out.println(approach1(s));
        }
    }

    public static BigInteger approach1(int n) {
        //TC = O(n^2),MC = O(n)
        //its just fucking maths
        BigInteger[] t = new BigInteger[101];
        for (int i = 0; i < 101; i++) {
            t[i] = BigInteger.valueOf(0);
        }
        t[0] = BigInteger.valueOf(1);
        t[1] = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                t[i] = t[i].add(t[j].multiply(t[i - j - 1]));

            }
        }
        return t[n];
    }


}
>>>>>>> 26b1aac (Final Commit_1)
