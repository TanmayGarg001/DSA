<<<<<<< HEAD
//10.Given an array of N integers arr[] where each element represents the max number of steps that can be made forward from that element. Find the minimum number of
//jumps to reach the end of the array (starting from the first element). If an element is 0, then you cannot move through that element.
//Note: Return -1 if you can't reach the end of the array.
//Example :-
//Input:  arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
//Output: 3 (1-> 3 -> 8 -> 9)
//Explanation: Jump from 1st element to
//2nd element as there is only 1 step,now there are three options 5, 8 or 9.
//If 8 or 9 is chosen then the end node 9 can be reached. So 3 jumps are made.
package com.company;

public class Main10 {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(approach1(array));
    }

    public static int approach1(int[] array) {
        //TC = O(n),MC = O(1)
        //Its a very smart approach if you think about it hard enough!
        if (array.length == 1) {
            return 0;//edge case
        }
        if (array[0] == 0) {
            return -1;//edge case
        }

        int maxReach = array[0];
        int steps = array[0];//possible places we can jump from a given index
        int jumps = 1;//at least one jump will always happen

        for (int i = 1; i < array.length; i++) {
            if (i == array.length - 1) {
                return jumps;
            }
            maxReach = Math.max(maxReach, array[i] + i);//The max reach will be the maximum of maxReach and ith element plus the value at ith index.
            steps--;
            if (steps == 0) {
                jumps++;
                if (i >= maxReach) {
                    return -1;//if steps are exhausted, and we can't move forward i.e. now we are looping
                }
                steps = maxReach - i;//reset the steps for another jump
            }
        }
        return jumps;
    }

=======
//10.Given an array of N integers arr[] where each element represents the max number of steps that can be made forward from that element. Find the minimum number of
//jumps to reach the end of the array (starting from the first element). If an element is 0, then you cannot move through that element.
//Note: Return -1 if you can't reach the end of the array.
//Example :-
//Input:  arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
//Output: 3 (1-> 3 -> 8 -> 9)
//Explanation: Jump from 1st element to
//2nd element as there is only 1 step,now there are three options 5, 8 or 9.
//If 8 or 9 is chosen then the end node 9 can be reached. So 3 jumps are made.
package com.company;

public class Main10 {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(approach1(array));
    }

    public static int approach1(int[] array) {
        //TC = O(n),MC = O(1)
        //Its a very smart approach if you think about it hard enough!
        if (array.length == 1) {
            return 0;//edge case
        }
        if (array[0] == 0) {
            return -1;//edge case
        }

        int maxReach = array[0];
        int steps = array[0];//possible places we can jump from a given index
        int jumps = 1;//at least one jump will always happen

        for (int i = 1; i < array.length; i++) {
            if (i == array.length - 1) {
                return jumps;
            }
            maxReach = Math.max(maxReach, array[i] + i);//The max reach will be the maximum of maxReach and ith element plus the value at ith index.
            steps--;
            if (steps == 0) {
                jumps++;
                if (i >= maxReach) {
                    return -1;//if steps are exhausted, and we can't move forward i.e. now we are looping
                }
                steps = maxReach - i;//reset the steps for another jump
            }
        }
        return jumps;
    }

>>>>>>> 26b1aac (Final Commit_1)
}