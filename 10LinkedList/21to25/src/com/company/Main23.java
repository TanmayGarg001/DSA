<<<<<<< HEAD
//Given a doubly linked list containing n nodes, where each node is at most k away from its target position in the list. The problem is to sort the given doubly linked list.
//For example, let us consider k is 2, a node at position 7 in the sorted doubly linked list, can be at positions 5, 6, 7, 8, 9 in the given doubly linked list.
//https://www.geeksforgeeks.org/sort-k-sorted-doubly-linked-list/
package com.company;


public class Main23 {

    public static void main(String[] args) {
        //See the blog for detailed solution.
        //Whenever the question is based on sorting the best way is to do is: make a arrayList-> throw all that node data into that-> sort that arrayList & make a new node,
        //now append all the data od arraylist to the node and return it.
        //MC = O(nlogn) and TC = O(n)
        //In question like this here given DLL is nearly sorted to k, we did somewhat similar thing in the BinarySearch,
        //As it's nearly sorted to k we can use priority queue or minheap which will result to TC = O(nlogk) and MC = O(n)
    }

}
=======
//23.Given a doubly linked list containing n nodes, where each node is at most k away from its target position in the list. The problem is to sort the given doubly linked list.
//For example, let us consider k is 2, a node at position 7 in the sorted doubly linked list, can be at positions 5, 6, 7, 8, 9 in the given doubly linked list.
//https://www.geeksforgeeks.org/sort-k-sorted-doubly-linked-list/
package com.company;

public class Main23 {

    public static void main(String[] args) {
        //See the blog for detailed solution.
        //Whenever the question is based on sorting the best way is to do is: make a arrayList-> throw all that node data into that-> sort that arrayList & make a new node,
        //now append all the data od arraylist to the node and return it.
        //MC = O(nlogn) and TC = O(n)
        //In question like this here given DLL is nearly sorted to k, we did somewhat similar thing in the BinarySearch,
        //As it's nearly sorted to k we can use priority queue or minheap which will result to TC = O(nlogk) and MC = O(n)
    }

}
>>>>>>> 26b1aac (Final Commit_1)
