//https://leetcode.com/problems/pascals-triangle/

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public List<List<Integer>> generate(int numRows) {//O(n*m),O(n*m)
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>(List.of(1));
        ans.add(temp);
        if (numRows == 1) {
            return ans;
        }
        ArrayList<Integer> temp2 = new ArrayList<>(List.of(1, 1));
        ans.add(temp2);
        if (numRows == 2) {
            return ans;
        }
        for (int i = 1; i < numRows - 1; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(1);
            for (int j = 0; j < ans.size() - 1; j++) {
                al.add(ans.get(ans.size() - 1).get(j) + ans.get(ans.size() - 1).get(j + 1));
            }
            al.add(1);
            ans.add(al);
        }
        return ans;
    }

}
