//https://leetcode.com/problems/max-consecutive-ones/

public class Main6 {

    public int findMaxConsecutiveOnes(int[] nums) {//O(n),O(1)
        int ans = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp++;
            }
            ans = Math.max(temp, ans);
            if (nums[i] == 0) {
                temp = 0;
            }
        }
        return ans;
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
