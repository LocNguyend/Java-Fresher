package JavaFresherDay11.Exercise.OddEvenThreadNumber;

public class TestOddEven {

    public static void main(String[] args) throws InterruptedException {
        EvenThread thread1 = new EvenThread();
        OddThread thread2 = new OddThread();

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t1.join();
        t2.start();
    }
}
