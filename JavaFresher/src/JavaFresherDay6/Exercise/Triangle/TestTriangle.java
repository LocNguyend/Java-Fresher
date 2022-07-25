package JavaFresherDay6.Exercise.Triangle;

import java.util.*;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Shape s1 = new Shape();

        System.out.println("Input color for triangle: ");
        String color = sc.nextLine();
        Triangle t1 = new Triangle();
        t1.setColor(color);

        System.out.println("Input 3 side of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        t1.setSide1(a);
        t1.setSide2(b);
        t1.setSide3(c);


        System.out.println(t1.toString());
        System.out.println("Area of triangle: " + t1.getArea());
        System.out.println("Perimeter of triangle: " + t1.getPerimeter());
    }
}
