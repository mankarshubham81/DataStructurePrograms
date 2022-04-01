// package LeetCode;
// 33. Search in Rotated Sorted Array
public class SearchInRotatedArr {
    public static void main(String[] args) {

    }

    public int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        // if you did not find pivot, then given array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            binarySearch(arr, target, 0, arr.length - 1);

        }

        // if pivot is found then you have found two ascending arry
        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);

    }

    public int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    public int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
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
