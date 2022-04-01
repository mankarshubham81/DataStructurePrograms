public class CountofZerosInNum {
    public static void main(String[] args) {
        System.out.println(countUsingRecursion(14023002));
    }

    public static int countUsingRecursion(int n) {
        return helper(n, 0);
    }

    public static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }
}

class Solution {
    public void moveZeroes(int[] nums) {

        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zeroCount++;
            else
                nums[i - zeroCount] = nums[i];
        }
        if (zeroCount > 0)
            for (int i = 0; i < zeroCount; i++)
                nums[(nums.length - zeroCount) + i] = 0;
        }

    }

    public void moveZeroes(int[] nums) {
        int pos = 0;
         for (int i = 0; i < nums.length; i++) {
             if (nums[i] != 0){
                 nums[pos++] = nums[i];
             }
         }
         for (int i = pos; i < nums.length; i++) {
             nums[i] = 0;
         }
     }