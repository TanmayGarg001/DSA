//24.Given a doubly-linked list, rotate the linked list counter-clockwise by N nodes. Here N is a given positive integer and is smaller than the count of nodes in linked list.
//https://practice.geeksforgeeks.org/problems/rotate-doubly-linked-list-by-p-nodes/1/
package com.company;

public class Main24 {

    public static void main(String[] args) {

    }

    public static Node update(Node head, int k) {
        //TC = O(n),MC = O(1)
        int i = 0;
        Node curr = head;
        while (i < k) {//1<->2<->3<->4<->5<->6
            curr = curr.next;//move curr pointer till we reach the point where we want the rotated list to start
            i++;
        }
        curr.prev.next = null;//now we break the link between 2 and 3 i.e. break the links after kth node.
        curr.prev = null;//{2<->3 is broken}
        Node last = curr;
        while (last.next != null) {
            last = last.next;                                  //head    curr        last
        }//now we have a pointer that points to last node i.e. 6 : 1<->2  3<->4<->5<->6
        last.next = head;//now join 6's next to 1 and
        head.prev = last;//join 1's prev to 6
        return curr;//return the rotated list : 3<->4<->5<->6<->1<->2
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