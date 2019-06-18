## Challenge

Write a function called FizzBuzzTree which takes a tree as an argument.

Without utilizing any of the built-in methods available to your language, determine weather or not the value of each node is divisible by 3, 5 or both, and change the value of each of the nodes:

If the value is divisible by 3, replace the value with “Fizz”

If the value is divisible by 5, replace the value with “Buzz”

If the value is divisible by 3 and 5, replace the value with “FizzBuzz”

Return the tree with its new values.


## Approach & Efficiency

For implementing FizzBuzzTree:
    I first checked to see if the root of the tree was null.
    If it was null, I returned the tree as is.
    If it wasn't null, I created a conditional to see if the value of the root was divisible by either 3, or 5, or 5 and 3.
    If any of those conditions were met, the value of the node was replaced with either Fizz, Buzz or FizzBuzz.
    Recursion was used to traverse through the nodes and tree with replaced values were returned.

  The big O for time for this approach is O(n) and space is O(n).


## [Link to FizzBuzz.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/stack_and_queue/Node.java)

## [Link to FizzBuzzTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/stack_and_queue/Queue.java)


## Solution
![FizzBizz Challenge](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/mergeLists.jpg)

