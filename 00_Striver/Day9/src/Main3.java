//https://leetcode.com/problems/combination-sum/

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    static List<List<Integer>> ans = new ArrayList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {//O(2^n),O(stack+O(n))
        solve(candidates, target, new ArrayList<>(), 0);
        return ans;
    }

    public static void solve(int[] arr, int w, ArrayList<Integer> al, int start) {
        if (w < 0) {
            return;
        } else if (w == 0) {
            ans.add(new ArrayList<>(al));
        } else {
            for (int i = start; i < arr.length; i++) {
                al.add(arr[i]);
                solve(arr, w - arr[i], al, start);
                al.remove(al.size() - 1);
            }
        }
    }

}
