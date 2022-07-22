package JavaFresherDay4.Exercise.StopWatch;

import java.util.*;
import java.lang.*;

public class TestWatch {

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j; //searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();

        // Seclection sort cho 100000 phan tu random
        int n = 100000;
        Random rnum = new Random();
        int[] arr = new int[n];

        for (int count = 0; count < n; count++){
            arr[count] = rnum.nextInt();
        }
        selectionSort(arr);


        watch.end();
        System.out.println("Time has passed " + watch.getElapsedTime() + " milisecond" );
    }
}
