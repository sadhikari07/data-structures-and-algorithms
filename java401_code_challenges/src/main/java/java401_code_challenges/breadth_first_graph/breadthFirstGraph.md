# Implement a breadth-first traversal on a graph.

## Approach & Efficiency

For implementing Breadth-first:

    I created a method that took a node (vertex of a graph as start point).

    I added the node to an arraylist.

    For all edges that are present on the vertex, I checked to see if their end point is included on the arraylist or not.
    If they weren't included, I added them to the arraylist and returned the arraylist as output.

    The big O for time for this approach is O(n^2) and space is O(n).

## Tests:
    testBreadthFirstReturnSize: Tests the size of the arraylist of the nodes returned after breadth first traversal.

    testBreadthFirstReturnlItems: Tests the items from return of breadth first traversal with three vertices and first input as argument.

    testBreadthFirstWithDifferentNode: Tests the items from return of breadth first traversal with three vertices and second input as argument.

    testBreadthFirstWithThirdNode: TTests the items from return of breadth first traversal with three vertices and third input as argument.


## [Link to BreadthFirstGraph.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/breadthFirst/BreadthFirst.java)

## [Link to BreadthFirstGraphTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/breadthFirst/BreadthFirstTest.java)


## Solution
![Breadth First graph Challenge](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/breadthFirstGraph.jpg)



//Resource:
- http://www.letscodethemup.com/graph-search-breadth-first-search/
-Evan (TA)