package org.example;

public class DiagonalTraversal {
    public static void diagonalTraversal(int[][] matrix) {

        int n = matrix.length; //number of rows
        int m = matrix[0].length; //number of cols

        //traverse upper diagonals(from top left to bottom right)
        for (int startCol = 0; startCol < m; startCol++) {
            int row = 0; //start from the first row
            int col = startCol; //col is determined by iteration

            //iterate through the diagonal
            while (row < n && col >= 0) {
                System.out.print(matrix[row][col] + " ");
                row++;
                col--;
            }
            System.out.println();
        }

        //Traverse lower diagonals (start from first column)
        for (int startRow = 1; startRow < n; startRow++) {
            int row = startRow; //start from the current row
            int col = m - 1; //start from the last column
            while (row < n && col >= 0) {
                System.out.print(matrix[row][col] + " ");
                row++;
                col--;
            }
            System.out.println();
        }
    }
}
