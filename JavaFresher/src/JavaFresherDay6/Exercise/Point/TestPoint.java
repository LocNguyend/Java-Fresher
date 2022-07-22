package JavaFresherDay6.Exercise.Point;

public class TestPoint {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(17,11);
        Point3D p2 = new Point3D(11,9,20);

        float[] XY = p1.getXY();
        for (float i : XY){
            System.out.println(i);
        }
        p1.setXY(5,8);
        System.out.println(p1.toString());

        System.out.println("----------------------------");

        p2.setXYZ(5,8,1);
        System.out.println(p2.toString());
        for (float i : p2.getXYZ()){
            System.out.println(i);
        }
    }
}
