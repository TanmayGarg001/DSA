<<<<<<< HEAD
//34.Given a string s in lowercase, rearrange the characters of s so that any two adjacent characters are not the same.
//Return any possible rearrangement of s or return "" if not possible.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main34 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        String[] arr = new String[t];
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            arr[i] = s;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(approach1(arr[i]));
        }
    }

    public static String approach1(String S) {
        //TC = O(n),MC = O(n)
        //1.Count letter appearance and store in hash[i]
        //2.Find the letter with the largest occurrence.
        //3.Put the letter into even index number (0, 2, 4 ...) char array
        //4.Put the rest into the array
        int[] hash = new int[26];
        for (int i = 0; i < S.length(); i++) {
            hash[S.charAt(i) - 'a'] += 1;
        }
        int max = 0, letter = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > max) {
                max = hash[i];
                letter = i;
            }
        }
        if (max > (S.length() + 1) / 2) {
            return "0";//if a letter comes more than 0.5 times in string ,there is no way to satisfy the condition.
        }

        char[] res = new char[S.length()];
        int index = 0;
        while (hash[letter] > 0) {
            res[index] = (char) (letter + 'a');
            index += 2;
            hash[letter]--;
        }
        for (int i = 0; i < hash.length; i++) {
            while (hash[i] > 0) {
                if (index >= res.length) {
                    index = 1;
                }
                res[index] = (char) (i + 'a');
                index += 2;
                hash[i]--;
            }
        }
        System.out.println("==>" + Arrays.toString(res));
        System.out.println(String.valueOf(res));
        if (res.length < 1) {
            return "0";
        }
        return "1";
    }
    //How this works:
//    We construct the resulting string in sequence: at position 0, 2, 4, ... and then 1, 3, 5, ...
//    In this way, we can make sure there is always a gap between the same characters
//    Consider this example: "aaabbbcdd", we will construct the string in this way:
//    a _ a _ a _ _ _ _ // fill in "a" at position 0, 2, 4
//    a b a _ a _ b _ b // fill in "b" at position 6, 8, 1
//    a b a c a _ b _ b // fill in "c" at position 3
//    a b a c a d b d b // fill in "d" at position 5, 7
}
=======
//34.Given a string s in lowercase, rearrange the characters of s so that any two adjacent characters are not the same.
//Return any possible rearrangement of s or return "" if not possible.
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main34 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        String[] arr = new String[t];
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            arr[i] = s;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(approach1(arr[i]));
        }
    }

    public static String approach1(String S) {
        //TC = O(n),MC = O(n)
        //1.Count letter appearance and store in hash[i]
        //2.Find the letter with the largest occurrence.
        //3.Put the letter into even index number (0, 2, 4 ...) char array
        //4.Put the rest into the array
        int[] hash = new int[26];
        for (int i = 0; i < S.length(); i++) {
            hash[S.charAt(i) - 'a'] += 1;
        }
        int max = 0, letter = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > max) {
                max = hash[i];
                letter = i;
            }
        }
        if (max > (S.length() + 1) / 2) {
            return "0";//if a letter comes more than 0.5 times in string ,there is no way to satisfy the condition.
        }

        char[] res = new char[S.length()];
        int index = 0;
        while (hash[letter] > 0) {
            res[index] = (char) (letter + 'a');
            index += 2;
            hash[letter]--;
        }
        for (int i = 0; i < hash.length; i++) {
            while (hash[i] > 0) {
                if (index >= res.length) {
                    index = 1;
                }
                res[index] = (char) (i + 'a');
                index += 2;
                hash[i]--;
            }
        }
        System.out.println("==>" + Arrays.toString(res));
        System.out.println(String.valueOf(res));
        if (res.length < 1) {
            return "0";
        }
        return "1";
    }
    //How this works:
//    We construct the resulting string in sequence: at position 0, 2, 4, ... and then 1, 3, 5, ...
//    In this way, we can make sure there is always a gap between the same characters
//    Consider this example: "aaabbbcdd", we will construct the string in this way:
//    a _ a _ a _ _ _ _ // fill in "a" at position 0, 2, 4
//    a b a _ a _ b _ b // fill in "b" at position 6, 8, 1
//    a b a c a _ b _ b // fill in "c" at position 3
//    a b a c a d b d b // fill in "d" at position 5, 7
}
>>>>>>> 26b1aac (Final Commit_1)
