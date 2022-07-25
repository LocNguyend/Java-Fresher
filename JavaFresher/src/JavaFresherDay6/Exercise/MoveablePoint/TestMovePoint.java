package JavaFresherDay6.Exercise.MoveablePoint;

public class TestMovePoint {

    public static void main(String[] args) {
        Point p1 = new Point(5,6);
        MoveablePoint p2 = new MoveablePoint(5,8,3,7);

        System.out.println(p1.toString());
        System.out.println("--------------------------------");

        System.out.println(p2.toString());
        p2.move();
        System.out.println(p2.toString());
    }
}
