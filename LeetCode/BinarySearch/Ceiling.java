// Brute Force Solution in O(n)

public class Ceiling {
    // Problem : Ceiling : Smallest Element int array that greater or = to
    // target(varible)
    // arr = {2,3,9,13,14,16,18}
    // ceiling(arr, target =14 => return = 14
    // ceiling(arr, target =15 ) => return =16
    // ceiling(arr, target =4 ) => return =9
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 11, 22, 32, 43, 55, 66, 77, 88, 99, 232, 434 };
        int target = 92;

        int res = ceiling(arr, target);
        System.out.println("Celing for " + target + " is : " + res);

    }

    public static int ceiling(int[] arr, int target) {
        // int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return arr[i];
            } else if (target < arr[i]) {// you can eleminate this extra else if blok by adding <= on above if staqtement
                return arr[i];
            }
        }

        return -1;
    }

}