package JavaFresherDay3.Exercise;

import java.util.*;

public class SumDiag {

    public static void printMatrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap kich thuoc ma tran vuong NxN và nhap gia tri cho ma tran
        System.out.println("Enter size of square matrix NxN: ");
        System.out.println("N = ");
        int N = scanner.nextInt();

        double[][] mat = new double[N][N];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                mat[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Square Matrix: ");
        printMatrix(mat);
        System.out.println();

        // Tinh gia tri tren duong cheo chinh
        double res = 0;
        for (int i = 0; i < mat.length; i++){
            res += mat[i][i];
        }

        System.out.println("Sum of Diagonal Matrix is: " + res);
    }
}
