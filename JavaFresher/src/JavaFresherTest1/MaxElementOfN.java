package JavaFresherTest1;
import java.util.*;


public class MaxElementOfN {

    public static int maxElement(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nhap so n va n phan tu so nguyen duong
        System.out.println("Input N: ");
        int n = sc.nextInt();
        if (n<=0){
            System.out.println("N must be positive!");
        }
        else {
            int[] arr = new int[n];
            System.out.println("Input N element: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] <= 0) {
                    System.out.println("All N elements need to be positive!");
                    break;
                }
            }
            //In ra phan tu max
            System.out.println("Max element of N element is: " + maxElement(arr));
        }
    }
}
