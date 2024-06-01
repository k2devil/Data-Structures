package Graphs.Application;

import java.util.ArrayList;

import Graphs.CycleDetection.CycleDetection;
import Graphs.Definition.CreateGraph;
import Graphs.Models.Edge;

public class Runner {
    public static void main(String args[]){
        int V = 4;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        CreateGraph.createDirectionalGraph(graph);

        boolean visited[] = new boolean[V];
        boolean recursionvis[] = new boolean[V];
        boolean isCycle = false;
        for(int i=0; i<V;i++){
            if (!visited[i]) {
                isCycle = CycleDetection.cycleDetection(graph, visited, 0, recursionvis);
            }
        }
        System.out.println(isCycle);
    }
}
