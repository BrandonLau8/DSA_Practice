package org.example;

import java.util.Arrays;
import java.util.Iterator;

import static org.example.ColumnWiseTraversal.columnTraversal;
import static org.example.DiagonalTraversal.diagonalTraversal;
import static org.example.SpiralTraversal.spiralTraversal;

public class Main {
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };

        int[][] lotteryCard2 = new int[3][3];
        lotteryCard2[0][0] = 1;
        lotteryCard2[0][1] = 2;
        lotteryCard2[0][2] = 3;
        lotteryCard2[1][0] = 4;
        lotteryCard2[1][1] = 5;
        lotteryCard2[1][2] = 6;
        lotteryCard2[2][0] = 7;
        lotteryCard2[2][1] = 8;
        lotteryCard2[2][2] = 9;

        for(int[] row : matrix) {
            for(int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

//        columnTraversal(matrix);
//        spiralTraversal(matrix);
        diagonalTraversal(matrix);



    }
}