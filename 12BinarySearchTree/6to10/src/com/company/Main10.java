<<<<<<< HEAD
//10.Merge Two Balanced Binary Search Trees
//https://www.geeksforgeeks.org/merge-two-balanced-binary-search-trees/
package com.company;

import java.util.ArrayList;

public class Main10 {

    private static Node ansRoot;

    public static void main(String[] args) {
//        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(-5, -1, 0, 4, 8, 15, 32, 55, 69, 99, 100));
//        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(-3, -2, 1, 6, 11, 27, 45, 60, 73, 420));
//        System.out.println(al1);
//        System.out.println(al2);
//        System.out.println("=====");
//        ArrayList<Integer> al = new ArrayList<>();
//        System.out.println(al);
    }

    public static Node mergeBST(Node root1, Node root2) {
        //TC = O(m+n),MC = O(m+n)
        //Do inOrder traversal of both roots get the sorted arrays and then merge the 2 sorted arrays in O(m+n),
        //other way is to simply addAll elements and then sort but taken O((n+m)log(n+m)) time.
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        inOrder(root1, al1);
        inOrder(root2, al2);
        ArrayList<Integer> mergedAl = new ArrayList<>();
        merge2SortedArrays(mergedAl, al1, al2);
        buildBST(mergedAl);
        return ansRoot;
    }

    public static void inOrder(Node root, ArrayList<Integer> al) {
        if (root != null) {
            inOrder(root.left, al);
            al.add(root.data);
            inOrder(root.right, al);
        }
    }

    public static void merge2SortedArrays(ArrayList<Integer> al, ArrayList<Integer> al1, ArrayList<Integer> al2) {
        //This will take O(m+n) time and result in sorted array.
        int i = 0;
        int j = 0;
        while (i < al1.size() && j < al2.size()) {
            if (al1.get(i) < al2.get(j)) {
                al.add(al1.get(i));
                i++;
            } else {
                al.add(al2.get(j));
                j++;
            }
        }
        while (i < al1.size()) {
            al.add(al1.get(i));
            i++;
        }
        while (j < al2.size()) {
            al.add(al2.get(j));
            j++;
        }
    }

    public static void buildBST(ArrayList<Integer> mergedAl) {
        for (int i = 0; i < mergedAl.size(); i++) {
            ansRoot = solve(ansRoot, mergedAl.get(i));
        }
    }

    public static Node solve(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else if (root.data > data) {
            root.left = solve(root.left, data);
        } else if (root.data < data) {
            root.right = solve(root.right, data);
        }
        return root;
    }

    public static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            left = null;
            right = null;
            this.data = data;
        }
    }

}
=======
//10.Merge Two Balanced Binary Search Trees
//https://www.geeksforgeeks.org/merge-two-balanced-binary-search-trees/
package com.company;

import java.util.ArrayList;

public class Main10 {

    private static Node ansRoot;

    public static void main(String[] args) {
//        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(-5, -1, 0, 4, 8, 15, 32, 55, 69, 99, 100));
//        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(-3, -2, 1, 6, 11, 27, 45, 60, 73, 420));
//        System.out.println(al1);
//        System.out.println(al2);
//        System.out.println("=====");
//        ArrayList<Integer> al = new ArrayList<>();
//        System.out.println(al);
    }

    public static Node mergeBST(Node root1, Node root2) {
        //TC = O(m+n),MC = O(m+n)
        //Do inOrder traversal of both roots get the sorted arrays and then merge the 2 sorted arrays in O(m+n),
        //other way is to simply addAll elements and then sort but taken O((n+m)log(n+m)) time.
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        inOrder(root1, al1);
        inOrder(root2, al2);
        ArrayList<Integer> mergedAl = new ArrayList<>();
        merge2SortedArrays(mergedAl, al1, al2);
        buildBST(mergedAl);
        return ansRoot;
    }

    public static void inOrder(Node root, ArrayList<Integer> al) {
        if (root != null) {
            inOrder(root.left, al);
            al.add(root.data);
            inOrder(root.right, al);
        }
    }

    public static void merge2SortedArrays(ArrayList<Integer> al, ArrayList<Integer> al1, ArrayList<Integer> al2) {
        //This will take O(m+n) time and result in sorted array.
        int i = 0;
        int j = 0;
        while (i < al1.size() && j < al2.size()) {
            if (al1.get(i) < al2.get(j)) {
                al.add(al1.get(i));
                i++;
            } else {
                al.add(al2.get(j));
                j++;
            }
        }
        while (i < al1.size()) {
            al.add(al1.get(i));
            i++;
        }
        while (j < al2.size()) {
            al.add(al2.get(j));
            j++;
        }
    }

    public static void buildBST(ArrayList<Integer> mergedAl) {
        for (int i = 0; i < mergedAl.size(); i++) {
            ansRoot = solve(ansRoot, mergedAl.get(i));
        }
    }

    public static Node solve(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else if (root.data > data) {
            root.left = solve(root.left, data);
        } else if (root.data < data) {
            root.right = solve(root.right, data);
        }
        return root;
    }

    public static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            left = null;
            right = null;
            this.data = data;
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
