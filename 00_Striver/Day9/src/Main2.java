//https://leetcode.com/problems/subsets-ii/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {//O(2^n),O(stack+O(n))
        solve(nums, new ArrayList<>(), nums.length);
        return ans;
    }

    public void solve(int[] arr, ArrayList<Integer> op, int n) {
        if (n == 0) {
            Collections.sort(op);
            if (!ans.contains(op)) {
                ans.add(op);
            }
            return;
        }
        ArrayList<Integer> op1 = new ArrayList<>(op);
        ArrayList<Integer> op2 = new ArrayList<>(op);
        op2.add(arr[n - 1]);
        solve(arr, op1, n - 1);
        solve(arr, op2, n - 1);
    }

}
