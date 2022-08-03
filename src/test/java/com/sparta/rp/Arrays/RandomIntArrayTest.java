package com.sparta.rp.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomIntArrayTest {
    @Test
    @DisplayName("Given a number of elements  return an array of that length")
    void givenANumberOfElementsReturnAnArrayOfThatLength(){
        int numberOfElements = 10;
        int [] randomArray = RandomIntArray.getRandomArray(numberOfElements);
        int answer = randomArray.length;
        Assertions.assertEquals(numberOfElements,answer);


    }
}
