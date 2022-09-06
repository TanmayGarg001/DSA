<<<<<<< HEAD
//36.Given an input stream of A of n characters consisting only of lower case alphabets. The task is to find the first non repeating character,
//each time a character is inserted to the stream. If there is no such character then append '#' to the answer.
//https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1#
package com.company;

import java.util.LinkedList;

public class Main36 {

    public static void main(String[] args) {

    }

    public String FirstNonRepeating(String str) {
        //TC = O(n*26),MC = O(n)
        StringBuilder sb = new StringBuilder();
        int[] isRepeated = new int[26];
        LinkedList<Character> ll = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isRepeated[ch - 'a'] == 0) {
                ll.add(ch);
            }
            isRepeated[ch - 'a']++;//if same char is repeated then add its count in the arr[]
            while (!ll.isEmpty() && isRepeated[ll.peek() - 'a'] != 1) {//if ll is not empty and if a char is repeated then we keep removing elements from the linked list
                ll.remove();
            }
            if (ll.isEmpty()) {
                sb.append('#');
            } else {
                sb.append((char) ll.peek());
            }
        }
        return sb.toString();
    }

}
=======
//36.Given an input stream of A of n characters consisting only of lower case alphabets. The task is to find the first non repeating character,
//each time a character is inserted to the stream. If there is no such character then append '#' to the answer.
//https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1#
package com.company;

import java.util.LinkedList;

public class Main36 {

    public static void main(String[] args) {

    }

    public String FirstNonRepeating(String str) {
        //TC = O(n*26),MC = O(n)
        StringBuilder sb = new StringBuilder();
        int[] isRepeated = new int[26];
        LinkedList<Character> ll = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isRepeated[ch - 'a'] == 0) {
                ll.add(ch);
            }
            isRepeated[ch - 'a']++;//if same char is repeated then add its count in the arr[]
            while (!ll.isEmpty() && isRepeated[ll.peek() - 'a'] != 1) {//if ll is not empty and if a char is repeated then we keep removing elements from the linked list
                ll.remove();
            }
            if (ll.isEmpty()) {
                sb.append('#');
            } else {
                sb.append((char) ll.peek());
            }
        }
        return sb.toString();
    }

}
>>>>>>> 26b1aac (Final Commit_1)
