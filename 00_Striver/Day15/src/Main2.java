//https://leetcode.com/problems/longest-palindromic-substring/

public class Main2 {

    public String longestPalindrome(String s) {//O(n),O(1)
        int maxPalindrome = 1;
        int start = 0;
        int low;
        int high;
        String ans = "";
        for (int i = 1; i < s.length(); i++) {
            low = i - 1;
            high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
            low++;
            high--;
            if (s.charAt(low) == s.charAt(high) && high - low + 1 > maxPalindrome) {
                maxPalindrome = high - low + 1;
                start = low;
            }
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
            low++;
            high--;
            if (s.charAt(low) == s.charAt(high) && high - low + 1 > maxPalindrome) {
                maxPalindrome = high - low + 1;
                start = low;
            }

        }
        return s.substring(start, start + maxPalindrome);
    }

}
