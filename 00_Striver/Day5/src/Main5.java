//https://leetcode.com/problems/add-two-numbers/


public class Main5 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {//O(n),(1)
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode ans = null;
        ListNode prev = null;
        int carry = 0;
        while (n1 != null || n2 != null) {
            int sum = 0;
            if (n1 != null) {
                sum = sum + n1.val;
                n1 = n1.next;
            }
            if (n2 != null) {
                sum = sum + n2.val;
                n2 = n2.next;
            }
            sum = sum + carry;
            carry = sum / 10;
            int digit = sum % 10;
            ListNode toAdd = new ListNode(digit);
            if (ans == null) {
                ans = toAdd;
            } else {
                prev.next = toAdd;
            }
            prev = toAdd;
        }
        if (carry != 0) {
            prev.next = new ListNode(carry);
        }
        return ans;
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
