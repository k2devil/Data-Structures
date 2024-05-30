package Graphs.Definition;

import java.util.ArrayList;

import Graphs.Models.Edge;

public class CreateGraph {
    public static void initializeGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
    }
    public static void createWeightedGraph(ArrayList<Edge> graph[]){
        initializeGraph(graph);
        graph[0].add(new Edge(0, 1,5));
        graph[0].add(new Edge(0, 2,3));
        graph[1].add(new Edge(1, 3,4));
        graph[1].add(new Edge(1, 0,5));
        graph[2].add(new Edge(2, 4,8));
        graph[2].add(new Edge(2, 0,3));
        graph[3].add(new Edge(3, 1,4));
        graph[3].add(new Edge(3, 4,9));
        graph[3].add(new Edge(3, 5,2));
        graph[4].add(new Edge(4, 2,8));
        graph[4].add(new Edge(4, 3,9));
        graph[4].add(new Edge(4, 5,2));
        graph[5].add(new Edge(5, 3,2));
        graph[5].add(new Edge(5, 4,2));
        graph[5].add(new Edge(5, 6,1));
        graph[6].add(new Edge(6, 5,1));

    }
    public static void createUnweightedGraph(ArrayList<Edge> graph[]){
        initializeGraph(graph);
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 0));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        graph[6].add(new Edge(6, 5));
    }
}
