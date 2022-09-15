//3.Given a linked list of N nodes. The task is to check if the linked list has a loop. Linked list can contain self loop.
//https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
package com.company;

public class Main3 {

    public static void main(String[] args) {

    }

    public static boolean detectLoop(Node head) {
        //TC = O(n),MC = O(1),
        //tortoise hare algorithm:Floyd's tortoise algorithm works when you're detecting a cycle in a linked list. It relies on the fact that if both pointers are moving at
        //a different pace, the gap between them will keep on increasing to a limit, after which it'll be reset if a cycle exists.
        //https://stackoverflow.com/questions/64561399/understanding-why-floyds-tortoise-and-hare-algorithm-works-when-applied-to-an-a
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
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