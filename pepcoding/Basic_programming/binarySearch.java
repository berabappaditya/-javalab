import java.util.*;

public class binarySearch {
    public static int binSearch(int[] arr, int x) {
        // return the index of element else -1
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24 };
        int x = 20;
        // int x = 24;
        // int x = 11;
        int ans = binSearch(arr, x);
        System.out.println(ans);

    }

}
