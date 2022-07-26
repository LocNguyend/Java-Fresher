package JavaFresherDay7.Exercise.Colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Square s1 = new Square(5);
        Square s2 = new Square(8);
        Rectangle r1 = new Rectangle(17,11);
        Circle c1 = new Circle();

        Shape[] shapes = new Shape[4];
        shapes[0] = s1;
        shapes[1] = r1;
        shapes[2] = c1;
        shapes[3] = s2;

        for (Shape i : shapes){
            System.out.println(i.getArea());
            if (i instanceof Square){
                Square t = (Square) i;
                t.howToColor();
            }
            System.out.println("------------------");
        }
    }
}
