package Graphs.Application;

import java.util.ArrayList;

import Graphs.DFS.Dfs;
import Graphs.Definition.CreateGraph;
import Graphs.Models.Edge;

public class Runner {
    public static void main(String args[]){
        int V = 7;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        CreateGraph.createUnweightedGraph(graph);

        boolean visited[] = new boolean[V];

        /* FOR DFS */

        for (int i=0; i<V ; i++){
            if(!visited[i]){
                Dfs.dfs(graph, i, visited);
            }
        }
        System.out.println();
    }
}
