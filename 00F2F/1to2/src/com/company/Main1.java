package com.company;

//arrays and strings important algo and more stuff!

public class Main1 {
    //Given an array all the elements are in the range of 1toN. but one element is repeated and therefore one is missing. Task is to find the duplicate number.
    //Some ways that you can think of is:-
    //Using brute force,Using HashSet or HashMap,or by sorting etc.,
    //We can sum the elements and then subtract them from the real sum, but it won't work for -ve numbers and duplicates more than 1.
    //But we have to do this in O(n) and O(1) space, or we can use bit manipulations too!
    //See this blog:-
    //https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/

    //Now we can do questions similar to this using
    //Missing Duplicate using swap sort(has some drawbacks but gets the job done), maneuver to next class.
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 2};
        ans(arr);
    }

    public static void ans(int[] array) {
        //this is basic maths 2 equations and 2 unknowns, missing and duplicate.
        //To fully solve this approach we required shit ton of maths, only for 1 missing and 1 duplicate if the count was increased it would be almost next to impossible.
        int realSum = (array.length * (array.length + 1)) / 2;//sum of 1toN
        int realSquareSum = (array.length * (array.length + 1) * (2 * (array.length + 1))) / 2;//sum of 1^2toN^2
        int sumLinear = 0;
        int sumSquare = 0;
        for (int i = 0; i < array.length; i++) {
            sumLinear = sumLinear + array[i];
            sumSquare = sumSquare + array[i] * array[i];
        }
        System.out.println(realSum);
        System.out.println(realSquareSum);
        System.out.println(sumLinear);
        System.out.println(sumSquare);
        System.out.println("=========");
        int realSumMinusActualSum = Math.abs(realSum - sumLinear);
        int realSquareSumMinusActualSquareSum = Math.abs(realSquareSum - sumSquare);
        System.out.println(realSumMinusActualSum);
        System.out.println(realSumMinusActualSum % realSquareSumMinusActualSquareSum);
    }

}