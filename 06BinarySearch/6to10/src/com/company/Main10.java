package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main10 {
    //Given an array of letters sorted in ascending order, find the smallest letter in the array which is greater than a given key letter.
    //For a,c,f,h if is input is f then answer should be h.
    public static void main(String[] args) {
        ArrayList<Character> arrayList = new ArrayList<>(Arrays.asList('b', 'c', 'f', 'h', 'i', 'm', 'o', 't', 'u', 'z'));
        System.out.println(nextAlphabet(arrayList, 'z'));
        System.out.println(nextAlphabet(arrayList, 'u'));
        System.out.println(nextAlphabet(arrayList, 'b'));
        System.out.println(nextAlphabet(arrayList, 'k'));
        System.out.println(nextAlphabet(arrayList, 'j'));
    }

    public static char nextAlphabet(ArrayList<Character> arrayList, char c) {
        //TC = O(logn),MC = O(1)
        //It's pretty much same as the previous ceil question.
        //0 means that answer does not exist
        int left = 0;
        char ans = '0';
        int right = arrayList.size() - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arrayList.get(mid) == c) {
                if (arrayList.get(arrayList.size() - 1) == c) {
                    return '0';
                } else {
                    return arrayList.get(mid + 1);
                }
            } else if (arrayList.get(mid) > c) {
                ans = arrayList.get(mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
