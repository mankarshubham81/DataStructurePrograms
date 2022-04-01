public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = { 2,3,4,5,6,10};
        // cheackimg weather array element is sorted or not from which index
        System.out.println(sorting(arr, 0));
    }

    public static boolean sorting(int[] arr, int index) {
        if(index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index + 1] && sorting(arr, index + 1);
    }
}
