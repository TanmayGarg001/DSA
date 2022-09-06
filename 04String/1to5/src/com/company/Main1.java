<<<<<<< HEAD
//1.Write a function that reverses a string. The input string is given as an array of characters s.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {
        String s = "timmySavage";
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        s = String.valueOf(stringBuilder);
        System.out.println("==>" + s);
        System.out.println(stringBuilder);

        char[] arr = {'h', 'e', 'l', 'w', 'o'};
//        String s = String.valueOf(arr);
//        System.out.println(s);
        approach1(arr);
        char[] arr2 = {'h', 'e', 'l', 'w', 'o'};
        approach2(arr2);
    }

    //Some other approaches are:- Copying and pasting the reverse into a new string and returning/overwriting that.
    //(we can't overwrite the existing string but this is char[] arr).
    //We can use Collections.reverse() ,but for that we need to copy this into ArrayList<Char>.

    public static void approach1(char[] s) {
        //TC = O(n),MC = O(1)
        //Keep swapping the first characters with the last characters till string.length/2 .
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[s.length - 1 - i];
            s[s.length - 1 - i] = s[i];
            s[i] = temp;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void approach2(char[] s) {
        //TC = O(n),MC = O(1)//Stack memory ofc
        //Using recursion
        ArrayList<Character> al = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            al.add(s[i]);
        }
        reversal(al);
        System.out.println(al);
    }

    public static void reversal(ArrayList<Character> al) {
        if (al.size() == 0) {
            return;
        }
        char temp = al.remove(0);
        reversal(al);
        al.add(temp);
    }

=======
//1.Write a function that reverses a string. The input string is given as an array of characters s.
package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {
        String s = "timmySavage";
//        StringBuilder stringBuilder = new StringBuilder(s);
//        stringBuilder.reverse();
//        s = String.valueOf(stringBuilder);
//        System.out.println("==>" + s);
//        System.out.println(stringBuilder);
        char[] arr = {'h', 'e', 'l', 'w', 'o'};
//        String s = String.valueOf(arr);
//        System.out.println(s);
        approach1(s);
        char[] arr2 = {'h', 'e', 'l', 'w', 'o'};
        approach2(arr2);
    }

    //Some other approaches are:- Copying and pasting the reverse into a new string and returning/overwriting that.
    //(we can't overwrite the existing string but this is char[] arr).
    //We can use Collections.reverse() ,but for that we need to copy this into ArrayList<Char>.

    public static void approach1(String str) {
        //TC = O(n),MC = O(1)
        //Keep swapping the first characters with the last characters till string.length/2 .
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[s.length - 1 - i];
            s[s.length - 1 - i] = s[i];
            s[i] = temp;
        }
        String a = String.valueOf(s);
        System.out.println("WOHOOOO  =  " + a);
        System.out.println(Arrays.toString(s));
    }

    public static void approach2(char[] s) {
        //TC = O(n),MC = O(1)//Stack memory ofc
        //Using recursion
        ArrayList<Character> al = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            al.add(s[i]);
        }
        reversal(al);
        System.out.println(al);
    }

    public static void reversal(ArrayList<Character> al) {
        if (al.size() == 0) {
            return;
        }
        char temp = al.remove(0);
        reversal(al);
        al.add(temp);
    }

>>>>>>> 26b1aac (Final Commit_1)
}