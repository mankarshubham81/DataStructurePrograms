import java.util.Arrays;

public class InplaceMergeSort {
    public static void main(String[] args) {
        int[] arr = { 20, 34, 22, 55, 66, 45, 33, 21 };
        divideInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void divideInplace(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        divideInplace(arr, 0, mid);
        divideInplace(arr, mid, end); 

        mergeInplace(arr,start,mid,end);
    }           


public static void mergeInplace(int[] arr, int start,int mid, int end) {
    int[] mix = new int[end-start];
    
    int i = start;
    int j = mid;
    int k = 0;

    while(i<mid && j<end){
        if(arr[i]<arr[j]){
            mix[k]= arr[i];
            i++;
        }else{
            mix[k]= arr[j];
            j++;
        }
        k++;
    }

    while(i<mid){
        mix[k] = arr[i];
        i++;
        k++;
    }

    while(j<end){
        mix[k]=arr[j];
        j++;
        k++;
    }
    
    for (int k2 = 0; k2 < mix.length; k2++) {
        arr[start+k2] = mix[k2];
    }
    // OR
    // System.arraycopy(mix, 0, arr,start + 0, mix.length);
}

}