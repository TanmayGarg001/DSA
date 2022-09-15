//28.Given a Linked List of size N, where every node represents a sub-linked-list and contains two pointers:
//(i) a next pointer to the next node,
//(ii) a bottom pointer to a linked list where this node is head.
//Each of the sub-linked-list is in sorted order.
//Flatten the Link List such that all the nodes appear in a single level while maintaining the sorted order.
//Note: The flattened list will be printed using the bottom pointer instead of next pointer.
//https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1#
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main28 {

    public static void main(String[] args) {

    }

    Node flatten(Node root) {
        //TC = O(n^2),MC = O(n)
        //Basic stuff make a arraylist add all the nodes in it and then sort it. at end make a new node and append all the arraylist's element into it and return it.
        ArrayList<Integer> al = new ArrayList<>();
        Node horiz = root;
        while (horiz != null) {
            al.add(horiz.data);
            Node temp = horiz.bottom;
            while (temp != null) {
                al.add(temp.data);
                temp = temp.bottom;
            }
            horiz = horiz.next;
        }
        Collections.sort(al);
        Node ans = new Node(al.get(0));
        root = ans;
        for (int i = 1; i < al.size(); i++) {
            ans.next = new Node(al.get(i));
            ans = ans.next;
        }
        return root;
    }

    static class Node {
        int data;
        Node next;
        Node bottom;

        Node(int d) {
            data = d;
            next = null;
            bottom = null;
        }
    }

}