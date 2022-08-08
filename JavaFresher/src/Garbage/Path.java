package Garbage;

import java.util.*;

public class Path {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int c[][] = new int[m][n];
        int d[][] = new int[m+1][n+1];

        for (int i = 0; i < m;i++){
            for (int j = 0; j < n; j++){
                c[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0;i<m;i++){
            d[i][0] = 0;
        }

        for (int j = 0; j < n ; j++){
            d[0][j] = 0;
        }

        for (int i = 1; i < m+1; i++){
            for (int j = 1; j < n+1; j++){
                d[i][j] = Math.max(Math.max(d[i-1][j-1],d[i][j-1]),d[i+1][j-1]) + c[i-1][j-1];
            }
        }

        System.out.println(d[m+1][n+1]);
    }
}
