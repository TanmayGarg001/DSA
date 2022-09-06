//https://leetcode.com/problems/single-element-in-a-sorted-array/

public class Main2 {

    public int singleNonDuplicate(int[] nums) {//O(logn),O(1)
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    low = mid + 2;
                } else {
                    high = mid - 1;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
        }
        return nums[low];
    }

}
