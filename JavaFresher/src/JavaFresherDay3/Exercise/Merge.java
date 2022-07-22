package JavaFresherDay3.Exercise;

import java.util.*;

public class Merge {
    public static void printArray(int array[]){
        for (int j = 0; j< array.length; j++){
            System.out.print(array[j]+"\t");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap kich thuoc va gia tri 2 mang
        System.out.println("Enter size of array 1: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter size of array 2: ");
        int size2 = scanner.nextInt();

        int[] array1 = new int[size1];
        int[] array2 = new int[size2];

        for (int i = 0; i< array1.length; i++){
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i< array2.length; i++){
            array2[i] = scanner.nextInt();
        }

        System.out.println("Array 1 and Array 2 are: ");
        printArray(array1);
        System.out.println();
        printArray(array2);
        System.out.println();

        // Merge 2 array thanh 1 array
        int[] res = new int[size1 + size2];
        for (int i = 0; i < array1.length; i++){
            res[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++){
            res[array1.length + i] = array2[i];
        }

        System.out.println("Result array: ");
        printArray(res);
    }
}
