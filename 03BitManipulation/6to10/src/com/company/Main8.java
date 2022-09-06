<<<<<<< HEAD
//8.Given a two integers say a and b. Find the quotient after dividing a by b without using multiplication, division and mod operator.
package com.company;

public class Main8 {

    public static void main(String[] args) {
        //See this blog:-
        //https://www.geeksforgeeks.org/divide-two-integers-without-using-multiplication-division-mod-operator/
        approach1(5, 10);
        System.out.println(approach2(8, 43));
    }

    public static void approach1(int divisor, int dividend) {
        //TC = O(n),MC = O(1)
        //Basic maths duh!
        int ans = -1;
        if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) {
            ans = 1;
        }
        divisor = Math.abs(divisor);
        dividend = Math.abs(dividend);
        int x = 0;
        while (divisor <= dividend) {//divisor = a number by which another number is to be divided,number that is being divided is called the dividend
            dividend = dividend - divisor;
            x++;
        }
        System.out.println(x * ans);
    }

    public static long approach2(long den, long num) {
        //TC = faster than O(logn),MC = O(1)
        if (den == 0) {
            return (int) Double.POSITIVE_INFINITY;
        }
        if (num == 0) {
            return 0;
        }
        if (den == num) {
            return 1;
        }
        long ans = 0;
        int temp = 0;
        long sign = Long.signum(den * num);
        den = Math.abs(den);
        num = Math.abs(num);
        for (int i = 31; i >= 0; i--) {
            if (temp + (den << i) <= num) {
                temp += den << i;
                ans |= 1L << i;
            }
        }
        if (sign == -1) {
            ans = -ans;
        }
        return ans;
    }

}
=======
//8.Given a two integers say a and b. Find the quotient after dividing a by b without using multiplication, division and mod operator.
package com.company;

public class Main8 {

    public static void main(String[] args) {
        //See this blog:-
        //https://www.geeksforgeeks.org/divide-two-integers-without-using-multiplication-division-mod-operator/
        approach1(5, 10);
        System.out.println(approach2(8, 43));
    }

    public static void approach1(int divisor, int dividend) {
        //TC = O(n),MC = O(1)
        //Basic maths duh!
        int ans = -1;
        if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) {
            ans = 1;
        }
        divisor = Math.abs(divisor);
        dividend = Math.abs(dividend);
        int x = 0;
        while (divisor <= dividend) {//divisor = a number by which another number is to be divided,number that is being divided is called the dividend
            dividend = dividend - divisor;
            x++;
        }
        System.out.println(x * ans);
    }

    public static long approach2(long den, long num) {
        //TC = faster than O(logn),MC = O(1)
        if (den == 0) {
            return (int) Double.POSITIVE_INFINITY;
        }
        if (num == 0) {
            return 0;
        }
        if (den == num) {
            return 1;
        }
        long ans = 0;
        int temp = 0;
        long sign = Long.signum(den * num);
        den = Math.abs(den);
        num = Math.abs(num);
        for (int i = 31; i >= 0; i--) {
            if (temp + (den << i) <= num) {
                temp += den << i;
                ans |= 1L << i;
            }
        }
        if (sign == -1) {
            ans = -ans;
        }
        return ans;
    }

}
>>>>>>> 26b1aac (Final Commit_1)
