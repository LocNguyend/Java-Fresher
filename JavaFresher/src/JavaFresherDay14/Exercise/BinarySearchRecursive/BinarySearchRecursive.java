package JavaFresherDay14.Exercise.BinarySearchRecursive;

public class BinarySearchRecursive {
    static int binarySearch(int[] arr,int l, int r, int x){

        if (r >= l && l <= arr.length - 1) {

            int mid = l + (r - l) / 2;

            //neu phan tu o giua
            if (arr[mid] == x)
                return mid;

            // neu phan tu nho hon mid thi no o ben left
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // neu phan tu lon hon mid thi no o right
            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,2,3,13,21};
        System.out.println(binarySearch(arr,0,arr.length-1,13));
    }
}
