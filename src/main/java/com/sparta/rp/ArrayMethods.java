package com.sparta.rp;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {
    static Random rand = new Random();
    static String[] words = {"is","haggard","hag", "has","had","could","did","take","say","want"};
    static String newName;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(words));
        for(int loops = 0; loops < words.length; loops++){
            words = oneIterationSortStrings(words);
        }
        System.out.println(Arrays.toString(words));


    }
    static int[] getRandomArray(int numberOfElements){
        int[] randomArray = new int[numberOfElements];
        for (int x = 0; x < randomArray.length; x++) {
            randomArray[x] = rand.nextInt(100);
        }
        return randomArray;
    }

    public static int getBiggest(int[] arrOfNums) {
        return biggest(oneIterationSort(arrOfNums));
    }
    static int[] bubbleSort(int[] unSortedArray){
        for(int loops= 0; loops < unSortedArray.length-1; loops++){
            unSortedArray= oneIterationSort(unSortedArray);
        }
          System.out.println("Values are "+ Arrays.toString(unSortedArray));
        return unSortedArray;
    }

    private static int[] oneIterationSort(int[] unsortedArray){
        int temp;
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            if (unsortedArray[i] > unsortedArray[i + 1]) {
                temp = unsortedArray[i];
                unsortedArray[i] = unsortedArray[i + 1];
                unsortedArray[i + 1] = temp;
            }
            //System.out.println("Values are "+ Arrays.toString(unsortedArray));
        }
        return unsortedArray;
    }


    private static int biggest(int[] arrayToSearch){
        int lastIndex = arrayToSearch.length -1;
        int largestInArray = arrayToSearch[lastIndex];
        return largestInArray;
    }

    private static String[] oneIterationSortStrings(String[] stringArrayToSort) {
        String temp;
        for (int i = 0; i < stringArrayToSort.length-1; i++) {
            if(stringArrayToSort[i].compareTo(stringArrayToSort[i+1]) > 0){
                temp = stringArrayToSort[i];
                stringArrayToSort[i] = stringArrayToSort[i+1];
                stringArrayToSort[i+1] = temp;
            }
        }
        return stringArrayToSort;
    }

    static String[] bubbleSortStringArray(String[] unsortedArray){
        System.out.println(Arrays.toString(unsortedArray));
        for(int loops = 0; loops < unsortedArray.length; loops++){
            unsortedArray = oneIterationSortStrings(unsortedArray);

        }
        System.out.println(Arrays.toString(unsortedArray));
        return unsortedArray;
    }
}
