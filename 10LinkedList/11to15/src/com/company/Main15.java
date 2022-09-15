//15.Given the head of a singly linked list, return the middle node of the linked list.
//If there are two middle nodes, return the second middle node.
// https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1/
// https://leetcode.com/problems/middle-of-the-linked-list/
package com.company;

public class Main15 {

    public static void main(String[] args) {

    }

    public static Node getMiddle(Node head) {
        //TC = O(n),MC = O(1)
        if (head.next == null) {
            return head;
        }
        //We move fast at 2 links at each iteration and slow at 1 link each iteration, by doing this when fast.next==null or fast==null is true then we would have found
        //our mid at slow node.
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

}