package java401_code_challenges.insertion_sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

     @Test
    public void insertionSortRegularArray() {
        InsertionSort classForTesting = new InsertionSort();
        int[] arr =  {5, 7, 2, 8, 1, 3};
        int[] expectedOutput = {1, 2, 3, 5, 7, 8};
        assertArrayEquals("Arrays should be equal", expectedOutput, classForTesting.insertionSort(arr));
    }

    @Test
    public void insertionSortWithSameNumbersTwice() {
        InsertionSort classForTesting = new InsertionSort();
        int[] arr = {2, 7, 2, 2, 1, 3};
        int[] expectedOutput = {1, 2, 2, 2, 3, 7};
        assertArrayEquals("Arrays should be equal", expectedOutput, classForTesting.insertionSort(arr));
    }

    @Test
    public void insertionSortWithAllSameNumbers() {
        InsertionSort classForTesting = new InsertionSort();
        int[] arr = {1, 1, 1, 1};
        int[] expectedOutput = {1, 1, 1, 1};
        assertArrayEquals("Arrays should be equal", expectedOutput, classForTesting.insertionSort(arr));
    }

    @Test
    public void insertionSortWithNegativeNumbers() {
        InsertionSort classForTesting = new InsertionSort();
        int[] arr = {-5, -2, -100, -10, -1};
        int[] expectedOutput = {-100, -10, -5, -2, -1};
        assertArrayEquals("Arrays should be equal", expectedOutput, classForTesting.insertionSort(arr));
    }

    @Test
    public void insertionSortWithEmptyArray() {
        InsertionSort classForTesting = new InsertionSort();
        int[] arr = {};
        int[] expectedOutput = {};
        assertArrayEquals("Arrays should be equal", expectedOutput, classForTesting.insertionSort(arr));
    }

    @Test
    public void insertionSortWithNegativeAndPositiveNumbers() {
        InsertionSort classForTesting = new InsertionSort();
        int[] arr = {100, 10, -100, -10, -1, 1};
        int[] expectedOutput = {-100, -10, -1, 1, 10, 100};
        assertArrayEquals("Arrays should be equal", expectedOutput, classForTesting.insertionSort(arr));
    }

    @Test
    public void insertionSortSortedArray() {
        InsertionSort classForTesting = new InsertionSort();
        int[] arr = {1, 2, 3, 4};
        int[] expectedOutput = {1, 2, 3, 4};
        assertArrayEquals("Arrays should be equal", expectedOutput, classForTesting.insertionSort(arr));
    }

    }