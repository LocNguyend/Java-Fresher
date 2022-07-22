package JavaFresherDay3.Exercise;

import java.util.*;

public class AddElement{

    public static int[] addElement(int index, int[] arr, int x){
        int[] resArray = new int[arr.length+1];
        for (int i = 0; i < index; i++){
            resArray[i] = arr[i];
        }
        resArray[index] = x;
        for (int i = index+1; i < resArray.length;i++){
            resArray[i] = arr[i-1];
        }
        return resArray;
    }

    public static void printArray(int[] array){
        for (int j = 0; j< array.length; j++){
            System.out.print(array[j]+"\t");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhap kich thuoc cua mang
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Nhap mang
        int i = 0;
        while (i < array.length){
            System.out.println("Enter element " + i + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Array: ");
        printArray(array);

        // Nhap vao vi tri va gia tri can tim
        System.out.println("Enter the adding value: ");
        int addValue = scanner.nextInt();
        System.out.println("Enter index value: ");
        int add_index = scanner.nextInt();

        // Kiem tra gia tri index co hop li thi thuc hien, khong thi in ra mang cu
        if (add_index <= -1 || add_index > array.length){
            System.out.println("Not valid adding index !");
            printArray(array);
        }
        else {
            int[] res = addElement(add_index,array,addValue);
            printArray(res);
        }
    }
}
