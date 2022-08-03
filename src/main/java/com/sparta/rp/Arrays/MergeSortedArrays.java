package com.sparta.rp.Arrays;

public class MergeSortedArrays {
    static int[] mergeArrays(int[] arr1, int[] arr2) {
        int combinedLength = arr1.length + arr2.length;
        int[] mergedArr = new int[combinedLength];
        int pointer1 = 0;
        int pointer2 = 0;
        int mergedPointer = 0;
        while(pointer1<arr1.length && pointer2<arr2.length){
            if(arr1[pointer1] < arr2[pointer2]){
                pointer1 = addSmallerToMergedArrayAndMovePointer(arr1, mergedArr, pointer1, mergedPointer);
            }else {
                pointer2 = addSmallerToMergedArrayAndMovePointer(arr2, mergedArr, pointer2, mergedPointer);
            }
            mergedPointer++;
        }

        if(pointer1 < arr1.length) {
            mergedArr = flush(arr1, mergedArr, pointer1, mergedPointer);
        } else {
            flush(arr2, mergedArr, pointer2, mergedPointer);
        }




        return mergedArr;
    }

    private static int addSmallerToMergedArrayAndMovePointer(int[] arr1, int[] mergedArr, int pointer1, int mergedPointer) {
        mergedArr[mergedPointer] = arr1[pointer1];
        if(pointer1 < arr1.length) {
            pointer1++;
        }
        return pointer1;
    }

    private static int[] flush(int[] arr1, int[] mergedArr, int pointer1, int mergedPointer) {
        while(pointer1 < arr1.length){
            mergedArr[mergedPointer] = arr1[pointer1];
            pointer1++;
            mergedPointer++;
        }
        return mergedArr;
    }
}
