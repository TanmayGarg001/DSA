//https://leetcode.com/problems/kth-largest-element-in-an-array/

import java.util.PriorityQueue;

public class Main2 {

    public int findKthLargest(int[] nums, int k) {//O(nlogk),O(k)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

}
