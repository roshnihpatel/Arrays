package com.sparta.rp.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortIntArrayTest {
    @Test
    @DisplayName("Given an array return the the sorted array")
    void givenArrayReturnTheSortedArray(){
        int [] unsortedArray = {11, 4, 5, 2, 7, 5, 2, 1};
        int [] expected = {1,2,2,4,5,5,7,11};
        int [] answer = BubbleSortIntArray.sortArray(unsortedArray);

        Assertions.assertArrayEquals(expected,answer );
    }
}
