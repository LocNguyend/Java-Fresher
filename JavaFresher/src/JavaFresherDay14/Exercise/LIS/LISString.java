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

        // LIS[i] stores the longest increasing subsequence of subarray
        // `arr[0…i]` that ends with `arr[i]`
        List<List<Character>> LIS = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            LIS.add(new ArrayList<>());
        }

        // LIS[0] denotes the longest increasing subsequence ending at `arr[0]`
        LIS.get(0).add(arr.get(0));

        // start from the second array element
        for (int i = 1; i < arr.size(); i++)
        {
            // do for each element in subarray `arr[0…i-1]`
            for (int j = 0; j < i; j++)
            {
                // find the longest increasing subsequence that ends with `arr[j]`
                // where `arr[j]` is less than the current element `arr[i]`

                if (arr.get(j) < arr.get(i) && LIS.get(j).size() > LIS.get(i).size()) {
                    LIS.set(i, new ArrayList<>(LIS.get(j)));
                }
            }

            // include `arr[i]` in `LIS[i]`
            LIS.get(i).add(arr.get(i));
        }

        // uncomment the following code to print contents of `LIS`
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
