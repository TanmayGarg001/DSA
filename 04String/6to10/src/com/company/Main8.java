<<<<<<< HEAD
//8.Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S).
//In case of conflict, return the substring which occurs first ( with the least starting index).
package com.company;

import java.util.ArrayList;

public class Main8 {

    public static void main(String[] args) {
        approach1("daddy");
        approach2("sabbaddss");
        approach3("baaaabbbbabbbbbaaabbbabab");
    }

    public static void approach1(String s) {
        //TC = O(n^3),MC = O(n^2)//It might not like it but ArrayList has s.length()^2 items.LOL. We can optimize this by destroying arrayList
        //ans just checking it on the go as done in approach2 but still time complexity remains O(n^3), in that case.
        //Make all the possible substrings of the given string, store them in ArrayList.
        //Reverse each of them and check if it's a palindrome if it is then check if it is larger than the previous palindrome in the string
        ArrayList<StringBuilder> al = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                StringBuilder sb1 = new StringBuilder(temp);
                al.add(sb1);
            }
        }
        int ans = 0;
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < al.size(); i++) {
            StringBuilder sb1 = new StringBuilder(al.get(i));
            StringBuilder sb2 = new StringBuilder(al.get(i));
            sb2.reverse();
            if (sb2.compareTo(sb1) == 0) {
                if (sb2.length() > ans) {
                    sb3 = sb2;
                    ans = sb2.length();
                }
            }
        }
        System.out.println(sb3);
    }

    public static void approach2(String s) {
        //TC = O(n^3),MC = O(1)
        //Similar to first approach, but we don't need arrayList as we keep updating it on the go.
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                StringBuilder sb1 = new StringBuilder(temp);
                StringBuilder sb2 = new StringBuilder(temp);
                sb1.reverse();
                if (sb1.compareTo(sb2) == 0 && sb1.length() > ans.length()) {
                    ans = sb2.toString();
                }
            }
        }
        System.out.println(ans);
    }

    public static void approach3(String s) {
        //TC = O(n^2),MC = O(1)
        //See the blog for detailed explanation
        //The way this is solved in this time complexity is almost impossible to imagine.
        //https://www.geeksforgeeks.org/longest-palindromic-substring-set-2/

        int maxLengthPalindrome = 1;//at least length of the palindrome will be 1
        int start = 0;
        int low;
        int high;

        for (int i = 1; i < s.length(); i++) {
            low = i - 1;
            high = i;
            //low and high move together by +1, when both are equal we keep expanding the pointers towards the string's extreme
            //till they are not equal(coz of the fact they are palindrome).

            //In case when palindrome's length is even
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }

            low++;
            high--;
            if (s.charAt(low) == s.charAt(high) && high - low + 1 > maxLengthPalindrome) {
                maxLengthPalindrome = high - low + 1;
                start = low;
            }

            //In case when palindrome's length is odd and center is i
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }

            low++;
            high--;
            if (s.charAt(low) == s.charAt(high) && high - low + 1 > maxLengthPalindrome) {
                maxLengthPalindrome = high - low + 1;
                start = low;
            }

        }
        System.out.println(s.substring(start, start + maxLengthPalindrome));

    }

}
=======
//8.Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S).
//In case of conflict, return the substring which occurs first ( with the least starting index).
package com.company;

import java.util.ArrayList;

public class Main8 {

    public static void main(String[] args) {
        approach1("daddy");
        approach2("sabbaddss");
        approach3("baaaabbbbabbbbbaaabbbabab");
    }

    public static void approach1(String s) {
        //TC = O(n^3),MC = O(n^2)//It might not like it but ArrayList has s.length()^2 items.LOL. We can optimize this by destroying arrayList
        //ans just checking it on the go as done in approach2 but still time complexity remains O(n^3), in that case.
        //Make all the possible substrings of the given string, store them in ArrayList.
        //Reverse each of them and check if it's a palindrome if it is then check if it is larger than the previous palindrome in the string
        ArrayList<StringBuilder> al = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                StringBuilder sb1 = new StringBuilder(temp);
                al.add(sb1);
            }
        }
        int ans = 0;
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < al.size(); i++) {
            StringBuilder sb1 = new StringBuilder(al.get(i));
            StringBuilder sb2 = new StringBuilder(al.get(i));
            sb2.reverse();
            if (sb2.compareTo(sb1) == 0) {
                if (sb2.length() > ans) {
                    sb3 = sb2;
                    ans = sb2.length();
                }
            }
        }
        System.out.println(sb3);
    }

    public static void approach2(String s) {
        //TC = O(n^3),MC = O(1)
        //Similar to first approach, but we don't need arrayList as we keep updating it on the go.
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                StringBuilder sb1 = new StringBuilder(temp);
                StringBuilder sb2 = new StringBuilder(temp);
                sb1.reverse();
                if (sb1.compareTo(sb2) == 0 && sb1.length() > ans.length()) {
                    ans = sb2.toString();
                }
            }
        }
        System.out.println(ans);
    }

    public static void approach3(String s) {
        //TC = O(n^2),MC = O(1)
        //See the blog for detailed explanation
        //The way this is solved in this time complexity is almost impossible to imagine.
        //https://www.geeksforgeeks.org/longest-palindromic-substring-set-2/

        int maxLengthPalindrome = 1;//at least length of the palindrome will be 1
        int start = 0;
        int low;
        int high;

        for (int i = 1; i < s.length(); i++) {
            low = i - 1;
            high = i;
            //low and high move together by +1, when both are equal we keep expanding the pointers towards the string's extreme
            //till they are not equal(coz of the fact they are palindrome).

            //In case when palindrome's length is even
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }

            low++;
            high--;
            if (s.charAt(low) == s.charAt(high) && high - low + 1 > maxLengthPalindrome) {
                maxLengthPalindrome = high - low + 1;
                start = low;
            }

            //In case when palindrome's length is odd and center is i
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }

            low++;
            high--;
            if (s.charAt(low) == s.charAt(high) && high - low + 1 > maxLengthPalindrome) {
                maxLengthPalindrome = high - low + 1;
                start = low;
            }

        }
        System.out.println(s.substring(start, start + maxLengthPalindrome));

    }

}
>>>>>>> 26b1aac (Final Commit_1)
