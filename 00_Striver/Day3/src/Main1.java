//https://leetcode.com/problems/search-a-2d-matrix/

public class Main1 {

    public boolean searchMatrix(int[][] matrix, int target) {//O(log(m*n)),O(1)
        int low = 0;
        int high = (matrix.length * matrix[0].length) - 1;
        while (high >= low) {
            int mid = low + ((high - low) / 2);
            int x = mid / matrix[0].length;
            int y = mid % matrix[0].length;
            if (matrix[x][y] == target) {
                return true;
            } else if (matrix[x][y] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

}
