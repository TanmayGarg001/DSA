package com.company;

import java.util.ArrayList;
import java.util.Arrays;

//sort array
public class Main3 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(12, -10, 84, 0, -447, 323));
        System.out.println(al);
        sortArr(al);
        System.out.println(al);
    }


    private static void sortArr(ArrayList<Integer> al) {
        if (al.size() == 1) {//base case if only 1 element is in the al then its sorted.
            return;
        }
        int num = al.remove(al.size() - 1);//store the last element of al in a var.
        sortArr(al);//now we call the sort method on the al.size()-1.
        insert(al, num);//inserts the stored element in the right pos.
    }

    private static void insert(ArrayList<Integer> al, int num) {
        if (al.size() == 0 || al.get(al.size() - 1) <= num) {//if al is empty or the al is like for instance {15,20,...} then its sorted already,
            // changing sign will result desc. sort
            al.add(num);//just append the num as it is greater than prev.
            return;
        }
        int temp = al.remove(al.size() - 1);
        insert(al, num);//keep searching for right pos for num.
        al.add(temp);//after that append the stored temp var.
    }

}
