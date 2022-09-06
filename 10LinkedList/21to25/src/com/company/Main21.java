<<<<<<< HEAD
//21.Given a sorted doubly linked list of positive distinct elements, the task is to find pairs in a doubly-linked list whose sum
//is equal to given value x, without using any extra space?
//https://www.geeksforgeeks.org/find-pairs-given-sum-doubly-linked-list/
package com.company;

public class Main21 {

    public static void main(String[] args) {

    }

    public static void findPairs(Node head, int key) {
        //TC = O(n),MC = O(1)
        Node start = head;
        Node end = head;
        while (end.next != null) {
            end = end.next;
        }
        //now start points at the very start of the DLL and end point at very last of the DLL.
        //given DLL is sorted, we move both pointers close to each other and when we find the sum we print it
        while (start != end && end.next != start) {
            if (start.data + end.data != key) {
                System.out.println("{" + start.data + "," + end.data + "}");
                start = start.next;
                end = end.prev;
            } else {
                if (start.data + end.data < key) {
                    start = start.next;
                } else {
                    end = end.prev;
                }
            }
        }
    }

    public static class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

}
=======
//21.Given a sorted doubly linked list of positive distinct elements, the task is to find pairs in a doubly-linked list whose sum
//is equal to given value x, without using any extra space?
//https://www.geeksforgeeks.org/find-pairs-given-sum-doubly-linked-list/
package com.company;

public class Main21 {

    public static void main(String[] args) {

    }

    public static void findPairs(Node head, int key) {
        //TC = O(n),MC = O(1)
        Node start = head;
        Node end = head;
        while (end.next != null) {
            end = end.next;
        }
        //now start points at the very start of the DLL and end point at very last of the DLL.
        //given DLL is sorted, we move both pointers close to each other and when we find the sum we print it
        while (start != end && end.next != start) {
            if (start.data + end.data == key) {
                System.out.println("{" + start.data + "," + end.data + "}");
                start = start.next;
                end = end.prev;
            } else {
                if (start.data + end.data < key) {
                    start = start.next;
                } else {
                    end = end.prev;
                }
            }
        }
    }

    public static class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
