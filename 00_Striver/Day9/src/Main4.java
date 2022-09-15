//https://leetcode.com/problems/combination-sum-ii/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main4 {

    static List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        combinationSum2(new int[]{1, 1, 3, 5, 7, 2, 2}, 8);
        System.out.println(ans);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {//O(2^n),O(stack+O(n))
        Arrays.sort(candidates);
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
                if (i > start && arr[i] == arr[i - 1]) {
                    continue;
                }
                al.add(arr[i]);
                solve(arr, w - arr[i], al, i + 1);
                al.remove(al.size() - 1);
            }
        }
    }

}
