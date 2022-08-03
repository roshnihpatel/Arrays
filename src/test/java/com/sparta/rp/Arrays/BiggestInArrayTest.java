package com.sparta.rp.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BiggestInArrayTest {
    @Test
    @DisplayName("Given an array return the largest value in the array")
    void givenArrayReturnTheLargestValue(){
        int [] unsortedArray = {11, 4, 5, 2, 7, 5, 2, 1};
        int expected = 11;
        int answer = BiggestInArray.getBiggest(unsortedArray);
        Assertions.assertEquals(expected,answer );
    }
}
