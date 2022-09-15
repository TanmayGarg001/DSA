//https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1/

import java.util.Arrays;

public class Main1 {
    
    public int findMedian(int[][] grid) {//O(rlogc),O(1)
        int row = grid.length;
        int col = grid[0].length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < row; i++) {
            min = Math.min(min, grid[i][0]);
            max = Math.max(max, grid[i][col - 1]);
        }
        int numSmallerThanMedian = (col * row + 1) / 2;
        while (min < max) {
            int mid = min + (max - min) / 2;
            int count;
            int total = 0;
            for (int i = 0; i < row; i++) {
                count = Arrays.binarySearch(grid[i], mid);
                if (count < 0) {
                    count = Math.abs(count + 1);
                } else {
                    while (count < col && grid[i][count] == mid) {
                        count++;
                    }
                }
                total += count;
            }
            if (total < numSmallerThanMedian) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }

}
