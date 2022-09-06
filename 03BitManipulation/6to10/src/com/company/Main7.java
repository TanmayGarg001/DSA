<<<<<<< HEAD
//7.Given two numbers x and y, and a range [l, r] where 1 <= l, r <= 32. Find the set bits of y in range [l, r] and set these bits in x also.
package com.company;

public class Main7 {

    public static void main(String[] args) {
        System.out.println(approach1(44, 3, 1, 5));
        System.out.println(approach2(10, 13, 1, 3));
    }

    public static int approach1(int x, int y, int l, int r) {
        //TC = O(r-l),MC = O(1)
        //This is just an observation can't do much about it tbh.
        for (int i = l - 1; i < r; i++) {
            if ((y & (1 << i)) != 0) {
                x = (x | (1 << i));//<< this is bitwise left shift operator
            }
        }
        return x;
    }

    public static int approach2(int x, int y, int l, int r) {
        //TC = O(r-l),MC = O(1)
        for (int i = l - 1; i < r; i++) {
            x = x | (y & (1 << i));//here 'i' is basically binary multiples of 2 i.e. 1 ,10,100,1000,10000 and so on.
        }
        return x;
    }

=======
//7.Given two numbers x and y, and a range [l, r] where 1 <= l, r <= 32. Find the set bits of y in range [l, r] and set these bits in x also.
package com.company;

public class Main7 {

    public static void main(String[] args) {
        System.out.println(approach1(44, 3, 1, 5));
        System.out.println(approach2(10, 13, 1, 3));
    }

    public static int approach1(int x, int y, int l, int r) {
        //TC = O(r-l),MC = O(1)
        //This is just an observation can't do much about it tbh.
        for (int i = l - 1; i < r; i++) {
            if ((y & (1 << i)) != 0) {
                x = (x | (1 << i));//<< this is bitwise left shift operator
            }
        }
        return x;
    }

    public static int approach2(int x, int y, int l, int r) {
        //TC = O(r-l),MC = O(1)
        for (int i = l - 1; i < r; i++) {
            x = x | (y & (1 << i));//here 'i' is basically binary multiples of 2 i.e. 1 ,10,100,1000,10000 and so on.
        }
        return x;
    }

>>>>>>> 26b1aac (Final Commit_1)
}