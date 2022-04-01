import java.util.Arrays;

// package randomProgram.ArrayListLinearSearch;

public class SearchIn2DArray {

    public static void main(String[] args) {
        //declaring 2d array
        int[][] arr2D = {
            {23,4,5},
            {43,75,3,47},
            {98,57,36}
        };
        int target = 47;
        int[] res = search2D(arr2D, target);
        System.out.println("result : "+Arrays.toString(res));

    }

    public static int[] search2D(int[][] a2,int target) {
        // if(a2.length == 0){
        //     return new int[]{-1,-1};
        // }

        for (int row = 0; row < a2.length; row++) {
            for (int col = 0; col < a2[row].length; col++) {
                if(target == a2[row][col]){
                    return new int[]{row,col};
                }
            }

        }

        return new int[]{-1,-1};

    }

}
