
// leetcode Q:268
// on leetcode there is another kind of similar question 448, 287
import java.util.Arrays;

public class Q268 {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 9, 4, 6, 5, 2, 0 };
        System.out.println(checkFun(arr));
        // System.out.println(Arrays.toString(arr));
    }

    public static int checkFun(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // search for missing number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }

        // Case 2:
        return arr.length;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
