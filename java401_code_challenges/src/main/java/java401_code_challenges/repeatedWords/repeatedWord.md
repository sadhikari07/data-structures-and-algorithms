# Challenge Summary:
Find the first repeated word in a book.

## Challenge Description
- Write a function that accepts a lengthy string parameter.
- Without utilizing any of the built-in library methods available to your language, return the first word to occur more than once in that provided string.

## Approach & Efficiency
- I created a method  RepeatedWord which took in a string.
- I changed the string to all lower case so that the method would return repeated words regardless of its capitalization or not.
- I then split the string and stored the words in an array.
- I created a hash table with the hashTable method that I built previously.
- I then created a loop that checked to see if the hash table already has a word stored, if not then the string is added to the hash table.
- The method returned the string if its match was found, or returned null if there was no match.
- The big O for this method was O(n).

## Solution

![Repeated word](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/repeatedWord.jpg)


## [Link to RepeatedWord.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/repeatedWords/RepeatedWord.java)

## [Link to RepeatedWordTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/repeatedWords/RepeatedWordTest.java)


## References:
- https://www.geeksforgeeks.org/find-the-first-repeated-character-in-a-string/
- https://dzone.com/articles/java-regex-splitting-space
