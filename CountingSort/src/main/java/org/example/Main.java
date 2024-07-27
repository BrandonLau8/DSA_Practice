package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[20];

        for(int i =0; i<arr.length; i++) {
            arr[i] = rand.nextInt(6);
        }

        System.out.println(Arrays.toString(arr));

        countingSort(arr);

    }

    private static void countingSort(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[arr.length];

        for(int j: arr) {
            count[j - min]++;
        }x

        for(int i =1; i<count.length; i++) {
            count[i] += count[i-1];
        }

        for(int i = arr.length -1; i>=0; i--) {
            output[count[arr[i] - min] -1] = arr[i];
            count[arr[i] - min]--;
        }

        System.out.println(Arrays.toString(output));
    }


}