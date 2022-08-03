package JavaFresherDay11.Exercise.OddEvenThreadNumber;

public class OddThread implements Runnable{

    @Override
    public void run() {
        try{
        for (int i = 1; i <10; i+=2){
            System.out.println(i);
            Thread.sleep(10);
            }
        }
        catch (InterruptedException e) {
                throw new RuntimeException(e);
        }
    }
}

