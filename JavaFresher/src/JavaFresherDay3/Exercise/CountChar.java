package JavaFresherDay3.Exercise;

import java.util.*;

public class CountChar {

    public static void main(String[] args) {
        String example = "This is a sample string";
        System.out.println("Example String is : " + example);

        Scanner scanner = new Scanner(System.in);

        //Nhap vao ki tu can tim kiem
        System.out.println("Enter char to count: ");
        char find = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < example.length(); i++){
            if(example.charAt(i) == find){
                count++;
            }
        }

        System.out.printf("The number of occurrences of char %c in example string is %s",find,count);
    }
}
