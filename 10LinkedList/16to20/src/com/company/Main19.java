<<<<<<< HEAD
//19.Given a node and our task is to delete that node from the circular linked list.
//https://www.geeksforgeeks.org/deletion-circular-linked-list/
package com.company;

public class Main19 {

    public static void main(String[] args) {

    }

    public static Node deleteKey(Node head, int key) {
        //TC = O(n),MC = O(1)
        Node temp = head;
        if (temp.data == key && temp.next == null) {//this will take care if list has only 1 element
            return null;
        }
        if (temp.data == key) {//this will take care if the key is very 1st element in the linked list.
            Node ans = head;
            while (true) {
                if (ans.next.data == head.data) {
                    ans.next = head.next;
                    break;
                }
                ans = ans.next;
            }
            return ans;
        }
        while (temp.next != null) {//this will find the key and once we find it we break the link and make a new link skipping that key.
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
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
//19.Given a node and our task is to delete that node from the circular linked list.
//https://www.geeksforgeeks.org/deletion-circular-linked-list/
package com.company;

public class Main19 {

    public static void main(String[] args) {

    }

    public static Node deleteKey(Node head, int key) {
        //TC = O(n),MC = O(1)
        Node temp = head;
        if (temp.data == key && temp.next == null) {//this will take care if list has only 1 element
            return null;
        }
        if (temp.data == key) {//this will take care if the key is very 1st element in the linked list.
            Node ans = head;
            while (true) {
                if (ans.next.data == head.data) {
                    ans.next = head.next;
                    break;
                }
                ans = ans.next;
            }
            return ans;
        }
        while (temp.next != null) {//this will find the key and once we find it we break the link and make a new link skipping that key.
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
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
