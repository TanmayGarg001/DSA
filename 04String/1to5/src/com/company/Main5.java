<<<<<<< HEAD
//5.Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1?
//(e.g. given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)
package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main5 {

    public static void main(String[] args) {
        System.out.println(approach1("TIMMY", "MYTIM"));
        System.out.println(approach1("TIMMY", "YMTIM"));
        System.out.println(approach2("TIMMY", "MYTIM"));
        System.out.println(approach2("TIMMY", "YMTIM"));
        System.out.println(approach3("TIMMY", "MYTIM"));
        System.out.println(approach3("TIMMY", "YMTIM"));
    }

    public static boolean approach1(String str, String ptr) {
        //TC = O(n^2),MC = (n), Brute Force.
        ArrayList<String> al = new ArrayList<>(List.of(str.split("")));
        ArrayList<String> al2 = new ArrayList<>(List.of(ptr.split("")));
        for (int i = 0; i < al.size(); i++) {
            if (al.equals(al2)) {
                return true;
            }
            String temp = al.get(0);
            al.remove(0);
            al.add(temp);
        }
        return false;
    }


    public static boolean approach2(String str, String ptr) {
        //TC = O(n^2),MC = (n), Brute Force but space optimized.
        String temp = str;
        for (int i = 0; i < str.length(); i++) {
            if (temp.contains(ptr)) {
                return true;
            }
            char x = temp.charAt(0);
            temp = temp.substring(1);
            temp = temp + x;
        }
        return false;
    }

    public static boolean approach3(String str, String ptr) {
        //TC = O(n),MC = (1), KMP Algorithm!
        String temp = str + str;
        return temp.contains(ptr);
    }

}
=======
//5.Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1?
//(e.g. given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)
package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main5 {

    public static void main(String[] args) {
        System.out.println(approach1("TIMMY", "MYTIM"));
        System.out.println(approach1("TIMMY", "YMTIM"));
        System.out.println(approach2("TIMMY", "MYTIM"));
        System.out.println(approach2("TIMMY", "YMTIM"));
        System.out.println(approach3("TIMMY", "MYTIM"));
        System.out.println(approach3("TIMMY", "YMTIM"));
    }

    public static boolean approach1(String str, String ptr) {
        //TC = O(n^2),MC = (n), Brute Force.
        ArrayList<String> al = new ArrayList<>(List.of(str.split("")));
        ArrayList<String> al2 = new ArrayList<>(List.of(ptr.split("")));
        for (int i = 0; i < al.size(); i++) {
            if (al.equals(al2)) {
                return true;
            }
            String temp = al.get(0);
            al.remove(0);
            al.add(temp);
        }
        return false;
    }


    public static boolean approach2(String str, String ptr) {
        //TC = O(n^2),MC = (n), Brute Force but space optimized.
        String temp = str;
        for (int i = 0; i < str.length(); i++) {
            if (temp.contains(ptr)) {
                return true;
            }
            char x = temp.charAt(0);
            temp = temp.substring(1);
            temp = temp + x;
        }
        return false;
    }

    public static boolean approach3(String str, String ptr) {
        //TC = O(n),MC = (1), KMP Algorithm!
        String temp = str + str;
        return temp.contains(ptr);
    }

}
>>>>>>> 26b1aac (Final Commit_1)
