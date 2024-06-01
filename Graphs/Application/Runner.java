package Graphs.Application;

import java.util.ArrayList;

import Graphs.Definition.CreateGraph;
import Graphs.Models.Edge;
import Graphs.PrintAllPath.PrintAllPaths;

public class Runner {
    public static void main(String args[]){
        int V = 7;

        int source = 0;
        int target = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        CreateGraph.createUnweightedGraph(graph);

        boolean visited[] = new boolean[V];

        PrintAllPaths.modifiedDFS(graph, source, visited, target, ""+source);
        System.out.println();
    }
}
