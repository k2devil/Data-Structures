package Graphs.BFS;

import java.util.*;

import Graphs.Models.Edge;

public class Bfs {
    public static void bfs(ArrayList<Edge> graph[],int V, boolean visited[], int root){
        Queue<Integer> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int current = q.remove();
            if (!visited[current]) {
                System.out.print(current+" ");
                visited[current] = true;
                for(int i=0;i<graph[current].size();i++){
                    Edge e = graph[current].get(i);
                    q.add(e.getDestination());
                }
            }
        }

    }
}
