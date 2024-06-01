package Graphs.PrintAllPath;

import java.util.ArrayList;

import Graphs.Models.Edge;

public class PrintAllPaths {
    public static void modifiedDFS(ArrayList<Edge> graph[], int current, boolean visited[], int target, String path){
        if(current==target){
            System.out.println(path);
            return;
        }
        for(int i=0; i<graph[current].size(); i++){
            Edge e = graph[current].get(i);
            if(!visited[e.getDestination()]){
                visited[current]=true;
                modifiedDFS(graph, e.getDestination(), visited, target, path+e.getDestination());
                visited[current]=false;
            }
        }
    }
}
