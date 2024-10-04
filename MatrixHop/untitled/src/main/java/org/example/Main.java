package org.example;

public class Main {

    //define movement directions in anticlockwise order
    private static final int[] dx = {0, 1, 0, -1}; //left, down, right, up
    private static final int[] dy = {-1, 0, 1, 0}; //corresponding direction vectors

    public static void main(String[] args) {
        //example of input matrix
        int[][] matrix = {
                {29, 8, 37},
                {15, 41, 3},
                {1, 10, 14}
        };



    }

    public static int findLastCall(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        //track cells that are already hopped on
        boolean[][] visited = new boolean[n][m];

        int x=0, y=0, direction=0, steps=0;
        visited[x][y] = true;
        int lastCell = matrix[x][y];

        while(true) {
            //try to move in the current direction
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
                //if valid move, skip alternate cells
                steps++;
                if(steps % 2 == 1) {
                    //move only if wwe're on an odd step
                    x = nx;
                    y = ny;
                    lastCell = matrix[x][y];
                    visited[x][y] = true;
                } else {
                    //skip this cell(don't mark as visited)
                    x = nx;
                    y = ny;
                }
            } else {

            }
        }
    }
}