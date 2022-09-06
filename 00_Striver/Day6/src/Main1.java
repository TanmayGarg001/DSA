//https://leetcode.com/problems/intersection-of-two-linked-lists/

public class Main1 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {//O(n),O(1)
        ListNode n1 = headA;
        ListNode n2 = headB;
        while (n1 != n2) {
            if (n1 == null) {
                n1 = headB;
            } else {
                n1 = n1.next;
            }
            if (n2 == null) {
                n2 = headA;
            } else {
                n2 = n2.next;
            }
        }
        return n1;
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
