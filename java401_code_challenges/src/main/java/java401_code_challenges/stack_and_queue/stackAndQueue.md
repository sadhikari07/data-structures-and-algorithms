# Stacks and Queues

Stack:
A stack is a container of objects that are inserted and removed according to the last-in first-out (LIFO) principle. 
In the pushdown stacks only two operations are allowed: push the item into the stack, and pop the item out of the stack. 
A stack is a limited access data structure - elements can be added and removed from the stack only at the top. push adds an item to the top of the stack, pop removes the item from the top.
A helpful analogy is to think of a stack of books; you can remove only the top book, also you can add a new book on the top.

Queue: 
A queue is a container of objects (a linear collection) that are inserted and removed according to the first-in first-out (FIFO) principle. 
An excellent example of a queue is a line of students in the food court of the UC. 
New additions to a line made to the back of the queue, while removal (or serving) happens in the front. 
In the queue only two operations are allowed enqueue and dequeue.
Enqueue means to insert an item into the back of the queue, dequeue means removing the front item. 

(//Stack and Queue reference: https://www.cs.cmu.edu/~adamchik/15-121/lectures/Stacks%20and%20Queues/Stacks%20and%20Queues.html)


## Challenge
Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
Create a Stack class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to top when the stack is created.
Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
Create a Queue class that has a top property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to front when the queue is created.
Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.
Be sure to follow your languages best practices for naming conventions.
You have access to the Node class and all the properties on the Linked List class.

## Structure and Testing
Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. 


Write tests to prove the following functionality:

Can successfully push onto a stack

Can successfully push multiple values onto a stack

Can successfully pop off the stack

Can successfully empty a stack after multiple pops

Can successfully peek the next item on the stack

Can successfully instantiate an empty stack

Can successfully enqueue into a queue

Can successfully enqueue multiple values into a queue

Can successfully dequeue out of a queue the expected value

Can successfully peek into a queue, seeing the expected value

Can successfully empty a queue after multiple dequeues

Can successfully instantiate an empty queue

Ensure your tests are passing before you submit your solution.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

## API
<!-- Description of each method publicly available to your Stack and Queue-->

## [Link to Node.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/stack_and_queue/Node.java)

## [Link to Queue.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/stack_and_queue/Queue.java)

## [Link to Stack.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/stack_and_queue/Stack.java)
