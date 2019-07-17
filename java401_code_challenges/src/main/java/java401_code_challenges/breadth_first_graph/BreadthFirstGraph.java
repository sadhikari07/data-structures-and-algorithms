package java401_code_challenges.breadth_first_graph;

import java401_code_challenges.graph.Graph;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;


public class BreadthFirstGraph {

    public ArrayList breadthFirst(Graph.Vertex startVertex){

        ArrayList<Graph.Vertex> collectionOfVertices = new ArrayList();

        Queue<Graph.Vertex> queueOfEdges = new LinkedList();

        queueOfEdges.add(startVertex);

        collectionOfVertices.add(startVertex);

        HashSet<Graph.Edge> edgesHashSet;

        while(!queueOfEdges.isEmpty()){
            Graph.Vertex vertexOfInterest = queueOfEdges.remove();
            edgesHashSet = vertexOfInterest.edges;
            for(Graph.Edge edge : edgesHashSet) {

                if (!collectionOfVertices.contains(edge.end)) {
                    collectionOfVertices.add(edge.end);
                    queueOfEdges.add(edge.end);
                }
            }
        }
        return collectionOfVertices;
    }
}
