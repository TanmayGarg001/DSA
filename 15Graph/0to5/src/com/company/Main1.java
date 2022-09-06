<<<<<<< HEAD
//1.BFS
//https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1/
package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main1 {

    public static void main(String[] args) {

    }

    //adj = adjacency list which is given to us and contains connections of node in the graph.
    //src = source node; dest = destination node; v = number of vertexes in the graph
    //pred[] = stores the path of source to destination if it's asked to print
    //dist[] = will store the distance of every node from source
    public static void bfsOfGraph(ArrayList<ArrayList<Integer>> adj, int src, int dest, int v, int[] prev, int[] dist) {
        Queue<Integer> q = new LinkedList<>();//will be used as storage for enqueuing nodes to implement BFS
        boolean[] visited = new boolean[v];//keeps track of nodes that we have visited
        for (int i = 0; i < v; i++) {
            dist[i] = Integer.MAX_VALUE;//Every vertex is at infinity distance from source initially except the source itself
            prev[i] = -1;//Prev node from source is nothing so -1
        }
        visited[src] = true;
        dist[src] = 0;
        q.add(src);
        while (!q.isEmpty()) {
            int curr = q.poll();//get the current node to consider for BFS and then go to all the connected neighbours of node.
            for (int i = 0; i < adj.get(curr).size(); i++) {
                int neighbour = adj.get(curr).get(i);
                if (!visited[neighbour]) {//if the neighbour has never been visited before then set it to true and perform req. operations
                    visited[neighbour] = true;
                    dist[neighbour] = dist[curr] + 1;
                    prev[neighbour] = curr;
                    q.add(neighbour);
                    if (neighbour == dest) {
                        break;
                    }
                }
            }
        }
    }

}
=======
//1.BFS
//https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1/
package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main1 {

    public static void main(String[] args) {

    }

    //adj = adjacency list which is given to us and contains connections of node in the graph.
    //src = source node; dest = destination node; v = number of vertexes in the graph
    //pred[] = stores the path of source to destination if it's asked to print
    //dist[] = will store the distance of every node from source
    public static void bfsOfGraph(ArrayList<ArrayList<Integer>> adj, int src, int dest, int v, int[] prev, int[] dist) {
        Queue<Integer> q = new LinkedList<>();//will be used as storage for enqueuing nodes to implement BFS
        boolean[] visited = new boolean[v];//keeps track of nodes that we have visited
        for (int i = 0; i < v; i++) {
            dist[i] = Integer.MAX_VALUE;//Every vertex is at infinity distance from source initially except the source itself
            prev[i] = -1;//Prev node from source is nothing so -1
        }
        visited[src] = true;
        dist[src] = 0;
        q.add(src);
        while (!q.isEmpty()) {
            int curr = q.poll();//get the current node to consider for BFS and then go to all the connected neighbours of node.
            for (int i = 0; i < adj.get(curr).size(); i++) {
                int neighbour = adj.get(curr).get(i);
                if (!visited[neighbour]) {//if the neighbour has never been visited before then set it to true and perform req. operations
                    visited[neighbour] = true;
                    dist[neighbour] = dist[curr] + 1;
                    prev[neighbour] = curr;
                    q.add(neighbour);
                    if (neighbour == dest) {
                        break;
                    }
                }
            }
        }
    }

}
>>>>>>> 26b1aac (Final Commit_1)
