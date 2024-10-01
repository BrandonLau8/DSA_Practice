package org.example;

public class AdjacencyMatrix {
    public static void adjacencyMatrix(int n, int m) {
        //+1 is used because node indicies start from 1 not 0
        int adj[][] = new int[n+1][n+1];

        //edge 1--2
        adj[1][2] = 1;
        adj[2][1] = 1;

        //edge 2--3
        adj[2][3] = 1;
        adj[3][2] = 1;

        //edge 1--3
        adj[1][3] = 1;
        adj[3][1] = 1;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<= n; j++) {
                System.out.print(adj[i][j]);
            }
            System.out.println();
        }
    }

}
