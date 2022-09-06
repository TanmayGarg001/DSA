<<<<<<< HEAD
//2.Find the maximum and minimum of an array using minimum number of comparisons
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of elements you want in the array : ");
        int capacity = scanner.nextInt();

        int[] array = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 25) - 10;
        }
        System.out.println(Arrays.toString(array));
        approach1(array);
        approach2(array);
        approach3(array);
        approach4(array);
    }

    public static void approach1(int[] array) {
        //TC = O(n),MC = O(1)
        //Iterate through whole array once and keep updating the minimum and maximum.
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Largest : " + max);
        System.out.println("Smallest : " + min);
    }

    public static void approach2(int[] array) {
        //TC = O(n*logn),MC = O(1)
        //Sort the array using Arrays.sort() which returns the array in ascending order and then get the extreme ends that min. and max. respectively.
        Arrays.sort(array);
        System.out.println("Largest : " + array[array.length - 1]);
        System.out.println("Smallest : " + array[0]);
    }

    public static void approach3(int[] array) {
        //TC = O(n),MC = O(1)
        //Using Java8 Stream to do all the work for you, very powerful and useful.
        //We can use Collections.max() too but that will work only on Lists.
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("Largest : " + max);
        System.out.println("Smallest : " + min);
    }

    public static void approach4(int[] array) {
        //TC = O(n),MC = O(1)
        //If array has odd no. elements then assign the first element as max and min.
        //If array has even no. of elements then assign the max and min accordingly comparing those two.
        //Now we are left with an array which can be made into pairs, and we keep comparing the pairs with the original pair(max and min variable at line 62 & 63) we made!
        //It really doesn't matter the number of instructions being executed in each loop are same as the above.
        int max = 0;
        int min = 0;
        int i = 0;
        if (array.length % 2 == 0) {
            if (array[0] > array[1]) {
                max = array[0];
                min = array[1];
            } else {
                max = array[1];
                min = array[0];
            }
            i = 2;
        }
        if (array.length % 2 != 0) {
            max = array[0];
            min = array[0];
            i = 1;
        }

        while (i < array.length - 1) {
            if (array[i] > array[i + 1]) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i + 1] < min) {
                    min = array[i + 1];
                }
            } else {
                if (array[i + 1] > max) {
                    max = array[i + 1];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
            i = i + 2;
        }
        System.out.println("Largest : " + max);
        System.out.println("Smallest : " + min);
    }

//Note there is also a recursive way to do this, but it is not very efficient.
//Basically divide the array into two parts and compare the maximums and minimums of the two parts to get the maximum and the minimum of the whole array
}
=======
//2.Find the maximum and minimum of an array using minimum number of comparisons
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of elements you want in the array : ");
        int capacity = scanner.nextInt();

        int[] array = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 25) - 10;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(Arrays.toString(array));
        approach1(array);
        approach2(array);
        approach3(array);
        approach4(array);
    }

    public static void approach1(int[] array) {
        //TC = O(n),MC = O(1)
        //Iterate through whole array once and keep updating the minimum and maximum.
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Largest : " + max);
        System.out.println("Smallest : " + min);
    }

    public static void approach2(int[] array) {
        //TC = O(n*logn),MC = O(1)
        //Sort the array using Arrays.sort() which returns the array in ascending order and then get the extreme ends that min. and max. respectively.
        Arrays.sort(array);
        System.out.println("Largest : " + array[array.length - 1]);
        System.out.println("Smallest : " + array[0]);
    }

    public static void approach3(int[] array) {
        //TC = O(n),MC = O(1)
        //Using Java8 Stream to do all the work for you, very powerful and useful.
        //We can use Collections.max() too but that will work only on Lists.
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("Largest : " + max);
        System.out.println("Smallest : " + min);
    }

    public static void approach4(int[] array) {
        //TC = O(n),MC = O(1)
        //If array has odd no. elements then assign the first element as max and min.
        //If array has even no. of elements then assign the max and min accordingly comparing those two.
        //Now we are left with an array which can be made into pairs, and we keep comparing the pairs with the original pair(max and min variable at line 62 & 63) we made!
        //It really doesn't matter the number of instructions being executed in each loop are same as the above.
        int max = 0;
        int min = 0;
        int i = 0;
        if (array.length % 2 == 0) {
            if (array[0] > array[1]) {
                max = array[0];
                min = array[1];
            } else {
                max = array[1];
                min = array[0];
            }
            i = 2;
        }
        if (array.length % 2 != 0) {
            max = array[0];
            min = array[0];
            i = 1;
        }

        while (i < array.length - 1) {
            if (array[i] > array[i + 1]) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i + 1] < min) {
                    min = array[i + 1];
                }
            } else {
                if (array[i + 1] > max) {
                    max = array[i + 1];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
            i = i + 2;
        }
        System.out.println("Largest : " + max);
        System.out.println("Smallest : " + min);
    }

//Note there is also a recursive way to do this, but it is not very efficient.
//Basically divide the array into two parts and compare the maximums and minimums of the two parts to get the maximum and the minimum of the whole array
}
>>>>>>> 26b1aac (Final Commit_1)
