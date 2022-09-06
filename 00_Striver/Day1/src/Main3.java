//https://leetcode.com/problems/next-permutation/

public class Main3 {

    public static void nextPermutation(int[] arr) {//O(n),O(1)
        int i = arr.length - 2;
        while (i >= 0 && arr[i + 1] <= arr[i]) {
            i--;
        }
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[i] >= arr[j]) {
                j--;
            }
            swap(arr, i, j);
        }
        reverse(arr, i + 1, arr.length - 1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

}
