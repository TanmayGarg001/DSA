<<<<<<< HEAD
//34.Given an Integer array A[] of n elements. Your task is to complete the function Palindrome Array.
// Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.
//a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam or nurses run.
package com.company;

public class Main34 {

    public static void main(String[] args) {
        int[] arr = {151, 161, 7277, 546645};
        System.out.println(approach1(arr));

    }

    public static int approach1(int[] arr) {
        //TC = O(n^2),MC = O(1)
        //Maths
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int ans = 0;
            int x = arr[i];
            while (x != 0) {
                int temp = x % 10;
                ans = ans * 10 + temp;
                x = x / 10;
            }
            if (ans == arr[i]) {
                count++;
            }
        }
        if (count == arr.length) {
            return 1;
        } else {
            return 0;
        }
    }

}
=======
//34.Given an Integer array A[] of n elements. Your task is to complete the function Palindrome Array.
// Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.
//a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam or nurses run.
package com.company;

public class Main34 {

    public static void main(String[] args) {
        int[] arr = {151, 161, 7277, 546645};
        System.out.println(approach1(arr));

    }

    public static int approach1(int[] arr) {
        //TC = O(n^2),MC = O(1)
        //Maths
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int ans = 0;
            int x = arr[i];
            while (x != 0) {
                int temp = x % 10;
                ans = ans * 10 + temp;
                x = x / 10;
            }
            if (ans == arr[i]) {
                count++;
            }
        }
        if (count == arr.length) {
            return 1;
        } else {
            return 0;
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
