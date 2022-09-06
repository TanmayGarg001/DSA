<<<<<<< HEAD
//14.Sort the given Linked List using quicksort. which takes O(n^2) time in worst case and O(nLogn) in average and best cases, otherwise you may get TLE.
//https://practice.geeksforgeeks.org/problems/quick-sort-on-linked-list/1
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main14 {

    public static void main(String[] args) {
        //Solution : https://www.geeksforgeeks.org/quicksort-on-singly-linked-list/
    }

    public static Node quickSort(Node head) {
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
=======
//14.Sort the given Linked List using quicksort. which takes O(n^2) time in worst case and O(nLogn) in average and best cases, otherwise you may get TLE.
//https://practice.geeksforgeeks.org/problems/quick-sort-on-linked-list/1
package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class Main14 {

    public static void main(String[] args) {
        //Solution : https://www.geeksforgeeks.org/quicksort-on-singly-linked-list/
    }

    public static Node quickSort(Node head) {
        //TC = O(nlogn), MC = O(n)
        //Here I am solving this using the fastest way to sort, but for typical solution mof merge sort see the solution link.
        if (head == null || head.next == null) {//edge case
            return head;
        }
        LinkedList<Integer> ll = new LinkedList<>();
        Node temp = head;
        while (temp != null) {
            ll.add(temp.data);
            temp = temp.next;
        }
        temp = head;
        Collections.sort(ll);
        while (temp != null) {
            temp.data = ll.removeFirst();
            temp = temp.next;
        }
        return head;
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
>>>>>>> 26b1aac (Final Commit_1)
