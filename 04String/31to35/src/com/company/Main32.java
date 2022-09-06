<<<<<<< HEAD
//32.Given a string containing only digits, restore it by returning all possible valid IP address combinations.
//A valid IP address must be in the form of A.B.C.D, where A, B, C, and D are numbers from 0-255. The numbers cannot be 0 prefixed unless they are 0.
package com.company;

import java.util.ArrayList;

public class Main32 {

    public static void main(String[] args) {
        System.out.println(approach1("11211"));
    }

    public static ArrayList<String> approach1(String s) {
        //TC = O(n),MC = O(n)
        //You might think that TC is O(n^3) but it's not coz of the fact that loop has to run 81 times in total coz limit on string size is 12.
        //If it was variable then it would be O(n^3)
        ArrayList<String> ans = new ArrayList<>();
        if (s.length() > 12) {
            return ans;
        }
        for (int i = 1; i < 4 && i < s.length() - 2; i++) {
            for (int j = i + 1; j < 4 + i && j < s.length() - 1; j++) {
                for (int k = j + 1; k < 4 + j && k < s.length(); k++) {
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j, k);
                    String s4 = s.substring(k);
                    if (isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)) {
                        ans.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                }
            }
        }
        return ans;
    }

    public static boolean isValid(String s) {
        if (s.length() > 3 || s.length() == 0 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }

}
=======
//32.Given a string containing only digits, restore it by returning all possible valid IP address combinations.
//A valid IP address must be in the form of A.B.C.D, where A, B, C, and D are numbers from 0-255. The numbers cannot be 0 prefixed unless they are 0.
package com.company;

import java.util.ArrayList;

public class Main32 {

    public static void main(String[] args) {
        System.out.println(approach1("11211"));
    }

    public static ArrayList<String> approach1(String s) {
        //TC = O(n),MC = O(n)
        //You might think that TC is O(n^3) but it's not coz of the fact that loop has to run 81 times in total coz limit on string size is 12.
        //If it was variable then it would be O(n^3)
        ArrayList<String> ans = new ArrayList<>();
        if (s.length() > 12) {
            return ans;
        }
        for (int i = 1; i < 4 && i < s.length() - 2; i++) {
            for (int j = i + 1; j < 4 + i && j < s.length() - 1; j++) {
                for (int k = j + 1; k < 4 + j && k < s.length(); k++) {
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j, k);
                    String s4 = s.substring(k);
                    if (isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)) {
                        ans.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                }
            }
        }
        return ans;
    }

    public static boolean isValid(String s) {
        if (s.length() > 3 || s.length() == 0 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }

}
>>>>>>> 26b1aac (Final Commit_1)
