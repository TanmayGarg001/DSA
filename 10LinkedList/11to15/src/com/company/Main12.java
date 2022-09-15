//12.Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
//If the two linked lists have no intersection at all, return null.
//https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
//https://leetcode.com/problems/intersection-of-two-linked-lists/
package com.company;

public class Main12 {

    public static void main(String[] args) {

    }

    int intersectPoint(Node headA, Node headB) {
        //TC = O(n),MC = O(1)
        Node a = headA;
        Node b = headB;
        while (a != b) {//when we find a and b equal to each other we exit the loop.
            if (a == null) {//if after whole traversal of 'a' we didn't find and intersection then we set 'a' to head of B
                a = headB;
            } else {
                a = a.next;//else simply move pointer
            }
            if (b == null) {//if after whole traversal of 'b' we didn't find and intersection then we set 'b' to head of A
                b = headA;
            } else {
                b = b.next;//else simply move pointer
            }
        }
        //This will work coz the gap will keep reducing between the links as we assign a and b to opposite heads
        return a.data;
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