# Implement a Graph

## Background info:
- A graph is a data structure for storing connected data like a network of people on a social media platform.
- A graph consists of vertices and edges.
A vertex represents the entity (for example, people) and an edge represents the relationship between entities (for example, a person’s friendships).
- A graph can be represented in different forms like adjacency matrix and adjacency list. Each one has their pros and cons in a different set-up.
//Reference: https://www.baeldung.com/java-graphs


## Challenge
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

### AddNode()
- Adds a new node to the graph
- Takes in the value of that node
- Returns the added node

### AddEdge()
- Adds a new edge between two nodes in the graph
- Include the ability to have a “weight”
- Takes in the two nodes to be connected by the edge
- Both nodes should already be in the Graph

### GetNodes()
- Returns all of the nodes in the graph as a collection (set, list, or similar)

### GetNeighbors()
- Returns a collection of nodes connected to the given node
- Takes in a given node
- Include the weight of the connection in the returned collection

### Size()
- Returns the total number of nodes in the graph

## Tests:

Write tests to prove the following functionality:

- Node can be successfully added to the graph
- An edge can be successfully added to the graph
- A collection of all nodes can be properly retrieved from the graph
- All appropriate neighbors can be retrieved from the graph
- Neighbors are returned with the weight between nodes included
- The proper size is returned, representing the number of nodes in the graph
- A graph with only one node and edge can be properly returned
- An empty graph properly returns null




## Approach & Efficiency

I created a Vertex class, which represents a node and has properties of integer value and a hashset of edges.

I created a Edge class which is made off of start vertex, end vertex, and weight.

I created a graph class which had properties of integer size to keep track of vertices, and hashSet of collection of vertices.

Then I used these classes to accomplish the feature tasks mentioned above.

The big O for this method is O(n).



## API

- addNode(): This method is declared as addVertex in the code. It taks in value of that node, adds that node to the graph and returns the added node.

- addEdge(): This method adds a new edge between two nodes in the graph and include the ability to have a “weight.
This method takes in the two nodes to be connected by the edge.

- getNodes: This method returns all of the nodes in the graph as a hashset.

- getNeighbors(): This method takes in a given node and returns a collection of nodes connected to the given node and includes the weight of the connection in the returned collection

- size(): Returns the total number of nodes in the graph.


## [Link to Graph.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/graph/Graph.java)

## [Link to GraphTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/graph/GraphTest.java)


## References:
- Evan (TA)
- https://stackoverflow.com/questions/44831436/java-implementing-weighted-graph/44831531
- https://www.sanfoundry.com/java-program-represent-graph-adjacency-list/
