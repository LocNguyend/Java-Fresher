package JavaFresherDay11.Exercise.FindPrime;

public class TestFindPrime {
    public static void main(String[] args) {

    LazyPrimeFactor lazyPrimeFactor = new LazyPrimeFactor();
    OptimPrimeFactor optimPrimeFactor = new OptimPrimeFactor();

    Thread t1 = new Thread(lazyPrimeFactor);
    Thread t2 = new Thread(optimPrimeFactor);

    t1.start();
    t2.start();

    }
}
