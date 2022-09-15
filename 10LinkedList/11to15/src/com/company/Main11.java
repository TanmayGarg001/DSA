//11.Given two lists sorted in increasing order, create a new list representing the intersection of the two lists.
//The new list should be made with its own memory — the original lists should not be changed. Note: The list elements are not necessarily distinct.
//https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1
package com.company;

public class Main11 {

    public static void main(String[] args) {

    }

    public static Node findIntersection(Node a, Node b) {
        //TC = O(n),MC = O(1)
        Node ans = new Node(0);
        Node head = ans;
        //as both lists are sorted we move the loop in that way
        while (a != null && b != null) {
            if (a.data == b.data) {//if both have same value
                ans.next = new Node(a.data);//then we append new node to our ans node
                ans = ans.next;//establish link with nodes
                a = a.next;//move pointers
                b = b.next;
            } else if (a.data > b.data) {
                b = b.next;//we move 'b' to catch up to 'a'
            } else {
                a = a.next;//we move 'a' to catch up to 'b'
            }
        }
        return head.next;//to remove '0' that was appended at start by default
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