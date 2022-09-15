//25.Given a doubly linked list containing n nodes. The problem is to reverse every group of k nodes in the list.
//https://www.geeksforgeeks.org/reverse-doubly-linked-list-groups-given-size/
package com.company;

public class Main25 {

    public static void main(String[] args) {

    }

    public static Node reverseKGroup(Node head, int k) {//1
        //TC = O(n),MC = O(stack), Very similar to Q2 of LinkedList
        if (head == null) {
            return null;
        }
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (length < k) return head;//till here its pretty basic stuff
        return ReverseLL(head, k, length);
    }

    public static Node ReverseLL(Node head, int k, int rem) {
        if (rem < k) {
            return head;
        }
        int i = 0;
        Node curr = head;
        Node nextNode;
        Node prev = null;
        while (i < k) {//this will reverse the 'k' links
            nextNode = curr.next;
            curr.next = prev;
            curr.prev=nextNode;
            prev = curr;
            curr = nextNode;
            i++;
        }
        head.next = ReverseLL(curr, k, rem - k);//this will keep calling at fewer chunks of the function, basically works on remaining part of list (n-k)
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