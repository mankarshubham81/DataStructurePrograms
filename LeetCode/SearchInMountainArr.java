// package LeetCode;
// leetcode 1095 hard problem : https://leetcode.com/problems/find-in-mountain-array/

// How to solve a problem
// assume arr = {10,20,30,40,50,30,10,5}
//1) find peak element => 4(5th position) index
// 2) Binary search in (0 to 4)
// 3) if Not found  find (5 to 7)

public class SearchInMountainArr {
    public static void main(String[] args) {

    }

    public static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        // start search in ascending order
        int firstTry = orrderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } else {
            // try to search in second half
            return orrderAgnosticBS(arr, target, peak + 1, arr.length-1);
        }
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in decressing part of array
                // this may be the answer, but loop at left
                // this is why end is != mid - 1
                end = mid;
            } else {
                // you are in ascending part of array
                start = mid + 1;// because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to largest number
        // so you can eather return start OR end
        return start;
    }

    public static int orrderAgnosticBS(int[] arr, int target, int start, int end) {
        // int start = 0;
        // int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) { // you know you can tatally skip this if loop, right ?
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) { // you know you can tatally skip this if loop, right ?
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }

        return -1;

    }

    // public static int binarySearch(int[] arr, int target, int start, int end) {

    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;

    //         if (target < arr[mid]) {
    //             end = mid - 1;
    //         } else if (target > arr[mid]) {
    //             start = mid + 1;
    //         } else {
    //             return mid;
    //         }
    //     }

    //     return -1;
    // }
}
