package Graphs.Application;

import java.util.ArrayList;

import Graphs.BFS.Bfs;
import Graphs.Definition.CreateGraph;
import Graphs.Models.Edge;

public class Runner {
    public static void main(String args[]){
        int V = 7;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        CreateGraph.createUnweightedGraph(graph);

        boolean visited[] = new boolean[V];

        /* FOR BFS */

        for (int i=0; i<V ; i++){
            if(!visited[i]){
                Bfs.bfs(graph, V, visited, i);
            }
        }
        System.out.println();
    }
}
