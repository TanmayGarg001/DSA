<<<<<<< HEAD
//16.Given an array of integers. Find the Inversion Count in the array.
//Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0.
//If an array is sorted in the reverse order then the inversion count is the maximum. 
//Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
package com.company;

import java.util.Arrays;

public class Main16 {

    public static void main(String[] args) {
        int[] array = {2, 0, 1, 2, 0, 98, -7, 9, 5, 251};
        int[] array2 = {2, 0, 1, 2, 0, 98, -7, 9, 5, 251};

        System.out.println(invCount(array));
        approach1(array2);
        System.out.println(approach2(array2, 0, array2.length - 1));
    }

    public static void approach1(int[] array) {
        //TC = O(n^2),MC = O(1)
        //using brute force all possible combinations when inversion count condition gets fulfilled we increase it
        long ic = 0L;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    ic++;
                }
            }
        }
        System.out.println("Inversion Count: " + ic);
    }

    private static int approach2(int[] arr, int l, int r) {
        //TC = O(n*logn),MC = O(n)
        //https://www.youtube.com/watch?v=owZhw-A0yWE
        //based on the principle of merge sort. Code it once yourself it's a good question
        int count = 0;
        if (l < r) {
            int m = l + ((r - l) / 2);
            count += approach2(arr, l, m);
            count += approach2(arr, m + 1, r);
            count += mergeAndCount(arr, l, m, r);
        }
        return count;
    }

    private static long mergeAndCount(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0;
        int j = 0;
        int k = l;
        int swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
        return swaps;
    }

    static long merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, count = 0;
        while (i < left.length || j < right.length) {
            if (i == left.length) {
                arr[i + j] = right[j];
                j++;
            } else if (j == right.length) {
                arr[i + j] = left[i];
                i++;
            } else if (left[i] <= right[j]) {
                arr[i + j] = left[i];
                i++;
            } else {
                arr[i + j] = right[j];
                count += left.length - i;
                j++;
            }
        }
        return count;
    }

    static long invCount(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }

        int m = (arr.length + 1) / 2;
        int[] left = Arrays.copyOfRange(arr, 0, m);
        int[] right = Arrays.copyOfRange(arr, m, arr.length);

        return invCount(left) + invCount(right) + merge(arr, left, right);
    }

=======
//16.Given an array of integers. Find the Inversion Count in the array.
//Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0.
//If an array is sorted in the reverse order then the inversion count is the maximum. 
//Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
package com.company;

import java.util.Arrays;

public class Main16 {

    public static void main(String[] args) {
        int[] array = {2, 0, 1, 2, 0, 98, -7, 9, 5, 251};
        int[] array2 = {2, 0, 1, 2, 0, 98, -7, 9, 5, 251};

        System.out.println(invCount(array));
        approach1(array2);
        System.out.println(approach2(array2, 0, array2.length - 1));
    }

    public static void approach1(int[] array) {
        //TC = O(n^2),MC = O(1)
        //using brute force all possible combinations when inversion count condition gets fulfilled we increase it
        long ic = 0L;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    ic++;
                }
            }
        }
        System.out.println("Inversion Count: " + ic);
    }

    private static int approach2(int[] arr, int l, int r) {
        //TC = O(n*logn),MC = O(n)
        //https://www.youtube.com/watch?v=owZhw-A0yWE
        //based on the principle of merge sort. Code it once yourself it's a good question
        int count = 0;
        if (l < r) {
            int m = l + ((r - l) / 2);
            count += approach2(arr, l, m);
            count += approach2(arr, m + 1, r);
            count += mergeAndCount(arr, l, m, r);
        }
        return count;
    }

    private static long mergeAndCount(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0;
        int j = 0;
        int k = l;
        int swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
        return swaps;
    }

    static long merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, count = 0;
        while (i < left.length || j < right.length) {
            if (i == left.length) {
                arr[i + j] = right[j];
                j++;
            } else if (j == right.length) {
                arr[i + j] = left[i];
                i++;
            } else if (left[i] <= right[j]) {
                arr[i + j] = left[i];
                i++;
            } else {
                arr[i + j] = right[j];
                count += left.length - i;
                j++;
            }
        }
        return count;
    }

    static long invCount(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }

        int m = (arr.length + 1) / 2;
        int[] left = Arrays.copyOfRange(arr, 0, m);
        int[] right = Arrays.copyOfRange(arr, m, arr.length);

        return invCount(left) + invCount(right) + merge(arr, left, right);
    }

>>>>>>> 26b1aac (Final Commit_1)
}