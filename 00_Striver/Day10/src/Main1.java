//https://leetcode.com/problems/permutations/

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    private static List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(permute(arr));
    }

    public static List<List<Integer>> permute(int[] nums) {
        solve(nums, nums.length, new ArrayList<>());
        return ans;
    }

    public static void solve(int[] arr, int n, ArrayList<Integer> al) {
        if (al.size() == n) {
            ans.add(new ArrayList<>(al));
            return;
        } else {
            for (int i = 0; i < n; i++) {
                if (al.contains(arr[i])) {
                    continue;
                }
                al.add(arr[i]);
                solve(arr, n, al);
                al.remove(al.size() - 1);
            }
        }
    }

}
