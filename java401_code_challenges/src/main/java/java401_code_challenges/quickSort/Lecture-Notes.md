## Lecture Notes: Quick Sort

Quick sort is a highly efficient sorting algorithm and is based on partitioning of array of data into smaller arrays.
A large array is partitioned into two arrays one of which holds values smaller than the specified value, say pivot, based on which the partition is made and another array holds values greater than the pivot value.

## Learning Objectives

Today students will learn how to sort an array of integers by quick sort method.
Students will understand the background of the quick sort method, go through the algorithm of how the process works, analyze the pseudo code, and watch a working demonstration of insertion sort method with tests to verify the functionality of the method.

## Lecture Flow
* Quick sort partitions an array and then calls itself recursively twice to sort the two resulting subarrays.
* This algorithm is quite efficient for large-sized data sets as its average and worst case complexity are of Ο(n2), where n is the number of items.

Steps to implement Quick sort:
 - Choose an element, called pivot, from the list. Generally pivot can be the middle index element.
 - Reorder the list so that all elements with values less than the pivot come before the pivot, while all elements with values greater than the pivot come after it (equal values can go either way). After this partitioning, the pivot is in its final position.
 This is called the partition operation.
 - Recursively apply the above steps to the sub-list of elements with smaller values and separately the sub-list of elements with greater values.

## Diagram
![Diagram](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/quickSortVisual.png)

## Algorithm
* Choose the highest index value has pivot
* Take two variables to point left and right of the list excluding pivot
* left points to the low index
* right points to the high
* while value at left is less than pivot move right
* while value at right is greater than pivot move left
* if both step 5 and step 6 does not match swap left and right
* if left ≥ right, the point where they met is new pivot

![Code](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/quickSortCode.png)


## Pseudocode
![Pseudo Code](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/quickSortPseudoCode.png)

## Readings and References

Video: https://www.youtube.com/watch?v=Fiot5yuwPAg

Read: http://www.java2novice.com/java-sorting-algorithms/quick-sort/

Article: https://www.tutorialspoint.com/data_structures_algorithms/quick_sort_algorithm.html

References:
* https://canvas.instructure.com/courses/1597100/assignments/11252311
* https://www.geeksforgeeks.org/quick-sort/
* https://www.tutorialspoint.com/data_structures_algorithms/quick_sort_algorithm.html
* http://www.java2novice.com/java-sorting-algorithms/quick-sort/
* https://www.youtube.com/watch?v=Fiot5yuwPAg


