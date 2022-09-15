//11.Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.That number can be repeated multiple times!
//You must solve the problem without modifying the array nums and uses only constant extra space.
package com.company;

import java.util.HashSet;

public class Main11 {

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 1, 5, 4};
        approach1(array);
        approach2(array);
        approach3(array);
    }

    public static void approach1(int[] array) {
        //TC = O(n^2),MC = O(1)
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Repeated number: " + array[i]);
                    break;
                }
            }
        }
    }

    public static void approach2(int[] array) {
        //TC= O(n),MC = O(n); i know it's not valid but its just another way
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                System.out.println("Repeated number: " + array[i]);
                break;
            }
            set.add(array[i]);
        }
    }


    public static void approach3(int[] array) {
        //TC = O(n), MC = O(1)
        //Using tortoise hare algorithm (Floyd's algo) of detection of a loop in a linked list. We can apply the same principle here.
        //The duplicate is the entry point of the cycle (in this case, the second element).
        //There is another solution which also considers the given array as a sort of linked list
        //(this is possible because of the constraint that each integer is between 1 and n).
        //If we take inspiration from Floyd’s cycle-finding algorithm, we can derive the following algorithm:
        //--Initiate two pointers slow and fast
        //--For each step, slow is moving one step at a time with slow = a[slow], whereas fast is moving two steps at a time with fast = a[a[fast]]
        //--When slow == fast, we are in a cycle
        //Is the algorithm completed? Not yet. Entry point of this cycle will be the duplicate. We have to reset slow and

        //https://stackoverflow.com/questions/64561399/understanding-why-floyds-tortoise-and-hare-algorithm-works-when-applied-to-an-a

        int fast = array[array[0]];//hare jumps 2 places each time
        int slow = array[0];//tortoise jumps 1 place each time

        while (fast != slow) {
            fast = array[array[fast]];
            slow = array[slow];
        }
        slow = 0;
        while (fast != slow) {
            fast = array[fast];
            slow = array[slow];
        }

        System.out.println("Repeated number: " + slow);

    }

}
