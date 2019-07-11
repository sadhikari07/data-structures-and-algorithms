# Challenge Summary:
Find common values in 2 binary trees.

## Challenge Description
- Write a function called tree_intersection that takes two binary tree parameters.
- Without utilizing any of the built-in library methods available to your language, return a set of values found in both trees.

## Approach & Efficiency
- I created a method treeIntersection which took in two binary trees as arguments.
- Then I pushed the values from the two trees to two arraylists.
- I then declared a hashmap, where I added the values from the two arraylists, and hashmaps would add any keys only once.
- I filled a new arraylist with the keys stored in the hashmap and returned the arraylist as result.
- The big O for this approach is O(n).


## Solution

![Repeated word](https://raw.githubusercontent.com/sadhikari07/data-structures-and-algorithms/master/java401_code_challenges/assets/hashmapTree.jpg)


## [Link to TreeIntersection.java:](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/main/java/java401_code_challenges/treeIntersection/TreeIntersection.java)

## [Link to TreeIntersection.java](https://github.com/sadhikari07/data-structures-and-algorithms/blob/master/java401_code_challenges/src/test/java/java401_code_challenges/treeIntersection/TreeIntersectionTest.java)

