# Binary Tree and BST Implementation

Tree:
A Tree is a non-linear data structure where data objects are organized in terms of hierarchical relationship.
The structure is non-linear in the sense that, unlike simple array and linked list implementation, data in a tree is not organized linearly.
Each data element is stored in a structure called a node. The topmost or starting node of the (inverted) tree is called the root node.
All nodes are linked with an edge and form hierarchical sub trees beginning with the root node.
Tree data structure is useful on occasions where linear representation of data do not suffice, such as creating a family tree. Java provides two in-built classes, TreeSet and TreeMap, in Java Collection Framework that cater to the needs of the programmer to describe data elements in the aforesaid form.


Reference: https://www.developer.com/java/data/understanding-java-tree-apis.html


## Challenge
Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.

Create a BinaryTree class

Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.

At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.

Create a BinarySearchTree class.

Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.

Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.


## Structure and Testing
Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

Write tests to prove the following functionality:

Can successfully instantiate an empty tree.

Can successfully instantiate a tree with a single root node.

Can successfully add a left child and right child to a single root node.

Can successfully return a collection from a preorder traversal.

Can successfully return a collection from an inorder traversal.

Can successfully return a collection from a postorder traversal.

Ensure your tests are passing before you submit your solution.

## Approach & Efficiency

For implementing binary tree:
    I first created a Node class that had properties for the value stored in the node, the left child node, and the right child node.
    Then I created a BinaryTree class which consisted of root node.
    Upon instantiating binary tree, an empty binary tree would be created.
    Then I created the following methods:

    preOrder: would display an arraylist of values of the nodes in the tree in the order of Root, Left, Right.

    inOrder: would display an arraylist of values of the nodes in the tree in the order of Left, Root, Right.

    postOrder: would display an arraylist of values of the nodes in the tree in the order of Left, Right, Root.


  The big O for time for this approach is O(1) and space is O(n).



For implementing add:

    I created a java class BinarySearchTree which had following properties:
     Node root;
     Node current;
     Node leftChild;
     Node rightChild;

     I used method of recursion to compare and add a node with given value to the tree.
    The big O for this approach is O(h) where h is the height of the tree.

For implementing search:

    I compared the given value with the root and used the method of recursion to traverse the tree and see if either \the left side or right side contained the valie.
    The big O for this approach is O(h) where h is the height of the tree.


## API

Class Node: Creates a new node with passed integer value.

    preOrder: displays an arraylist of values of the nodes in the tree in the order of Root, Left, Right.

    inOrder: displays an arraylist of values of the nodes in the tree in the order of Left, Root, Right.

    postOrder: displays an arraylist of values of the nodes in the tree in the order of Left, Right, Root.

add: accepts a value, and adds a new node with that value in the correct location in the binary search tree.

contains: accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.



## [Link to Node.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/stack_and_queue/Node.java)

## [Link to BinaySearch.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/stack_and_queue/Queue.java)

## [Link to BinaryTree.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/stack_and_queue/Stack.java)

## [Link to TreeTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/stack_and_queue/Stack_and_queueTest.java)



Refernces used in this assignment:

//https://www.baeldung.com/java-binary-tree
//https://www.geeksforgeeks.org/dfs-traversal-of-a-tree-using-recursion/
//https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/