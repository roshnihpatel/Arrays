package com.sparta.rp.Arrays;

import java.util.Arrays;

public class BubbleSortStringArray {
    private static String[] oneIterationSortStrings(String[] stringArrayToSort) {
        String temp;
        for (int i = 0; i < stringArrayToSort.length-1; i++) {
            if(stringArrayToSort[i].compareTo(stringArrayToSort[i+1]) > 0){
                swapStrings(stringArrayToSort, i);
            }
        }
        return stringArrayToSort;
    }

    private static void swapStrings(String[] stringArrayToSort, int i) {
        String temp;
        temp = stringArrayToSort[i];
        stringArrayToSort[i] = stringArrayToSort[i +1];
        stringArrayToSort[i +1] = temp;
    }

    public static String[] sortArray(String[] unsortedArray){
        String[] sortedArray = new String[unsortedArray.length];
        System.arraycopy(unsortedArray, 0, sortedArray, 0, unsortedArray.length);
        System.out.println(Arrays.toString(unsortedArray));
        for(int loops = 0; loops < unsortedArray.length; loops++){
            sortedArray = oneIterationSortStrings(sortedArray);

        }
        System.out.println(Arrays.toString(sortedArray));
        return sortedArray;
    }
}
