//https://leetcode.com/problems/two-sum/

import java.util.HashMap;

public class Main1 {

    public int[] twoSum(int[] nums, int target) {//O(n),O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
