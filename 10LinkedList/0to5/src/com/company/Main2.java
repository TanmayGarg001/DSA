<<<<<<< HEAD
//2.Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.k is a positive integer and is less than or equal
//to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes,in the end, should remain as it is.
//You may not alter the values in the list's nodes, only nodes themselves may be changed.
//https://leetcode.com/problems/reverse-nodes-in-k-group/
//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1
package com.company;

public class Main2 {

    public static void main(String[] args) {

    }

    public static Node reverseKGroup(Node head, int k) {//1
        //TC = O(n),MC = O(stack)
        if (head == null) {
            return null;
        }
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (length < k) return head;//till here its pretty basic stuff
        return ReverseLL(head, k, length);
    }

    public static Node ReverseLL(Node head, int k, int rem) {
        if (rem < k) {
            return head;
        }
        int i = 0;
        Node curr = head;
        Node nextNode;
        Node prev = null;
        while (i < k) {//this will reverse the 'k' links
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
            i++;
        }
        head.next = ReverseLL(curr, k, rem - k);//this will keep calling at fewer chunks of the function, basically works on remaining part of list (n-k)
        return prev;
    }

    public static Node reverse(Node head, int k) {//2
        //TC = O(n),MC = O(stack)
        Node curr = head;
        Node prev = null;
        Node temp = null;
        int i = 0;
        while (curr != null && i < k) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            i++;
        }
        if (curr != null) {
            head.next = reverse(temp, k);
        }
        return prev;
    }

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

}
=======
//2.Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.k is a positive integer and is less than or equal
//to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes,in the end, should remain as it is.
//You may not alter the values in the list's nodes, only nodes themselves may be changed.
//https://leetcode.com/problems/reverse-nodes-in-k-group/
//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1
package com.company;

public class Main2 {

    public static void main(String[] args) {

    }

    public static Node reverseKGroup(Node head, int k) {//1
        //TC = O(n),MC = O(stack)
        if (head == null) {
            return null;
        }
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (length < k) return head;//till here its pretty basic stuff
        return ReverseLL(head, k, length);
    }

    public static Node ReverseLL(Node head, int k, int rem) {
        if (rem < k) {
            return head;
        }
        int i = 0;
        Node curr = head;
        Node nextNode;
        Node prev = null;
        while (i < k) {//this will reverse the 'k' links
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
            i++;
        }
        head.next = ReverseLL(curr, k, rem - k);//this will keep calling at fewer chunks of the function, basically works on remaining part of list (n-k)
        return prev;
    }

    public static Node reverse(Node head, int k) {//2
        //TC = O(n),MC = O(stack)
        Node curr = head;
        Node prev = null;
        Node temp = null;
        int i = 0;
        while (curr != null && i < k) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            i++;
        }
        if (curr != null) {
            head.next = reverse(temp, k);
        }
        return prev;
    }

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
