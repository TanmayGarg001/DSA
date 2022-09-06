//https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1

import java.util.HashMap;

public class Main4 {

    int maxLen(int[] arr, int n) {//O(n),O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            } else {
                ans = Math.max(ans, i - map.get(sum));
            }
        }
        return ans;
    }

}
