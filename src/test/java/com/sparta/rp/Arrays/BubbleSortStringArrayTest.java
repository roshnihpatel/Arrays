package com.sparta.rp.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortStringArrayTest {
    @Test
    @DisplayName("Given an array of strings, return the array order alphabetically")
    void giveAnArrayOfStringReturnTheOrderArray(){
        String[] unsortedArray = {"is","had","has","could","did","take","say","want","must","move","found","keep","might","got","took","eat","being","was","were","will","look","been","get","know","help","show","ask","try","study","start","close","run","carry","watch","leave","are","can","would","write","call","come","live","tell","set","went","change","learn","thought","seem","walk","hear","let","be","said","make","go","am","made","give","follow","put","read","play","should","saw","open","began","stop","cut","have","use","like","see","find","may","think","came","does","need","spell","add","turn","begin","grow","miss","talk"};
        String[] expected = {"add","am","are","ask","be","been","began","begin","being","call","came","can","carry","change","close","come","could","cut","did","does","eat","find","follow","found","get","give","go","got","grow","had","has","have","hear","help","is","keep","know","learn","leave","let","like","live","look","made","make","may","might","miss","move","must","need","open","play","put","read","run","said","saw","say","see","seem","set","should","show","spell","start","stop","study","take","talk","tell","think","thought","took","try","turn","use","walk","want","was","watch","went","were","will","would","write"};

        String[] answer = BubbleSortStringArray.sortArray(unsortedArray);
        Assertions.assertArrayEquals(expected,answer);


    }
}
