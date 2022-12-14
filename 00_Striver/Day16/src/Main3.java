//https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/

public class Main3 {

    public int minInsertions(String str) {//O(n^2),O(n^2)
        StringBuilder sb1 = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder(str);
        sb2.reverse();
        int[][] t = new int[str.length() + 1][str.length() + 1];
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 1; j <= str.length(); j++) {
                if (sb1.charAt(i - 1) == sb2.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
                }
            }
        }
        return str.length() - t[sb1.length()][sb2.length()];
    }

}

