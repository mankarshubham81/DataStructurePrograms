// package randomProgram.ArrayListLinearSearch;

public class MinInArray {
    public static void main(String[] args) {
        int[] ar = {2,32,4,12,74,64,1,8,48,5,223,54,78};
        int result = minElement(ar);
        System.out.println("Minimum element : " + result);
        int result1 = maxElement(ar);
        System.out.println("MAximum element : "+ result1);

    
    }

    public static int minElement(int[] a) {
        int min = a[0];
        if(a.length == 0){
            return -1;
        }

        for (int i = 0; i < a.length; i++) {
            if(min > a[i]){
                min = a[i];  
            }
        }

        return min;
    }

    public static int maxElement(int[] a) {
        
        int max = a[0];
        if(a.length == 0){
            return -1;
        }
        
        for (int i = 0; i < a.length; i++) {
            if(max < a[i]){
                max = a[i];  
            }
        }

        return max;
    }
}
