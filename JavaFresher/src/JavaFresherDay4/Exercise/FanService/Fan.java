package JavaFresherDay4.Exercise.FanService;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean Running = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isRunning() {
        return Running;
    }

    public void setRunning(boolean running) {
        Running = running;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (Running) {
            return "Fan{" + "speed=" + speed + ", radius=" + radius + ", color='" + color + "', fan is on" + '\'' + '}';
        }
        else {
            return "Fan{" + "radius=" + radius + ", color='" + color + "', fan is off" + '\'' + '}';
        }
    }
}

