<<<<<<< HEAD
//26.In daily share trading, a buyer buys shares in the morning and sells them on the same day. If the trader is allowed to make at most 2 transactions in a day,
//whereas the second transaction can only start after the first one is complete (Buy->sell->Buy->sell). Given stock prices throughout the day, find out the
//maximum profit that a share trader could have made.
package com.company;

public class Main26 {

    public static void main(String[] args) {
        int[] arr = {2, 30, 15, 10, 8, 25, 80};
        System.out.print(approach1(arr));
    }

    public static int approach1(int[] arr) {
        //TC = O(n),MC = O(1)
        int first_buy = Integer.MIN_VALUE;
        int first_sell = 0;
        int second_buy = Integer.MIN_VALUE;
        int second_sell = 0;

        for (int i = 0; i < arr.length; i++) {

            first_buy = Math.max(first_buy, -arr[i]);
            first_sell = Math.max(first_sell, first_buy + arr[i]);
            second_buy = Math.max(second_buy, first_sell - arr[i]);
            second_sell = Math.max(second_sell, second_buy + arr[i]);

        }
        return second_sell;
    }
    //Use Q17 with sliding partition to solve, but then TC = O(n^2),MC = O(1)

}
=======
//26.In daily share trading, a buyer buys shares in the morning and sells them on the same day. If the trader is allowed to make at most 2 transactions in a day,
//whereas the second transaction can only start after the first one is complete (Buy->sell->Buy->sell). Given stock prices throughout the day, find out the
//maximum profit that a share trader could have made.
package com.company;

public class Main26 {

    public static void main(String[] args) {
        int[] arr = {2, 30, 15, 10, 8, 25, 80};
        System.out.print(approach1(arr));
    }

    public static int approach1(int[] arr) {
        //TC = O(n),MC = O(1)
        int first_buy = Integer.MIN_VALUE;
        int first_sell = 0;
        int second_buy = Integer.MIN_VALUE;
        int second_sell = 0;

        for (int i = 0; i < arr.length; i++) {

            first_buy = Math.max(first_buy, -arr[i]);
            first_sell = Math.max(first_sell, first_buy + arr[i]);
            second_buy = Math.max(second_buy, first_sell - arr[i]);
            second_sell = Math.max(second_sell, second_buy + arr[i]);

        }
        return second_sell;
    }
    //Use Q17 with sliding partition to solve, but then TC = O(n^2),MC = O(1)

}
>>>>>>> 26b1aac (Final Commit_1)
