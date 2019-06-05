# Challenge Summary
Write a method for the Linked List class which takes a number, k, as a parameter. 
Return the node’s value that is k from the end of the linked list. 
You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.


## Approach & Efficiency
For this problem, I first found the length of the linked list. 
Then I checked if the length of the linked list is greater than the integer passed as argument. 
If the linked list's length was less than the integer passed, an illegal argument exceeption is thrown.
Else, we go through the linked list until the length of the integer subtracts to the input argument. Whatever is the value of the node at the end of the counter is the value that we're looking for.
The big O for time for this approach is O(n).

## Solution
![Linked list insertion](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/linkedList.jpg)


## [Link to linkedList.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/linkedlist/LinkedList.java)

## [Link to linkedListTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/linkedlist/LinkedListTest.java)
