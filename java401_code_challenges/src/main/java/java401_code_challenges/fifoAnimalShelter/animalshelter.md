# First-in, First out Animal Shelter.


## Challenge
Create a class called AnimalShelter which holds only dogs and cats.

The shelter operates using a first-in, first-out approach.


 Implement the following methods:

 enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.

 dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.

## Structure and Testing
Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge.


## Approach & Efficiency

For creating cats and dog instances:
  Created an animal class which had property animalType.
  Extended the class animal to subclasses cat and dog, which had animaType cat and dog respectively.


For implementing enQueueAnimal:
  This method took an argument which was an instance of dog or cat.
  I created two empty queues dogQueue and catQueue which would hold dog instances or cat instances.
  Depending on the passed in argument, I used previously defined enqueue method to add the instance to dogQueue or catQueue.
  The big O for time and space for this method is O(1).


For implementing deQueueAnimal:
  This method took an argument which was a String "dog" or "cat"".
  Depending on the passed in argument, I used previously defined dequeue method to remove item from dogQueue or catQueue.
  If passed argument was invalid, null was returned to the user with a message.
  The big O for time and space for this approach is O(1).


## API


Avialable for enqueueAnimal and deQueueAnimal:

  Queue: Creates a queue with specified data type.

  Enqueue: This method takes a specified data type an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.

  Dequeue: This method does not take any argument, removes the node from the front of the queue, and returns the node’s value.

  Peek: This method does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.



## [Link to AnimalShelter.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/fifoAnimalShelter/AnimalShelter.java)

## [Link to AnimalShelterTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/fifoAnimalShelter/AnimalShelterTest.java)

![Solution](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/animalShelter.jpg)

