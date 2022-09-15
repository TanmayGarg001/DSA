//https://leetcode.com/problems/find-the-duplicate-number/

public class Main4 {

    public int findDuplicate(int[] nums) {//O(n),O(1)
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public int findDuplicateLittlefaster(int[] nums) {//O(n),O(n)
        boolean[] arr = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (arr[nums[i]]) {
                return nums[i];
            }
            arr[nums[i]] = true;
        }
        return -1;
    }

}
