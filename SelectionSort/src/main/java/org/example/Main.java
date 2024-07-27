package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10000];

        for(int i = 0; i<numbers.length;i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Before: \n");
        System.out.println(Arrays.toString(numbers));
        long startTime = System.currentTimeMillis();

        selectionSort(numbers);

        long endTime = System.currentTimeMillis();
        System.out.println("Took " + (endTime - startTime) + "ms");
        System.out.println("\nAfter: ");
        System.out.println(Arrays.toString(numbers));
    }

    public static void selectionSort(int[] inputArray) {
        int inputLength = inputArray.length;

        for(int i=0; i<inputLength-1; i++) {
            int min = inputArray[i];
            int indexOfMin = i;
            for(int j = i+1; j<inputLength; j++) {
                if(inputArray[j] < min) {
                    min = inputArray[j];
                    indexOfMin = j;
                }
            }
            int temp = inputArray[i];
            inputArray[i] = min;
            inputArray[indexOfMin] = temp;
        }
    }
}