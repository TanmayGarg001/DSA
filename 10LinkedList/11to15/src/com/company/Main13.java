//13.Given Pointer/Reference to the head of the linked list, the task is to Sort the given linked list using Merge Sort.
//Note: If the length of linked list is odd, then the extra node should go in the first list while splitting.
//Merge Sort for Linked List
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main13 {

    public static void main(String[] args) {
        //Solution : https://www.techiedelight.com/merge-sort-singly-linked-list/
    }

    public static Node mergeSort(Node head) {
        //TC = O(nlogn), MC = O(n)
        //Here I am solving this using the fastest way to sort, but for typical solution mof merge sort see the solution link.
        if (head == null || head.next == null) {//edge case
            return head;
        }
        ArrayList<Integer> al = new ArrayList<>();
        while (head != null) {
            al.add(head.data);
            head = head.next;
        }
        Collections.sort(al);//sort the arrayList
        Node ans = new Node(al.get(0));//make a new node which has al.get(0) as its data
        Node res = ans;//make a new node that points to head of the ans, and we will return this it at end.
        for (int i = 1; i < al.size(); i++) {//basic looping
            ans.next = new Node(al.get(i));
            ans = ans.next;
        }
        return res;
    }

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

}