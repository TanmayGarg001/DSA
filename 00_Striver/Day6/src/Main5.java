//https://leetcode.com/problems/linked-list-cycle-ii/

import java.util.HashSet;

public class Main5 {

    public ListNode detectCycleFast(ListNode head) {//O(n),O(1)
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode slow2 = head;
                while (slow2 != slow) {
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        return null;
    }

    public ListNode detectCycle(ListNode head) {//O(n),O(n)
        HashSet<ListNode> hs = new HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            if (hs.contains(curr)) {
                return curr;
            }
            hs.add(curr);
            curr = curr.next;
        }
        return null;
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
