//https://leetcode.com/problems/maximum-subarray/

public class Main4 {

    public int maxSubArray(int[] arr) {//O(n),O(1)
        int max = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

}
