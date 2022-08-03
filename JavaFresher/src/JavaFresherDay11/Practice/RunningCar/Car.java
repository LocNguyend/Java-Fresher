package JavaFresherDay11.Practice.RunningCar;

import java.util.Random;

import static JavaFresherDay11.Practice.RunningCar.TestCar.DISTANCE;
import static JavaFresherDay11.Practice.RunningCar.TestCar.STEP;

public class Car implements Runnable{

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();

        while (runDistance < DISTANCE){
            try {
                int speed = (new Random().nextInt(20));
                runDistance += speed;
                String log ="|";
                int percentTravel = (runDistance * 100)/DISTANCE;
                for (int i = 0; i < DISTANCE; i+=STEP){
                    if (percentTravel >= i + STEP){
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log+="o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log +" "+
                        Math.min(DISTANCE,runDistance) + "km");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Car " + this.name + "broken !");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car " + this.name + "finish in " + (endTime - startTime)/1000 +"s");
    }
}
