<<<<<<< HEAD
//6.Given a number N having only one ‘1’ and all other ’0’s in its binary representation, find position of the only set bit. If there are 0 or more than 1
//set bit the answer should be -1. Position of  set bit '1' should be counted starting with 1 from LSB side in binary representation of the number.
package com.company;

public class Main6 {

    public static void main(String[] args) {
        System.out.println(approach1(1024));
        System.out.println(approach1(0));
        System.out.println(approach1(152));
    }

    public static int approach1(int n) {
        //TC = O(1),MC = O(1)
        //Similar to previous question
        String s = Integer.toBinaryString(n);
        if (n != 0 && ((n & (n - 1)) == 0)) {
            return s.length();
        }
        return -1;
    }

}
=======
//6.Given a number N having only one ‘1’ and all other ’0’s in its binary representation, find position of the only set bit. If there are 0 or more than 1
//set bit the answer should be -1. Position of  set bit '1' should be counted starting with 1 from LSB side in binary representation of the number.
package com.company;

public class Main6 {

    public static void main(String[] args) {
        System.out.println(approach1(1024));
        System.out.println(approach1(0));
        System.out.println(approach1(152));
    }

    public static int approach1(int n) {
        //TC = O(1),MC = O(1)
        //Similar to previous question
        String s = Integer.toBinaryString(n);
        if (n != 0 && ((n & (n - 1)) == 0)) {
            return s.length();
        }
        return -1;
    }

}
>>>>>>> 26b1aac (Final Commit_1)
