// package LeetCode.BinarySearch;
// Time Complexicity of ceiling is O(log n) 

public class BinarySCeiling {
    public static void main(String[] args) {
        int[] arr = { -49, -45, -32, -1, 0, 1, 2, 11, 22, 32, 43, 55, 66, 77, 88, 99, 232, 434 };
        int target = 555;

        int res = ceiling(arr, target);
        System.out.println("celing Result Using BSA : " + res);
    }

    public static int ceiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;


            // WHAT if the target number is greater than greatest number in the array
            if(target > arr[arr.length -1]){
                return -1;
            }

            if (target == arr[mid]) {
                return arr[mid];
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            }else{
                // Ans not found
                return arr[mid];
            }
        }

        return arr[start];
    }
}
