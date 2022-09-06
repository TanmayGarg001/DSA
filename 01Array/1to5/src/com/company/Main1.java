<<<<<<< HEAD
//1.Reverse the array
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//    Literally reversing the elements in memory can't be done any faster than O(n).
//    However, you could make a wrapper class that indexes the array reversed.
//    So, in fact you don't reverse the array, but only access the elements backwards.

public class Main1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of elements you want in the array : ");
        int capacity = scanner.nextInt();
        int[] array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i] = (int) ((Math.random() * 20) - 15);
        }
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(array));
        approach1(array);
        approach2(array);
        approach3(array);

    }

    public static void approach1(int[] array) {
        //TC = O(n),MC = O(n)
        //Just make a new array which is reverse of original array using indexes and then overwrite the original array with the reverse array created.
        int[] revArray = new int[array.length];
        for (int i = 0; i < revArray.length; i++) {
            revArray[i] = array[array.length - i - 1];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = revArray[i];
        }
        System.out.println("Reversed Array : ");
        System.out.println(Arrays.toString(array));
    }

    public static void approach2(int[] array) {
        //TC = O(n),MC = O(1), but here TC is relatively faster than approach1
        //Keep swapping the elements from front to rear end by decrement of 1 each time and do this till arrayLength/2 (ofc).
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Reversed Array : ");
        System.out.println(Arrays.toString(array));
    }

    public static void approach3(int[] array) {
        //TC = O(n),MC = O(n)
        //Using reverse() method using Collections import, very powerful (see the real source code from Collections).
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            integerArrayList.add(array[i]);
        }
        // List temp = Arrays.asList(array);
        // ArrayList<Integer> integerArrayList1= new ArrayList<>(temp);
        Collections.reverse(integerArrayList);
        System.out.println("Reversed Array : ");
        array = integerArrayList.stream().mapToInt(i -> i).toArray();//for loop equivalent
        System.out.println(Arrays.toString(array));
    }

=======
//1.Reverse the array
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//    Literally reversing the elements in memory can't be done any faster than O(n).
//    However, you could make a wrapper class that indexes the array reversed.
//    So, in fact you don't reverse the array, but only access the elements backwards.

public class Main1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of elements you want in the array : ");
        int capacity = scanner.nextInt();
        int[] array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i] = (int) ((Math.random() * 20) - 15);
        }
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(array));
        approach1(array);
        approach2(array);
        approach3(array);

    }

    public static void approach1(int[] array) {
        //TC = O(n),MC = O(n)
        //Just make a new array which is reverse of original array using indexes and then overwrite the original array with the reverse array created.
        int[] revArray = new int[array.length];
        for (int i = 0; i < revArray.length; i++) {
            revArray[i] = array[array.length - i - 1];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = revArray[i];
        }
        System.out.println("Reversed Array : ");
        System.out.println(Arrays.toString(array));
    }

    public static void approach2(int[] array) {
        //TC = O(n),MC = O(1), but here TC is relatively faster than approach1
        //Keep swapping the elements from front to rear end by decrement of 1 each time and do this till arrayLength/2 (ofc).
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Reversed Array : ");
        System.out.println(Arrays.toString(array));
    }

    public static void approach3(int[] array) {
        //TC = O(n),MC = O(n)
        //Using reverse() method using Collections import, very powerful (see the real source code from Collections).
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            integerArrayList.add(array[i]);
        }
        // List temp = Arrays.asList(array);
        // ArrayList<Integer> integerArrayList1= new ArrayList<>(temp);
        Collections.reverse(integerArrayList);
        System.out.println("Reversed Array : ");
        array = integerArrayList.stream().mapToInt(i -> i).toArray();//for loop equivalent
        System.out.println(Arrays.toString(array));
    }

>>>>>>> 26b1aac (Final Commit_1)
}