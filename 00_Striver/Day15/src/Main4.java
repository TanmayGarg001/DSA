//https://leetcode.com/problems/repeated-string-match/discuss/416144/Rabin-Karp-algorithm-C%2B%2B-implementation

public class Main4 {

    public static void main(String[] args) {
        rabinKarp("AABAACAADAABAABA", "AABA");
        KMP("AABAACAADAABAABA", "AABA");
    }

    public static void rabinKarp(String txt, String pat) {
        //TC = O(n+m)==nearly O(n) due to hashCode(),MC= O(1)
        int hc = pat.hashCode();
        int j = pat.length();
        for (int i = 0; i <= txt.length() - pat.length(); i++, j++) {
            String temp = txt.substring(i, j);
            int hcTemp = temp.hashCode();
            if (hcTemp == hc && temp.equals(pat)) {
                System.out.println(i + ": " + temp);
            }
        }
    }

    public static void KMP(String str, String pat) {
        //TC = O(n) in the Best case and O(m*(n-m+1)) in the worst case.
        int M = pat.length();
        int N = str.length();
        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++) {
                if (str.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            if (j == M) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }

}
