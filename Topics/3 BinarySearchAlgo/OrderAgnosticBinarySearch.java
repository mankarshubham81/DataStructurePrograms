// package Topics.BinarySearchAlgo;

// Time Complexicity is same as Binary Search
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // Ascending Array
        // int[] arr = { -49, -45, -32, -1, 0, 1, 2, 11, 22, 32, 43, 55, 66, 77, 88, 99, 232, 434 };


        // Descending Array
        int[] arr = {897,676,566,545,433,422,392,223,201,182,162,122,82,77,63,42,21,18,12,2,1};
        int target = 77;

        int res = orrderAgnosticBS(arr, target);
        System.out.println("Positon of Founded Result : " + res);

    }

    public static int orrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
}
