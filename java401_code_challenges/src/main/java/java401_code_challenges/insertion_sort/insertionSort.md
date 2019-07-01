# Code Challenge/Lab 26: Implement InsertionSort

## Challenge

Complete a working, tested implementation of Insertion Sort, based on the pseudo code provided

Research and prepare a lecture on the Insertion Sort Algorithm suitable for delivery to 301 level student.

Your lecture notes should be the only material an instructor should need to conduct a high quality lecture on the subject.

## Tests:
The following tests were performed to verify the functionality of the function:

    insertionSortRegularArray: Verifies array is sorted when input has mixed numbers in random order.

    insertionSortWithSameNumbersTwice: Verifies array is sorted when input has at least one number repeated.

    insertionSortWithAllSameNumbers: Verifies array is sorted when input has all same numbers.

    insertionSortWithNegativeNumbers: Verifies array is sorted when input has all negative numbers.

    insertionSortWithEmptyArray: Verifies array is sorted when input is an empty array

    insertionSortWithNegativeAndPositiveNumbers: Verifies array is sorted when input has negative and positive numbers.

    insertionSortSortedArray: Verifies array is sorted when input is also a sorted array.


## Approach & Efficiency

 I declared insertionSort method that takes in an array as argument
 Then I created a loop to run from 1 to the length of the array with counter i and declared a temporary variable for integer with value of item on current index of the array.
 I then declared another counter j and initialize it to i-1, created another loop that iterates until j is greater than or equal to 0 and the temporary variable is less than the integer at index j of the array.
 Then I assign temporary variable to item on index of j+1 of that array.
 Finally I returned the sorted array as output.

 The big O for time for this approach is O(n^2) and space is O(1).



## [Link to Insertionsort.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/insertion_sort/InsertionSort.java)

## [Link to InsertionSortTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/insertion_sort/InsertionSortTest.java)

## [Link to Lecture-Notes.md](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/insertion_sort/LECTURE-NOTES.md)

References used in this assignment:
* http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
* https://canvas.instructure.com/courses/1597100/assignments/11252309
* https://www.geeksforgeeks.org/insertion-sort/
