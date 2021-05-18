package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void mergeSort_inputArrayWithMultipleValues_isSorted() {
        //SETUP
        int[] input = {12, 8, 15, 4, 6, 7, 2, 3, 9};
        int[] expected = {2, 3, 4, 6, 7, 8, 9, 12, 15};

        //EXECUTION
        Quicksort.solve(input);
        int[] actual = input;

        //ASSERT
        assertArrayEquals(expected, actual, "Input array should be sorted");
    }

}
