<<<<<<< HEAD
//8.Write a function that moves the last element to the front in a given Singly Linked List.
//For example, if the given Linked List is 1->2->3->4->5, then the function should change the list to 5->1->2->3->4.
//https://www.geeksforgeeks.org/move-last-element-to-front-of-a-given-linked-list/
package com.company;

public class Main8 {

    public static void main(String[] args) {

    }

    public static Node moveLastToFirst(Node head) {
        //TC = O(n),MC = O(1)
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        while (curr.next.next != null) {//1->2->3->4->5->null {Draw at notebook for better understanding}
            curr = curr.next;//from above example we can conclude that we must stop loop at 4 that is when curr is pointing to 4
        }                                                                              //↓←←←←←←←←←←←↑
        curr.next.next = head;//this will turn the list into a circular linked list i.e. 1->2->3->4->5
        head = curr.next;//now we re-assign the head to the very last link i.e. to 5
        curr.next = null;//at last, we break the link and the list becomes 5->1->2->3->4
        return head;
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

}
=======
//8.Write a function that moves the last element to the front in a given Singly Linked List.
//For example, if the given Linked List is 1->2->3->4->5, then the function should change the list to 5->1->2->3->4.
//https://www.geeksforgeeks.org/move-last-element-to-front-of-a-given-linked-list/
package com.company;

public class Main8 {

    public static void main(String[] args) {

    }

    public static Node moveLastToFirst(Node head) {
        //TC = O(n),MC = O(1)
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        while (curr.next.next != null) {//1->2->3->4->5->null {Draw at notebook for better understanding}
            curr = curr.next;//from above example we can conclude that we must stop loop at 4 that is when curr is pointing to 4
        }                                                                              //↓←←←←←←←←←←←↑
        curr.next.next = head;//this will turn the list into a circular linked list i.e. 1->2->3->4->5
        head = curr.next;//now we re-assign the head to the very last link i.e. to 5
        curr.next = null;//at last, we break the link and the list becomes 5->1->2->3->4
        return head;
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
