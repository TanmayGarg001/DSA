//https://leetcode.com/problems/majority-element/

import java.util.ArrayList;
import java.util.HashMap;

public class Main3 {

    public int majorityElement(int[] nums) {//O(n),O(n)
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0) + 1);
        }
        ArrayList<Integer> values = new ArrayList<>(hmap.values());
        ArrayList<Integer> keys = new ArrayList<>(hmap.keySet());
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) > nums.length / 2) {
                return keys.get(i);
            }
        }
        return -1;
    }

}