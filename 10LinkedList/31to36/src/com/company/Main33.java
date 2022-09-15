//33.Given a singly linked list, remove all the nodes which have a greater value on its following nodes.
//https://practice.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1#
package com.company;

public class Main33 {

    public static void main(String[] args) {

    }

    Node compute(Node head) {
        //TC = O(n), MC = O(stack)
        if (head == null || head.next == null) {//base case
            return head;

        }
        Node nextNode = compute(head.next);//recursive call for all next nodes except the head
        if (nextNode.data > head.data) {
            return nextNode;
        }
        head.next = nextNode;
        return head;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

}