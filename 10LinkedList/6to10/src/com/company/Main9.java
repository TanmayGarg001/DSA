//9.A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.
//https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#
package com.company;

public class Main9 {

    public static void main(String[] args) {

    }


    public static Node addOne(Node head) {
        //TC = O(n),MC = O(n) //coz at several points we store the reverse List [Nodes connected in reverse order] in memory
        //For list like: 4->5->6->8 ans us easy to calculate i.e. it would be 4569 just move to the last link and add 1 to it.
        Node tmp = head;//but if list ends with 9 or is something like 9->9->9->9->9 then it's a problem
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        if (tmp.data != 9) {
            tmp.data = tmp.data + 1;
        } else {//this is how we will take care of the case when last link is 9: we reverse the linked list and add one to the head and keep on adding 1 till the node.data!=9
            Node res = reverse(head);
            Node temp = res;
            while (true) {
                if (temp == null) {
                    temp = new Node(tmp.data + 1);
                }
                if (temp.data == 9) {
                    temp.data = 0;
                } else {
                    temp.data = temp.data + 1;
                    break;
                }
                temp = temp.next;
            }
            Node ans = reverse(res);
            if (ans.data == 0) {//this takes care when list is of all 9's only.
                Node n = new Node(1);
                n.next = ans;
                return n;
            }
            return ans;
        }
        return head;
    }

    public static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
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