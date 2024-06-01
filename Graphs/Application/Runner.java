package Graphs.Application;

import java.util.ArrayList;

import Graphs.Definition.CreateGraph;
import Graphs.Models.Edge;

public class Runner {
    public static void main(String args[]){
        int V = 7;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        CreateGraph.createUnweightedGraph(graph);

        boolean visited[] = new boolean[V];

        System.out.println();
    }
}
