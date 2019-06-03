# Singly Linked List
 Background info:
Singly Linked Lists are a type of data structure. It is a type of list. In a singly linked list each node in the list stores the contents of the node and a pointer or reference to the next node in the list. It does not store any pointer or reference to the previous node. It is called a singly linked list because each node only has a single link to another node. To store a single linked list, you only need to store a reference or pointer to the first node in that list. The last node has a pointer to nothingness to indicate that it is the last node.
"http://www.java2novice.com/data-structures-in-java/linked-list/singly-linked-list/"


## Challenge
Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
This object should be aware of a default empty value assigned to head when the linked list is instantiated.
Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
Define a method called print which takes in no arguments and returns a collection all of the current Node values in the Linked List.
At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.
Be sure to follow your language/frameworks standard naming conventions (e.g. C# uses PascalCasing for all method and class names).

Structure and Testing
Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

Write tests to prove the following functionality:

Can successfully instantiate an empty linked list
Can properly insert into the linked list
The head property will properly point to the first node in the linked list
Can properly insert multiple nodes into the linked list
Will return true when finding a value within the linked list that exists
Will return false when searching for a value in the linked list that does not exist
Can properly return a collection of all the values that exist in the linked list


## Approach & Efficiency
I created a LinkedList method which was responsible for creating linked list. I initialized the list with null. 
Then I created a method that would accept argument integer and create a node with that integer.  The node was then set as head. The big O for this method was O(1).
I created a print method that would return an arraylist of the items inside of the linkedListonce the list was created. I used arrayList for its flexibility and being easier to manipulate. The big O for this method was O(n).
Then I created a method that would take an integer as argument and see if that integer was in the linked list. For this I checked if the items in the linked list had same value as the input. The big O for this method was O(n).
Then I created the tests as instructed in the assignment.

## API
Insert: This method accepts an integer and creates a node with the value of the integer that was input. Then the node was assigned as the head.

Includes: This method accepts an ineteger as argument and checks if the value of the ineteger equals any of the values in the linked list. It will return True/False depending on the outcome of the search.

Print: This method does't take any arguments, but assigns all of the items in the linked list to an arraylist. This method later returns the arrayList once all of the list items are in the arrayList.

## [Link to linkedList.java:] (https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/linkedlist/LinkedList.java)

## [Link to linkedListTest.java] (https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/linkedlist/LinkedListTest.java)

