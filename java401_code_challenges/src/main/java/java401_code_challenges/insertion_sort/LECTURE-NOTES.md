## Lecture Notes: Insert Sort
Insert sort is a sorting algorithm for array of integers.
The method takes in an array of integers as input, sorts them with the method of insertion by comparing current item with the right most element of the array.
The output of this method is a sorted array.

During each iteration, the first remaining element of the input is only compared with the right-most element of the sorted subsection of the array.
The simplest worst case input is an array sorted in reverse order. The set of all worst case inputs consists of all arrays where each element is the smallest or second-smallest of the elements before it.
In these cases every iteration of the inner loop will scan and shift the entire sorted subsection of the array before inserting the next element.
This gives insertion sort a quadratic running time (i.e., O(n^2)).
The average case is also quadratic, which makes insertion sort impractical for sorting large arrays.
However, insertion sort is one of the fastest algorithms for sorting very small arrays, even faster than quicksort; indeed, good quicksort implementations use insertion sort for arrays smaller than a certain threshold, also when arising as subproblems; the exact threshold must be determined experimentally and depends on the machine, but is commonly around ten.


## Learning Objectives

Today students will learn how to sort an array of integers by insertion and sort method.
Students will understand the background of the insertion sort method, go through the algorithm of how the process works, analyze the pseudo code, and watch a working demonstration of insertion sort method with tests to verify the functionality of the method.

## Lecture Flow
* Insert sort is an algorithm that sorts any given array of integers by comparing and inserting one integer at a time.
* Insertion sort iterates through the list by consuming one input element at each repetition, and growing a sorted output list.
* On a repetition, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there.
* It repeats until no input elements remain.


## Diagram
![Diagram](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/insertionSort.png)

## Algorithm
* Declare insertionSort method that takes in an array as argument
* Create a loop to run from 1 to the length of the array with counter i.
* Declare a temporary variable for integer with value of item on current index of the array.
* Declare another counter j and initialize it to i-1.
* Create another loop that iterates until j is greater than or equal to 0 and the temporary variable is less than the integer at index j of the array.
* Assign temporary variable to item on index of j+1 of that array.

![Code](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/insertSortCode.png)


## Pseudocode
![Pseudo Code](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/insertSortPseudoCode.png)

Readings and References

Video: https://www.youtube.com/watch?v=lCDZ0IprFw4

Read: http://www.java2novice.com/java-sorting-algorithms/insertion-sort/

Article: https://www.guru99.com/insertion-sort-java.html

References:
* http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
* https://canvas.instructure.com/courses/1597100/assignments/11252309
* https://www.youtube.com/watch?v=lCDZ0IprFw4
* https://www.geeksforgeeks.org/insertion-sort/


