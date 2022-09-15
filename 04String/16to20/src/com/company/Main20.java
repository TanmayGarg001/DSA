//20.Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence.0 is for space.
package com.company;

public class Main20 {

    public static void main(String[] args) {
        String[] str = {"2", "22", "222",
                "3", "33", "333",
                "4", "44", "444",
                "5", "55", "555",
                "6", "66", "666",
                "7", "77", "777", "7777",
                "8", "88", "888",
                "9", "99", "999", "9999"};
        String input = "DAMN SON";
        System.out.println(printSequence(str, input));
    }

    static String printSequence(String[] arr, String input) {
        //TC = O(n),MC = O(1)
        //We make a string array for all the letters in the trackpad
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ')
                output.append("0");
            else {
                int position = input.charAt(i) - 'A';
                output.append(arr[position]);
            }
        }
        return output.toString();

    }


}