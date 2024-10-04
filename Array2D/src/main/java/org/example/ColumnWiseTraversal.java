package org.example;

public class ColumnWiseTraversal {

    public static void columnTraversal(int[][] matrix) {
        //column-wise traversal (top to bottom)
        //traverse the first value of each column
        for(int j=0; j<matrix[0].length; j++) {
            //traverse first value of each row
            for(int i=0; i<matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
