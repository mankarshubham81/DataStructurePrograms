// package LeetCode.AmazonQ;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = { -49, -45, -32, -1, 0, 1, 2, 11, 22, 32, 43, 55, 66, 77, 88, 99, 232, 434 };
        int target = 77;
        int res = answer(arr, target);
        System.out.println("Infinite Array Result Using BSA : " + res);
    }

    public static int answer(int[] arr, int target) {
        // first find the range
        // first dtart with box of size 2
        int start = 0;
        int end = 1;

        // condition for the target lie in the range
        while(target > arr[end]){
            int temp = end + 1;// this is New Start
            // double the box value
            // end = previous end + size of box * 2;
            end =  end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

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
