# Get Edge

Conduct a depth first preorder traversal on a graph.

## Feature tasks:

Create a function that accepts an adjacency list as a graph, and conducts a depth first traversal.
Without utilizing any of the built-in methods available to your language, return a collection of nodes in their pre-order depth-first traversal order.

## Approach & Efficiency
- I created a method depthFirst which took in a graph and a vertex (node) as arguments.
- I declared a stack and pushed the vertex to the stack.
- I created a while loop to run until there was nothing in the stack. I popped the last item pushed in the stack.
- I checked to see if the arraylist that I declared to contain all the vertices contains the popped item or not.
    If not, then I added the item to the arraylist.
- I looked at all of the edges of the popped item. If the arraylist did not have the end of the edged in it already, I added the end of the edges to the stack.
- I returned the arraykist as result.

The big O for this approach is O(n^2).

## Tests:
    testDepthFirstSize: Tests the size of the arraylist of the nodes returned after depth first traversal.

    testDepthReturnlItems: Tests the items from return of depth first traversal with three vertices and first input as argument.

    estDepthFirstWithDifferentVertexReturnItems: Tests the items from return of depth first traversal with three vertices and second input as argument.

    testBreadthFirstWithManyVertices: Tests the items from return of depth first traversal with multiple items.

    testBreadthWitFloatingVertex: Tests the size of return of breadth first traversal with one vertex not connected to anything.


## [Link to DepthFirst.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/depthFirst/DepththFirst.java)

## [Link to DepthFirstTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/depthFirst/DepthFirstTest.java)


## Solution
![Get Edge Challenge](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/depthFirstGraph.jpg)


## Resource:
- https://algorithms.tutorialhorizon.com/graph-depth-first-search-using-recursion/
- https://java2blog.com/depth-first-search-in-java/
- Evan (TA)
