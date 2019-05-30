# Code Challenge: Class 03, Binary Search

## Challenge Summary:
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

## Approach and efficiency:
I created a function called binarySearchFunction which took a sorted array and a search key as parameters. I then tracked the first index, last index, and the midway point index of the array. 
Then I created a and checked to see if midway point item is equal to, greater than or less than the search key. If it was the search key, the midway point item was returned. 
If midway point was less than the search key, I changed the first index to be next item after midway point. If midway point was greater than the search key, I changed the last index to be one item before midway point.
The loop continued until search match was found, in which case the index was returned, and if no match was found, -1 was returned.

## Solution:
![arry_shift_whiteboard](../assets/array_shift.jpg)

## [Link to arrayShift.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/401_code_challenges/array_shift/src/main/java/array_shift/ArrayShift.java)

## [Link to arrayShiftTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/401_code_challenges/array_shift/src/test/java/array_shift/ArrayShiftTest.java)
