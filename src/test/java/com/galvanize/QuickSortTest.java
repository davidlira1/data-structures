package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest {

    @Test
    public void quickSort_inputEmptyArray_arrayStaysTheSame() {
        //SETUP
        int[] input = new int[0];
        int[] expected = input.clone();

        //EXECUTION
        Quicksort.solve(input);
        int[] actual = input;

        //ASSERT
        assertArrayEquals(expected, actual, "Should return an empty array");
    }

    @Test
    public void quickSort_inputArrayWithOneValue_arrayStaysTheSame() {
        //SETUP
        int[] input = {1};
        int[] expected = input.clone();

        //EXECUTION
        Quicksort.solve(input);
        int[] actual = input;

        //ASSERT
        assertArrayEquals(expected, actual, "Should return an empty array");
    }

    @Test
    public void quickSort_inputArrayWithMultipleValues_isSorted() {
        //SETUP
        int[] input = {12, 8, 15, 4, 7, 2, 9};
        int[] expected = {2, 4, 7, 8, 9, 12, 15};

        //EXECUTION
        Quicksort.solve(input);
        int[] actual = input;

        //ASSERT
        assertArrayEquals(expected, actual, "Input array should be sorted");
    }
}
