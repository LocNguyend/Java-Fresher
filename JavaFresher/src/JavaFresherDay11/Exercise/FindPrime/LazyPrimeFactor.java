package JavaFresherDay11.Exercise.FindPrime;

public class LazyPrimeFactor implements Runnable{

    public Boolean isPrime(int n){
        if (n < 2) return false;
        for(int i = 2; i < n ; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            if (isPrime(count)) {
                System.out.print("Lazy: " + count);
                System.out.println();
            }
            count++;
        }
        }
    }
