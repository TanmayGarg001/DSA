<<<<<<< HEAD
package com.company;

import java.util.Arrays;

public class Main4 {

    //Both are used to get a MST(Min spanning tree which covers all the nodes once and hence min. weight sum) from a connected graph(ofc)
    //Prims's: Select the source (initially), Now keep selecting the min. edge that is connected to the current selected edge.
    //Kruskal's: Always select the smallest weight edge in the graph, if the cycle is forming discard that edge

    //Dijkstra's Algo: Calculates the shortest distance from a source to all the other nodes in the graph. Very similar to prim's.

    //PRIM'S ALGORITHM:
    public static void primAlgo(int[][] graph, int vertexCount) {
        int numberOfEdges = 0;
        boolean[] track = new boolean[vertexCount];//keeps track of the vertexes selected for MST
        Arrays.fill(track, false);//initialize track[] with false coz initially no vertex is selected
        track[0] = true;//we select first vertex

        while (numberOfEdges < vertexCount - 1) {
            int min = Integer.MAX_VALUE;//max int for greedy approach
            int row = 0;
            int col = 0;
            for (int i = 0; i < vertexCount; i++) {
                if (track[i]) {//check for if the vertex is selected or not
                    for (int j = 0; j < vertexCount; j++) {
                        if (!track[j] && graph[i][j] != 0) {
                            if (min > graph[i][j]) {
                                min = graph[i][j];
                                row = i;
                                col = j;
                            }
                        }
                    }
                }
            }
            System.out.println(row + "->" + col + ": " + graph[row][col]);
            track[col] = true;
            numberOfEdges++;
        }
    }

    //DIJKSTRA'S ALGORITHM:
    public static void dijkstra(int[][] graph, int source) {
        int count = graph.length;
        boolean[] visitedVertex = new boolean[count];
        int[] distance = new int[count];
        for (int i = 0; i < count; i++) {
            visitedVertex[i] = false;
            distance[i] = Integer.MAX_VALUE;
        }

        // Distance of self loop is zero
        distance[source] = 0;
        for (int i = 0; i < count; i++) {

            // Update the distance between neighbouring vertex and source vertex
            int u = findMinDistance(distance, visitedVertex);
            visitedVertex[u] = true;

            // Update all the neighbouring vertex distances
            for (int v = 0; v < count; v++) {
                if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }
        for (int i = 0; i < distance.length; i++) {
            System.out.printf("Distance from %s to %s is %s%n", source, i, distance[i]);
        }

    }

    // Finding the minimum distance
    private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visitedVertex[i] && distance[i] < minDistance) {
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex;
    }

}
=======
package com.company;

import java.util.Arrays;

public class Main4 {

    //Both are used to get a MST(Min spanning tree which covers all the nodes once and hence min. weight sum) from a connected graph(ofc)
    //Prims's: Select the source (initially), Now keep selecting the min. edge that is connected to the current selected edge.
    //Kruskal's: Always select the smallest weight edge in the graph, if the cycle is forming discard that edge

    //Dijkstra's Algo: Calculates the shortest distance from a source to all the other nodes in the graph. Very similar to prim's.

    //PRIM'S ALGORITHM:
    public static void primAlgo(int[][] graph, int vertexCount) {
        int numberOfEdges = 0;
        boolean[] track = new boolean[vertexCount];//keeps track of the vertexes selected for MST
        Arrays.fill(track, false);//initialize track[] with false coz initially no vertex is selected
        track[0] = true;//we select first vertex

        while (numberOfEdges < vertexCount - 1) {
            int min = Integer.MAX_VALUE;//max int for greedy approach
            int row = 0;
            int col = 0;
            for (int i = 0; i < vertexCount; i++) {
                if (track[i]) {//check for if the vertex is selected or not
                    for (int j = 0; j < vertexCount; j++) {
                        if (!track[j] && graph[i][j] != 0) {
                            if (min > graph[i][j]) {
                                min = graph[i][j];
                                row = i;
                                col = j;
                            }
                        }
                    }
                }
            }
            System.out.println(row + "->" + col + ": " + graph[row][col]);
            track[col] = true;
            numberOfEdges++;
        }
    }

    //DIJKSTRA'S ALGORITHM:
    public static void dijkstra(int[][] graph, int source) {
        int count = graph.length;
        boolean[] visitedVertex = new boolean[count];
        int[] distance = new int[count];
        for (int i = 0; i < count; i++) {
            visitedVertex[i] = false;
            distance[i] = Integer.MAX_VALUE;
        }

        // Distance of self loop is zero
        distance[source] = 0;
        for (int i = 0; i < count; i++) {

            // Update the distance between neighbouring vertex and source vertex
            int u = findMinDistance(distance, visitedVertex);
            visitedVertex[u] = true;

            // Update all the neighbouring vertex distances
            for (int v = 0; v < count; v++) {
                if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }
        for (int i = 0; i < distance.length; i++) {
            System.out.printf("Distance from %s to %s is %s%n", source, i, distance[i]);
        }

    }

    // Finding the minimum distance
    private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visitedVertex[i] && distance[i] < minDistance) {
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex;
    }

}
>>>>>>> 26b1aac (Final Commit_1)
