//https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1#

import java.util.Arrays;

public class Main3 {

    int[] JobScheduling(Job[] arr, int n) {
        int maxDeadline = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxDeadline = Math.max(maxDeadline, arr[i].deadline);
        }
        int[] vacancy = new int[maxDeadline];
        Arrays.sort(arr, (a, b) -> Integer.compare(b.profit, a.profit));
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].deadline - 1; j >= 0; j--) {
                if (vacancy[j] == 0) {
                    sum = sum + arr[i].profit;
                    vacancy[j] = 1;
                    count++;
                    break;
                }
            }
        }
        int[] ans = new int[2];
        ans[0] = count;
        ans[1] = sum;
        return ans;
    }

    static class Job {
        int id, profit, deadline;

        Job(int x, int y, int z) {
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }
}
