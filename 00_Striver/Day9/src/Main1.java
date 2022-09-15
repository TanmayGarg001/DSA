//https://practice.geeksforgeeks.org/problems/subset-sums2234/1

import java.util.ArrayList;

public class Main1 {

    public static void solve(ArrayList<Integer> al, ArrayList<Integer> ans, int sum, int n) {//O(2^n),O(stack)
        if (n == 0) {
            ans.add(sum);
            return;
        }
        solve(al, ans, sum, n - 1);
        solve(al, ans, sum + al.get(n - 1), n - 1);
    }

}
