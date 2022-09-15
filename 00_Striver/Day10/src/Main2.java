//https://leetcode.com/problems/n-queens/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main2 {

    HashSet<Integer> col = new HashSet<>();
    HashSet<Integer> posDiag = new HashSet<>();//(r+c)
    HashSet<Integer> negDiag = new HashSet<>();//(r-c)
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        backtrack(0, n, new ArrayList<>());
        return ans;
    }

    public void backtrack(int row, int n, ArrayList<String> al) {
        if (row == n) {//found a valid solution
            ans.add(new ArrayList<>(al));
            return;
        }
        for (int c = 0; c < n; c++) {
            if (col.contains(c) || posDiag.contains(row + c) || negDiag.contains(row - c)) {//continues if we find queen that has marked this area
                continue;
            }
            char[] arr = new char[n];
            Arrays.fill(arr, '.');
            arr[c] = 'Q';
            String rowAns = new String(arr);

            al.add(rowAns);
            col.add(c);
            posDiag.add(row + c);
            negDiag.add(row - c);

            backtrack(row + 1, n, al);

            al.remove(al.size() - 1);
            col.remove(c);
            posDiag.remove(row + c);
            negDiag.remove(row - c);
        }
    }

}
