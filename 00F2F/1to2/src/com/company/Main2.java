<<<<<<< HEAD
package com.company;

//Swap Sort : Find a duplicate and a missing number,which is scalable!!
//Disclaimer : if the array is read-only swap-sort by is name ig is more than enough to suggest that it won't work.
//https://www.youtube.com/watch?v=Eo6N15ezLEU&list=PL_z_8CaSLPWdJfdZHiNYYM46tYQUjbBJx&index=6
public class Main2 {

    public static void main(String[] args) {
        //if we somehow place elements of the array on the index they were supposed to be placed,then at every ith index the value must be i+1.
        //and furthermore we can tell duplicate and missing elements in one go,it would be very easy.This is what swap-sort helps us to do.
        //this is scalable code too i.e. no matter how many missing or duplicates are all will get resolved :D
        int[] arr = {4,2,3,1,1};
        int[] arr2 = {7, 6, 6, 5, 2, 3, 1};
        int[] arr3 = {1, 1, 1, 1, 1, 1};
        swapSort(arr);
        swapSort(arr2);
        swapSort(arr3);
    }

    //This problem can be solved by using brute force,using HashSet or HashMap,by sorting or by using maths and
    //making equations, but it will get damn complex if we have to find more than one missing or duplicate number.
    //Disclaimer : if the array is read-only swap-sort then it won't work (ofc).
    //Must consider this example for easier understanding:
    //Array index    : {0,1,2,3,4}
    //Array elements : {4,2,3,1,1}
    public static void swapSort(int[] arr) {
        int i = 0;//initialize pointer to traverse array
        while (i < arr.length) {
            if (arr[i] == arr[arr[i] - 1]) {//this will check if the element at ith index is what it should be
                i++;                        //if it is increase the pointer
            } else {
                swap(arr, i, arr[i] - 1);//else we swap the number at ith index and the number at arr[i]-1 index
            }
        }
        i = 0;
        while (i < arr.length) {//after that's done loop
            if (arr[i] != i + 1) {//and if value at ith index is not same as i+1
                System.out.println("Duplicate: " + arr[i]);//we found the duplicate
                System.out.println("Missing: " + (i + 1));//we found the missing
            }
            i++;
        }
        System.out.println("=========");
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
=======
package com.company;

//Swap Sort : Find a duplicate and a missing number,which is scalable!!
//Disclaimer : if the array is read-only swap-sort by is name ig is more than enough to suggest that it won't work.
//https://www.youtube.com/watch?v=Eo6N15ezLEU&list=PL_z_8CaSLPWdJfdZHiNYYM46tYQUjbBJx&index=6
public class Main2 {

    public static void main(String[] args) {
        //if we somehow place elements of the array on the index they were supposed to be placed,then at every ith index the value must be i+1.
        //and furthermore we can tell duplicate and missing elements in one go,it would be very easy.This is what swap-sort helps us to do.
        //this is scalable code too i.e. no matter how many missing or duplicates are all will get resolved :D
        int[] arr = {4,2,3,1,1};
        int[] arr2 = {7, 6, 6, 5, 2, 3, 1};
        int[] arr3 = {1, 1, 1, 1, 1, 1};
        swapSort(arr);
        swapSort(arr2);
        swapSort(arr3);
    }

    //This problem can be solved by using brute force,using HashSet or HashMap,by sorting or by using maths and
    //making equations, but it will get damn complex if we have to find more than one missing or duplicate number.
    //Disclaimer : if the array is read-only swap-sort then it won't work (ofc).
    //Must consider this example for easier understanding:
    //Array index    : {0,1,2,3,4}
    //Array elements : {4,2,3,1,1}
    public static void swapSort(int[] arr) {
        int i = 0;//initialize pointer to traverse array
        while (i < arr.length) {
            if (arr[i] == arr[arr[i] - 1]) {//this will check if the element at ith index is what it should be
                i++;                        //if it is increase the pointer
            } else {
                swap(arr, i, arr[i] - 1);//else we swap the number at ith index and the number at arr[i]-1 index
            }
        }
        i = 0;
        while (i < arr.length) {//after that's done loop
            if (arr[i] != i + 1) {//and if value at ith index is not same as i+1
                System.out.println("Duplicate: " + arr[i]);//we found the duplicate
                System.out.println("Missing: " + (i + 1));//we found the missing
            }
            i++;
        }
        System.out.println("=========");
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
>>>>>>> 26b1aac (Final Commit_1)
}