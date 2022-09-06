<<<<<<< HEAD
//21.Given an array of positive and negative numbers. Find if there is a sub-array (of size at-least one) with 0 sum.
package com.company;

import java.util.HashSet;

public class Main21 {

    public static void main(String[] args) {
        int[] array = {4, 2, -3, 1, 6};
        System.out.println(approach1(array));
        System.out.println(approach2(array));
    }

    public static boolean approach1(int[] array) {
        //TC = O(n^2),MC= O(1)
        //Brute force approach, make all possible combinations of the set sums and output if 0 is achieved
        for (int i = 0; i < array.length; i++) {
            int sum = array[i];
            if (sum == 0) {
                return true;
            }
            for (int j = i; j < array.length - 1; j++) {
                sum = sum + array[j + 1];
                if (sum == 0) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean approach2(int[] array) {
        //TC = O(n),MC = O(n); in all sub-arrays questions brute force will always take place and code will run. But on order to optimize it, memory is required.
        //If you think about it, if we keep storing the sum of the elements that we traverse in the array into a hashSet to avoid duplicate and use constant lookup time
        //We can check that if the sum is already in hashMap if the sum already exists it implies that we have found a sub array whose sum is zero.
        //Because if the sum already exists that means additions of some elements must have resulted in zero and the sum which resulted that equal to the sum till that.
        HashSet<Integer> hashSet = new HashSet<>();
        int sum = 0;
        for (int a : array) {
            sum = sum + a;
            if (a == 0 || sum == 0 || hashSet.contains(sum)) {
                return true;
            }
            hashSet.add(sum);
        }
        return false;
        //Using plain old for loop increases chances of error, use forEach only if you want to traverse the whole array or set in this case,if not using for loop is used.
        // for(int i=0;i<array.length;i++){
        // 	sum =sum+array[i];
        // 	if(array[i]==0 ||sum==0 ||hashSet.contains(sum)){
        // 		return true;
        // 	}
        // 	hashSet.add(sum);
        // }
    }


=======
//21.Given an array of positive and negative numbers. Find if there is a sub-array (of size at-least one) with 0 sum.
package com.company;

import java.util.HashSet;

public class Main21 {

    public static void main(String[] args) {
        int[] array = {4, 2, -3, 1, 6};
        System.out.println(approach1(array));
        System.out.println(approach2(array));
    }

    public static boolean approach1(int[] array) {
        //TC = O(n^2),MC= O(1)
        //Brute force approach, make all possible combinations of the set sums and output if 0 is achieved
        for (int i = 0; i < array.length; i++) {
            int sum = array[i];
            if (sum == 0) {
                return true;
            }
            for (int j = i; j < array.length - 1; j++) {
                sum = sum + array[j + 1];
                if (sum == 0) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean approach2(int[] array) {
        //TC = O(n),MC = O(n); in all sub-arrays questions brute force will always take place and code will run. But on order to optimize it, memory is required.
        //If you think about it, if we keep storing the sum of the elements that we traverse in the array into a hashSet to avoid duplicate and use constant lookup time
        //We can check that if the sum is already in hashMap if the sum already exists it implies that we have found a sub array whose sum is zero.
        //Because if the sum already exists that means additions of some elements must have resulted in zero and the sum which resulted that equal to the sum till that.
        HashSet<Integer> hashSet = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (array[i] == 0 || sum == 0 || hashSet.contains(sum)) {
                return true;
            }
            hashSet.add(sum);
        }
        return false;
    }


>>>>>>> 26b1aac (Final Commit_1)
}