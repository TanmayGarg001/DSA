<<<<<<< HEAD
//40.Write a function “runCustomerSimulation” that takes following two inputs
//a) An integer ‘n’: total number of computers in a café and a string:
//b) A sequence of uppercase letters ‘seq’: Letters in the sequence occur in pairs. The first occurrence indicates the arrival of a customer;
//the second indicates the departure of that same customer. A customer will be serviced if there is an unoccupied computer. No letter will occur more than two times.

//Customers who leave without using a computer always depart before customers who are currently using the computers. There are at most 20 computers per café.
//For each set of input the function should output a number telling how many customers, if any walked away without using a computer. Return 0 if all the customers
//were able to use a computer.Example:
//runCustomerSimulation (2, “ABBAJJKZKZ”) should return 0
//runCustomerSimulation (3, “GACCBDDBAGEE”) should return 1 as ‘D’ was not able to get any computer
package com.company;

public class Main40 {

    public static void main(String[] args) {
        System.out.println(approach1(2, "ABBAJJKZKZ"));
        System.out.println(approach1(3, "GACCBDDBAGEE"));
    }

    public static int approach1(int n, String s) {
        int ans = 0;
        int occupied = 0;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'A';
            if (arr[idx] == 0) {//increase the letter track by 1 as it enters the café
                arr[idx] = 1;
                if (occupied < n) {//if we have computers that are free right now, we increase occupy, and we set the letter track by 1 again coz it will leave sometime
                    occupied++;
                    arr[idx] = 2;
                } else {//if all computers are busy we increase the answer as one person wasn't able to use PC
                    ans++;
                }
            } else {
                if (arr[idx] == 2) {// Decrement occupied only if this customer was using a computer
                    occupied--;
                }
                arr[idx] = 0;
            }
        }
        return ans;
    }

}
=======
//40.Write a function “runCustomerSimulation” that takes following two inputs
//a) An integer ‘n’: total number of computers in a café and a string:
//b) A sequence of uppercase letters ‘seq’: Letters in the sequence occur in pairs. The first occurrence indicates the arrival of a customer;
//the second indicates the departure of that same customer. A customer will be serviced if there is an unoccupied computer. No letter will occur more than two times.

//Customers who leave without using a computer always depart before customers who are currently using the computers. There are at most 20 computers per café.
//For each set of input the function should output a number telling how many customers, if any walked away without using a computer. Return 0 if all the customers
//were able to use a computer.Example:
//runCustomerSimulation (2, “ABBAJJKZKZ”) should return 0
//runCustomerSimulation (3, “GACCBDDBAGEE”) should return 1 as ‘D’ was not able to get any computer
package com.company;

public class Main40 {

    public static void main(String[] args) {
        System.out.println(approach1(2, "ABANBJXJKZKZNX"));
        System.out.println(approach1(3, "GACCBDDBAGEE"));
    }

    public static int approach1(int n, String s) {
        int ans = 0;
        int occupied = 0;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'A';
            if (arr[idx] == 0) {//increase the letter track by 1 as it enters the café
                arr[idx] = 1;
                if (occupied < n) {//if we have computers that are free right now, we increase occupy, and we set the letter track by 1 again coz it will leave sometime
                    occupied++;
                    arr[idx] = 2;
                } else {//if all computers are busy we increase the answer as one person wasn't able to use PC
                    ans++;
                }
            } else {
                if (arr[idx] == 2) {// Decrement occupied only if this customer was using a computer
                    occupied--;
                }
                arr[idx] = 0;
            }
        }
        return ans;
    }

}
>>>>>>> 26b1aac (Final Commit_1)
