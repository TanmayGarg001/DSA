package com.company;

import java.util.HashMap;

//Given a string you need to print the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1
public class Main7 {

    public static void main(String[] args) {
        unique("aabacbebebe", 3);
    }

    //Given a string you need to print the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1
    public static void unique(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();//initializations
        int j = 0;
        int i = 0;
        int ans = -1;//initializations

        while (j < s.length()) {//while j pointer is less than window size
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);//do these operations in each iteration (default operation)
            if (map.size() < k) {//if the condition is less than window size
                j++;             //do this to hit window size
            } else if (map.size() == k) { //once we hit window size
                ans = Math.max(ans, j - i + 1); //do the req. operations
                j++;
            } else {
                while (map.size() > k) { // its variable size window, if the condition overcomes window size we need to keep remove stuff till the condition is not met again
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1); //do operations to remove calculations of ith pointer
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;//keep increasing i by 1 in each iteration
                }
                j++;// once it is done now increase j in order to calculate next window operation.
            }
        }
        System.out.println(ans);
    }

}
