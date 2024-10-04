package org.example;

public class SpiralTraversal {
    public static void spiralTraversal(int[][] matrix) {
        if(matrix.length == 0) return;

        int top= 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left<=right) {
            //move right
            for(int j=left; j<=right;j++) {
                System.out.print(matrix[top][j] + " ");
            }
            top++; //top points to next value down

            //move down
            for(int i= top; i<= bottom; i++){
                System.out.print(matrix[i][right] + " ");
            }
            right--; //right points to next value left

            if(top <= bottom) {
                //move left
                for(int j=right; j>=left; j--){
                    System.out.print(matrix[bottom][j] + " ");
                }
                bottom--; //bottom points to value up

                //move up
                for(int i=bottom; i>=top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                top--;
            }
            break;
        }
    }
}
