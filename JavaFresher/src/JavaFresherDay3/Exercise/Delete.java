package JavaFresherDay3.Exercise;

import java.util.*;

public class Delete {

    public static int indexDel (int array[], int element){
        int index = -1;
        for (int i = 0; i<array.length; i++){
            if(array[i] == element){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void printArray(int array[]){
        for (int j = 0; j< array.length; j++){
            System.out.print(array[j]+"\t");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap vao kich thuoc cua mang
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Nhap mang
        int i = 0;
        while (i<array.length){
            System.out.println("Enter element " + i + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Array: ");
        printArray(array);

        // Nhap phan tu can xoa
        System.out.println("Enter delete value: ");
        int deleteValue = scanner.nextInt();

        // Kiem tra co phan tu X trong mang, co thi xoa, khong thi in lai mang ban dau
        int del_index = indexDel(array,deleteValue);

        if (del_index < 0){
            System.out.println("Not found delete value on array");
            printArray(array);
        }
        else {
            //tao 1 mang moi de luu ket qua
            int[] resArray = new int[array.length-1];
            int k = 0;
            for (int j = 0;j < array.length;j++){
                if(j==del_index) continue;
                else {
                    resArray[k++] = array[j];
                }
            }
            System.out.println("Result array: ");
            printArray(resArray);
        }

    }
}
