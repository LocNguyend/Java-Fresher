package JavaFresherDay4.Exercise.FanService;

public class TestFan {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setRunning(true);

        fan2.setSpeed(Fan.MEDIUM);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        }
}
