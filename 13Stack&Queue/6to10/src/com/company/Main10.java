<<<<<<< HEAD
//10.Inserting at the end of stack
//https://stackoverflow.com/questions/45130465/inserting-at-the-end-of-stack
package com.company;

import java.util.Stack;

public class Main10 {
    private static Stack<Character> st = new Stack<>();

    public static void main(String[] args) {
        st.push('a');
        st.push('x');
        st.push('3');
        st.push('-');
        st.push('z');
        System.out.println(st);
        insert_at_bottom('T');
        System.out.println(st);
    }

    static void insert_at_bottom(char x) {
        //TC = O(n),MC = O(n),Basic Stuff
        if (st.isEmpty())
            st.push(x);
        else {
            char a = st.pop();
            insert_at_bottom(x);
            st.push(a);
        }
    }

}
=======
//10.Inserting at the end of stack
//https://stackoverflow.com/questions/45130465/inserting-at-the-end-of-stack
package com.company;

import java.util.Stack;

public class Main10 {
    private static Stack<Character> st = new Stack<>();

    public static void main(String[] args) {
        st.push('a');
        st.push('x');
        st.push('3');
        st.push('-');
        st.push('z');
        System.out.println(st);
        insert_at_bottom('T');
        System.out.println(st);
    }

    static void insert_at_bottom(char x) {
        //TC = O(n),MC = O(n),Basic Stuff
        if (st.isEmpty())
            st.push(x);
        else {
            char a = st.pop();
            insert_at_bottom(x);
            st.push(a);
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
