## Challenge: Breadth-first Traversal.

Write a breadth first traversal method which takes a Binary Tree as its unique input.

Without utilizing any of the built-in methods available to your language, traverse the input tree using a Breadth-first approach; print every visited node’s value.


## Approach & Efficiency

For implementing Breadth-first:

    I created a method that would take root node of a tree as argument.
    I created a new queue with the method I previously built in queue and stack challenge.
    I started by adding the root of the tree to the queue.
    Then I created a while loop which looked at left child of the node first and right child to check the value of the node and added the next nodes from the root to the queue and removed the front of the queue on each iteration.
    Every time a node was removed, I printed out the node.

    The big O for time for this approach is O(n) and space is O(1).

## Tests:
    testSizeOrder: Tests the size of the arraylist of node's values returned after traversing the tree.

    testOrder: Tests if the tree is traversed in breadth first approach.

    testOrderForLeftUneven: Tests the order of traversal when there are no left children.

    testOrderForRightUneven: Tests the order of traversal when there are no right children.


## [Link to BreadthFirst.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/breadthFirst/BreadthFirst.java)

## [Link to BreadthFirstTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/breadthFirst/BreadthFirstTest.java)


## Solution
![FizzBizz Challenge](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/breadthFirst.jpg)



//Resource: https://www.baeldung.com/java-binary-tree
