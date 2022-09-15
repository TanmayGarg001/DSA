//4.Given a linked list of N nodes such that it may contain a loop.
//A loop here means that the last node of the link list is connected to the node at position X. If the link list does not have any loop, X=0.
//Remove the loop from the linked list, if it is present.
//https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1
package com.company;

import java.util.HashSet;

public class Main4 {

    public static void main(String[] args) {

    }

    public static void removeLoop(Node head) {
        //TC = O(n),MC = O(n)
        HashSet<Node> hs = new HashSet<>();
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            if (hs.contains(curr)) {
                prev.next = null;//this will remove the loop
                return;
            }
            hs.add(curr);
            prev = curr;
            curr = curr.next;
        }
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