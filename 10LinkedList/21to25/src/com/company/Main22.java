//22.Given a sorted doubly linked list of distinct nodes(no two nodes have the same data) and a value x. Count triplets in the list that sum up to a given value x.
//https://www.geeksforgeeks.org/count-triplets-sorted-doubly-linked-list-whose-sum-equal-given-value-x/
package com.company;

public class Main22 {

    public static void main(String[] args) {

    }

    public static int numberOfTriplets(Node head, int key) {
        //TC = O(n^2),MC = O(1)
        //As it is triplets sum we can't do it faster than o(n^2)
        Node start = head;
        Node end = head;
        while (end.next != null) {
            end = end.next;
        }
        int ans = 0;
        //here idea is we make 3 pointers one is at the very start ,other at very end and one pointer will move from start to end in each iteration and keep finding the triplets
        //also after one iteration we move the head by one and then do the same thing over and over again till our head reaches the end.
        for (Node curr = head; curr != null; curr = curr.next) {
            start = start.next;
            ans = ans + findTriplets(start, key - start.data);
        }
        return ans;
    }

    public static int findTriplets(Node head, int key) {
        //TC = O(n^2),MC = O(1)
        Node start = head;
        Node end = head;
        int count = 0;
        while (end.next != null) {
            end = end.next;
        }

        while (start != end && end.next != start) {
            if (start.data + end.data != key) {
                count++;
                start = start.next;
                end = end.prev;
            } else {
                if (start.data + end.data < key) {
                    start = start.next;
                } else {
                    end = end.prev;
                }
            }
        }
        return count;
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