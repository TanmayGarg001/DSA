package com.company;
//There are n people standing in a circle (numbered clockwise 1 to n) waiting to be executed. The counting begins at point 1 in the circle and proceeds around the
//circle in a fixed direction (clockwise). In each step, a certain number of people are skipped and the next person is executed. The elimination proceeds around
//the circle (which is becoming smaller and smaller as the executed people are removed), until only the last person remains, who is given freedom.
//Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in circle.
//The task is to choose the place in the initial circle so that you are the last one remaining and so survive.
//Input:
//n = 2, k = 1
//Output:
//2
//Explanation:
//Here, n = 2 and k = 1, then safe position is
//2 as the person at 1st position will be killed.

import java.util.ArrayList;

public class Main17 {

    public static void main(String[] args) {
        System.out.println(josephus(40, 7));
        easyWay(8, 2);
    }

    public static int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        }
        return ((josephus(n - 1, k) + k - 1) % n) + 1;
    }

    public static void easyWay(int n, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i + 1);
        }
        int ans = solve(arrayList, k - 1, 0);
        System.out.println(ans);
    }

    public static int solve(ArrayList<Integer> al, int skip, int index) {
        if (al.size() == 1) {
            return al.get(0);
        }
        index = (index + skip) % al.size();
        al.remove(index);
        return solve(al, skip, index);
    }

}
