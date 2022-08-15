package JavaFresherDay14.Exercise.LIS;

import java.util.ArrayList;
import java.util.List;

public class LISString {
    public static void findLIS(String array)
    {
        List<Character> arr = new ArrayList<>();
        for (char ch : array.toCharArray()) {
            arr.add(ch);
        }
        // base case
        if (arr == null || arr.size() == 0) {
            return;
        }

        List<List<Character>> LIS = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            LIS.add(new ArrayList<>());
        }


        LIS.get(0).add(arr.get(0));


        for (int i = 1; i < arr.size(); i++)
        {

            for (int j = 0; j < i; j++)
            {


                if (arr.get(j) < arr.get(i) && LIS.get(j).size() > LIS.get(i).size()) {
                    LIS.set(i, new ArrayList<>(LIS.get(j)));
                }
            }


            LIS.get(i).add(arr.get(i));
        }

        
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println("LIS[" + i + "] — " + LIS.get(i));
        }*/

        // `j` will store an index of LIS
        int j = 0;
        for (int i = 0; i < arr.size(); i++)
        {
            if (LIS.get(j).size() < LIS.get(i).size()) {
                j = i;
            }
        }

        // print LIS
        System.out.print(LIS.get(j));
    }
    public static void main(String args[]) {
        // Your code goes here
        String arr = "Welcome";
        findLIS(arr);
    }
}
