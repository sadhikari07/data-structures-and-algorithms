# Challenge Summary
Write a function called mergeLists which takes two linked lists as arguments. 
Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list. 
Try and keep additional space down to O(1). You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

## Approach & Efficiency
For this problem, I created a method that would take in two linked lists as arguments. 
I assigned the head of both links to a node variable, and declared variables to assign the next nodes from the current.
I created a while loop that ran until the current node of either of the linked lists was null.
Within that loop I assigned the nodes from second list alternatively after each node on first list.
The big O for time for this approach is O(n).
The big O for space for this approach is O(1).

## Solution
![Linked list insertion](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/mergeLists.jpg)


## [Link to linkedList.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/linkedlist/LinkedList.java)

## [Link to linkedListTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/linkedlist/LinkedListTest.java)
