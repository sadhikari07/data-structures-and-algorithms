# Find the Maximum Value in a Binary Tree

## Challenge


Write a function called find-maximum-value which takes binary tree as its only input.

Without utilizing any of the built-in methods available to your language, return the maximum value stored in the tree.

You can assume that the values stored in the Binary Tree will be numeric.

## Tests:
The following tests were performed to verify the functionality of the function:

    testFindMaximumValueAtLeft: Verifies maximum value when its at one of the left children

    testFindMaximumValueAtRoot: Verifies maximum value when its at the root node

    testFindMaximumValueAtRight: Verifies maximum value when its at one of the right children

    testFindMaximumValueRepeated: Verifies maximum value when there are two children with same maximum value

    testFindMaximumValueBetweenNegatives: Verifies maximum value is a negative number

## Approach & Efficiency

For implementing binary tree:
    I first created a method that would take a tree as input and use a helper method to determine the maximum value of the nodes in a tree.

    The helper function would take the root node of the tree as argument. Then it would set the maximum value of the tree to the root.

    Recursively, the method will look into all of the children of the tree to determine if the value is more or less than the max value that was setup and adjust the max value accordingly.

    An integer with the maximum value was returned as output.

  The big O for time for this approach is O(n) and space is O(1).



## [Link to BinaryTree.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/tree/BinaryTree.java)

## [Link to TreeTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/TreeTest/TreeTest.java)

## Solution
![Linked list insertion](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/mergeLists.jpg)


Refernces used in this assignment:
https://stackoverflow.com/questions/23173932/how-to-find-max-value-in-a-binary-tree
