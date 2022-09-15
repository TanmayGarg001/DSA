//https://leetcode.com/problems/reverse-nodes-in-k-group/

public class Main3 {

    public static ListNode reverseKGroup(ListNode head, int k) {//O(n),O(1)
        if (head == null || head.next == null) {
            return head;
        }
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return solve(head, k, len);
    }

    public static ListNode solve(ListNode head, int k, int len) {
        if (k > len) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        int i = 0;
        while (i < k) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            i++;
        }
        head.next = solve(curr, k, len - k);
        return prev;
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
