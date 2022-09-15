//https://www.spoj.com/problems/AGGRCOW/

import java.util.Arrays;
import java.util.Scanner;

public class Main6 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int t = scanner.nextInt();
//        while (t != 0) {
//            int n = scanner.nextInt();
//            int c = scanner.nextInt();
//            int[] stalls = new int[n];
//            for (int i = 0; i < n; i++) {
//                stalls[i] = scanner.nextInt();
//            }
//            System.out.println(aggressiveCows(stalls, c));
//            t--;
//        }
    }

    public static int aggressiveCows(int[] stalls, int cows) {//O(nlogn),O(1)
        Arrays.sort(stalls);
        int low = 0;
        int high = stalls[stalls.length - 1] - stalls[0];//can take high (int)1e9 but here its obvious what it will be so ezpz or max of stalls arr[]
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isDistanceValid(stalls, mid, cows)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isDistanceValid(int[] stalls, int dis, int k) {//T,T,T,T,T,F,F,F,F
        int cows = 1;
        int lastCowPos = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastCowPos >= dis) {
                cows++;
                lastCowPos = stalls[i];
                if (cows == k) {
                    return true;
                }
            }
        }
        return false;
    }

}
