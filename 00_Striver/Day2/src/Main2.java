//https://leetcode.com/problems/merge-intervals/

import java.util.Arrays;
import java.util.LinkedList;

public class Main2 {//O(nlogn),O(n)

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> ll = new LinkedList<>();
        for (int[] interval : intervals) {
            if (ll.isEmpty() || ll.getLast()[1] < interval[0]) {
                ll.add(interval);
            } else {
                ll.getLast()[1] = Math.max(interval[1], ll.getLast()[1]);
            }
        }
        return ll.toArray(new int[ll.size()][2]);
    }

}
