<<<<<<< HEAD
//19.Given a string of characters, find the length of the longest proper prefix which is also a proper suffix.
package com.company;

public class Main19 {

    public static void main(String[] args) {
        System.out.println(approach1("abcaabc"));
    }

    public static int approach1(String s) {
        //KMP algorithm write it with an example and solve it line by line.
        //It is a very clever algo which ignores the prev result as it is guaranteed to match, and keep updating the array when char matches!
        int[] lps = new int[s.length()];
        int i = 0;
        int j = 1;

        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                lps[j] = i;
                j++;
            } else {
                if (i == 0) {
                    j++;
                } else {
                    i = lps[i - 1];
                }
            }
        }
        System.out.println(s.substring(0, lps[lps.length-1]));
        return lps[s.length() - 1];
    }

}
=======
//19.Given a string of characters, find the length of the longest proper prefix which is also a proper suffix.
package com.company;

public class Main19 {

    public static void main(String[] args) {
        System.out.println(approach1("abcaabc"));
    }

    public static int approach1(String s) {
        //KMP algorithm write it with an example and solve it line by line.
        //It is a very clever algo which ignores the prev result as it is guaranteed to match, and keep updating the array when char matches!
        int[] lps = new int[s.length()];
        int i = 0;
        int j = 1;
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                lps[j] = i;
                j++;
            } else {
                if (i == 0) {
                    j++;
                } else {
                    i = lps[i - 1];
                }
            }
        }
        System.out.println(s.substring(0, lps[lps.length-1]));
        return lps[s.length() - 1];
    }

}
>>>>>>> 26b1aac (Final Commit_1)
