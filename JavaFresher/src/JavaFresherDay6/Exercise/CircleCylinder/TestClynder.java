package JavaFresherDay6.Exercise.CircleCylinder;

public class TestClynder {

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(5.5, "black", 17.11);
        Circle circle = new Circle();

        System.out.println(circle);
        System.out.println("The area is: " + circle.getArea());

        System.out.println("---------------------------");

        c1.setHeight(5.8);
        System.out.println(c1.toString());
        System.out.println("The volume is: " + c1.getVolume() + " and the area is: " + c1.getArea());

        System.out.println("---------------------------");

        System.out.println(c2.toString());
        System.out.println("The volume is: " + c2.getVolume() + " and the area is: " + c2.getArea());
    }
}
