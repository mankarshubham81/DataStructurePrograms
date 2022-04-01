import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Printing prime number betweent 1 to 100");
        // int ans = isPrime();
        // System.out.println("");
        // int n = in.nextInt();
        for (int i = 0; i < 100; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }  
    }

    static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
            int c = 2;
            while(c*c <= n){
                if(n % c == 0){
                    return false;
                }
                c++;
            }
            return c*c > n; 
    }
}