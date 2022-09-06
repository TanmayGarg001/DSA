<<<<<<< HEAD
//31.You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
//Merge all the linked-lists into one sorted linked-list and return it.
//https://leetcode.com/problems/merge-k-sorted-lists/
//https://practice.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1#
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main31 {

    public static void main(String[] args) {

    }

    Node mergeKList(Node[] arr) {
        //TC = O(n^2),MC = O(n)
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Node head = arr[i];
            while (head != null) {//We select lists in given arr and keep adding the nodes innit to arrayList.
                al.add(head.data);
                head = head.next;
            }
        }
        Collections.sort(al);//Now simply sort the list and make a new Node and keep appending al's element to the node and return it accordingly.
        Node ans = new Node(-1);
        Node temp = ans;
        for (int i = 0; i < al.size(); i++) {
            ans.next = new Node(al.get(i));
            ans = ans.next;
        }
        return temp.next;
    }

    static class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }
}
=======
//31.You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
//Merge all the linked-lists into one sorted linked-list and return it.
//https://leetcode.com/problems/merge-k-sorted-lists/
//https://practice.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1#
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main31 {

    public static void main(String[] args) {

    }

    Node mergeKList(Node[] arr) {
        //TC = O(n^2),MC = O(n)
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Node head = arr[i];
            while (head != null) {//We select lists in given arr and keep adding the nodes innit to arrayList.
                al.add(head.data);
                head = head.next;
            }
        }
        Collections.sort(al);//Now simply sort the list and make a new Node and keep appending al's element to the node and return it accordingly.
        Node ans = new Node(-1);
        Node temp = ans;
        for (int i = 0; i < al.size(); i++) {
            ans.next = new Node(al.get(i));
            ans = ans.next;
        }
        return temp.next;
    }

    static class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }
}
>>>>>>> 26b1aac (Final Commit_1)
