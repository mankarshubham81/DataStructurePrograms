import java.util.Arrays;
import java.util.Scanner;

// package Topics;
//Multidimentional array
public class MultiDim {
        public static void main(String[] args) {
            Scanner ip  = new Scanner(System.in);
    // Just random unrelated program
        //     int[] nums = {3,3,2,3,2};
        //     System.out.print(Arrays.toString(nums));
        //     change(nums);
        //     System.out.print(Arrays.toString(nums));
     
        // 2 dimentional array
        // initialzing
        // int[][] twoDArr = new int[3][]; 
        // initialzing WITH decalring SOME ELEMENT  
        int[][] twoDArr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // it could be like this 
        // also
        int[][] arr2D = {
            {1,2,3}, // 0 th index
            {4,5},  // 1 st index
            {6,7,8,9} // 2 nd index 
            // arr2D[2] return {6,7,8,9} and arr2D[2][3] return 9  
        };

        // // input
        // for (int row = 0; row < arr2D.length; row++) {
        //     for (int col = 0; col < arr2D[row].length; col++) {
        //         arr2D[row][col] = ip.nextInt();
        //     }
        // }

        // output
        // for (int row = 0; row < arr2D.length; row++) {
        //     for (int col = 0; col < arr2D[row].length; col++) {
        //         System.out.print(arr2D[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // OR Output
        for (int row = 0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }

        // Another way by Using Enhanced for loop
        for(int[] a : arr2D){
            System.out.println(Arrays.toString(a));
        }
    }

        // // Strings are immuatable in java and arrays are mutable in java
        // public static void change(int[] arr){
        //     arr[0]= 82;
        // }
}
