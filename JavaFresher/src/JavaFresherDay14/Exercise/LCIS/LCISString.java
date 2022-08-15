package JavaFresherDay14.Exercise.LCIS;

import java.util.ArrayList;
import java.util.List;

public class LCISString {
    public static void findLCIS(String array)
    {
        //Luu string duoi dang list cac char
        List<Character> arr = new ArrayList<>();
        for (char ch : array.toCharArray()) {
            arr.add(ch);
        }
        // base case
        if (arr == null || arr.size() == 0) {
            return;
        }

        // LCIS[i] giu gia tri lon nhat cua sub ket thuc o arr[i] cua arr[0..i]
        List<List<Character>> LCIS = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            LCIS.add(new ArrayList<>());
        }

        // LIS[0] cho gia tri khi ket thuc o arr[0] (=1)
        LCIS.get(0).add(arr.get(0));

        // bat dau duyet tu phan tu thu 2
        for (int i = 1; i < arr.size(); i++)
        {
            // duyet voi tung phan tu `arr[0…i-1]`
            // tim sub lon nhat ket thuc boi `arr[i]` khi ma so sanh arr[i] lon hon voi phan tu lien truoc arr[i-1]

            if (arr.get(i-1) < arr.get(i) && LCIS.get(i-1).size() > LCIS.get(i).size()) {
                LCIS.set(i, new ArrayList<>(LCIS.get(i-1)));
            }

            // add `arr[i]` vao `LIS[i]`
            LCIS.get(i).add(arr.get(i));
        }


        // `j` chua do dai lon nhat cua LIS
        int j = 0;
        for (int i = 0; i < arr.size(); i++)
        {
            if (LCIS.get(j).size() < LCIS.get(i).size()) {
                j = i;
            }
        }

        // print LCIS
        System.out.print(LCIS.get(j));
    }

    public static void main(String[] args) {
        String arr = "abcdexfghik";
        findLCIS(arr);
    }
}
