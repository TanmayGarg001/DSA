<<<<<<< HEAD
//9.Given N friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once.
// Find out the total number of ways in which friends can remain single or can be paired up. Since answer can be very large, return your answer mod 10^9+7.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main9 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final long[] t = new long[10002];

    public static void main(String[] args) throws Exception {
        System.out.print("Enter the number of test cases: ");
        int tc = Integer.parseInt(br.readLine());
        Arrays.fill(t, -1);
        testCase(tc);
    }

    public static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter the array size: ");
            int n = Integer.parseInt(br.readLine());
            System.out.println("=====");
            System.out.println(approach1(n));
            System.out.println("=====");
            System.out.println(approach2(n));
            System.out.println("=====");
            System.out.println(approach3(n));
        }
    }

    //f(n) = ways n people can remain single or pair up.
    //For n-th person there are two choices:
    //1) n-th person remains single, we recur for f(n - 1)
    //2) n-th person pairs up with any of the remaining n - 1 persons. We get (n - 1) * f(n - 2)
    //Therefore we can recursively write f(n) as: f(n) = f(n - 1) + (n - 1) * f(n - 2)

    public static long approach1(int n) {
        //TC = O(2^n),MC = O(heap)
        //Basic recursive code.
        if (n > 2) {
            return approach1(n - 1) + (n - 1) * approach1(n - 2);//n-1 means the number is solo and recursive call goes to the left-over array
            //n-1*app(n-2) means that pair is made and so call goes to left over array and n-1 is solo entries combinations total.
        } else {
            return n;
        }
    }

    public static long approach2(int n) {
        //TC = O(n),MC = O(n)
        //Basic recursive code with memoization.
        if (t[n] != -1) {
            return t[n];
        }
        if (n > 2) {
            return t[n] = approach2(n - 1) + (n - 1) * approach2(n - 2);
        } else {
            return t[n] = n;
        }
    }

    public static long approach3(int n) {
        //TC = O(n),MC = O(n)
        //using DP table
        if (n <= 2) {
            return n;
        }
        long[] t = new long[n + 1];
        t[0] = 0;
        t[1] = 1;
        t[2] = 2;
        for (int i = 3; i <= n; i++) {
            t[i] = (t[i - 1] + ((i - 1) * t[i - 2])) % 1000000007;
        }
        return t[n];
    }


}
=======
//9.Given N friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once.
// Find out the total number of ways in which friends can remain single or can be paired up. Since answer can be very large, return your answer mod 10^9+7.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main9 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final long[] t = new long[10002];

    public static void main(String[] args) throws Exception {
        System.out.print("Enter the number of test cases: ");
        int tc = Integer.parseInt(br.readLine());
        Arrays.fill(t, -1);
        testCase(tc);
    }

    public static void testCase(int t) throws IOException {
        for (int i = 0; i < t; i++) {
            System.out.print("Enter the array size: ");
            int n = Integer.parseInt(br.readLine());
            System.out.println("=====");
            System.out.println(approach1(n));
            System.out.println("=====");
            System.out.println(approach2(n));
            System.out.println("=====");
            System.out.println(approach3(n));
        }
    }

    //f(n) = ways n people can remain single or pair up.
    //For n-th person there are two choices:
    //1) n-th person remains single, we recur for f(n - 1)
    //2) n-th person pairs up with any of the remaining n - 1 persons. We get (n - 1) * f(n - 2)
    //Therefore we can recursively write f(n) as: f(n) = f(n - 1) + (n - 1) * f(n - 2)

    public static long approach1(int n) {
        //TC = O(2^n),MC = O(heap)
        //Basic recursive code.
        if (n > 2) {
            return approach1(n - 1) + (n - 1) * approach1(n - 2);//n-1 means the number is solo and recursive call goes to the left-over array
            //n-1*app(n-2) means that pair is made and so call goes to left over array and n-1 is solo entries combinations total.
        } else {
            return n;
        }
    }

    public static long approach2(int n) {
        //TC = O(n),MC = O(n)
        //Basic recursive code with memoization.
        if (t[n] != -1) {
            return t[n];
        }
        if (n > 2) {
            return t[n] = approach2(n - 1) + (n - 1) * approach2(n - 2);
        } else {
            return t[n] = n;
        }
    }

    public static long approach3(int n) {
        //TC = O(n),MC = O(n)
        //using DP table
        if (n <= 2) {
            return n;
        }
        long[] t = new long[n + 1];
        t[0] = 0;
        t[1] = 1;
        t[2] = 2;
        for (int i = 3; i <= n; i++) {
            t[i] = (t[i - 1] + ((i - 1) * t[i - 2])) % 1000000007;
        }
        return t[n];
    }


}
>>>>>>> 26b1aac (Final Commit_1)
