import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        // this array contain only element in 1 to n format
        int[] arr = { 3, 1, 7, 5, 6, 4, 2 };
        cycleS(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cycleS(int[] arr) {
        int i = 0;
        while(i< arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
