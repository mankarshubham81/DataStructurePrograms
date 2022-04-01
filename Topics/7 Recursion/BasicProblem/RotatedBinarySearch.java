public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 44,45,56,67,87,88,89,22,33,44,55};
        int target = 67;
        System.out.println(binarysearchRotatedArray(arr, target, 0, arr.length-1));
    }

    public static int binarysearchRotatedArray(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return binarysearchRotatedArray(arr, target, s, mid - 1);
            } else {
                return binarysearchRotatedArray(arr, target, mid + 1, e);
            }
        }else if(target >= arr[mid] && target <= arr[e]){
            return binarysearchRotatedArray(arr, target, mid+1, e);
        }else{
            return binarysearchRotatedArray(arr, target, s, mid - 1);
        }
    }
}
