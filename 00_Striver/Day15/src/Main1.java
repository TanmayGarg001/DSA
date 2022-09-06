//https://leetcode.com/problems/reverse-words-in-a-string/

public class Main1 {

    public String reverseWords(String s) {//O(n),O(no. of words)
        // ArrayList<String> ans = new ArrayList<>(Arrays.asList(s.spilt(" +")));
        s = s.trim();
        String[] arr = s.split(" +");
        StringBuilder ans = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            ans.append(arr[i] + " ");
        }
        return ans.toString().trim();
    }

}
