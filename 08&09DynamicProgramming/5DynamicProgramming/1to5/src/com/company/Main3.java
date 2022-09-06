<<<<<<< HEAD
//3.Given two integers n and r, find nCr. Since the answer may be very large, calculate the answer modulo 10^9+7.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main3 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.print("Enter number of test cases: ");
        int t = Integer.parseInt(br.readLine());
        testCase(t);
    }

    private static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter n and r: ");
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int r = Integer.parseInt(s[1]);
            System.out.println("=====");
            System.out.println(approach1(n, r));
            System.out.println("=====");
            System.out.println(approach2(n, r));
        }
    }

    public static long approach1(int n, int r) {
        //TC = O(n^2+),MC = O(n^2+)
        //BigInteger internal implementations
        if (r > n) {
            return 0;
        }
        BigInteger[] arr = new BigInteger[1001];
        arr[0] = BigInteger.valueOf(1);
        arr[1] = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1].multiply(BigInteger.valueOf(i));
        }
        BigInteger N = arr[n];
        BigInteger R = arr[r];
        BigInteger C = arr[n - r];
        return (N.divide(R.multiply(C)).mod(BigInteger.valueOf(1000000007)).longValue());
    }

    public static int approach2(int n, int r) {
        //TC = O(n^2),MC = O(r)
        //Just a clever math formula
        int[] t = new int[r + 2];
        t[0] = 1;
        t[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = Math.min(r, i); j >= 1; j--)
                t[j] = (t[j] + t[j - 1]) % 1000000007;
        }
        return t[r];
    }


=======
//3.Given two integers n and r, find nCr. Since the answer may be very large, calculate the answer modulo 10^9+7.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main3 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.print("Enter number of test cases: ");
        int t = Integer.parseInt(br.readLine());
        testCase(t);
    }

    private static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter n and r: ");
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int r = Integer.parseInt(s[1]);
            System.out.println("=====");
            System.out.println(approach1(n, r));
            System.out.println("=====");
            System.out.println(approach2(n, r));
        }
    }

    public static long approach1(int n, int r) {
        //TC = O(n^2+),MC = O(n^2+)
        //BigInteger internal implementations
        if (r > n) {
            return 0;
        }
        BigInteger[] arr = new BigInteger[1001];
        arr[0] = BigInteger.valueOf(1);
        arr[1] = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1].multiply(BigInteger.valueOf(i));
        }
        BigInteger N = arr[n];
        BigInteger R = arr[r];
        BigInteger C = arr[n - r];
        return (N.divide(R.multiply(C)).mod(BigInteger.valueOf(1000000007)).longValue());
    }

    public static int approach2(int n, int r) {
        //TC = O(n^2),MC = O(r)
        //Just a clever math formula
        int[] t = new int[r + 2];
        t[0] = 1;
        t[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = Math.min(r, i); j >= 1; j--)
                t[j] = (t[j] + t[j - 1]) % 1000000007;
        }
        return t[r];
    }


>>>>>>> 26b1aac (Final Commit_1)
}