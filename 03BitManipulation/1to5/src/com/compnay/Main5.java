<<<<<<< HEAD
//5.Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some x.
package com.compnay;

public class Main5 {

    public static void main(String[] args) {
        System.out.println(approach1(98));
        System.out.println(approach2(2147483648L));
    }

    public static boolean approach1(long n) {
        //TC = O(logn),MC = O(1)
        //It works but will throw stackOverflow error
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0 || n <= 0) {
            return false;
        }
        return approach1(n / 2);
    }

    public static boolean approach2(long n) {
        //TC = O(k)//k is the length-1 of long 'n' in binary form.
        //Every power of two in binary is represented by 1 followed by zeros, we make use of that here.
        String s = Long.toBinaryString(n);
        String x = s.substring(1);
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }

    public static boolean approach3(long n) {
        //TC = O(1),MC = O(1)//GODLIKE!
        //If we AND a number which is power of 2 with n and n-1. We know that n will be like 1000 whereas n-1 will be 0111
        //So we and both of them we will get 0 always.
        return n != 0 && ((n & (n - 1)) == 0);
    }

}
=======
//5.Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some x.
package com.compnay;

public class Main5 {

    public static void main(String[] args) {
        System.out.println(approach1(98));
        System.out.println(approach2(2147483648L));
    }

    public static boolean approach1(long n) {
        //TC = O(logn),MC = O(1)
        //It works but will throw stackOverflow error
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0 || n <= 0) {
            return false;
        }
        return approach1(n / 2);
    }

    public static boolean approach2(long n) {
        //TC = O(k)//k is the length-1 of long 'n' in binary form.
        //Every power of two in binary is represented by 1 followed by zeros, we make use of that here.
        String s = Long.toBinaryString(n);
        String x = s.substring(1);
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }

    public static boolean approach3(long n) {
        //TC = O(1),MC = O(1)//GODLIKE!
        //If we AND a number which is power of 2 with n and n-1. We know that n will be like 1000 whereas n-1 will be 0111
        //So we and both of them we will get 0 always.
        return n != 0 && ((n & (n - 1)) == 0);
    }

}
>>>>>>> 26b1aac (Final Commit_1)
