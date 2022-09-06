package com.company;

//Allocate pages of book [GODLIKE QUESTION!]
public class Main17 {
//https://www.geeksforgeeks.org/allocate-minimum-number-pages/
//Given number of pages in n different books and m students. The books are arranged in ascending order of number of pages.(it will work if the array is not sorted.)
//Every student is assigned to read some consecutive books. The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.
//Input : pages[] = {12, 34, 67, 90}
//        m = 2
//Output : 113
//Explanation:
//There are 2 number of students. Books can be distributed
//in following fashion :
//  1) [12] and [34, 67, 90]
//      Max number of pages is allocated to student
//      2 with 34 + 67 + 90 = 191 pages
//  2) [12, 34] and [67, 90]
//      Max number of pages is allocated to student
//      2 with 67 + 90 = 157 pages
//  3) [12, 34, 67] and [90]
//      Max number of pages is allocated to student
//      1 with 12 + 34 + 67 = 113 pages
//
//Of the 3 cases, Option 3 has the minimum pages = 113.

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(solve(arr, 2));
    }

    private static int solve(int[] arr, int m) {
        if (m > arr.length) {
            return -1;//if number of students surpass the array elements.
        } else {
            int low = 0;
            int high = 0;
            int ans = -1;
            for (int i = 0; i < arr.length; i++) {
                low = Math.max(low, arr[i]);
                high = high + arr[i];
            }
            while (low <= high) {
                int mid = low + ((high - low) / 2);
                if (isAnswer(arr, m, mid)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return ans;
        }
    }

    private static boolean isAnswer(int[] arr, int m, int mid) {
        int students = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                return false;//coz we decide threshold can't be greater than mid
            }
            if (arr[i] + sum > mid) {
                students++;//increase number of students by 1 as pages surpassed the threshold of 1 student
                sum = arr[i];//new student page count starts
                if (students > m) {
                    return false;
                }
            } else {
                sum = sum + arr[i];
            }
        }
        return true;
    }

}
