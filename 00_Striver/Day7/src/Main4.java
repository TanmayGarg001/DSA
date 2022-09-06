//https://leetcode.com/problems/trapping-rain-water/

public class Main4 {

    public int trap(int[] height) {//O(n),O(n)
        int ans = 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        right[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        for (int i = 0; i < height.length; i++) {
            ans = ans + (Math.min(left[i], right[i]) - height[i]);
        }
        return ans;
    }

    public int trapFast(int[] height) {//O(n),O(1)
        int maxLeftSoFar = height[0];
        int maxRightSoFar = height[height.length - 1];
        int l = 0;
        int r = height.length - 1;
        int ans = 0;
        while (l < r) {
            if (maxLeftSoFar < maxRightSoFar) {
                l++;
                maxLeftSoFar = Math.max(maxLeftSoFar, height[l]);
                ans += maxLeftSoFar - height[l];
            } else {
                r--;
                maxRightSoFar = Math.max(maxRightSoFar, height[r]);
                ans += maxRightSoFar - height[r];
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
