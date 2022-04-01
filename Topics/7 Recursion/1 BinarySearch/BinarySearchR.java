// package 1 BinarySearch;

public class BinarySearchR {
    public static void main(String[] args) {

        int[] arr = { 2, 34, 45, 67, 78, 89, 93, 104, 124, 365 };
        int target = 104;
        int res = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println("BS Element position : " + res);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, end);
        }

    }
}
