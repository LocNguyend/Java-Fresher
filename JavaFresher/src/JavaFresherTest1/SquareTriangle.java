package JavaFresherTest1;

import java.util.*;

public class SquareTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input 3 edges a,b,c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a > 0 && b > 0 && c >0) {
            //Kiem tra co phai 3 canh 1 tam giac vuong
            double a2 = Math.pow(a, 2);
            double b2 = Math.pow(b, 2);
            double c2 = Math.pow(c, 2);

            if (a2 == b2 + c2 || b2 == c2 + a2 || c2 == a2 + b2) {
                System.out.println("The triangle is Square Triangle !");
                double Perimeter = a + b + c;
                double halfP = Perimeter / 2;
                double Area = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
                System.out.println("Perimeter of triangle: " + Perimeter + " and Area of triangle: " + Area);
            } else {
                System.out.println("The triangle is not Square Triangle");
            }
        }
        else {
            System.out.println("Not a triangle");
        }
    }
}
