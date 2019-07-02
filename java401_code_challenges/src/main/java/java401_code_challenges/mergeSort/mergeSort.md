# Code Challenge/Lab 26: Implement InsertionSort

## Challenge

Complete a working, tested implementation of Merge Sort, based on the pseudo code provided

Research and prepare a lecture on the Merge Sort Algorithm suitable for delivery to 301 level student.

Your lecture notes should be the only material an instructor should need to conduct a high quality lecture on the subject.

## Tests:
The following tests were performed to verify the functionality of the function:

    mergeSortRegularArray: Verifies array is sorted when input has mixed numbers in random order.

    mergeSortWithSameNumbersTwice: Verifies array is sorted when input has at least one number repeated.

    mergeSortWithAllSameNumbers: Verifies array is sorted when input has all same numbers.

    mergeSortWithNegativeNumbers: Verifies array is sorted when input has all negative numbers.

    mergeSortWithEmptyArray: Verifies array is sorted when input is an empty array

    mergeSortWithNegativeAndPositiveNumbers: Verifies array is sorted when input has negative and positive numbers.

    mergeSortSortedArray: Verifies array is sorted when input is also a sorted array.

    mergeSorArrayWithOneItem: Verifies array is sorted when input is an array with just one item.


## Approach & Efficiency

 I declared MergeSort method that takes in an array as argument.
 Then I split the array into halves recursively until I had single elements from the array remaining.
 I then created a method Merge that took left half array, right half array, and the entire array as argument.
 I declared three different counters i, j and k. Then I compared the integers and started to assign them back into the array that was initially passed in as argument.
 I called the MergeSort method on left half and right half, and called Merge by passing left half, right half, and the input array.
 The result from the above methods was a sorted array.

 The big O for time for this approach is O(n^log(n)) and space is O(1).



## [Link to Mergesort.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/mergeSort/MergeSort.java)

## [Link to MergeSortTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/mergeSort/MergeSortTest.java)

## [Link to Lecture-Notes.md](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/mergeSort/Lecture-Notes.md)


## Solution
![Linked list insertion](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/mergeSortWhiteBoard.jpg)


## References used in this assignment:
* https://www.geeksforgeeks.org/merge-sort/
* https://www.baeldung.com/java-merge-sort
* https://howtodoinjava.com/algorithm/merge-sort-java-example/
* https://www.java67.com/2018/03/mergesort-in-java-algorithm-example-and.html
* https://www.youtube.com/watch?v=iMT7gTPpaqw
* https://canvas.instructure.com/courses/1597100/assignments/11252310

