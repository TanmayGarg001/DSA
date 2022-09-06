//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Main5 {

    public int removeDuplicatesFast(int[] nums) {//O(n),O(1)
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return ++j;
    }

    public int removeDuplicates(int[] nums) {//O(n),O(n)
        LinkedHashSet<Integer> ts = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            ts.add(nums[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>(ts);
        for (int i = 0; i < ans.size(); i++) {
            nums[i] = ans.get(i);
        }
        return ans.size();
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
