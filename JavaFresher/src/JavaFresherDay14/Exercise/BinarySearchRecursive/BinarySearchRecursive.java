package JavaFresherDay14.Exercise.BinarySearchRecursive;

public class BinarySearchRecursive {
    static int binarySearch(int[] arr,int l, int r, int x){

        if (r >= l && l <= arr.length - 1) {

            int mid = l + (r - l) / 2;

            // If the element is present
            // at the middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then it can
            // only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present in
        // array
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,2,3,13,21};
        System.out.println(binarySearch(arr,0,arr.length-1,13));
    }
}
