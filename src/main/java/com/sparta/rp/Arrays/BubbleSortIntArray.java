package com.sparta.rp.Arrays;

import java.util.Arrays;

public class BubbleSortIntArray {

        static String[] words = {"is","haggard","hag", "has","had","could","did","take","say","want"};

        static int[] sortArray(int[] unSortedArray){
            int[] sortedArray = new int[unSortedArray.length];
            System.arraycopy(unSortedArray, 0, sortedArray,0, unSortedArray.length);
            for(int loops= 0; loops < unSortedArray.length-1; loops++){
                sortedArray= oneIterationSort(sortedArray);
            }
            System.out.println("Values are "+ Arrays.toString(sortedArray));
            return sortedArray;
        }

        public static int[] oneIterationSort(int[] unsortedArray){

            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    swap(unsortedArray, i);
                }
                //System.out.println("Values are "+ Arrays.toString(unsortedArray));
            }
            return unsortedArray;
        }

        private static void swap(int[] unsortedArray, int i) {
            int temp;
            temp = unsortedArray[i];
            unsortedArray[i] = unsortedArray[i + 1];
            unsortedArray[i + 1] = temp;
        }
}
