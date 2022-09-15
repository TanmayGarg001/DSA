//18.Given a singly linked list of size N of integers. The task is to check if the given linked list is palindrome or not.
//https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
//https://leetcode.com/problems/palindrome-linked-list/
package com.company;

public class Main18 {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(Node head) {
        //TC = O(n),MC= O(1)
        //We can't reverse the whole list and compare coz the reference list would be reversed
        //So ex: 1->2-3->4->3->2->1
        //So we find mid and after that we compare the head and the prev and keep iterating, here prev is at last after reversing: 1->2-3->4<-3<-2<-1<-prev
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {//use tortoise hare to find mid
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null;
        Node curr = slow;
        while (curr != null) {//now we reverse the list after the mid
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        while (prev != null) {
            if (prev.data != head.data) {
                return false;
            }
            prev = prev.next;
            head = head.next;
        }
        return true;
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