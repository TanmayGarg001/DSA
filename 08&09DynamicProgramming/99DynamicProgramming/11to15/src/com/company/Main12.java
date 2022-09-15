<<<<<<< HEAD
//12.Given a fence with n posts and k colors, find out the number of ways of painting the fence such that at most 2 adjacent posts have the same color.
//Since answer can be large return it modulo 10^9 + 7.
package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main12 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        System.out.print("Enter the number of test cases: ");
        int tc = Integer.parseInt(br.readLine());
        testCases(tc);
    }

//diff = no of ways when color of last
//        two posts is different
// same = no of ways when color of last
//        two posts is same
// total ways = diff + sum

//for n = 1
//    diff = k, same = 0
//    total = k

//for n = 2
//    diff = k * (k-1) //k choices for
//           first post, k-1 for next
//    same = k //k choices for common
//           color of two posts
//    total = k +  k * (k-1)

//for n = 3
//    diff = k * (k-1)* (k-1)
//    same = k * (k-1) * 2
//        // 2 is multiplied because consider two color R and B
//        // R R B or B R R
//        // B B R or R B B
//           c'' != c, (k-1) choices for it

    private static void testCases(int tc) throws Exception {
        for (int i = 0; i < tc; i++) {
            System.out.print("Enter the number of posts and colors: ");
            String[] a = br.readLine().split(" ");
            int n = Integer.parseInt(a[0]);
            int k = Integer.parseInt(a[1]);
            System.out.println(approach1(n, k));
        }
    }

    private static long approach1(int n, int k) {
        long[] t = new long[n + 1];
        t[1] = k;
        long diff = k;//when adjacent color are different
        long same;//when adjacent color are same
        for (int i = 2; i <= n; i++) {
            same = diff;
            diff = t[i - 1] * (k - 1);
            diff = diff % 1000000007;
            t[i] = (same + diff) % 1000000007;
        }
        return t[n];
    }

}
=======
//12.Given a fence with n posts and k colors, find out the number of ways of painting the fence such that at most 2 adjacent posts have the same color.
//Since answer can be large return it modulo 10^9 + 7.
package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main12 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        System.out.print("Enter the number of test cases: ");
        int tc = Integer.parseInt(br.readLine());
        testCases(tc);
    }

//diff = no of ways when color of last
//        two posts is different
// same = no of ways when color of last
//        two posts is same
// total ways = diff + sum

//for n = 1
//    diff = k, same = 0
//    total = k

//for n = 2
//    diff = k * (k-1) //k choices for
//           first post, k-1 for next
//    same = k //k choices for common
//           color of two posts
//    total = k +  k * (k-1)

//for n = 3
//    diff = k * (k-1)* (k-1)
//    same = k * (k-1) * 2
//        // 2 is multiplied because consider two color R and B
//        // R R B or B R R
//        // B B R or R B B
//           c'' != c, (k-1) choices for it

    private static void testCases(int tc) throws Exception {
        for (int i = 0; i < tc; i++) {
            System.out.print("Enter the number of posts and colors: ");
            String[] a = br.readLine().split(" ");
            int n = Integer.parseInt(a[0]);
            int k = Integer.parseInt(a[1]);
            System.out.println(approach1(n, k));
        }
    }

    private static long approach1(int n, int k) {
        long[] t = new long[n + 1];
        t[1] = k;
        long diff = k;//when adjacent color are different
        long same;//when adjacent color are same
        for (int i = 2; i <= n; i++) {
            same = diff;
            diff = t[i - 1] * (k - 1);
            diff = diff % 1000000007;
            t[i] = (same + diff) % 1000000007;
        }
        return t[n];
    }

}
>>>>>>> 26b1aac (Final Commit_1)
