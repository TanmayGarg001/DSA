<<<<<<< HEAD
//32.Given elements as nodes of the two linked lists. The task is to multiply these two linked lists, say L1 and L2.
//https://practice.geeksforgeeks.org/problems/multiply-two-linked-lists/1#
package com.company;

public class Main32 {

    public static void main(String[] args) {

    }

    public long multiplyTwoLists(Node l1, Node l2) {
        //TC = O(n),MC = O(1)
        //Basic Maths stuff.
        long N = 1000000007;
        long a = 0;
        long b = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                a = (a * 10) % N + l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = (b * 10) % N + l2.data;
                l2 = l2.next;
            }
        }
        return ((a % N) * (b % N) % N);
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
=======
//32.Given elements as nodes of the two linked lists. The task is to multiply these two linked lists, say L1 and L2.
//https://practice.geeksforgeeks.org/problems/multiply-two-linked-lists/1#
package com.company;

public class Main32 {

    public static void main(String[] args) {

    }

    public long multiplyTwoLists(Node l1, Node l2) {
        //TC = O(n),MC = O(1)
        //Basic Maths stuff.
        long N = 1000000007;
        long a = 0;
        long b = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                a = (a * 10) % N + l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = (b * 10) % N + l2.data;
                l2 = l2.next;
            }
        }
        return ((a % N) * (b % N) % N);
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
