//https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.Arrays;

public class Main3 {

    public int longestConsecutive(int[] nums) {//O(nlogn),O(1)
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int ans = 1;
        int temp = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            if (nums[i] + 1 == nums[i + 1]) {
                temp++;
                ans = Math.max(ans, temp);
            } else {
                temp = 1;
            }
        }
        return ans;
    }

}
