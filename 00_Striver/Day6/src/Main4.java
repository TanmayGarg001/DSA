//https://leetcode.com/problems/palindrome-linked-list/

import java.util.ArrayList;
import java.util.Collections;

public class Main4 {

    public boolean isPalindromeFast(ListNode head) {//O(n),O(1)
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        while (prev != null) {
            if (prev.val != head.val) {
                return false;
            }
            prev = prev.next;
            head = head.next;
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {//O(n),O(n)
        ArrayList<Integer> al = new ArrayList<>();
        while (head != null) {
            al.add(head.val);
            head = head.next;
        }
        ArrayList<Integer> al2 = new ArrayList<>(al);
        Collections.reverse(al2);
        return al.equals(al2);
    }

    static public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}

