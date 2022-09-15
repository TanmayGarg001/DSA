//https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1#

import java.util.Arrays;

public class Main2 {

    static int findPlatform(int[] arr, int[] dep) {//O(nlogn),O(1)
        Arrays.sort(arr);
        Arrays.sort(dep);
        int j = 0;
        int platformCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= dep[j]) {
                platformCount++;
            } else {
                j++;
            }
        }
        return platformCount;
    }

}

