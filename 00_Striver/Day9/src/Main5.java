//https://leetcode.com/problems/palindrome-partitioning/

import java.util.ArrayList;
import java.util.List;

public class Main5 {

    private static List<List<String>> ans = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }

    public static List<List<String>> partition(String s) {//O(2^n),O(stack+O(n))
        solve(s, new ArrayList<>(), 0);
        return ans;
    }

    public static void solve(String s, ArrayList<String> al, int start) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(al));
        } else {
            for (int i = start; i < s.length(); i++) {
                if (isPalindrome(s, start, i)) {
                    al.add(s.substring(start, i + 1));
                    solve(s, al, i + 1);
                    al.remove(al.size() - 1);
                }
            }
        }
    }

    public static boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

}
