package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[] {1, 2, 3, 4, 5};



        System.out.println(Arrays.toString(numbers));

        System.out.println(binarySearch(numbers, 4));

//        System.out.println("\nAfter: ");
//        System.out.println(Arrays.toString(numbers));

    }

    private static int binarySearch(int[] numbers, int numbersToFind) {
        int low = 0;
        int high = numbers.length - 1;

        while(low <= high) {
            int midIndex = (low + high) / 2;
            int midNum = numbers[midIndex];

            if(numbersToFind == midNum) {
                return midIndex;
            }

            if(numbersToFind < midNum) {
                high = midIndex - 1;
            }

            if(numbersToFind > midNum) {
                low = midIndex + 1;
            }
        }

        return -1;
    }
}