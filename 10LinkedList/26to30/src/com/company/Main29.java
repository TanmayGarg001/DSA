<<<<<<< HEAD
//29.Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros
//segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.
//https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1#
package com.company;

public class Main29 {

    public static void main(String[] args) {

    }

    static Node segregate(Node head) {
        //TC = O(n),MC = O(1)
        //Same as Que4 of arrays, basically count number of zeros and ones and after that in a loop update all the nodes accordingly
        if (head == null || head.next == null) {
            return head;
        }
        int zeros = 0;
        int ones = 0;
        int len = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zeros++;
            } else if (temp.data == 1) {
                ones++;
            }
            temp = temp.next;
            len++;
        }
        temp = head;//make temp as start i.e. point at head
        for (int i = 0; i < len; i++) {
            if (i < zeros) {
                temp.data = 0;
            } else if (i < ones + zeros) {
                temp.data = 1;
            } else {
                temp.data = 2;
            }
            temp = temp.next;//move temp in each iteration
        }
        return head;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

}
=======
//29.Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros
//segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.
//https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1#
package com.company;

public class Main29 {

    public static void main(String[] args) {

    }

    static Node segregate(Node head) {
        //TC = O(n),MC = O(1)
        //Same as Que4 of arrays, basically count number of zeros and ones and after that in a loop update all the nodes accordingly
        if (head == null || head.next == null) {
            return head;
        }
        int zeros = 0;
        int ones = 0;
        int len = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zeros++;
            } else if (temp.data == 1) {
                ones++;
            }
            temp = temp.next;
            len++;
        }
        temp = head;//make temp as start i.e. point at head
        for (int i = 0; i < len; i++) {
            if (i < zeros) {
                temp.data = 0;
            } else if (i < ones + zeros) {
                temp.data = 1;
            } else {
                temp.data = 2;
            }
            temp = temp.next;//move temp in each iteration
        }
        return head;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
