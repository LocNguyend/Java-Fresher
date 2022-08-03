package JavaFresherDay11.Exercise.FindPrime;

public class OptimPrimeFactor implements Runnable {
    public Boolean isPrime(int n){
        if (n < 2) return false;
        for(int i = 2; i < Math.sqrt(n) ; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        int count = 0;
        try{
            while (true){
                if (isPrime(count)) {
                    System.out.print("Optim: " + count);
                    System.out.println();
                }
                count++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
