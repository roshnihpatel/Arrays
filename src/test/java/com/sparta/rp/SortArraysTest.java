package com.sparta.rp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SortArraysTest {
    @Test
    @DisplayName("Given an array return the largest value in the array")
    void givenArrayReturnTheLargestValue(){
        int [] unsortedArray = {11, 4, 5, 2, 7, 5, 2, 1};
        int expected = 11;
        int answer = ArrayMethods.getBiggest(unsortedArray);
        Assertions.assertEquals(expected,answer );
    }
    @Test
    @DisplayName("Given an array return the the sorted array")
    void givenArrayReturnTheSortedArray(){
        int [] unsortedArray = {11, 4, 5, 2, 7, 5, 2, 1};
        int [] expected = {1,2,2,4,5,5,7,11};
        int [] answer = ArrayMethods.bubbleSort(unsortedArray);

        Assertions.assertArrayEquals(expected,answer );
    }
    @Test
    @DisplayName("Given a number of elements  return an array of that length")
    void givenANumberOfElementsReturnAnArrayOfThatLength(){
        int numberOfElements = 10;
        int [] randomArray = ArrayMethods.getRandomArray(numberOfElements);
        int answer = randomArray.length;
        Assertions.assertEquals(numberOfElements,answer);


    }
    @Test
    @DisplayName("Given an array of strings, return the array order alphabetically")
    void giveAnArrayOfStringReturnTheOrderArray(){
        String[] unsortedArray = {"is","had","has","could","did","take","say","want","must","move","found","keep","might","got","took","eat","being","was","were","will","look","been","get","know","help","show","ask","try","study","start","close","run","carry","watch","leave","are","can","would","write","call","come","live","tell","set","went","change","learn","thought","seem","walk","hear","let","be","said","make","go","am","made","give","follow","put","read","play","should","saw","open","began","stop","cut","have","use","like","see","find","may","think","came","does","need","spell","add","turn","begin","grow","miss","talk"};
        String[] expected = {"add","am","are","ask","be","been","began","begin","being","call","came","can","carry","change","close","come","could","cut","did","does","eat","find","follow","found","get","give","go","got","grow","had","has","have","hear","help","is","keep","know","learn","leave","let","like","live","look","made","make","may","might","miss","move","must","need","open","play","put","read","run","said","saw","say","see","seem","set","should","show","spell","start","stop","study","take","talk","tell","think","thought","took","try","turn","use","walk","want","was","watch","went","were","will","would","write"};

        String[] answer = ArrayMethods.bubbleSortStringArray(unsortedArray);
        Assertions.assertArrayEquals(expected,answer);


    }
    @Test
    @DisplayName("Given two sorted arrays return a single combined sorted array")
    void givenTwoSortedArraysReturnASingleSortedArray(){
        int [] sortedArray1 = {1,2,9,45,135};
        int [] sortedArray2 = {6,8,9,23};
        int [] expected = {1,2,6,8,9,9,23,45,135};
        int [] answer = ArrayMethods.mergeTwoSortedArrays(sortedArray1,sortedArray2);
        Assertions.assertArrayEquals(expected,answer );
    }


}
