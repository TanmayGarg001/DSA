//https://leetcode.com/problems/search-in-rotated-sorted-array/

public class Main3 {

    public int search(int[] nums, int target) {//O(logn),O(1)
        int index = findSmallestNum(nums);
        return Math.max(binarySearch(nums, 0, index - 1, target), binarySearch(nums, index, nums.length - 1, target));
    }

    public int findSmallestNum(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public int binarySearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
