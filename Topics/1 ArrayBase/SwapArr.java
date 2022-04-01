import java.util.Arrays;

// import randomProgram.a1;

// package Topics;

public class SwapArr {
    public static void main(String[] args) {
        int[] arr = { 2222, 336, 883, 695, 1194, 2176, 56,34 };
        System.out.println(Arrays.toString(arr));
        swap(arr, 2, 4);
        System.out.println(Arrays.toString(arr));
        // find maximum number in given array
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 2, 6));
         System.out.println(Arrays.toString(arr));
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    
    public static int max(int[] arr) {
        
        if(arr.length == 0){
            return -1;
        }
        
        if(arr == null){
            return -1;
        }
        
        int maxNo = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxNo < arr[i]) {
                maxNo = arr[i];
            }
        }
        
        return maxNo;
    }
    
    public static int maxRange(int[] arr, int min, int max) {
        if(min > max){
            return -1;
        }
        
        if(arr == null){
            return -1;
        }
        
        int maxNo = min;
        for (int i = min; i < max; i++) {
            if (maxNo < arr[i]) {
                maxNo = arr[i];
            }
        }
        
        return maxNo;
    }
    
    public static void reverseArr(int[] arr){
        int min = 0;
        int max = arr.length-1;
        
        while(min < max){
            swap(arr, min, max);
            min++;
            max--;
        }
        
    }
    
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
