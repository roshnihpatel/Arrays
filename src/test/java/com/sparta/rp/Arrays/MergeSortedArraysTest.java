package com.sparta.rp.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeSortedArraysTest {
    @Test
    @DisplayName("Given two sorted arrays return a single combined sorted array")
    void givenTwoSortedArraysReturnASingleSortedArray(){
        int [] sortedArray1 = {1,2,9,45,135};
        int [] sortedArray2 = {6,8,9,23};
        int [] expected = {1,2,6,8,9,9,23,45,135};
        int [] answer = MergeSortedArrays.mergeArrays(sortedArray1,sortedArray2);
        Assertions.assertArrayEquals(expected,answer );
    }
}
