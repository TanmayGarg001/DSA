//https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1#

import java.util.Arrays;

public class Main4 {

    double fractionalKnapsack(int W, Item[] arr, int n) {//O(nlogn),O(1)
        Arrays.sort(arr, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));
        int currWeight = 0;
        double resValue = 0.0;
        for (int i = 0; i < n; i++) {
            if (currWeight + arr[i].weight <= W) {
                currWeight += arr[i].weight;
                resValue += arr[i].value;
            } else {
                int remain = W - currWeight;
                resValue += ((double) arr[i].value / (double) arr[i].weight) * (double) remain;
                break;
            }
        }
        return resValue;
    }

    static class Item {
        int value, weight;

        Item(int x, int y) {
            this.value = x;
            this.weight = y;
        }
    }
}
