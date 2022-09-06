//https://leetcode.com/problems/permutation-sequence/

import java.util.ArrayList;

public class Main6 {

    public static ArrayList<String> ans = new ArrayList<>();

    public static void main(String[] args) {
        getPermutation(3, 4);
        System.out.println(ans);
    }

    public static String getPermutation(int n, int k) {//O(2^n),O(stack+O(n))
        solve("", n, k, new boolean[n + 1]);
        return ans.get(k - 1);
    }

    public static void solve(String combination, int n, int k, boolean[] track) {
        if (combination.length() == n) {
            ans.add(combination);
            return;
        } else {
            for (int i = 1; i <= n; i++) {
                if (ans.size() == k) {
                    break;
                }
                if (track[i]) {
                    continue;
                }
                track[i] = true;
                String otherComb = combination + i;
                solve(otherComb, n, k, track);
                track[i] = false;
            }
        }
    }

    public static String getPermutationFast(int n, int k) {//O(n),O(1(coz n=9 at max))
        ArrayList<Integer> al = new ArrayList<>();
        int fact = 1;
        for (int i = 1; i < n; i++) {
            fact = fact * i;
            al.add(i);
        }
        al.add(n);
        k = k - 1;
        StringBuilder ans = new StringBuilder();
        while (true) {
            int x = k / fact;
            int y = k % fact;
            ans.append(al.get(x));
            al.remove(x);
            k = y;
            if (ans.length() == n) {
                break;
            }
            fact = fact / al.size();
        }
        return ans.toString();
    }


}
