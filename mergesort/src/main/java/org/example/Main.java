package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[1000];

        for(int i=0; i < numbers.length ; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Before: \n");
        System.out.println(Arrays.toString(numbers));

        mergeSort(numbers);

        System.out.println("\n After: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        if(inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftArr = new int[midIndex];
        int[] rightArr = new int[inputLength - midIndex];

        for(int i = 0; i<midIndex; i++) {
            leftArr[i] = inputArray[i];
        }

        for(int i= midIndex; i<inputLength; i++) {
            rightArr[i - midIndex] = inputArray[i];
        }
        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(inputArray, leftArr, rightArr);

    }

    private static void merge(int[] inputArray, int[] leftArr, int[] rightArr) {
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;

        int i=0, j=0, k=0;

        while(i < leftSize && j < rightSize) {
            if(leftArr[i] <= rightArr[j]) {
                inputArray[k] = leftArr[i];
                i++;
            } else {
                inputArray[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i < leftSize) {
            inputArray[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < rightSize) {
            inputArray[k] = rightArr[j];
            j++;
            k++;
        }
    }
}