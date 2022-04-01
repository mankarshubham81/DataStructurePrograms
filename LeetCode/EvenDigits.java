// package LeetCode;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {2,32,133,12,2212,1};
        System.out.println(evenDigits(nums));

        System.out.println(digit2(-348428));
    }

    static int evenDigits(int[] nums) {
        int count = 0;
        
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }

        return count;
    }


    static boolean even(int num){
        int numOfDidits = digits(num);
        // if(numOfDidits % 2 == 0){
        //     return true;
        // }
        // OR code
        return numOfDidits % 2 == 0;

    }



    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;

        while(num > 0){
            num /= 10;
            count++;
        }

        return count; 
    }


    // OR function for digit() method
    static int digit2(int num){
        if(num < 0){
            num = num * -1;
        }        

        return (int)(Math.log10(num)) + 1;
    }    
}
