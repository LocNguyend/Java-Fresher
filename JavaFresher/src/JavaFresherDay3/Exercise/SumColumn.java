package JavaFresherDay3.Exercise;

import java.util.*;

public class SumColumn {

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

        // Nhap gia tri ma tran MxN
        System.out.println("Enter value for each element of matrix MxN: ");
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                mat[i][j] = scanner.nextDouble();
            }
        }

        printMatrix(mat);
        System.out.println();

        // Nhap gia tri cot muon tinh
        System.out.println("Enter index column: ");
        int index_column = scanner.nextInt();

        // Tinh tong theo hang
        double res = 0.0;
        for (int i = 0; i < mat.length;i++) {
                res += mat[i][index_column];
        }

        System.out.printf("Sum by column %d is: %f",index_column,res);
    }
}
