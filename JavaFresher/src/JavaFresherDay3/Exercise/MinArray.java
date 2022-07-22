package JavaFresherDay3.Exercise;

import java.util.*;

public class MinArray {

    public static void printArray(int array[]){
        for (int j = 0; j< array.length; j++){
            System.out.print(array[j]+"\t");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai bao kich thuoc mang
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();

        // Nhap gia tri cua mang
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        int index = 0;
        printArray(arr);
        System.out.println();

        // So sanh gia tri cua tung phan tu voi min
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        System.out.println("Min of array is " + min + " at position " + (index+1));
    }
}
