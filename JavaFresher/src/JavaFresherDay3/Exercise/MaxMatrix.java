package JavaFresherDay3.Exercise;

import java.util.*;

public class MaxMatrix {

    public static double findMax(double mat[][]){
        double max = mat[0][0];
        for (int i = 0; i < mat.length;i++)
            for (int j = 0; j<mat[0].length; j++){
                if (mat[i][j] > max){
                    max = mat[i][j];
                }
            }
        return max;
    }

    public static void printMatrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap kich thuoc ma tran
        System.out.println("Enter size of matrix MxN: ");
        System.out.println("M = ");
        int M = scanner.nextInt();
        System.out.println("N = ");
        int N = scanner.nextInt();

        double[][] mat = new double[M][N];

        // Nhap gia tri ma tran
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                mat[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("The matrix: ");
        printMatrix(mat);

        double res = findMax(mat);
        System.out.println("Max of matrix is: " + res);
    }
}
