//https://www.interviewbit.com/problems/maximum-sum-combinations/

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main3 {

    public int[] solve(int[] arr1, int[] arr2, int k) {//O(nlogn),O(k)
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (pq.size() < k) {
                pq.add(arr1[arr1.length - 1] + arr2[i]);
            }
        }
        for (int i = arr1.length - 2; i >= 0; i--) {
            for (int j = arr2.length - 1; j >= 0; j--) {
                int sum = arr1[i] + arr2[j];
                if (sum < pq.peek()) {
                    break;
                } else {
                    if (pq.size() < k) {
                        pq.add(sum);
                    } else {
                        pq.poll();
                        pq.add(sum);
                    }
                }
            }
        }
        int[] arr = new int[k];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = pq.poll();
        }
        return arr;
    }

}
