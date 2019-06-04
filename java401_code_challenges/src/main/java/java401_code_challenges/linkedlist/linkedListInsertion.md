# Challenge Summary
Write the following methods for the Linked List class:

.append(value) which adds a new node with the given value to the end of the list

.insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node

.insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node


## Approach & Efficiency
To append value to the list: If the list was null, assign head to the new node. If the list wasn't null, find out last item on the list by going through node.next, and assign last node.next to newNode. Big O for this method was O(n).

To insert before: If the given value was the value of head, then insert the node as the head. If it wasn't head, then go through the list to find which next item to the current item has that value. Once the next item is found, insert the node after the current node. If the value doesn't match, print out an invalid value error. The big O for this method was O(n).

To insert after: Go through the list to find which node has the input value. Once the value is found, insert the node after the current node. If the value doesn't match, print out an invalid value error. The big O for this method was O(n).

## Solution
![Linked list insertion](java401_code_challenges/assets/linkedList.jpg)


## [Link to linkedList.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/linkedlist/LinkedList.java)

## [Link to linkedListTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/linkedlist/LinkedListTest.java)
