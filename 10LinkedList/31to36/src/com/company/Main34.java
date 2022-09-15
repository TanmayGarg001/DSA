//34.Given a link list of size N, modify the list such that all the even numbers appear before all the odd numbers in the modified list.
//The order of appearance of numbers within each segregation should be same as that in the original list.
//NOTE: Don't create a new linked list, instead rearrange the provided one.
//https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list5035/1#
package com.company;

public class Main34 {

    public static void main(String[] args) {

    }

    Node divide(Node head) {
        //TC = O(n),MC = O(n)
        //Easy stuff
        if (head == null) {
            return null;
        }
        Node dummy = new Node(0);
        Node temp = dummy;
        Node curr = head;

        while (curr != null) {
            if (curr.data % 2 == 0) {
                temp.next = new Node(curr.data);
                temp = temp.next;
            }
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            if (curr.data % 2 != 0) {
                temp.next = new Node(curr.data);
                temp = temp.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

}