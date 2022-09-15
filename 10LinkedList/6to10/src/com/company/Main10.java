//10.You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
//and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1
//https://leetcode.com/problems/add-two-numbers/
package com.company;

public class Main10 {

    public static void main(String[] args) {

    }

    static Node addTwoLists(Node l1, Node l2) {//due to same reason as prev Que
        //TC = O(n),MC = O(n)
        Node n1 = reverse(l1);//we reverse both the lists
        Node n2 = reverse(l2);
        Node ans = null;
        Node prev = null;
        int carry = 0;
        while (n1 != null || n2 != null) {//as l1 and l2 can have diff sizes, so we keep on going till both hit null
            int sum = 0;//to store sum of current nodes
            if (n1 != null) {
                sum = sum + n1.data;
            }
            if (n2 != null) {
                sum = sum + n2.data;
            }
            sum = sum + carry;
            carry = sum / 10;//extract carry from a sum
            sum = sum % 10;//extract the digit from sum which will be added in the answer
            Node node = new Node(sum);//make a new node with data as sum
            if (ans == null) {//initialize ans node for very 1st time
                prev = node;
                ans = node;
            } else {//after that we keep appending new nodes to our answer
                prev.next = node;
                prev = node;
            }
            //move n1 and n2 only if it is possible
            if (n1 != null) {
                n1 = n1.next;
            }
            if (n2 != null) {
                n2 = n2.next;
            }
        }
        if (carry != 0) {//if at very last carry is still left then
            prev.next = new Node(carry);//we make a new node and add that after the last link
        }
        ans = reverse(ans);//and at very last we reverse again to make the answer in correct direction links.
        return ans;
    }

    static Node reverse(Node head) {//reverses the whole linked list or reverses the links bw the list
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