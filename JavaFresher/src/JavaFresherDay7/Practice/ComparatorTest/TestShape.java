package JavaFresherDay7.Practice.ComparatorTest;

public class TestShape {

    public static void main(String[] args) {
        //test Shape
        Shape shape = new Shape();
        System.out.println(shape.toString());
        shape = new Shape("red", false);
        System.out.println(shape.toString());
        System.out.println("---------------------------");

        // test Circle
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        System.out.println("---------------------------");

        // test Rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        System.out.println("---------------------------");

        //test Square
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
