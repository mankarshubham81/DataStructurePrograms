import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int [] res = mergeSortFunction(arr);
        System.out.print("Merge Sort : ");
        System.out.println(Arrays.toString(res));
    }

    public static int[] mergeSortFunction(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid  = arr.length/2;

        int [] left = mergeSortFunction(Arrays.copyOfRange(arr, 0, mid));
        int [] right = mergeSortFunction(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    public static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length + second.length];
        int i=0;
        int j=0;
        int k = 0;

        while(i < first.length && j< second.length){
            if(first[i] < second[j]){
                mix[k]= first[i] ;
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
            // it may be possible that one of the arrays is not complete
            // either this goona work
            while(i< first.length){
                mix[k] = first[i];
                i++;
                k++;
            }

            // Or this
            while(j<second.length){
                mix[k] = second[j];
                j++;
                k++;
            }
        return mix;

    }
}