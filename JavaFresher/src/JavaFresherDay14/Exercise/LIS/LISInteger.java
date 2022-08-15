package JavaFresherDay14.Exercise.LIS;

import java.util.*;

public class LISInteger {
        public static void findLIS(int[] arr)
        {
            // base case
            if (arr == null || arr.length == 0) {
                return;
            }

            // LIS[i] stores the longest increasing subsequence of subarray
            // `arr[0…i]` that ends with `arr[i]`
            List<List<Integer>> LIS = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                LIS.add(new ArrayList<>());
            }

            // LIS[0] denotes the longest increasing subsequence ending at `arr[0]`
            LIS.get(0).add(arr[0]);

            // start from the second array element
            for (int i = 1; i < arr.length; i++)
            {
                // do for each element in subarray `arr[0…i-1]`
                for (int j = 0; j < i; j++)
                {
                    // find the longest increasing subsequence that ends with `arr[j]`
                    // where `arr[j]` is less than the current element `arr[i]`

                    if (arr[j] < arr[i] && LIS.get(j).size() > LIS.get(i).size()) {
                        LIS.set(i, new ArrayList<>(LIS.get(j)));
                    }
                }

                // include `arr[i]` in `LIS[i]`
                LIS.get(i).add(arr[i]);
            }

            // uncomment the following code to print contents of `LIS`
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println("LIS[" + i + "] — " + LIS.get(i));
        }*/

            // `j` will store an index of LIS
            int j = 0;
            for (int i = 0; i < arr.length; i++)
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
        int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
        findLIS(arr);
        }
}
