package java401_code_challenges.breadth_first_graph;
import java401_code_challenges.graph.Graph;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BreadthFirstGraphTest {

    @Test
    public void testBreadthFirstReturnItems() {
        BreadthFirstGraph libraryForTesting = new BreadthFirstGraph();
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        Graph.Vertex result3 = classUnderTest.addVertex(3);
        classUnderTest.addEdge(result1, result2, 4);
        classUnderTest.addEdge(result1, result3, 4);
        classUnderTest.addEdge(result2, result3, 3);
        Graph.Vertex[] expectedOutput = {result1, result2, result3};
        ArrayList actualOutput = libraryForTesting.breadthFirst(result1);
        for (int i = 0; i<expectedOutput.length; i++) {
            assertEquals("Elements on return should be result1, result2, and result3", expectedOutput[i], actualOutput.get(i));
        }
    }

    @Test
    public void testBreadthFirstWithDifferentNode() {
        BreadthFirstGraph libraryForTesting = new BreadthFirstGraph();
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        Graph.Vertex result3 = classUnderTest.addVertex(3);
        classUnderTest.addEdge(result1, result2, 4);
        classUnderTest.addEdge(result1, result3, 4);
        classUnderTest.addEdge(result2, result1, 3);
        Graph.Vertex[] expectedOutput = {result2, result1, result3};
        ArrayList actualOutput = libraryForTesting.breadthFirst(result2);
        for (int i = 0; i<expectedOutput.length; i++) {
            assertEquals("Elements on return should be result2, result1, and result3", expectedOutput[i], actualOutput.get(i));
        }
    }

    @Test
    public void testBreadthFirstWithThirdNode() {
        BreadthFirstGraph libraryForTesting = new BreadthFirstGraph();
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        Graph.Vertex result3 = classUnderTest.addVertex(3);
        classUnderTest.addEdge(result1, result2, 4);
        classUnderTest.addEdge(result1, result3, 4);
        classUnderTest.addEdge(result2, result1, 3);
        Graph.Vertex[] expectedOutput = {result3, result1, result2};
        ArrayList actualOutput = libraryForTesting.breadthFirst(result3);
        for (int i = 0; i<expectedOutput.length; i++) {
            assertEquals("Elements on return should be result3, result1, and result2", expectedOutput[i], actualOutput.get(i));
        }
    }

    @Test
    public void testBreadthFirstReturnSize() {
        BreadthFirstGraph libraryForTesting = new BreadthFirstGraph();
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        Graph.Vertex result3 = classUnderTest.addVertex(3);
        classUnderTest.addEdge(result1, result2, 4);
        classUnderTest.addEdge(result1, result3, 4);
        classUnderTest.addEdge(result2, result3, 3);
        ArrayList result = libraryForTesting.breadthFirst(result1);
        assertEquals("Size of the arraylist of breadth first traversal should be 3", 3, result.size());
    }

    @Test
    public void testBreadthWitFloatingVertex() {
        BreadthFirstGraph libraryForTesting = new BreadthFirstGraph();
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex(1);
        Graph.Vertex result2 = classUnderTest.addVertex(2);
        Graph.Vertex result3 = classUnderTest.addVertex(3);
        Graph.Vertex result4 = classUnderTest.addVertex(4);
        classUnderTest.addEdge(result1, result2, 4);
        classUnderTest.addEdge(result1, result3, 4);
        classUnderTest.addEdge(result2, result3, 3);
        ArrayList result = libraryForTesting.breadthFirst(result1);
        assertEquals("Size of the arraylist of breadth first traversal should be 3", 3, result.size());
    }
}