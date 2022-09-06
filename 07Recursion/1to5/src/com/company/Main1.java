package com.company;

//In recursion, we make input smaller, why?
//Now if you think about it, we don't make input small, input becomes small itself.i.e. we don't deliberately do that.
//hum kuch aisa kaam krte ya fir kuch aise decisions lete hai jo krne se input small ho jaata hai.So primary goal should be decision-making.
//decision space i.e. when you're asked to make choices and decisions there might be a hint for recursion.
//Recursive tree, very useful, as if we are able to design recursive tree for a problem, then writing code for that is ezpz.
//Make the tree using i/p-o/p method or whatever you like, once tree is made, the problem is cakewalk.
//initialize the o/p first and then make other o/p and smaller i/p and keep doing this.
//no. of branches in a recursive tree corresponds to the no. of choices
//Recursion is very important as it is present everywhere i.e. used in every data structure and a lot of questions.
//see img3 for 3-4 approaches to solve recursion efficiently.

public class Main1 {

    public static void main(String[] args) {

        print1ToN(5);
        System.out.println("===");
        printNto1(5);
        System.out.println("===");
        System.out.println(factorial(5));

    }

    //generally easier problems where decision is not that heavy, we use IBH method else we use recursive tree.
    //here if we see we have to print 1 to n , let's say we print from 1 to n-1 now all we need to do is print the n. and stop doing this at a base case.
    public static void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }

    public static void printNto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNto1(n - 1);
    }

    //Generally approach should be use IBH way, then try to solve the question using recursive tree and then at last use choice diagram.

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
