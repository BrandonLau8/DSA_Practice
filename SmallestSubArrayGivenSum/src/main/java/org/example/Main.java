package org.example;

public class Main {
    public static void main(String[] args) {

        int[] input = new int[]{4, 2, 2, 7, 8, 1, 2, 8, 10};
        int targetSum = 8;
        System.out.println(smallestSubArray(targetSum, input));
    }

    private static int smallestSubArray(int targetSum, int[] arr) {

        int start = 0;
        int currentSum = 0;
        int minWindowSize = Integer.MAX_VALUE;
        for(int end = 0; end<arr.length; end++) {
            currentSum += arr[end];

            while(currentSum >= targetSum) {
                minWindowSize = Math.min(minWindowSize, (end-start) + 1);
                currentSum -= arr[start];
                start++;
            }
        }
        return minWindowSize;
    }
}