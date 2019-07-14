# Challenge Summary:
Implement a simplified LEFT JOIN for 2 Hashmaps.

## Challenge Description
- Write a function that LEFT JOINs two hashmaps into a single data structure.
- The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
- The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
- Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
- LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row.
- If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.
- The returned data structure that holds the results is up to you.
    It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic.
- Avoid utilizing any of the library methods available to your language.

## Approach & Efficiency
- I created a method leftJoiner which took in two hash tables (synonym and antonym).
- I created a loop that would run to the length of the number of buckets in the synonym table.
- I checked to see if the head node of each linked list inside of the synonym table is null or not.
- When the head wasn't null, I looked for the matching word in the antonym table.
- If the matching word was present in the antonym table, I added the value (antonym) of the word to the synonym table.
- If the matching word wasn't in the antonym table, I added the string "Null" to the next of the word.
- I then converted the hash table to a array list and returned the arraylist.


## Solution

![Repeated word](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/queueueWithStackWhiteBoard.jpg)


## [Link to LeftJoin.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/leftJoin/LeftJoin.java)

## [Link to LeftJoinTest.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/leftJoin/LeftJoinTest.java)

