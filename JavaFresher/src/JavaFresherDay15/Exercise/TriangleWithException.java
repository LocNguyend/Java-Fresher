package JavaFresherDay15.Exercise;

import java.util.Scanner;

public class TriangleWithException {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);

        Triangle t1 = new Triangle();

        boolean done = false;

        while (!done){
            try {
                System.out.println("side 1");
                double side1 = scanner.nextDouble();
                System.out.println("side 2");
                double side2 = scanner.nextDouble();
                System.out.println("side 3");
                double side3 = scanner.nextDouble();
                t1 = new Triangle(side1,side2,side3);
                done = true;
            }
            catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
                System.out.println("Enter three sides:  ");
            }
        }
    }
}
