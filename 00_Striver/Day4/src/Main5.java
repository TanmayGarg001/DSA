//https://www.interviewbit.com/problems/subarray-with-given-xor/

import java.util.HashMap;

public class Main5 {

    public int solve(int[] arr, int target) {//O(n),O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
            if (map.get(xor ^ target) != null) {
                count += map.get(xor ^ target);
            }
            if (xor == target) {
                count++;
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }

}
