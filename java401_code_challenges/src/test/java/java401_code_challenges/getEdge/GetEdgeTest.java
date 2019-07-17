package java401_code_challenges.getEdge;

import java401_code_challenges.graph.Graph;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GetEdgeTest {
    @Test
    public void findConnnectionThatShouldntExist() {
        GetEdge libraryForTesting = new GetEdge();
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex("China");
        Graph.Vertex result2 = classUnderTest.addVertex("India");
        Graph.Vertex result3 = classUnderTest.addVertex("Nepal");
        Graph.Vertex result4 = classUnderTest.addVertex("Japan");
        classUnderTest.addEdge(result1, result2, 100);
        classUnderTest.addEdge(result1, result3, 200);
        classUnderTest.addEdge(result2, result4, 100);
        String expectedOutput = "False, $0";
        String[] findConnection = {"China", "Japan"};
        assertEquals("There should be no direct connection from China to Japan", expectedOutput, libraryForTesting.getEdge(classUnderTest, findConnection));
    }

    @Test
    public void findConnnectionBetweenTwo() {
        GetEdge libraryForTesting = new GetEdge();
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex("China");
        Graph.Vertex result2 = classUnderTest.addVertex("India");
        Graph.Vertex result3 = classUnderTest.addVertex("Nepal");
        Graph.Vertex result4 = classUnderTest.addVertex("Japan");
        classUnderTest.addEdge(result1, result2, 100);
        classUnderTest.addEdge(result1, result3, 200);
        classUnderTest.addEdge(result2, result4, 100);
        String expectedOutput = "True, $100";
        String[] findConnection = {"China", "India"};
        assertEquals("There should be direct connection from China to India", expectedOutput, libraryForTesting.getEdge(classUnderTest, findConnection));
    }

    @Test
    public void findConnnectionBetweenThree() {
        GetEdge libraryForTesting = new GetEdge();
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex("China");
        Graph.Vertex result2 = classUnderTest.addVertex("India");
        Graph.Vertex result3 = classUnderTest.addVertex("Nepal");
        Graph.Vertex result4 = classUnderTest.addVertex("Japan");
        classUnderTest.addEdge(result1, result2, 100);
        classUnderTest.addEdge(result1, result3, 200);
        classUnderTest.addEdge(result2, result4, 100);
        String expectedOutput = "True, $200";
        String[] findConnection = {"China", "India", "Japan"};
        assertEquals("There should be direct connection from China to India to Japan", expectedOutput, libraryForTesting.getEdge(classUnderTest, findConnection));
    }

    @Test
    public void findConnnectionBetweenThreeThatBreaks() {
        GetEdge libraryForTesting = new GetEdge();
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex("China");
        Graph.Vertex result2 = classUnderTest.addVertex("India");
        Graph.Vertex result3 = classUnderTest.addVertex("Nepal");
        Graph.Vertex result4 = classUnderTest.addVertex("Japan");
        classUnderTest.addEdge(result1, result2, 100);
        classUnderTest.addEdge(result1, result3, 200);
        classUnderTest.addEdge(result2, result4, 100);
        String expectedOutput = "False, $0";
        String[] findConnection = {"China", "Japan", "India"};
        assertEquals("There should not be direct connection from China to Japan to India", expectedOutput, libraryForTesting.getEdge(classUnderTest, findConnection));
    }

    @Test
    public void findConnnectionOnNonExistingCity() {
        GetEdge libraryForTesting = new GetEdge();
        Graph classUnderTest = new Graph();
        Graph.Vertex result1 = classUnderTest.addVertex("China");
        Graph.Vertex result2 = classUnderTest.addVertex("India");
        Graph.Vertex result3 = classUnderTest.addVertex("Nepal");
        Graph.Vertex result4 = classUnderTest.addVertex("Japan");
        classUnderTest.addEdge(result1, result2, 100);
        classUnderTest.addEdge(result1, result3, 200);
        classUnderTest.addEdge(result2, result4, 100);
        String expectedOutput = "False, $0";
        String[] findConnection = {"Maldives", "Japan"};
        assertEquals("There should not be direct connection from Maldives to Japan", expectedOutput, libraryForTesting.getEdge(classUnderTest, findConnection));
    }

}