package org.example;

import java.util.*;

import static org.example.MergeSort.mergeSort;

public class Main {
    public static void main(String[] args) {
//        List<String> arr = new ArrayList<>();
//        arr.add("banana");
//        arr.add("apple");
//        arr.add("peach");
//        arr.add("cherry");
//        arr.add("jackfruit");
//
//        System.out.println(arr);
//
//        Collections.sort(arr);
//
//        System.out.println(arr);

        Random random = new Random();
        int[] nums = new int[10];

        for(int i=0; i<nums.length; i++) {
            nums[i] = random.nextInt(100);
        }

        System.out.println("Before: " + Arrays.toString(nums));

        mergeSort(nums);

        System.out.println("After: " + Arrays.toString(nums));


    }
}