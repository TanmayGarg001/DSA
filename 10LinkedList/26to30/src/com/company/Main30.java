//30.A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.
//Construct a deep copy of the list. The deep copy should consist of exactly n brand-new nodes, where each new node has its value set to the value of its
// corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in
// the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.
//https://leetcode.com/problems/copy-list-with-random-pointer/
//https://practice.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1#
package com.company;

import java.util.HashMap;

public class Main30 {

    public static void main(String[] args) {

    }

    public Node copyRandomList(Node head) {
        //TC = O(n),MC = O(n)
        if (head == null) {
            return null;
        }
        HashMap<Node, Node> map = new HashMap<>();

        // loop 1. copy all the nodes
        Node temp = head;
        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        // loop 2. assign next and random pointers
        temp = head;
        while (temp != null) {
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }

    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

}