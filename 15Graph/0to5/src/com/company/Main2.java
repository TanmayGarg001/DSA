<<<<<<< HEAD
//2.DFS
//https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1/
package com.company;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];//keeps track of nodes that we have visited
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(0, adj, visited, ans);//uses recursion coz of in-depth traversal
        return ans;
    }

    public static void dfs(int vertex, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> ans) {
        //Understand by using copy-pen
        visited[vertex] = true;
        ans.add(vertex);
        for (int neighbour : adj.get(vertex)) {
            if (!visited[neighbour]) {
                dfs(neighbour, adj, visited, ans);
            }
        }
    }

}
=======
//2.DFS
//https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1/
package com.company;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];//keeps track of nodes that we have visited
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(0, adj, visited, ans);//uses recursion coz of in-depth traversal
        return ans;
    }

    public static void dfs(int vertex, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> ans) {
        //Understand by using copy-pen
        visited[vertex] = true;
        ans.add(vertex);
        for (int neighbour : adj.get(vertex)) {
            if (!visited[neighbour]) {
                dfs(neighbour, adj, visited, ans);
            }
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
