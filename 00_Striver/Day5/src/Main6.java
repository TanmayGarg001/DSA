//https://leetcode.com/problems/delete-node-in-a-linked-list/

public class Main6 {

    public void deleteNode(ListNode node) {//O(1),O(1)
        node.val = node.next.val;
        node.next = node.next.next;
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

