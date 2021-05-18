package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void bubbleSort_arrayManyValues_sortsArray() {
        //SETUP
        int[] input = {12, 8, 15, 4, 6, 7, 2, 3, 9};
        int[] expected = {2, 3, 4, 6, 7, 8, 9, 12, 15};

        //EXECUTION
        BubbleSort.solve(input);
        int[] actual = input;

        //ASSERT
        assertArrayEquals(expected, actual, "Should sort the array");
    }
}
