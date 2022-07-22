import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();

        Rectangle myRectangle = new Rectangle(width,height);

        System.out.println("Your Rectangle \n" + myRectangle.toString());
        System.out.println("Perimeter: " + myRectangle.getPerimeter());
        System.out.println("Area: " + myRectangle.getArea());
    }
}
