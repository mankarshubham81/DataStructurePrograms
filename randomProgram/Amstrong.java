// package randomProgram;

public class Amstrong{
 
    public static void main(String[] args) {
        
        for (int i = 152; i <= 1000; i++) {
            if (isAmStrong(i)) {
                System.out.print(i+" ");
            }
        }
    }

    static boolean isAmStrong(int n){
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n % 10;
            n = n/ 10;
            sum += rem*rem*rem;
        }
        
        return sum == original;
    }
}
