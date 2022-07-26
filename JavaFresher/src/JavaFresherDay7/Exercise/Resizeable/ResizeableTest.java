package JavaFresherDay7.Exercise.Resizeable;

public class ResizeableTest {

    public static void main(String[] args) {

        //test circle
        Circle c1 = new Circle(3);
        Square s1 = new Square(4);
        Rectangle r1 = new Rectangle(5,8);

        Shape[] shapes = new Shape[3];
        shapes[0] = c1;
        shapes[1] = s1;
        shapes[2] = r1;

        //Pre-resize
        System.out.println("Pre-resize");
        for (Shape i : shapes){
            System.out.println(i);
        }

        for (Shape i : shapes){
            i.resize(100);
        }

        System.out.println("------------------------------------");
        System.out.println("After-resize");

        //After-resize
        for (Shape i : shapes){
            System.out.println(i);
        }
    }
}
