import java.sql.Array;
import java.util.Arrays;

// package 2 SelsctionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 23, 22, 65, 24, 76, 1, 87, 32, 21, 76, 98, 57, 5, 4, 2 };
        selectionS(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionS(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        // int max = Integer.MIN_VALUE;
        for (int i = 0; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }
}
