import javax.xml.stream.events.EndDocument;

// package Topics.BinarySearchAlgo;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = { -49, -45, -32, -1, 0, 1, 2, 11, 22, 32, 43, 55, 66, 77, 88, 99, 232, 434 };
        int target = -1;

        int res = binarySearch(arr, target);
        System.out.println("Positon of Founded Result : " + res);
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Find Weather the array is sorted in ascending or descending

        while (start <= end) {
            // find the middle Element
            // better way to find mid because when we (start + end )/2 might exceed the
            // integer range in java
            // so we need better solution
            // better Solution s + ((e-s)/2) // when you going to solve it, it will look
            // exactly look like (s+e)/2
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {

                return mid;

            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
