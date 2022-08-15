package JavaFresherDay14.Exercise.LIS;

import java.util.*;

public class LISInteger {
        public static void findLIS(int[] arr)
        {
            // base case
            if (arr == null || arr.length == 0) {
                return;
            }

            // LIS[i] chua day con dai nhat ket thuc boi arr[i] tu phan tu ban dau -> i`
            List<List<Integer>> LIS = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                LIS.add(new ArrayList<>());
            }

            // LIS[0] khai bao day con dai nhat o `arr[0]`
            LIS.get(0).add(arr[0]);

            // bat dau tu phan tu thu 2
            for (int i = 1; i < arr.length; i++)
            {
                // lap lai tu phan tu dau tien toi no `arr[0…i-1]`
                for (int j = 0; j < i; j++)
                {
                    // tim day con dai nhat ket thuc o `arr[j]`
                    // khi `arr[j]` nho hon phan tu dang xet `arr[i]`

                    if (arr[j] < arr[i] && LIS.get(j).size() > LIS.get(i).size()) {
                        LIS.set(i, new ArrayList<>(LIS.get(j)));
                    }
                }

                // add `arr[i]` vao trong `LIS[i]`
                LIS.get(i).add(arr[i]);
            }

            // in ra cac phan tu co trong `LIS`
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println("LIS[" + i + "] — " + LIS.get(i));
        }*/

            // `j` chua max cua LIS
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
