<<<<<<< HEAD
//7.The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
//countAndSay(1) = "1"
//countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
//To determine how you "say" a digit string, split it into the minimal number of groups so that each group is a contiguous section all the same character.
//Then for each group, say the number of characters, then say the character. To convert the saying into a digit string, replace the counts with a number and
//concatenate every saying.
//Given a positive integer n, return the nth term of the count-and-say sequence.
package com.company;

public class Main7 {

    public static void main(String[] args) {
        System.out.println(approach1(7));
    }

    public static String approach1(int n) {
        //TC = O(n),MC = O(1)
        String val = "1";
        for(int i =2; i<=n;i++){
            val = convert(val);
        }
        return val;
    }

    private static String convert(String input){
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        for(int i = 0;i<input.length();i++){
            if(i == input.length()-1 ||input.charAt(i) != input.charAt(i+1) ){
                sb.append(counter);
                sb.append(input.charAt(i));
                counter=1;
            } else{
                counter++;
            }
        }
        return sb.toString();
    }

}
=======
//7.The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
//countAndSay(1) = "1"
//countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
//To determine how you "say" a digit string, split it into the minimal number of groups so that each group is a contiguous section all the same character.
//Then for each group, say the number of characters, then say the character. To convert the saying into a digit string, replace the counts with a number and
//concatenate every saying.
//Given a positive integer n, return the nth term of the count-and-say sequence.
package com.company;

public class Main7 {

    public static void main(String[] args) {
        System.out.println(approach1(5));
    }

    public static String approach1(int n) {
        //TC = O(n),MC = O(1)
        String val = "1";
        for(int i =2; i<=n;i++){
            val = convert(val);
        }
        return val;
    }

    private static String convert(String input){
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        for(int i = 0;i<input.length();i++){
            if(i == input.length()-1 ||input.charAt(i) != input.charAt(i+1) ){
                sb.append(counter);
                sb.append(input.charAt(i));
                counter=1;
            } else{
                counter++;
            }
        }
        return sb.toString();
    }

}
>>>>>>> 26b1aac (Final Commit_1)
