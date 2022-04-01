import java.sql.Array;
import java.util.Arrays;

// package 3 InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 23, 22, 65, 24, 76, 1,-32,-31, 87, 32, 21, 76, 98, 57, 5, 4, 2 };
        insertiionS(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertiionS(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
