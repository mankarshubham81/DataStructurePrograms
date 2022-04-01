// package LeetCode.BinarySearch;
// FInd the floor of the number
	// Problem : floor : Greatest Element in array that smaller or = to
    // target(varible)
    // arr = {2,3,9,13,14,16,18}
    // floor(arr, target =14 => return = 14
    // floor(arr, target =15 ) => return =14
    // floor(arr, target =4 ) => return =3

public class Floor {
    
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 11, 22, 32, 43, 55, 66, 77, 88, 99, 232, 434 };
        int target = 92;

        int res = floor1(arr, target);
        System.out.println("Celing for " + target + " is : " + res);

    }

    public static int floor1(int[] arr, int target) {
        
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return arr[i];
            }else if(target < arr[i]){
                return arr[i - 1];
            }
        }

        return arr.length -1;
    }

}
