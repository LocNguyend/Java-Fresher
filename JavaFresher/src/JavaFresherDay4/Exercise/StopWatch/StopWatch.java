package JavaFresherDay4.Exercise.StopWatch;


import java.lang.*;

public class StopWatch {

    private final long nanoSecondsPerMillisecond = 1000000;

    private long startTime = 0;
    private long endTime = 0;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    //Khoi tao stopwatch voi thoi gian hien tai cua he thong
    public StopWatch() {
    }

    //Reset startTime ve thoi gian hien tai cua he thong
    public void start(){
        this.startTime = System.nanoTime();
    }

    //Reset endTime ve thoi gian hien tai cua he thong
    public void end(){
        this.endTime = System.nanoTime();
    }

    public long getElapsedTime(){
        return (this.getEndTime() - this.getStartTime()) / nanoSecondsPerMillisecond;
    }

}
