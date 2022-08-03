package com.sparta.rp.Arrays;

public class BiggestInArray {
    public static int biggest(int[] arrayToSearch){
        int lastIndex = arrayToSearch.length -1;
        int largestInArray = arrayToSearch[lastIndex];
        return largestInArray;
    }
    public static int getBiggest(int[] arrOfNums) {
        return biggest(BubbleSortIntArray.oneIterationSort(arrOfNums));
    }
}
