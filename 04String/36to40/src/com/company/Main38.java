<<<<<<< HEAD
//38.Given a string S delete the characters which are appearing more than once consecutively.
package com.company;

public class Main38 {

    public static void main(String[] args) {
        System.out.println(approach1("aabbccdaabb"));
        System.out.println(approach2("aabbccdaabb"));
    }

    public static String approach1(String s) {
        //TC = O(n^2),MC = O(1), Here in general TC would be less than n^2 but if all chars are same in the string then only it will worst Tc i.e. O(n^2)
        if (s.length() <= 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return approach1(s.substring(1));
        } else {
            return s.charAt(0) + approach1(s.substring(1));
        }
    }

    public static String approach2(String s) {
        //TC = O(n),MC = O(1)
        char[] arr = s.toCharArray();
        if (arr.length <= 1) {
            return s;
        }
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }

        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < j + 1; i++) {
            ans.append(arr[i]);
        }
        return ans.toString();
    }

}
=======
//38.Given a string S delete the characters which are appearing more than once consecutively.
package com.company;

public class Main38 {

    public static void main(String[] args) {
        System.out.println(approach1("aabbccdaabb"));
        System.out.println(approach2("aabbccdaabb"));
    }

    public static String approach1(String s) {
        //TC = O(n^2),MC = O(1), Here in general TC would be less than n^2 but if all chars are same in the string then only it will worst Tc i.e. O(n^2)
        if (s.length() <= 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return approach1(s.substring(1));
        } else {
            return s.charAt(0) + approach1(s.substring(1));
        }
    }

    public static String approach2(String s) {
        //TC = O(n),MC = O(1)
        char[] arr = s.toCharArray();
        if (arr.length <= 1) {
            return s;
        }
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }

        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < j + 1; i++) {
            ans.append(arr[i]);
        }
        return ans.toString();
    }

}
>>>>>>> 26b1aac (Final Commit_1)
