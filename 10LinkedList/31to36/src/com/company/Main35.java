//35.Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node from the end of the linked list.
//https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1#
package com.company;

public class Main35 {

    public static void main(String[] args) {

    }

    int getNthFromLast(Node head, int n) {
        //TC = O(n),MC = O(1)
        //Basic stuff. Other way is to reverse the list and then return the nth element
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (len < n) {
            return -1;
        }
        if (head.next == null) {
            return head.data;
        }
        if (len == n) {
            return head.data;
        }
        len = len - n;
        temp = head;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            temp = temp.next;
            ans = temp.data;
        }
        return ans;
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