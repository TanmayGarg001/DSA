package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main12 {
    //Given a sorted array, find the element in the array which has minimum absolute difference with the given number.
    //Ex:- for array 1,3,8,10,15 if input is 12 then the answer should be 3 as 12-10 = 2;//is minimum, so we return 10's index.

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3, 5, 9, 11, 15, 17, 18, 19, 20, 25, 35, 40, 65, 100));
        System.out.println(floor(arrayList, 5));
        System.out.println(floor(arrayList, 1254));
        System.out.println(floor(arrayList, 25));
        System.out.println(floor(arrayList, 22));
        System.out.println(ciel(arrayList, 22));
        System.out.println(ciel(arrayList, 3));
        System.out.println(ciel(arrayList, 66));
        System.out.println(ciel(arrayList, 12));
        System.out.println("================");
        System.out.println(answer(arrayList, 5));
        System.out.println(answer(arrayList, 7));
        System.out.println(answer(arrayList, 20));
        System.out.println(answer(arrayList, 69));
        System.out.println(answer(arrayList, 34));
        System.out.println("=================");
        System.out.println(anotherApproach(arrayList, 5));
        System.out.println(anotherApproach(arrayList, 7));
        System.out.println(anotherApproach(arrayList, 69));
        System.out.println(anotherApproach(arrayList, 34));
    }

    public static int answer(ArrayList<Integer> arrayList, int number) {
        int a = floor(arrayList, number);
        int b = ciel(arrayList, number);
        if (Math.abs(arrayList.get(a) - number) <= Math.abs(arrayList.get(b) - number)) {
            return a;
        } else if (Math.abs(arrayList.get(a) - number) > Math.abs(arrayList.get(b) - number)) {
            return b;
        }
        return -1;
    }

    public static int floor(ArrayList<Integer> arrayList, int number) {
        int left = 0;
        int right = arrayList.size() - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arrayList.get(mid) == number) {
                return mid;
            } else if (arrayList.get(mid) > number) {
                right = mid - 1;
            } else {
                ans = mid;
                left = mid + 1;
            }
        }
        return ans;
    }

    public static int ciel(ArrayList<Integer> arrayList, int number) {
        int left = 0;
        int right = arrayList.size() - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arrayList.get(mid) == number) {
                return mid;
            } else if (arrayList.get(mid) < number) {
                left = mid + 1;
            } else {
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }

    public static int anotherApproach(ArrayList<Integer> arrayList, int number) {
        int left = 0;
        int right = arrayList.size() - 1;
        int temp1 = -1;
        int temp2 = -1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arrayList.get(mid) == number) {
                return mid;
            } else if (arrayList.get(mid) > number) {
                right = mid - 1;
            } else if (arrayList.get(mid) < number) {
                left = mid + 1;
            }
            if (right == left - 1) {//this is the last iteration of the loop i.e. when left==right
                temp1 = Math.abs(arrayList.get(left) - number);
                temp2 = Math.abs(arrayList.get(right) - number);
            }
        }
        return Math.min(temp1, temp2);
    }
    //best:
    private static int solve(int[] arr,int key){
        int a = floor(arr,key);
        int b = ceil(arr,key);
        return Math.min(Math.abs(a-key),Math.abs(b-key));
    }

    private static int floor(int[] arr,int key){
        int ans=0;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid = low+ ((high-low)/2);
            if(arr[mid]==key){
                return arr[mid];
            }
            else if(arr[mid]>key){
                high=mid-1;
            }else{
                ans=mid;
                low=mid+1;
            }
        }
        return arr[ans];
    }

    private static int ceil(int[] arr,int key){
        int ans=0;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid = low+ ((high-low)/2);
            if(arr[mid]==key){
                return arr[mid];
            }
            else if(arr[mid]>key){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return arr[ans];
    }

}
