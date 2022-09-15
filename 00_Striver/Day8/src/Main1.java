//https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1#

import java.util.Arrays;

public class Main1 {

    public static int maxMeetings(int[] start, int[] end) {//O(m+n(log(m+n)),O(m+n)
        int[][] arr = new int[start.length][2];
        for (int i = 0; i < start.length; i++) {
            arr[i][0] = end[i];
            arr[i][1] = start[i];
        }
        int count = 1;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int endTime = arr[0][0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][1] > endTime) {
                count++;
                endTime = arr[i][0];
            }
        }
        return count;
    }

}
