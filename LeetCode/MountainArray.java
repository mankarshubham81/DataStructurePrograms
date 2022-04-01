// package LeetCode;
// Question 852 : https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Question 162: https://leetcode.com/problems/find-peak-element/submissions/

public class MountainArray {
    public static void main(String[] args) {

        int[] arr = {0,3,4,5,6,8,14,9,8,7,6,5,3,1,0};
        System.out.println(peakIndexInMountainArray(arr));
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
            }else{
                // you are in ascending part of array
                start = mid + 1;// because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to largest number 
        // so you can eather return start OR end
        return start;
    }
}
