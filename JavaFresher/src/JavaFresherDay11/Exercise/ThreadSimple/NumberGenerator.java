package JavaFresherDay11.Exercise.ThreadSimple;

public class NumberGenerator implements Runnable {

    public NumberGenerator() {
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i ++){
                System.out.println(i);
                System.out.println(this.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
