package JavaFresherDay11.Practice.RunningCar;


public class TestCar {

    public static int DISTANCE = 100;
    public static int STEP = 2;

    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);

        System.out.println("Distancde: 100km");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
