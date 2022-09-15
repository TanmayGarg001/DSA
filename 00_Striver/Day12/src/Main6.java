//https://leetcode.com/problems/top-k-frequent-elements/

import java.util.HashMap;
import java.util.PriorityQueue;

public class Main6 {//O(klogd),O(n)//N = # of elements in the input array
                    //D = # of distinct (unique) elements in the input array
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(hmap.get(b), hmap.get(a)));
        for (int key : hmap.keySet()) {
            pq.add(key);
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }

}
