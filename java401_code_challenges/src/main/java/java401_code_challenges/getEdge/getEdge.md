# Get Edge

Given a business trip itinerary, and an Alaska Airlines route map, is the trip possible with direct flights? If so, how much will the total trip cost be?

## Feature tasks:

Feature Tasks
Write a function based on the specifications above, which takes in a graph, and an array of city names.
Without utilizing any of the built-in methods available to your language, return whether the full trip is possible with direct flights, and how much it would cost.

## Approach & Efficiency
- I created a method getEdge which took in a graph and array of strring (city names).
- I checked to see if the first item of that array is even in the list of vertices of the graph.
    - If it wasn't on the graph, I returned false, else continued.
- I created a loop to go through the array of cities.
- For every edge (neighbor list) in the vertex that has first item of the array (city match), I checked to see if it had the next city from the input as one of the ends.
    - If true, I added the weight of the edge to the flight price, and updated the city match to the end of that edge.
    - If false, I returned false.

- The Big o for this approach is O(n^2).


## Tests:
    findConnnectionThatShouldntExist: Tests for the direct flight between two vertex that aren't nodes to each other.

    findConnnectionBetweenTwo: Tests the direct connection status and price for two adjacent vertices.

    indConnnectionBetweenThree: Tests connection between three adjacent vertices.

    findConnnectionBetweenThreeThatBreaks: Tests connection between three non-adjacent vertices.

    findConnnectionOnNonExistingCity: Tests for connection with a city that doesn't exist in the graph

## [Link to GetEdge.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/breadthFirst/BreadthFirst.java)

## [Link to GetEdgeTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/breadthFirst/BreadthFirstTest.java)


## Solution
![Get Edge Challenge](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/breadthFirstGraph.jpg)



//Resource:
- https://medium.com/basecs/finding-the-shortest-path-with-a-little-help-from-dijkstra-613149fbdc8e
- https://www.baeldung.com/java-dijkstra
- Evan (TA)