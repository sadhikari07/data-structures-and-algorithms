package java401_code_challenges.getEdge;
import java401_code_challenges.graph.Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class GetEdge<T>{

    public String getEdge(Graph<T> graph, String[] inputArray) {

        boolean directConnectionStatus = false;
        Graph.Vertex cityOfInterest = null;
        String noRoute = "False, $0";


        for (Graph.Vertex cityVertex : graph.vertices) {

            if (inputArray[0].equals(cityVertex.value)) {
                directConnectionStatus = true;
                cityOfInterest = cityVertex;
            }
        }

        if(!directConnectionStatus){
            return noRoute;
        }

        int flightPrice = 0;


        for (int i = 1; i < inputArray.length; i++) {
            HashSet<Graph.Edge> edgeHashSet = cityOfInterest.edges;
            directConnectionStatus = false;
            for (Graph.Edge neighborCity : edgeHashSet) {
                //Check to see if next city is in the list of neighbors (edges) of current city.
                if (neighborCity.end.value.equals(inputArray[i])) {
                    flightPrice = flightPrice + neighborCity.weight;
                    directConnectionStatus = true;
                    cityOfInterest = neighborCity.end;
                }
            }
            if(!directConnectionStatus){
                return noRoute;
            }
        }
    return "True, $" + flightPrice;
    }
}

//Reference: https://medium.com/basecs/finding-the-shortest-path-with-a-little-help-from-dijkstra-613149fbdc8e
//https://www.baeldung.com/java-dijkstra