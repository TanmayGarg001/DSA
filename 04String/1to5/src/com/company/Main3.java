<<<<<<< HEAD
//3.Write an efficient program to print all the duplicates and their counts in the input string
package com.company;

import java.util.HashMap;

public class Main3 {

    public static void main(String[] args) {
        approach1("TimmyTrumpetSavage2001");
        approach2("TimmyTrumpetSavage2001");
    }

    public static void approach1(String s) {
        //TC = O(n),MC = O(n)
        //Make a hashMap and print the characters repeating more than once.
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(map);

//        Iterator<Character> iterator = map.keySet().iterator();
//        while (iterator.hasNext()) {
//            char key = iterator.next();
//            int val = map.get(key);
//            if (val > 1) {
//                System.out.println("Key = " + key + " ,Value = " + val);
//            }
//        }

        for (char key : map.keySet()) {
            int val = map.get(key);
            if (val > 1) {
                System.out.println("Key = " + key + " ,Value = " + val);
            }
        }

        // for (Map.Entry<Character, Integer> stringStringEntry : map.entrySet()) {
        //    	if (stringStringEntry.getValue() > 1) {
        //        	System.out.println("KEY = " + stringStringEntry.getKey() + " , VALUE = " + stringStringEntry.getValue());
        //    	}
        // }

    }

    public static void approach2(String str) {
        //TC = O(n),MC = O(n)
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            count[charAt] = count[charAt] + 1;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1)
                System.out.println("Number of " + (char) i + ": " + count[i]);

        }
    }
}
=======
//3.Write an efficient program to print all the duplicates and their counts in the input string
package com.company;

import java.util.HashMap;

public class Main3 {

    public static void main(String[] args) {
        approach1("TimmyTrumpetSavage2001");
        approach2("TimmyTrumpetSavage2001");
    }

    public static void approach1(String s) {
        //TC = O(n),MC = O(n)
        //Make a hashMap and print the characters repeating more than once.
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(map);

//        Iterator<Character> iterator = map.keySet().iterator();
//        while (iterator.hasNext()) {
//            char key = iterator.next();
//            int val = map.get(key);
//            if (val > 1) {
//                System.out.println("Key = " + key + " ,Value = " + val);
//            }
//        }

        for (char key : map.keySet()) {
            int val = map.get(key);
            if (val > 1) {
                System.out.println("Key = " + key + " ,Value = " + val);
            }
        }

        // for (Map.Entry<Character, Integer> stringStringEntry : map.entrySet()) {
        //    	if (stringStringEntry.getValue() > 1) {
        //        	System.out.println("KEY = " + stringStringEntry.getKey() + " , VALUE = " + stringStringEntry.getValue());
        //    	}
        // }

    }

    public static void approach2(String str) {
        //TC = O(n),MC = O(1)
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)] ++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1)
                System.out.println("Number of " + (char) i + ": " + count[i]);

        }
    }
}
>>>>>>> 26b1aac (Final Commit_1)
