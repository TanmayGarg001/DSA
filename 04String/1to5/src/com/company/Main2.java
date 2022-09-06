<<<<<<< HEAD
//2.Given a string S, check if it is palindrome or not.
package com.company;

public class Main2 {

    public static void main(String[] args) {
        System.out.println(approach1("radar"));
        approach2("rotator");
    }

    public static int approach1(String s) {
        //TC = O(n),MC = O(1)
        //We can also,Make a char array reverse of the string and compare to the original string if it's same the given string is palindrome.
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return 0;
            }
        }
        return 1;
    }

    public static void approach2(String s) {
        //TC = O(n),MC = O(1)
        //Using StringBuilder, it is more optimised and faster than other approaches
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder(s);
        //Objects of String are immutable, and objects of StringBuffer and StringBuilder are mutable. StringBuffer and StringBuilder are similar,
        // but StringBuilder is faster and preferred over StringBuffer for the single-threaded program. If thread safety is needed, then StringBuffer is used.
        s2.reverse();
        //compareTo() = returns the value 0 if this StringBuilder contains the same character sequence as that of the argument StringBuilder; a negative integer if this
        //StringBuilder is lexicographically less than the StringBuilder argument; or a positive integer if this StringBuilder is lexicographically
        //greater than the StringBuilder argument.
        if (s1.compareTo(s2) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("False");
        }
    }

}
=======
//2.Given a string S, check if it is palindrome or not.
package com.company;

public class Main2 {

    public static void main(String[] args) {
        System.out.println(approach1("radar"));
        approach2("rotator");
    }

    public static int approach1(String s) {
        //TC = O(n),MC = O(1)
        //We can also,Make a char array reverse of the string and compare to the original string if it's same the given string is palindrome.
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return 0;
            }
        }
        return 1;
    }

    public static void approach2(String s) {
        //TC = O(n),MC = O(1)
        //Using StringBuilder, it is more optimised and faster than other approaches
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder(s);
        //Objects of String are immutable, and objects of StringBuffer and StringBuilder are mutable. StringBuffer and StringBuilder are similar,
        // but StringBuilder is faster and preferred over StringBuffer for the single-threaded program. If thread safety is needed, then StringBuffer is used.
        s2.reverse();
        //compareTo() = returns the value 0 if this StringBuilder contains the same character sequence as that of the argument StringBuilder; a negative integer if this
        //StringBuilder is lexicographically less than the StringBuilder argument; or a positive integer if this StringBuilder is lexicographically
        //greater than the StringBuilder argument.
        if (s1.compareTo(s2) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("False");
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
