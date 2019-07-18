package java401_code_challenges.depth_first_graph;

import java401_code_challenges.graph.Graph;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DepthFirstTest {
    @Test
    public void testDepthFirstReturnItems() {
        DepthFirst libraryForTesting = new DepthFirst();
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        Graph.Vertex result3 = classUnderTest.addVertex(3);
        Graph.Vertex result4 = classUnderTest.addVertex(4);
        classUnderTest.addEdge(result1, result2, 1);
        classUnderTest.addEdge(result1, result3, 1);
        classUnderTest.addEdge(result3, result4, 1);
        Graph.Vertex[] expectedOutput1 = {result1, result2, result3, result4};
        Graph.Vertex[] expectedOutput2 = {result1, result3, result4, result2};
        ArrayList actualOutput = libraryForTesting.depthFirstGraph(classUnderTest, result1);
        for (int i = 0; i<expectedOutput1.length; i++) {
            assertTrue(expectedOutput1[i] == actualOutput.get(i) || expectedOutput2[i] == actualOutput.get(i));
        }
    }

    @Test
    public void testDepthFirstWithDifferentVertexReturnItems() {
        DepthFirst libraryForTesting = new DepthFirst();
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        Graph.Vertex result3 = classUnderTest.addVertex(3);
        Graph.Vertex result4 = classUnderTest.addVertex(4);
        classUnderTest.addEdge(result1, result2, 1);
        classUnderTest.addEdge(result1, result3, 1);
        classUnderTest.addEdge(result3, result4, 1);
        Graph.Vertex[] expectedOutput1 = {result2, result1, result3, result4};
        ArrayList actualOutput = libraryForTesting.depthFirstGraph(classUnderTest, result2);
        for (int i = 0; i<expectedOutput1.length; i++) {
            assertTrue("Expected output should match with actual output.", expectedOutput1[i] == actualOutput.get(i));
        }
    }

    @Test
    public void testBreadthFirstSize() {
        DepthFirst libraryForTesting = new DepthFirst();
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        Graph.Vertex result3 = classUnderTest.addVertex(3);
        classUnderTest.addEdge(result1, result2, 4);
        classUnderTest.addEdge(result1, result3, 4);
        classUnderTest.addEdge(result2, result1, 3);
        ArrayList actualOutput = libraryForTesting.depthFirstGraph(classUnderTest, result1);
        assertEquals("The size of depth first traversal should be 3", 3, actualOutput.size());
    }

    @Test
    public void testBreadthFirstWithManyVertices() {
        Graph classUnderTest = new Graph();
        DepthFirst libraryForTesting = new DepthFirst();
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
        ArrayList actualOutput = libraryForTesting.depthFirstGraph(classUnderTest, result1);
        assertEquals("The size of depth first traversal should be 7", 7, actualOutput.size());
    }


    @Test
    public void testBreadthWitFloatingVertex() {
        DepthFirst libraryForTesting = new DepthFirst();
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        Graph.Vertex result3 = classUnderTest.addVertex(3);
        Graph.Vertex result4 = classUnderTest.addVertex(4);
        classUnderTest.addEdge(result1, result2, 4);
        classUnderTest.addEdge(result1, result3, 4);
        classUnderTest.addEdge(result2, result3, 3);
        ArrayList result = libraryForTesting.depthFirstGraph(classUnderTest, result1);
        assertEquals("Size of the arraylist of depth first traversal should be 3", 3, result.size());
    }

}