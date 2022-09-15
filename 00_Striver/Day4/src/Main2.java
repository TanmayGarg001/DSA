//https://leetcode.com/problems/4sum/

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 3, 2, 1};
        doubleSum(arr, 6);
    }

    public static List<List<Integer>> fourSum(int[] arr, int target) {//O(n^3),O(n^2)
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 2; j++) {
                int left = j + 1;
                int right = arr.length - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == target) {
                        set.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static List<List<Integer>> doubleSum(int[] arr, int target) {//O(n^3),O(n^2)
        HashMap<Integer, ArrayList<ArrayList<Integer>>> store = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i] + arr[j];
                ArrayList<Integer> al = new ArrayList<>(List.of(i, j));
                if (!store.containsKey(temp)) {
                    store.put(temp, new ArrayList<>());
                }
                store.get(temp).add(al);
            }
        }
        HashSet<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i] + arr[j];
                if (store.containsKey(target - temp)) {
                    ArrayList<ArrayList<Integer>> al = new ArrayList<>(store.get(target - temp));
                    for (int x = 0; x < al.size(); x++) {
                        ArrayList<Integer> alTemp = al.get(x);
                        int a = alTemp.get(0);
                        int b = alTemp.get(1);
                        if (j > i && i > b & b > a) {
                            ArrayList<Integer> ansCandidate = new ArrayList<>(List.of(arr[a], arr[b], arr[i], arr[j]));
                            ans.add(ansCandidate);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }

}
