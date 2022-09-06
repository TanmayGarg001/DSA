//https://leetcode.com/problems/reverse-linked-list/

import java.util.ArrayList;

public class Main1 {

    public ListNode reverseListFast(ListNode head) {//O(n),O(1)
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public ListNode reverseList(ListNode head) {//O(n),O(n)
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            al.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        for (int i = al.size() - 1; i >= 0; i--) {
            temp.val = al.get(i);
            temp = temp.next;
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}

