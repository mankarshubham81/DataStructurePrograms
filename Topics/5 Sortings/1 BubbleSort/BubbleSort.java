import java.util.Arrays;

// package Topics.5 Sortings;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 23, 22, 65, 24, 76, 1, 87, 32, 21, 76, 98, 57, 5, 4, 2 };
        bubbleS(arr);
        System.out.println("Bubble Sorted Array " + Arrays.toString(arr));
    }

    public static void bubbleS(int[] arr) {
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                } else {
                    // you do not need else here, you can remove it;
                }
            }
            if (!flag) { // !false = true
                break;
            }
        }

    }
}
