# Queue with stack

## Challenge
Implement a Queue using two Stacks.

Create a brand new PseudoQueue class.
Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects.
Ensure that you create your class with the following methods:
enqueue(value) which inserts value into the PseudoQueue, using a first-in, first-out approach.
dequeue() which extracts a value from the PseudoQueue, using a first-in, first-out approach.
The Stack instances have only push, pop, and peek methods. You should use your own Stack implementation.
Instantiate these Stack objects in your PseudoQueue constructor.

## Structure and Testing
Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge.


## Approach & Efficiency

Inside of my class QueueWithStacks, I declared two stacks using the method I previously created.

For Enqueue:
To add items in the queue, I took my first stack and pushed the given integer to the stack.
 The big O for time and space for this approach is O(1).

For Dequeue:
I first created a loop to go through the first stack, pop off items on the stack, and push those items to the second stack within the loop.
This gave me a second stack with items in reverse order from first stack. Then I popped off one item from the second stack, which was the first entered item on the queue.
Then I moved everything back over to first queue by creating a while loop to go through the second stack, pop off items on the stack, and push those items to the first stack within the loop.
This gave me updated queue with the dequeued item off the queue.
 The big O for time is O(n) and space is O(1).

 ## Test:
 I created tests for following scenarios to test the accuracy and functionality:

    testEnqueInsert: Tests if an item can be succesfully inserted to the queue
    testDeque: Tests if an item can be succesfully taken off the queue
    testEmptyQueue: Tests if multiple items can be dequeued to empty the queue
    testEnqueMultipleInsert: Tests if multiple items can be inserted in the queue


## Solution
![Linked list insertion](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/queueueWithStackWhiteBoard.jpg)


## [Link to queuewithstacks.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/QueueWithStacks/QueueWithStacks.java)

## [Link to QueueWithStacksTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/QueueWithStacks/QueueWithStacksTest.java)
