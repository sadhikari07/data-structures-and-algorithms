package java401_code_challenges.graph;

import java.util.*;

public class Graph<T> {

    public HashSet<Vertex> vertices;
    public int size;

    public Graph() {
        this.size = 0;
        vertices = new HashSet<>();
    }

    public void addEdge(Vertex<T> start, Vertex<T> end, int weight){
       Edge newEdge = new Edge(start, end, weight);
       Edge edgeReversed = new Edge(end, start, weight);
       start.edges.add(newEdge);
       end.edges.add(edgeReversed);
    }

    public Vertex addVertex(T value){
        Vertex newVertex = new Vertex(value);
        vertices.add(newVertex);
        size++;
        return newVertex;
    }

    public HashSet getNodes(){
        HashSet allNodes = vertices;
        return allNodes;
    }

    public HashSet<Edge> getNeighbors(Vertex vertexOfInterest){
        HashSet neighborEdges = vertexOfInterest.edges;
        return neighborEdges;
    }

    public int size(){
        return size;
    }


    public class Edge{
        public Vertex start;
        public Vertex end;
        public int weight;
        public Edge(Vertex start, Vertex end, int weight){
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
    }

    public class Vertex<T>{
        public T value;
        public HashSet<Edge> edges;

        public Vertex(T value){
            this.value = value;
            this.edges = new HashSet<>();
        }
    }

}


//https://stackoverflow.com/questions/44831436/java-implementing-weighted-graph/44831531