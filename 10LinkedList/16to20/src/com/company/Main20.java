<<<<<<< HEAD
//20.Given a doubly linked list of n elements. The task is to reverse the doubly linked list.
//https://practice.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1
package com.company;

public class Main20 {

    public static void main(String[] args) {

    }

    public static Node reverseDLL(Node head) {
        //TC = O(n),MC = O(1)
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            curr.prev = nextNode;
            prev = curr;
            curr = nextNode;
        }
        return prev;
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
//20.Given a doubly linked list of n elements. The task is to reverse the doubly linked list.
//https://practice.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1
package com.company;

public class Main20 {

    public static void main(String[] args) {

    }

    public static Node reverseDLL(Node head) {
        //TC = O(n),MC = O(1)
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            curr.prev = nextNode;
            prev = curr;
            curr = nextNode;
        }
        return prev;
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
