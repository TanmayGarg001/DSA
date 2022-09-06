<<<<<<< HEAD
//21.Given a string S consisting of only opening and closing curly brackets '{' and '}', find out the minimum number of reversals required to
//convert the string into a balanced expression.A reversal means changing '{' to '}' or vice-versa.
package com.company;

import java.util.Stack;

public class Main21 {

    public static void main(String[] args) {
        System.out.println(approach1("}{{}}{{{"));
        System.out.println(approach2("}{{}}{{{"));
    }

    public static int approach1(String s) {
        //TC = O(n),MC = O(n)
        if (s.length() % 2 != 0) {
            return -1;
        }
        int ans = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if (stack.peek() == '{' && s.charAt(i) == '}') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            char a = stack.pop();
            char b = stack.pop();
            if (a == '{') {
                ans++;
            }
            if (b == '}') {
                ans++;
            }
        }
        return ans;

    }

    public static int approach2(String s) {
        //TC = O(n),MC = O(1)
        if (s.length() % 2 != 0) {
            return -1;
        }
        int ans = 0;
        int i = 0;
        int open = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '{') {
                open++;
            } else if (open > 0 && s.charAt(i) == '}') {
                open--;
            } else {
                open++;
                ans++;
            }
            i++;
        }
        ans = ans + open / 2;
        return ans;

    }

}
=======
//21.Given a string S consisting of only opening and closing curly brackets '{' and '}', find out the minimum number of reversals required to
//convert the string into a balanced expression.A reversal means changing '{' to '}' or vice-versa.
package com.company;

import java.util.Stack;

public class Main21 {

    public static void main(String[] args) {
        System.out.println(approach1("}{{}}{{{"));
        System.out.println(approach2("}{{}}{{{"));
    }

    public static int approach1(String s) {
        //TC = O(n),MC = O(n)
        if (s.length() % 2 != 0) {
            return -1;
        }
        int ans = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if (stack.peek() == '{' && s.charAt(i) == '}') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            char a = stack.pop();
            char b = stack.pop();
            if (a == '{') {
                ans++;
            }
            if (b == '}') {
                ans++;
            }
        }
        return ans;

    }

    public static int approach2(String s) {
        //TC = O(n),MC = O(1)
        if (s.length() % 2 != 0) {
            return -1;
        }
        int ans = 0;
        int i = 0;
        int open = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '{') {
                open++;
            } else if (open > 0 && s.charAt(i) == '}') {
                open--;
            } else {
                open++;
                ans++;
            }
            i++;
        }
        ans = ans + open / 2;
        return ans;

    }

}
>>>>>>> 26b1aac (Final Commit_1)
