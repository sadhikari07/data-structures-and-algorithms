package java401_code_challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testBinarySearchFunctionOnFirstHalf() {
        BinarySearch libraryForTesting = new BinarySearch();
        int[] sortedArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchKey = 7;
        int expectedOutput = 6;
        assertEquals("Match should be found", expectedOutput, libraryForTesting.binarySearchFunction(sortedArray, searchKey));
    }

    @Test
    public void testBinarySearchFunctionOnSecondHalf() {
        BinarySearch libraryForTesting = new BinarySearch();
        int[] sortedArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchKey = 9;
        int expectedOutput = 8;
        assertEquals("Match should be found", expectedOutput, libraryForTesting.binarySearchFunction(sortedArray, searchKey));
    }

    @Test
    public void testBinarySearchFunctionDoesntMatch() {
        BinarySearch libraryForTesting = new BinarySearch();
        int[] sortedArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchKey = 11;
        int expectedOutput = -1;
        assertEquals("Match should be found", expectedOutput, libraryForTesting.binarySearchFunction(sortedArray, searchKey));
    }
}