# Implement Quick Sort

## Challenge

Complete a working, tested implementation of Quick Sort, based on the pseudo code provided

Research and prepare a lecture on the Quick Sort Algorithm suitable for delivery to 301 level student.

Your lecture notes should be the only material an instructor should need to conduct a high quality lecture on the subject.

## Tests:
The following tests were performed to verify the functionality of the function:

    quickSortRegularArray: Verifies array is sorted when input has mixed numbers in random order.

    quickSortWithSameNumbersTwice: Verifies array is sorted when input has at least one number repeated.

    quickSortWithAllSameNumbers: Verifies array is sorted when input has all same numbers.

    quickSortWithNegativeNumbers: Verifies array is sorted when input has all negative numbers.

    quickSortWithEmptyArray: Verifies array is sorted when input is an empty array

    quickSortWithNegativeAndPositiveNumbers: Verifies array is sorted when input has negative and positive numbers.

    quickSortSortedArray: Verifies array is sorted when input is also a sorted array.

    quickSorArrayWithOneItem: Verifies array is sorted when input is an array with just one item.


## Approach & Efficiency

 - This challenge was solved using quick sort algorithm.
 - Quick sort is a highly efficient sorting algorithm and is based on partitioning of array of data into smaller arrays.
 - A large array is partitioned into two arrays one of which holds values smaller than the specified value, say pivot, based on which the partition is made and another array holds values greater than the pivot value.



The complexity of quick sort in the average case is Θ(n log(n)) and in the worst case is Θ(n2).



## [Link to QuickSort.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/quickSort/QuickSort.java)

## [Link to QuickSortTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/quickSort/QuickSortTest.java)

## [Link to Lecture-Notes.md](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/quickSort/Lecture-Notes.md)


## Solution
![Linked list insertion](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/quickSortWhiteBoard.jpg)


## References:
* https://canvas.instructure.com/courses/1597100/assignments/11252311
* https://www.geeksforgeeks.org/quick-sort/
* https://www.tutorialspoint.com/data_structures_algorithms/quick_sort_algorithm.htm
* http://www.java2novice.com/java-sorting-algorithms/quick-sort/
* https://www.youtube.com/watch?v=Fiot5yuwPAg

