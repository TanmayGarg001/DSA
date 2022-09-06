<<<<<<< HEAD
//16.Given head, the head of a singly linked list, find if the linked list is circular or not.
//A linked list is called circular if it is not NULL terminated and all nodes are connected in the form of a cycle. An empty linked list is considered as circular.
//https://practice.geeksforgeeks.org/problems/circular-linked-list/1#
package com.company;

public class Main16 {

    public static void main(String[] args) {

    }

    public static boolean isCircular(Node head) {
        //TC = O(n),MC = O(1)
        if (head.next == null) {
            return false;//edge case
        }
        Node temp = head.next;
        while (temp.next != null) {//keep looping till null is found i.e. list is linear without loop, so it will exit while loop and return file
            if (temp == head) {//else if we found a link which connects to the head then we return true
                return true;
            }
            temp = temp.next;
        }
        return false;
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
//16.Given head, the head of a singly linked list, find if the linked list is circular or not.
//A linked list is called circular if it is not NULL terminated and all nodes are connected in the form of a cycle. An empty linked list is considered as circular.
//https://practice.geeksforgeeks.org/problems/circular-linked-list/1#
package com.company;

public class Main16 {

    public static void main(String[] args) {

    }

    public static boolean isCircular(Node head) {
        //TC = O(n),MC = O(1)
        if (head.next == null) {
            return false;//edge case
        }
        Node temp = head.next;
        while (temp.next != null) {//keep looping till null is found i.e. list is linear without loop, so it will exit while loop and return file
            if (temp == head) {//else if we found a link which connects to the head then we return true
                return true;
            }
            temp = temp.next;
        }
        return false;
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
