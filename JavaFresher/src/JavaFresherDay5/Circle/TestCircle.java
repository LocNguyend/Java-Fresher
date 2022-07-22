package JavaFresherDay5.Circle;

public class TestCircle {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);

        System.out.println(c1.getArea() + " " + c1.getRadius());
        System.out.println(c2.getArea() + " " + c2.getRadius());

    }
}
