// package LeetCode;

import java.util.zip.CRC32C;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {10,2,3},
            {30,2},
            {32,2,32},
            {42,23,64},
            {34,3,23}
        };
        int result = calMaxWealth(accounts);
        System.out.println("res : "+result);

    }

    public static int calMaxWealth(int[][] accounts) {
        
        // int max =0;
        int max = Integer.MIN_VALUE;
        // person = row
        //account = column
        for (int person = 0; person < accounts.length; person++) {
            int rwosum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rwosum += accounts[person][account];
            }
            
            if(max < rwosum){
                max = rwosum;
            }


        }
        
        return max; 
        // return 0;
    }
}
