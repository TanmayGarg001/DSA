<<<<<<< HEAD
//21.Minimum swap required to convert binary tree to binary search tree.
//https://www.geeksforgeeks.org/minimum-swap-required-convert-binary-tree-binary-search-tree/
package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Main21 {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 11};
        System.out.println(convertTree(arr));
    }

    public static int convertTree(int[] arr) {
        //TC = O(nlogn),MC = O(n)
        //A binary search tree is a Binary Tree in which all the nodes are placed in such a way that inOrder traversal of that tree gives is sorted result.
        //This helps us to make a key searching in tree faster.
        //Now to convert a given arr which is indexed like a tree and to convert it into BST we make a new arr same as given sort the copyArr[].
        //Now after this we calculate min of swaps we require to form arr[] to copyArr[]. this can be done using HashMap as they help us in searching of keys is sorted
        //arr i.e. copyArr[] in O(1) time.
        //IT IS SAME QUE AS : FIND MIN. NO OF SWAPS TO SORT AN ARRAY :https://www.geeksforgeeks.org/minimum-number-swaps-required-sort-array/
        int swapCount = 0;
        int[] copyArr = Arrays.copyOfRange(arr, 0, arr.length - 1);
        Arrays.sort(copyArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < copyArr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != copyArr[i]) {
                int temp = arr[i];
                swap(arr, i, map.get(copyArr[i]));
                swapCount++;
                map.put(temp, map.get(copyArr[i]));
                map.put(copyArr[i], temp);
            }
        }
        return swapCount;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            left = null;
            right = null;
            this.data = data;
        }
    }

}
=======
//21.Minimum swap required to convert binary tree to binary search tree.
//https://www.geeksforgeeks.org/minimum-swap-required-convert-binary-tree-binary-search-tree/
package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Main21 {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 11};
        System.out.println(convertTree(arr));
    }

    public static int convertTree(int[] arr) {
        //TC = O(nlogn),MC = O(n)
        //A binary search tree is a Binary Tree in which all the nodes are placed in such a way that inOrder traversal of that tree gives is sorted result.
        //This helps us to make a key searching in tree faster.
        //Now to convert a given arr which is indexed like a tree and to convert it into BST we make a new arr same as given sort the sortedArr[].
        //Now after this we calculate min of swaps we require to form arr[] to sortedArr[]. this can be done using HashMap as they help us in searching of keys is sorted
        //arr i.e. sortedArr[] in O(1) time.
        //IT IS SAME QUE AS : FIND MIN. NO OF SWAPS TO SORT AN ARRAY :https://www.geeksforgeeks.org/minimum-number-swaps-required-sort-array/
        int swapCount = 0;
        int[] sortedArr = Arrays.copyOfRange(arr, 0, arr.length - 1);
        Arrays.sort(sortedArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != sortedArr[i]) {
                int temp = arr[i];
                swap(arr, i, map.get(sortedArr[i]));
                swapCount++;
                map.put(temp, map.get(sortedArr[i]));
                map.put(sortedArr[i], temp);
            }
        }
        return swapCount;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            left = null;
            right = null;
            this.data = data;
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
