## Lecture Notes: Insert Sort
Merge sort is a “divide and conquer” algorithm wherein we first divide the problem into subproblems.
When the solutions for the subproblems are ready, we combine them together to get the final solution to the problem.

During the Mergesort process the object in the collection are divided into two collections.
To split a collection, Mergesort will take the middle of the collection and split the collection into its left and its right part.
The resulting collections are again recursively splitted via the Mergesort algorithm until they are broke to single element in each collection.

After splitting each collection, mergesort algorithm start combining all collections obtained via above procedure.
To combine both collections Mergesort start at each collection at the beginning.
It pick the object which is smaller and inserts this object into the new collection.
For this collection it now selects the next elements and selects the smaller element from both collection by comparing one element from each collection at a time.

This process create a collection of sorted elements (subset of all elements which needs to be sorted).
This process is recursively done for all available collections obtained in first step i.e. splitting the collections.

Once all elements from both collections have been inserted in the new collection, Mergesort has successfully sorted the collection.

## Learning Objectives

Today students will learn how to sort an array of integers by merge and sort method.
Students will understand the background of the merge sort method, go through the algorithm of how the process works, analyze the pseudo code, and watch a working demonstration of insertion sort method with tests to verify the functionality of the method.

## Lecture Flow
* Merge sort is an algorithm that sorts any given array of integers by divide and conquer method..
* The algorithm can be described as the following 2 step process:

-- Divide: In this step, we divide the input array into 2 halves, the pivot being the midpoint of the array. This step is carried out recursively for all the half arrays until there are no more half arrays to divide.

-- Conquer: In this step, we sort and merge the divided arrays from bottom to top and get the sorted array.


## Diagram
![Diagram](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/mergeSortVisual.png)

## Algorithm
* Create a method mergeSort which takes in an array as input.
* Divide the array into two parts continuously until it's broken down to one element.
* Sort the individual elements from smallest to largest.
* Merge the divided array together.
* Return the sorted array.

![Code](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/mergeSortCode.png)


## Pseudocode
![Pseudo Code](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/mergeSortPseudo.png)

Readings and References

Video: https://www.youtube.com/watch?v=iMT7gTPpaqw
Read: https://howtodoinjava.com/algorithm/merge-sort-java-example/
Article: https://www.java67.com/2018/03/mergesort-in-java-algorithm-example-and.html

References:
* https://www.geeksforgeeks.org/merge-sort/
* https://www.baeldung.com/java-merge-sort
* https://howtodoinjava.com/algorithm/merge-sort-java-example/
* https://www.java67.com/2018/03/mergesort-in-java-algorithm-example-and.html
* https://www.youtube.com/watch?v=iMT7gTPpaqw


