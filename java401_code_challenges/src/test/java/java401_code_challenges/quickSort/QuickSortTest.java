package java401_code_challenges.quickSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void mergeSortRegularArray() {
        QuickSort classForTesting = new QuickSort();
        int[] arr =  {5, 7, 2, 8, 1, 3};
        int[] expectedOutput = {1, 2, 3, 5, 7, 8};
        classForTesting.QuickSort(arr, 0, arr.length-1);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void mergeSortWithSameNumbersTwice() {
        QuickSort classForTesting = new QuickSort();
        int[] arr = {2, 7, 2, 2, 1, 3};
        int[] expectedOutput = {1, 2, 2, 2, 3, 7};
        classForTesting.QuickSort(arr, 0, arr.length-1);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void mergeSortWithAllSameNumbers() {
        QuickSort classForTesting = new QuickSort();
        int[] arr = {1, 1, 1, 1};
        int[] expectedOutput = {1, 1, 1, 1};
        classForTesting.QuickSort(arr, 0, arr.length-1);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void imergeSortWithNegativeNumbers() {
        QuickSort classForTesting = new QuickSort();
        int[] arr = {-5, -2, -100, -10, -1};
        int[] expectedOutput = {-100, -10, -5, -2, -1};
        classForTesting.QuickSort(arr, 0, arr.length-1);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void mergeSortWithEmptyArray() {
        QuickSort classForTesting = new QuickSort();
        int[] arr = {};
        int[] expectedOutput = {};
        classForTesting.QuickSort(arr, 0, arr.length-1);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void mergeSortWithNegativeAndPositiveNumbers() {
        QuickSort classForTesting = new QuickSort();
        int[] arr = {100, 10, -100, -10, -1, 1};
        int[] expectedOutput = {-100, -10, -1, 1, 10, 100};
        classForTesting.QuickSort(arr, 0, arr.length-1);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void mergeSortSortedArray() {
        QuickSort classForTesting = new QuickSort();
        int[] arr = {1, 2, 3, 4};
        int[] expectedOutput = {1, 2, 3, 4};
        classForTesting.QuickSort(arr, 0, arr.length-1);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void mergeSorArrayWithOneItem() {
        QuickSort classForTesting = new QuickSort();
        int[] arr = {1};
        int[] expectedOutput = {1};
        classForTesting.QuickSort(arr, 0, arr.length-1);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

}