<<<<<<< HEAD
//29.Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.
//Note: No two strings are the second most repeated, there will be always a single string.
package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main29 {

    public static void main(String[] args) {
        String[] arr = {"aaa", "ccc", "bbb", "aaa", "aaa", "bbb"};
        System.out.println(approach1(arr));
        System.out.println(approach2(arr));
    }

    public static String approach1(String[] arr) {
        //TC = O(nlogn), MC = O(n)
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String key = arr[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        ArrayList<Integer> al = new ArrayList<>(map.values());
        Collections.sort(al);
        return getKey(map, al.get(al.size() - 2));
    }

    public static String getKey(Map<String, Integer> map, Integer value) {
        //it only works coz its give in the question that : No two strings are the second most repeated, there will be always a single string.
        for (String key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }

    public static String approach2(String[] arr) {
        //TC = O(n), MC = O(n)
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String key = arr[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        ArrayList<String> al = new ArrayList<>(map.keySet());
        int max = 0;
        String ans = "";
        int secMax = 0;
        for (int i = 0; i < al.size(); i++) {
            if (max < map.get(al.get(i))) {
                max = Math.max(max, map.get(al.get(i)));
            }
        }
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (secMax < m.getValue() && m.getValue() < max) {
                secMax = m.getValue();
                ans = m.getKey();
            }
        }
        return ans;
    }

}
=======
//29.Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.
//Note: No two strings are the second most repeated, there will be always a single string.
package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main29 {

    public static void main(String[] args) {
        String[] arr = {"aaa", "ccc", "bbb", "aaa", "aaa", "bbb"};
        System.out.println(approach1(arr));
        System.out.println(approach2(arr));
    }

    public static String approach1(String[] arr) {
        //TC = O(nlogn), MC = O(n)
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String key = arr[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        ArrayList<Integer> al = new ArrayList<>(map.values());
        Collections.sort(al);
        return getKey(map, al.get(al.size() - 2));
    }

    public static String getKey(Map<String, Integer> map, Integer value) {
        //it only works coz its give in the question that : No two strings are the second most repeated, there will be always a single string.
        for (String key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }

    public static String approach2(String[] arr) {
        //TC = O(n), MC = O(n)
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String key = arr[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        ArrayList<String> al = new ArrayList<>(map.keySet());
        int max = 0;
        String ans = "";
        int secMax = 0;
        for (int i = 0; i < al.size(); i++) {
            max = Math.max(max, map.get(al.get(i)));
        }
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (secMax < m.getValue() && m.getValue() < max) {
                secMax = m.getValue();
                ans = m.getKey();
            }
        }
        return ans;
    }

}
>>>>>>> 26b1aac (Final Commit_1)
