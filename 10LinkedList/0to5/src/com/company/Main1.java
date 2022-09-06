<<<<<<< HEAD
//1.Given a linked list of N nodes. The task is to reverse this list.
//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1/#
package com.company;

public class Main1 {

    public static void main(String[] args) {

    }

    public Node reverseLinkedListIteratively(Node head) {
        //TC = O(n),MC = O(1)
        Node prev = null;
        while (head != null) {
            Node nextNode = head.next;//we need to reverse linked lists, so we change links 1 by 1 in whole list, and so we detach next from list and reverse that first.
            head.next = prev;//break the link and connect to prev link to reverse
            prev = head;//move prev by 1 link
            head = nextNode;//move head by 1 link
        }
        return prev;
    }

    public Node reverseLinkedListRecursively(Node head) {
        //TC = O(n),MC = O(stack)
        if (head == null || head.next == null) {
            return head;
        }
        Node nextNode = head.next;//extract the whole linked list excluding the very 1st element
        Node newHead = reverseLinkedListRecursively(nextNode);//do the same thing for that linked list
        nextNode.next = head;//the extracted list will point to the prev link i.e. the head in this case.
        head.next = null;//base case for head
        return newHead;
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
//1.Given a linked list of N nodes. The task is to reverse this list.
//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1/#
package com.company;

public class Main1 {

    public static void main(String[] args) {

    }

    public Node reverseLinkedListIteratively(Node head) {
        //TC = O(n),MC = O(1)
        Node prev = null;
        while (head != null) {
            Node nextNode = head.next;//we need to reverse linked lists, so we change links 1 by 1 in whole list, and so we detach next from list and reverse that first.
            head.next = prev;//break the link and connect to prev link to reverse
            prev = head;//move prev by 1 link
            head = nextNode;//move head by 1 link
        }
        return prev;
    }

    public Node reverseLinkedListRecursively(Node head) {
        //TC = O(n),MC = O(stack)
        if (head == null || head.next == null) {
            return head;
        }
        Node nextNode = head.next;//extract the whole linked list excluding the very 1st element
        Node newHead = reverseLinkedListRecursively(nextNode);//do the same thing for that linked list
        nextNode.next = head;//the extracted list will point to the prev link i.e. the head in this case.
        head.next = null;//base case for head
        return newHead;
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
