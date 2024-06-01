package Graphs.CycleDetection;

import java.util.ArrayList;

import Graphs.Models.Edge;

public class CycleDetection {
    public static boolean cycleDetection(ArrayList<Edge> graph[], boolean visited[], int current, boolean recursionvis[]){
        visited[current] = true;
        recursionvis[current] = true;

        for(int i=0; i<graph[current].size(); i++){
            Edge e = graph[current].get(i);
            if (recursionvis[e.getDestination()]) {
                return true;
            }
            else if (!visited[e.getDestination()]){
                if(cycleDetection(graph, visited, e.getDestination(), recursionvis)){
                    return true;
                }
            }
        }
        recursionvis[current] = false;
        return false;
    }
}
