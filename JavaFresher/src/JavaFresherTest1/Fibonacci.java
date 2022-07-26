package JavaFresherTest1;

import java.util.*;

public class Fibonacci {
    public static int Fibonacci (int n){
        if (n < 2){
            return 1;
        }
        else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nhap so n <= 20, in ra Fibonacci tuong ung
        System.out.println("Input n <= 20: ");
        int n = sc.nextInt();
        if (n > 20 || n <= 0){
            System.out.println("Error input, please input again with n <= 20!");
        }
        else {
            System.out.println(Fibonacci(n));
        }
    }
}
