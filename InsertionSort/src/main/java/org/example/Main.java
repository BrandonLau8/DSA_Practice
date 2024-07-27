package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[100];

        for(int i=0; i< nums.length;i++) {
            nums[i] = rand.nextInt(100);
        }


        System.out.println("Before \n");
        System.out.println(Arrays.toString(nums));

        insertionSort(nums);

        System.out.println("\n After");
        System.out.println(Arrays.toString(nums));

    }

    public static void insertionSort(int[] nums) {
        for(int i=1; i<nums.length;i++){
            int currentValue = nums[i];
            int j = i-1;
            while(j>=0 && nums[j] > currentValue) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = currentValue;
        }
    }
}