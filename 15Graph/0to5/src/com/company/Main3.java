package com.company;

import java.util.ArrayList;

public class Main3 {

    //Cycle detection in graph
    public static void main(String[] args) {

    }

    public static boolean cycleDetection(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];//keeps track of nodes that we have visited
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < v; i++) {//To cover dis-connected graphs in a graph
            if (!visited[i]) {
                if (dfsCycleDetect(0, adj, visited, -1)) {//uses recursion coz of in-depth traversal
                    return true;
                }
            }
        }
        return false;//No cycle was found after doing all the work
    }

    public static boolean dfsCycleDetect(int vertex, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int parent) {
        //Understand by using copy-pen
        visited[vertex] = true;
        for (int neighbour : adj.get(vertex)) {
            if (!visited[neighbour]) {
                if (dfsCycleDetect(neighbour, adj, visited, vertex)) {
                    return true;
                }
            } else if (parent != neighbour) {
                return true;
            }
        }
        return false;
    }


}