package com.sparta.rp.Arrays;

import java.util.Random;

public class RandomIntArray {
    static Random rand = new Random();

    static int[] getRandomArray(int numberOfElements){
        int[] randomArray = new int[numberOfElements];
        for (int x = 0; x < randomArray.length; x++) {
            randomArray[x] = rand.nextInt(100);
        }
        return randomArray;
    }
}
