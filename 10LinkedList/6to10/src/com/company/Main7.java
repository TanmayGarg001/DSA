<<<<<<< HEAD
//7.Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this unsorted Linked List. When a value appears in multiple nodes,
//the node which appeared first should be kept, all others duplicates are to be removed.
//https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1
package com.company;

import java.util.HashSet;

public class Main7 {

    public static void main(String[] args) {

    }

    public Node removeDuplicates(Node head) {
        //TC = O(n),MC = O(n)
        if (head == null || head.next == null) {
            return head;
        }
        HashSet<Integer> set = new HashSet<>();
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            if (set.contains(curr.data)) {//we make set so that we keep use its constant look-up benefit for unsorted list
                prev.next = curr.next;
            } else {
                set.add(curr.data);//if set does not have any that value simple add it in the set as it is unique
                prev = curr;//and set the prev to curr as we move curr in each iteration
            }
            curr = curr.next;//move curr by 1 link
        }
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
//7.Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this unsorted Linked List. When a value appears in multiple nodes,
//the node which appeared first should be kept, all others duplicates are to be removed.
//https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1
package com.company;

import java.util.HashSet;

public class Main7 {

    public static void main(String[] args) {

    }

    public Node removeDuplicates(Node head) {
        //TC = O(n),MC = O(n)
        if (head == null || head.next == null) {
            return head;
        }
        HashSet<Integer> set = new HashSet<>();
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            if (set.contains(curr.data)) {//we make set so that we keep use its constant look-up benefit for unsorted list
                prev.next = curr.next;
            } else {
                set.add(curr.data);//if set does not have any that value simple add it in the set as it is unique
                prev = curr;//and set the prev to curr as we move curr in each iteration
            }
            curr = curr.next;//move curr by 1 link
        }
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
