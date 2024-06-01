package Graphs.DFS;

import java.util.*;

import Graphs.Models.Edge;

public class Dfs {
    public static void dfs(ArrayList<Edge> graph[], int current, boolean visited[]){
        System.out.print(current+" ");
        visited[current] = true;

        for (int i=0; i<graph[current].size();i++){
            Edge e = graph[current].get(i);

            if(!visited[e.getDestination()]){
                dfs(graph, e.getDestination(), visited);
            }
        }
    }
}
