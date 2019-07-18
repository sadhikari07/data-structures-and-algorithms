package java401_code_challenges.depth_first_graph;

import java401_code_challenges.graph.Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class DepthFirst<T> {

    public static ArrayList<Graph.Vertex> depthFirstGraph(Graph graph, Graph.Vertex vertex){
        ArrayList arr = new ArrayList();

        Stack<Graph.Vertex> stackOfVertices = new Stack<>();
        stackOfVertices.push(vertex);

        while (!stackOfVertices.isEmpty()){

            vertex = stackOfVertices.pop();

            if(!arr.contains(vertex)){
                arr.add(vertex);

                HashSet<Graph.Edge> edgeHashSet = vertex.edges;
                for(Graph.Edge edge : edgeHashSet){
                    if(!arr.contains(edge.end)){
                        stackOfVertices.push(edge.end);
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        Graph.Vertex result3 = classUnderTest.addVertex(3);
        Graph.Vertex result4 = classUnderTest.addVertex(4);
        Graph.Vertex result5 = classUnderTest.addVertex(5);
        Graph.Vertex result6 = classUnderTest.addVertex(6);
        Graph.Vertex result7 = classUnderTest.addVertex(7);
        classUnderTest.addEdge(result1, result2, 1);
        classUnderTest.addEdge(result2, result3, 1);
        classUnderTest.addEdge(result2, result4, 1);
        classUnderTest.addEdge(result1, result4, 1);
        classUnderTest.addEdge(result4, result5, 1);
        classUnderTest.addEdge(result4, result6, 1);
        classUnderTest.addEdge(result4, result7, 1);
        classUnderTest.addEdge(result6, result7, 1);
//        Graph.Vertex[] expectedOutput = {result3, result1, result2};
        ArrayList actualOutput = depthFirstGraph(classUnderTest, result1);
        for (int i = 0; i<actualOutput.size(); i++) {
            Graph.Vertex g = (Graph.Vertex) actualOutput.get(i);
            System.out.println(g.value);
        }
    }
}


//Reference: https://java2blog.com/depth-first-search-in-java/
//https://algorithms.tutorialhorizon.com/graph-depth-first-traversal/