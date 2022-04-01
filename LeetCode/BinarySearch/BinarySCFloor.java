// package LeetCode.BinarySearch;
// Time Complexicity of floor is O(log n) 

public class BinarySCFloor {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8};
        int target = 1;

        int result = floor(arr, target);
        System.out.println("Floor is : " + result);
    }

    public static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            
            if(target < arr[start]){
                return -1;
            }

            int mid = (start + end )/ 2;


            if (target == arr[mid]) {
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } 
        }

        return arr[end];
    }
}
