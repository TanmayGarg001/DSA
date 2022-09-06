//https://leetcode.com/problems/merge-k-sorted-lists/
//https://leetcode.com/problems/merge-k-sorted-lists/discuss/10640/Simple-Java-Merge-Sort
import java.util.PriorityQueue;

public class Main5 {

    public ListNode mergeKLists(ListNode[] lists) {//O(nlogk),O(n)
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(lists.length, (a, b) -> Integer.compare(a.val, b.val));
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;

        for (ListNode node:lists) {
            if (node!=null) {
                minHeap.add(node);
            }
        }

        while (!minHeap.isEmpty()){
            tail.next=minHeap.poll();
            tail=tail.next;

            if (tail.next!=null) {
                minHeap.add(tail.next);
            }
        }
        return dummy.next;
    }

    public static class ListNode {
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
