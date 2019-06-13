# Multi-bracket Validation.


## Challenge
Create a function function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced.

There are 3 types of brackets:

Round Brackets : ()
Square Brackets : []
Curly Brackets : {}

## Structure and Testing
Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge.


## Approach & Efficiency

For this challenge, I created a method that would take a string as an argument.
Inside the method, I defined a stack.
I created a loop that would look at every single characters of the passed string.
If the character that it was looking was '{', '[' or '(', I stored the character on the stack.
If the first character was {', '[' or '(', I returned false.
When looking at the next character, if the next character was '{', '[' or '(' and it matched the last item tha was inserted on the stack, then that character was taken off the stack.
After the loop was complete, if the stack was empty, that  meant that the brackets were matching, and hence I returned true, otherwise I returned false.
The big O for time and space for this approach was O(n) and O(1) respectively.

## API


Avialable for MultiBracketValidation:

  Stack: Creates a new stack.

  Push: This method takes a character and adds character to the top of the stack.

  Dequeue: This method removes the character from the top of the stack.

  Peek: This method returns the character located in the top of the stack, without removing it from the stack.



## [Link to MultiBracketValidation.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/multibracketvalidation/MultiBracketValidation.java)

## [Link to MultiBracketValidationTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/multibracketvalidation/MultiBracketValidationTest.java)


## Solution
![Multi bracket validation](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/multiBracketValidation.jpg)
