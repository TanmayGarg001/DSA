<<<<<<< HEAD
package com.company;

public class Main {

    public static void main(String[] args) {
        //=========================================================================================================================================================//
        //BASICS AND USEFUL WAYS TO APPROACH:-
        //Approach to increase selection ratio!
        //Some dos and don'ts for an interview or coding test, what to do when stuck, how to debug your code and a lot more.
        //Check previous year paper and tests of the company and prepare mentally reading instructions.
        //Check weightage and difficult level(if given), generally if 3 questions are given it is easy medium and hard. So manage time accordingly.
        //Time management is very important, use initial instruction time to calculate time you can give to each question flexibility at max +-5 mins.
        //By reading problem statement carefully you should understand what is being asked i/p o/p requirements etc. because some companies won't give explanation.
        //Use constraints to recognize time complexities and use custom test cases for your help.
        //Some companies take care of the i/p o/p and ask you to write the meat of the mode (function etc.), other don't.
        //Example::- on hackerRank mostly function is required but on hackerEarth i/p o/p and function everything will be done by you take care of format too!
        //Test case can carry different marks too! Like corner cases and if input is very large then they may carry more marks.
        //=========================================================================================================================================================//
        //CONSTRAINTS AND TIME COMPLEXITY:-
        //Now these below points are legendary points! Constraints and debugging can lead to selection if done properly!
        //Constraints are very, very important as they check 2 things :- to check your skills and time constraint.
        System.out.println(Integer.MAX_VALUE);//Max value is of the order 2*10^9//as int is 4bytes
        System.out.println(Long.MAX_VALUE);//Max value is of the order 9*10^19//and long is 8bytes
        //Use java.math.BigInteger import for anything larger than that.It has no limit!
        //Write optimized code to avoid TLE(Time limited exceed)!
        //Now by seeing constraint we can deduce TimeComplexity, so it helps to avoid TLE.
        //Generally, the machines that verify the code runs at 10^8 operations per second.1 operation is defined as simple command that CPU executes like a+b=c;//this is 1 oper.
        //So they can do operations like this 10^8 in a sec, it may sound a lot but if the same thing is done in an array with a million elements and there are several
        //commands inside it that do the same, it results in TLE. So loop is bottleneck!
        //So if time is given lets say 2sec for a test case then we can do 2*10^8 operations at max in our code.
        //So loop runs till N and which is given as constraint in the question.
        //Basically run your code at max Value of N or constraints provided and if it runs , then you're good to go!
        //For example if 1<=N<=10^4 then O(n^2) will work just fine!
        //But if N can go beyond that lets say 10^8 or more than that,then O(n^2) will give TLE!
        //So before writing code, check the constraints and calculate the max Time Limit approach, now write the code using that time complexity.
        //So by calculating time complexity before even reading the question you can somewhat predict the approach required to solve the question.
        //Ex:- if Tc comes out to be O(logn) then binary search might work. etc.but remember 10^7 can't run O(logn) as log base is 2.It might work but mostly it won't.
        //If N is very low then exponential will work, so it might be using recursion.
        //Linear will most likely will be solved using some data structure like HashMap etc.
        //See the table for a better understanding.
        //=========================================================================================================================================================//
        //DEBUGGING:-
        //Now after writing the code if it does not work or is having some bugs etc. solve them.
        //Test custom input is the best way to debug your code!
        //Run custom input with the cases that you coded on whilst dry run and re-check the logic and write the values or outputs after execution of a segment in the code.
        //So firstly run with custom input and re-run the logic.
        //Use print statements they help a lot!See the image.
        //Stub the functions i.e. use comment a function that you are sure about and pass the direct output manually.
        //=========================================================================================================================================================//
    }

}
=======
package com.company;

public class Main {
    public static void main(String[] args) {
        //=========================================================================================================================================================//
        //BASICS AND USEFUL WAYS TO APPROACH:-
        //Approach to increase selection ratio!
        //Some dos and don'ts for an interview or coding test, what to do when stuck, how to debug your code and a lot more.
        //Check previous year paper and tests of the company and prepare mentally reading instructions.
        //Check weightage and difficult level(if given), generally if 3 questions are given it is easy medium and hard. So manage time accordingly.
        //Time management is very important, use initial instruction time to calculate time you can give to each question flexibility at max +-5 mins.
        //By reading problem statement carefully you should understand what is being asked i/p o/p requirements etc. because some companies won't give explanation.
        //Use constraints to recognize time complexities and use custom test cases for your help.
        //Some companies take care of the i/p o/p and ask you to write the meat of the code (function etc.), other don't.
        //Example:- on hackerRank mostly function is required but on hackerEarth i/p o/p and function everything will be done by you take care of format too!
        //Test case can carry different marks too! Like corner cases and if input is very large then they may carry more marks.
        //=========================================================================================================================================================//
        //CONSTRAINTS AND TIME COMPLEXITY:-
        //Now these below points are legendary points! Constraints and debugging can lead to selection if done properly!
        //Constraints are very, very important as they check 2 things :- to check your skills and time constraint.
        System.out.println(Integer.MAX_VALUE);//Max value is of the order 2*10^9//as int is 4bytes
        System.out.println(Long.MAX_VALUE);//Max value is of the order 9*10^19//and long is 8bytes
        //Use java.math.BigInteger import for anything larger than that.It has no limit!
        //Write optimized code to avoid TLE(Time limited exceed)!
        //Now by seeing constraint we can deduce TimeComplexity, so it helps to avoid TLE.
        //Generally, the machines that verify the code runs at 10^8 operations per second.1 operation is defined as simple command that CPU executes like a+b=c;//this is 1 oper.
        //So they can do operations like this 10^8 in a sec, it may sound a lot but if the same thing is done in an array with a million elements and there are several
        //commands inside it that do the same, it results in TLE. So loop is bottleneck!
        //So if time is given lets say 2sec for a test case then we can do 2*10^8 operations at max in our code.
        //So loop runs till N and which is given as constraint in the question.
        //Basically run your code at max Value of N or constraints provided and if it runs , then you're good to go!
        //For example if 1<=N<=10^4 then O(n^2) will work just fine!
        //But if N can go beyond that lets say 10^8 or more than that,then O(n^2) will give TLE!
        //So before writing code, check the constraints and calculate the max Time Limit approach, now write the code using that time complexity.
        //So by calculating time complexity before even reading the question you can somewhat predict the approach required to solve the question.
        //Ex:- if Tc comes out to be O(logn) then binary search might work. etc.but remember 10^7 can't run O(nlogn) as log base is 2.It might work but mostly it won't.
        //If N is very low then exponential will work, so it might be using recursion.
        //Linear will most likely will be solved using some data structure like HashMap etc.
        //See the table for a better understanding.
        //=========================================================================================================================================================//
        //DEBUGGING:-
        //Now after writing the code if it does not work or is having some bugs etc. solve them.
        //Test custom input is the best way to debug your code!
        //Run custom input with the cases that you coded on whilst dry run and re-check the logic and write the values or outputs after execution of a segment in the code.
        //So firstly run with custom input and re-run the logic.
        //Use print statements they help a lot!See the image.
        //Stub the functions i.e. use comment a function that you are sure about and pass the direct output manually.
        //=========================================================================================================================================================//
    }

}
>>>>>>> 26b1aac (Final Commit_1)
