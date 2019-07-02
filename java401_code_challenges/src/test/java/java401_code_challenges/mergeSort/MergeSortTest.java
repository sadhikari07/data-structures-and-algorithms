package java401_code_challenges.mergeSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSortRegularArray() {
        MergeSort classForTesting = new MergeSort();
        int[] arr =  {5, 7, 2, 8, 1, 3};
        int[] expectedOutput = {1, 2, 3, 5, 7, 8};
        classForTesting.MergeSort(arr);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void mergeSortWithSameNumbersTwice() {
        MergeSort classForTesting = new MergeSort();
        int[] arr = {2, 7, 2, 2, 1, 3};
        int[] expectedOutput = {1, 2, 2, 2, 3, 7};
        classForTesting.MergeSort(arr);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void mergeSortWithAllSameNumbers() {
        MergeSort classForTesting = new MergeSort();
        int[] arr = {1, 1, 1, 1};
        int[] expectedOutput = {1, 1, 1, 1};
        classForTesting.MergeSort(arr);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void imergeSortWithNegativeNumbers() {
        MergeSort classForTesting = new MergeSort();
        int[] arr = {-5, -2, -100, -10, -1};
        int[] expectedOutput = {-100, -10, -5, -2, -1};
        classForTesting.MergeSort(arr);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void mergeSortWithEmptyArray() {
        MergeSort classForTesting = new MergeSort();
        int[] arr = {};
        int[] expectedOutput = {};
        classForTesting.MergeSort(arr);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void mergeSortWithNegativeAndPositiveNumbers() {
        MergeSort classForTesting = new MergeSort();
        int[] arr = {100, 10, -100, -10, -1, 1};
        int[] expectedOutput = {-100, -10, -1, 1, 10, 100};
        classForTesting.MergeSort(arr);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void mergeSortSortedArray() {
        MergeSort classForTesting = new MergeSort();
        int[] arr = {1, 2, 3, 4};
        int[] expectedOutput = {1, 2, 3, 4};
        classForTesting.MergeSort(arr);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }

    @Test
    public void mergeSorArrayWithOneItem() {
        MergeSort classForTesting = new MergeSort();
        int[] arr = {1};
        int[] expectedOutput = {1};
        classForTesting.MergeSort(arr);
        assertArrayEquals("Arrays should be equal", expectedOutput, arr);
    }
}