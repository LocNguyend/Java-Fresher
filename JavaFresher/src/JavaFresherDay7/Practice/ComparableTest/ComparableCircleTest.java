package JavaFresherDay7.Practice.ComparableTest;

import java.util.*;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(5.15);
        circles[1] = new ComparableCircle(5.8);
        circles[2] = new ComparableCircle(1.11,"white",true);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
