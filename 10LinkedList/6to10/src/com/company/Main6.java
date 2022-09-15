//6.Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).
//Note: Try not to use extra space. Expected time complexity is O(N). The nodes are arranged in a sorted way.
//https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
package com.company;

public class Main6 {

    public static void main(String[] args) {

    }

    Node removeDuplicates(Node head) {
        //TC = O(n),MC = O(1)
        if (head == null) {
            return null;
        }
        Node curr = head;
        while (curr.next != null) {
            if (curr.data == curr.next.data) {//if curr and next node have same data
                curr.next = curr.next.next;//then we move the link from 1->1->2 to 1->2 directly destroying the middle element
                //and this will always work coz list is sorted.
            } else {
                curr = curr.next;
            }
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