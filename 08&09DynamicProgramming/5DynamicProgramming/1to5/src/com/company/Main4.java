<<<<<<< HEAD
//4.Permutation refers to the process of arranging all the members of a given set to form a sequence.
//The number of permutations on a set of n elements is given by n!where “!” represents factorial.Calculate nPr
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main4 {
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
        BigInteger C = arr[n - r];
        return (N.divide(C).mod(BigInteger.valueOf(1000000007)).longValue());
    }

    public static long approach2(int n, int r) {
        //TC = O(1),MC = O(n)
        //nPr = n!/(n-r)! ==> n*n-1*n-2*n-3----n-r;
        int ans = 1;
        for (int i = n; i > n - r; i--) {
            ans = (i * ans) % 1000000007;
        }
//        the second way
//        long[] arr = new long[1001];
//        arr[0] = 1;
//        arr[1] = 1;
//        for (int i = 2; i < 1000; i++) {
//            arr[i] = i * arr[i - 1];
//        }

        return ans;
    }

}
=======
//4.Permutation refers to the process of arranging all the members of a given set to form a sequence.
//The number of permutations on a set of n elements is given by n!where “!” represents factorial.Calculate nPr
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main4 {
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
        BigInteger C = arr[n - r];
        return (N.divide(C).mod(BigInteger.valueOf(1000000007)).longValue());
    }

    public static long approach2(int n, int r) {
        //TC = O(1),MC = O(n)
        //nPr = n!/(n-r)! ==> n*n-1*n-2*n-3----n-r;
        int ans = 1;
        for (int i = n; i > n - r; i--) {
            ans = (i * ans) % 1000000007;
        }
//        the second way
//        long[] arr = new long[1001];
//        arr[0] = 1;
//        arr[1] = 1;
//        for (int i = 2; i < 1000; i++) {
//            arr[i] = i * arr[i - 1];
//        }

        return ans;
    }

}
>>>>>>> 26b1aac (Final Commit_1)
