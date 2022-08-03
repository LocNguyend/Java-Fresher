package JavaFresherDay11.Practice.RunnableThread;

public class TestRunnableThread {
    public static void main(String args[]) {
        System.out.println("Main thread running... ");

        RunnableThread runnableDemo1 = new RunnableThread("Thread-1-HR-Database");
        runnableDemo1.start();

        RunnableThread runnableDemo2 = new RunnableThread("Thread-2-Send-Email");
        runnableDemo2.start();

        System.out.println("Main thread stopped!!! ");
    }
}
