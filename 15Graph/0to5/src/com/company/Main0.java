package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main0 {
    //See notes for basic understanding of Graphs
    //Here I am considering the graph to be bidirectional graph i.e. 1->3 and 1<-3. For unidirectional work is even
    //less and code is less also as we have to do operation 1 time only in general.
    private static int vertexes = 5;//Example
    private static int edges = 13;//Example

    public static void main(String[] args) {
        //One way is using adjacency matrix which uses more memory (V^2) and is used in Dense Graphs can be of boolean or 0/1 and '1' denotes a connection bw 2 nodes.

        int[][] denseGraph = new int[vertexes + 1][vertexes + 1];//Here +1 will be done only coz im assuming nodes of graph staring from 1,
        //So, this is to avoid doing '-1' for each operation
        addEdgeMatrix(denseGraph, 3, 4);
        addEdgeMatrix(denseGraph, 1, 2);
        addEdgeMatrix(denseGraph, 2, 5);
        System.out.println(Arrays.deepToString(denseGraph));

        //Other way is Adjacency list which uses less memory (E+V) and is used in Sparse Graphs.
        ArrayList<LinkedList<Integer>> sparseGraph = new ArrayList<>();
        addEdgeList(sparseGraph, 3, 4);
        addEdgeList(sparseGraph, 1, 2);
        addEdgeList(sparseGraph, 2, 5);
        addEdgeList(sparseGraph, 5, 5);
        System.out.println(sparseGraph);
    }

    public static void addEdgeMatrix(int[][] graph, int source, int destination) {//im assuming here that user is inputting indexes in valid range from 1-5 in this example.
        graph[source][destination] = 1;
        graph[destination][source] = 1;
    }

    public static void addEdgeList(ArrayList<LinkedList<Integer>> graph, int source, int destination) {//same assumption as above method.
        initialization(graph);
        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }

    private static void initialization(ArrayList<LinkedList<Integer>> graph) {
        for (int i = 0; i <= vertexes; i++) {//<= coz of again 1-5 nodes assume instead of 0to5
            graph.add(new LinkedList<>());
        }
    }

}