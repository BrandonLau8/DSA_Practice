package org.example;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] inputArray) {
        //get the array size
        int size = inputArray.length;

        //if the size has less than 2 values return
        if(size < 2) {
            return;
        }

        //find the mid index
        int midIndex = size / 2;

        //set new arrays as left and right
        int[] leftArr = new int[midIndex];
        int[] rightArr = new int[size - midIndex];

        //iterate through the inputArray setting the values to both left and right arrays
        for(int i=0; i<midIndex; i++) {
            leftArr[i] = inputArray[i];
        }

        for(int i=midIndex; i<size;i++) {
            rightArr[i - midIndex] = inputArray[i];
        }

        //continue to split the arrays with recursion
        mergeSort(leftArr);
        mergeSort(rightArr);

        //merge the sorted array
        merge(inputArray, leftArr, rightArr);

    }

    public static void merge(int[] inputArray, int[] leftArr, int[] rightArr) {
        //find the left and right array sizes
        int leftArrSize = leftArr.length;
        int rightArrSize = rightArr.length;
        int inputArrSize = inputArray.length;

        //set 3 pointers the point to beginning of left, right, and inputArray
        int i = 0;
        int j = 0;
        int k = 0;

        //iterate through all 3 arrays
        while(i < leftArrSize && j < rightArrSize) {
            //compare the left and right values and put the smallerValue inputArray then increment pointer
            if(leftArr[i] <= rightArr[j]) {
                inputArray[k] = leftArr[i];
                i++;
            } else {
                inputArray[k] = rightArr[j];
                j++;
            }

            //increment inputArray
            k++;
        }

        //add remaining elements
        while(i < leftArrSize) {
            inputArray[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < rightArrSize) {
            inputArray[k] = rightArr[j];
            j++;
            k++;
        }

    }
}
