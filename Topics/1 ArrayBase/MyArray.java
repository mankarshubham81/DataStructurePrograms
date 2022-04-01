import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

// package Topics;

public class MyArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // initialize the integer array that contains 5 elements
        int[] arr = new int[5];
        //OR initialize with declaration 
        int[] arr2 = {10,21,32,2,23};
        // System.out.print(arr2[2]);

        // for(int i = 0;i<arr.length;i++){
        //     System.out.print("Enter array element : ");
        //     arr[i] = input.nextInt();
        // }
        
        //1 st normal way of using array
        // System.out.print("printing array : ");
        // for(int i = 0;i<arr.length;i++){
        //     System.out.print(arr[i]+ " ");
        // }
        // 2 nd way of printing array using inhanced for loop
        // Enhanced for loop
        // for(int num : arr){
        //     System.out.print(num+ " ");
        // }
        // 3 rd way to print array
        // System.out.print(Arrays.toString(arr));

        // printing array which contains string
        String[] strArray = new String[5];

        for(int i = 0;i<strArray.length;i++){
            System.out.print("Enter array element : ");
            strArray[i] = input.next();            
        }

        System.out.print(Arrays.toString(strArray));
          System.out.println();

    }
    
}
