package java401_code_challenges.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {


    //    Node can be successfully added to the graph
    @Test
    public void sizeTestAddingNode() {
        Graph classUnderTest = new Graph();
        classUnderTest.addVertex(5);
        assertEquals("Size of the graph should be 1", 1, classUnderTest.size);
    }

    @Test
    public void valueTestAddingNode() {
        Graph classUnderTest = new Graph();
        Graph.Vertex result = classUnderTest.addVertex(5);
        assertTrue("Value 5 should be contained in the vertex hash set", classUnderTest.getNodes().contains(result));
    }


    // An edge can be successfully added to the graph
    @Test
    public void testAddingEdge() {
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        classUnderTest.addEdge(result1, result2, 4);
        assertEquals("Number of edges for result1 should be 1 ", 1, classUnderTest.getNeighbors(result1).size());
    }


    // A collection of all nodes can be properly retrieved from the graph
    @Test
    public void testReturningAllNodes() {
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        assertEquals("Number of nodes from return should be 2 ", 2, classUnderTest.getNodes().size());
    }

    @Test
    public void testReturningAllNodesValues() {
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        Graph.Vertex[] arr = {result1, result2};
        for(int i = 0; i < arr.length; i++){
            assertTrue("Values 1 and 2 should be in the return.", classUnderTest.getNodes().contains(arr[i]));
        }
    }

    //    All appropriate neighbors can be retrieved from the graph
    @Test
    public void testReturningAllNeighbors() {
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        Graph.Vertex result3 = classUnderTest.addVertex(3);
        classUnderTest.addEdge(result1, result2, 4);
        classUnderTest.addEdge(result1, result3, 4);
        classUnderTest.addEdge(result2, result3, 3);
        assertEquals("result1 should have 2 neighbors", 2, classUnderTest.getNeighbors(result1).size());
        assertEquals("result3 should have 2 neighbors", 2, classUnderTest.getNeighbors(result3).size());
    }

    //    Neighbors are returned with the weight between nodes included
    @Test
    public void testReturningAllNeighborsWithWeight() {
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        Graph.Vertex result3 = classUnderTest.addVertex(3);
        classUnderTest.addEdge(result1, result2, 4);
        classUnderTest.addEdge(result1, result3, 4);
        classUnderTest.addEdge(result2, result3, 3);
        for(Graph.Edge edge : classUnderTest.getNeighbors(result1)){
            assertEquals("The value of weight returned from the getNeighbors() should be 4", 4, edge.weight);
        }
    }

    //    The proper size is returned, representing the number of nodes in the graph
    @Test
    public void testReturningSize() {
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        Graph.Vertex result3 = classUnderTest.addVertex(3);
        assertEquals("The proper size of the graph sould be returned", 3, classUnderTest.size());
    }

    @Test
    public void testReturningSizeOfEmpty() {
        Graph classUnderTest = new Graph();
        assertEquals("The proper size of the graph sould be returned", 0, classUnderTest.size());
    }

    //    A graph with only one node and edge can be properly returned
    @Test
    public void testReturningGraphWithOneNode() {
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        assertEquals("Graph with one item should return 1 for size of vertices", 1, classUnderTest.vertices.size());
    }

    @Test
    public void testReturningGraphWithOneEdge() {
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        classUnderTest.addEdge(result1, result2, 4);
        assertEquals("Graph with one edge should return 1 for size of vertices", 1, classUnderTest.getNeighbors(result1).size());
    }

    //    An empty graph properly returns empty hashset.
    @Test
    public void testReturningSizeOfEmptyNull() {
        Graph classUnderTest = new Graph();
        assertEquals("Empty graph should return 0 for size of vertices", 0, classUnderTest.vertices.size());
    }

}