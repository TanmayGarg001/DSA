//https://leetcode.com/problems/rotate-list/

public class Main1 {

    public ListNode rotateRight(ListNode head, int k) {//O(n),O(1)
        if (head == null || k == 0) {
            return head;
        }
        ListNode temp = head;
        int len = 1;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }
        temp.next = head;
        k %= len;
        for (int i = 0; i < len - k; i++) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }

    static public class ListNode {
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
