import java.util.*;

public class TestQuadratic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhap 3 so a,b,c
        System.out.println("Enter a,b,c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation res = new QuadraticEquation(a,b,c);

        if (res.getDelta() < 0){
            System.out.println("The equation has no real roots");
        }
        else if (res.getDelta() == 0){
            System.out.printf("The equation has one root %f", res.getRoot1());
        }
        else {
            System.out.printf("The equation has two roots %f and %f",res.getRoot1(),res.getRoot2());
        }
    }
}
