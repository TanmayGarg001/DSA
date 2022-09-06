<<<<<<< HEAD
//17.Given a Circular Linked List of size N, split it into two halves circular lists. If there are odd number of nodes in the given circular linked list then out of
//the resulting two halved lists, first list should have one node more than the second list. The resultant lists should also be circular lists and not linear lists.
//https://practice.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1#
package com.company;

public class Main17 {

    public static void main(String[] args) {

    }

    void splitList(circular_LinkedList list) {
        //TC = O(n),MC = O(1)
        //Here we use tortoise-hare algorithm coz when hare reaches at the start again the tortoise will be at the mid. Similar to Q15 [LinkedList]
        Node head = list.head;//Get the head of the list
        Node mid = findMid(head);//find the mid of the list
        Node last = mid.next;
        while (last.next != head) {
            last = last.next;
        }//now last points to the very lst item of the circular linked list
        list.head1 = head;
        list.head2 = mid.next;
        //to make both lists circular:
        last.next = mid.next;
        mid.next = head;
    }

    Node findMid(Node head) {
        Node slow = head, fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
//17.Given a Circular Linked List of size N, split it into two halves circular lists. If there are odd number of nodes in the given circular linked list then out of
//the resulting two halved lists, first list should have one node more than the second list. The resultant lists should also be circular lists and not linear lists.
//https://practice.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1#
package com.company;

public class Main17 {

    public static void main(String[] args) {

    }

    void splitList(circular_LinkedList list) {
        //TC = O(n),MC = O(1)
        //Here we use tortoise-hare algorithm coz when hare reaches at the start again the tortoise will be at the mid. Similar to Q15 [LinkedList]
        Node head = list.head;//Get the head of the list
        Node mid = findMid(head);//find the mid of the list
        Node last = mid.next;
        while (last.next != head) {
            last = last.next;
        }//now last points to the very lst item of the circular linked list
        list.head1 = head;
        list.head2 = mid.next;
        //to make both lists circular:
        last.next = mid.next;
        mid.next = head;
    }

    Node findMid(Node head) {
        Node slow = head, fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
