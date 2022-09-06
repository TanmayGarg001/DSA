<<<<<<< HEAD
//5.Write a function findFirstLoopNode() that checks whether a given Linked List contains a loop.
//If the loop is present then it returns point to the first node of the loop. Else it returns NULL.
//https://leetcode.com/problems/linked-list-cycle-ii/
package com.company;

import java.util.HashSet;

public class Main5 {

    public static void main(String[] args) {

    }

    public Node detectCycle(Node head) {
        //TC = O(n),MC = O(n)
        HashSet<Node> hs = new HashSet<>();
        Node curr = head;
        while (curr != null) {
            if (hs.contains(curr)) {
                return curr;//this us where loop is starting, basically when we get the same element again that is the node we need to return ofc.
            }
            hs.add(curr);
            curr = curr.next;
        }
        return null;
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
=======
//5.Write a function findFirstLoopNode() that checks whether a given Linked List contains a loop.
//If the loop is present then it returns point to the first node of the loop. Else it returns NULL.
//https://leetcode.com/problems/linked-list-cycle-ii/
package com.company;

import java.util.HashSet;

public class Main5 {

    public static void main(String[] args) {

    }

    public Node detectCycle(Node head) {
        //TC = O(n),MC = O(n)
        HashSet<Node> hs = new HashSet<>();
        Node curr = head;
        while (curr != null) {
            if (hs.contains(curr)) {
                return curr;//this us where loop is starting, basically when we get the same element again that is the node we need to return ofc.
            }
            hs.add(curr);
            curr = curr.next;
        }
        return null;
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
>>>>>>> 26b1aac (Final Commit_1)
